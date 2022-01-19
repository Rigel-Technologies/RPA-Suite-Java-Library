package MiTools;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Date;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.xml.sax.SAXException;

import CartesObj.*;
import sun.net.smtp.SmtpClient;

//MyCartesProcess
public abstract class MyCartesProcess extends MyCartes // This abstract class allows you to create processes using APIS from MyCartesAPI.
{
   protected final String EXIT_SETTINGS_KO = "Settings_" + EXIT_ERROR;
   private static String fCartesPath = null;
   private ICartesObj fCartes;
   //ICartesObj robot = ClassFactory.createCartesObj();
   
   private ArrayList<MyCartesAPI> apis;
   private String fFileSettings;
   private boolean fShowAbort, fVisibleMode;
   private IRPADataString frpaAbort = null;
   protected SmtpClient fSMTP;
   
   
   public MyCartesProcess(String csvAbortar) throws Exception,SecurityException, IllegalArgumentException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, NoSuchFieldException, InterruptedException
   {
       super(csvAbortar);
       fCartes = null;
       apis = new ArrayList<MyCartesAPI>();
       fFileSettings = null;
       fShowAbort = true;
       fVisibleMode = true;
       fSMTP = null;
   }
   
   protected void AddAPI(MyCartesAPI api) throws InterruptedException, Exception
   {
       try
       {
           if (apis.indexOf(api) < 0)
           {
               apis.add(api);
               if (getProjectId().length() > 0)
                   api.Load();
           }
       }catch(Exception e)
       {
           forensic("MyCartesProcess.AddAPI", e);
           throw new Exception("MyCartesProcess.AddAPI");

       }
   }
   protected void DeleteAPI(MyCartesAPI api)
   {
       apis.remove(api);
   }

   private void LoadConfiguration() throws Exception // It loads the process configuration.   
   {
       File lpXmlCfg = null;
       try
       {
           lpXmlCfg = new File(SettingsFile());
           LoadConfiguration(lpXmlCfg);
           
       }catch(Exception e)
       {
           throw new Exception("Loading settings:" + e.getMessage()); 
       }
   }
   @Override
   protected ICartesObj getCartes() throws Exception
   {
     try{
         if (fCartes == null)
         {
            
             File f = new File(CartesPath());    
        
             if ((CartesPath().length() > 0) && f.exists())
             {
                 boolean ok = false;                         
                 File path = new File(CartesPath());
                 String CartesName = path.getName().toString();
                 
                 if(CartesName.contains(".")){
                    int pos =  CartesName.indexOf(".");
                    CartesName = CartesName.substring(0,pos);
                 }
                 if (!ok)
                 {
                     fCartes = CartesObj.ClassFactory.createCartesObj(); 
                     Thread.sleep(10000);
                 }

             }
             else 
			 {
				throw new Exception("Cartes is not installed. Please install Robot Cartes from the RPA Suite installation.");
			 }
         }else{
             //fCartes = CartesObj.ClassFactory.createCartesObj(); //CartesObj.ClassFactory.createCartesObj(); //
             return fCartes;
         }
     }catch(Exception e){
         throw new Exception("Cartes is not installed. Please install Robot Cartes from the RPA Suite installation.");
     }
       //return fCartes;
     return fCartes;
   }
   @Override
   protected String getCartesPath() throws IllegalArgumentException, IllegalAccessException, InvocationTargetException, TransformerException, SAXException, IOException, ParserConfigurationException  
   {
       Object InstallPath;

       if (fCartesPath == null)
       {
           InstallPath = WinRegistry.readString (
                  WinRegistry.HKEY_LOCAL_MACHINE, //HKEY
                 "SOFTWARE\\Wow6432Node\\Cartes", //Key
                 "Cartes Client");  
                      
           if (InstallPath == null)
               InstallPath = WinRegistry.readString (
                      WinRegistry.HKEY_LOCAL_MACHINE, //HKEY
                     "SOFTWARE\\Cartes", //Key
                     "Cartes Client");
           
           fCartesPath = InstallPath.toString();
       }
       return fCartesPath;
   }
   @Override
   protected void MergeLibrariesAndLoadVariables() throws InterruptedException, Exception
   {
       try
       {
           for(MyCartes item : apis)
               item.Load();
           
           if (Abort().length() > 0)
           {
               boolean var = isVariable(Abort());
               if(var){                     
                   //frpaAbort = (IRPADataString)cartes().component(Abort()); 
                   frpaAbort = cartes().component(Abort()).queryInterface(IRPADataString.class);
               }
               else {
                   throw new Exception("Abort() does not exist!");
               }  
           }
           else frpaAbort = null;
       }
       catch (Exception e)
       {
           forensic("MyCartesProcess.MergeLibrariesAndLoadVariables", e);
           throw new Exception("EXIT_ERROR "+e.getMessage());
       }
   }
   @Override
   protected void UnMergeLibrariesAndUnLoadVariables() throws InterruptedException, Exception
   {
       try
       {
           for(MyCartes item : apis)
               item.UnLoad();
       }
       catch (Exception e)
       {
           forensic("MyCartesProcess.UnMergeLibrariesAndUnLoadVariables", e);
           throw new Exception("EXIT_ERROR "+e.getMessage());
       }
   }
   @Override
protected String getProjectId() throws Exception 
   {
       return Execute("ProjectId;");
   }
   protected int GetApis()
   {
	   
	   
	   
       return apis.size();
   }
   protected MyCartesAPI GetApi(int index) throws InterruptedException, Exception
   {
       try
       {
           return apis.get(index);
       }
       catch (Exception e)
       {
           forensic("MyCartesProcess::GetApi(" + index + ")", e);
           throw new Exception("MyCartesProcess::GetApi");
       }
   }
   //https://www.tabnine.com/code/java/classes/org.apache.commons.net.smtp.SMTPClient
   //cambiar todo el metodo de envio de correo
   /*protected SmtpClient GetSMTP() // It returns a SMTP Client to send emails.
   {
       if (fSMTP == null)
       {
           fSMTP = new SmtpClient("UTF-8");
           fSMTP.Credentials = new System.Net.NetworkCredential("myaccount@gmail.com", "mypassword");
           fSMTP.Port = 587;
           fSMTP.Host = "smtp.gmail.com";
           fSMTP.EnableSsl = true;
       }
       return fSMTP;
   }*/
   protected abstract String getRPAMainFile(); // Here you must return the main ".rpa" file
   protected abstract void LoadConfiguration(File XmlCfg); // Here you must load the configuration of the process
  
   protected void ShowAbortDialog(IRPADataString abort)
   {
       abort.showAbortDialog("Press button to abort", "Closing...", "Abort");
   }
   protected int RegisterIteration(Date start, String typify, String data, boolean screenShot) throws InterruptedException, Exception
   {
       return cartes().registerIteration(start, typify, data, screenShot ? 1 : 0);
   }
   protected boolean DoInit() throws InterruptedException, Exception // If DoExecute must be invoked, this method returns true.
   {
       //if (!IsDebug) //myobject
       //Close();
       return true;
   }
   protected abstract void DoExecute(Date start); // Here you must execute the process. The process have already loaded the configuration
   protected void DoEnd() throws InterruptedException, Exception // This method is invoked after running DoExecute.
   {
       //if (!IsDebug) //myobject
      Close();
   }
   public boolean Execute() throws InterruptedException, Exception
   {
       Date start;
       boolean result = false;
       String lsMainFile;
       boolean enter = true;  
       try
       {
           //mutex = new Mutex();
           
           try
           {
               if (enter)
               {
            	  
                   start = new Date();
                   CheckRPASuiteVersion();
                   Balloon("I'm opening the project...");
                   lsMainFile = RPAMainFile(); 
                   File file = new File(lsMainFile);
                   File file2 = new File("\\Cartes\\" + lsMainFile);
                  
                   if(file.exists()){
                     cartes().open(lsMainFile);
                   }else if(file2.exists()){
                     cartes().open(lsMainFile);
                   }else{
                     cartes().open(RPAMainFile());
                   }
                           
                   try{
                       cartes().balloon(Name());
                       
                       try
                       {
                           cartes().balloon("Reading settings...");
                           MergeLibrariesAndLoadVariables();                         
                           LoadConfiguration();
                         try{
                               if (VisibleMode())
                                   Execute("visualmode(1);");
                               try
                               {
                                   if (DoInit())
                                   {
                                       if (ShowAbort() && (frpaAbort != null))
                                           ShowAbortDialog(frpaAbort);
                                       
                                      CheckAbort();
                                      DoExecute(start);
                                   }
                               }
                               finally
                               {
                                   DoEnd();
                               }
                         }
                         finally
                           { 
                               //if (VisibleMode())
                                   //Execute("visualmode(0);");
                           }
                         cartes().balloon("Process is over.");
                       }
                       catch(Exception e){
                    	   cartes().balloon(e.getMessage());
                       }
                   }finally{
                     
                   }
               }
               else
               {
                   String message = "Process \"" + Name() + "\" is already running." +
                                    "You will not run another process until it finishes.";
                   forensic(message);
               }
           }
           finally
           {
               //mutex.release();
           }
       }
       catch (Exception e)
       {
           forensic(e.getMessage());
       }
       return result;
   }
   
   
   public void Close() throws InterruptedException, Exception
   {
       int i;
       i = 0;
       if(GetApis() > 0){
           while (i < GetApis())
           {
               try
               {
                   GetApi(i).Close();                  
               }
               catch (Exception e)
               {
                   forensic("MyCartesProcess::Close()\r\n" + "GetApi(" + i + ").Close()", e);
               }
               i++;
           }
       }
   }
   
   public String SettingsFile()
   {   
     if (fFileSettings == null)
               fFileSettings = CurrentPath() + "\\settings.xml";
           return fFileSettings;
   } // Read
   
   public void SetSettingsFile(String value){
     fFileSettings = value; 
   } // write
   
   public boolean ShowAbort()
   {
     return fShowAbort; 
   } // Read. It controls the appearance of the window to abort. 
   
   public void setShowAbort(boolean value){
     fShowAbort = value;
   } //Write. It controls the appearance of the window to abort. 
   
   public boolean VisibleMode()
   {
       return fVisibleMode; 
   } // Read. It controls the visible mode of Cartes. 
   
   public void SetVisibleMode(boolean value){
     fVisibleMode = value;
   } //Write. It controls the visible mode of Cartes. 
   
   public String RPAMainFile()
   {
       return getRPAMainFile(); 
   } // Read
   
   /*public SmtpClient SMTP()
   {
      return GetSMTP(); 
   } // Read 
   */    
}
