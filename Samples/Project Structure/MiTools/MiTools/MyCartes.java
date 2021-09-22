package MiTools;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.xml.sax.SAXException;

import com.sun.org.apache.xalan.internal.Version;

import CartesObj.*;

public abstract class MyCartes extends MyObject {

    protected final static String EXIT_ABORT = "Abort";
    protected final String EXIT_ERROR = "KO";
    protected final String EXIT_OK = "OK";
    private String fAbort; // Cartes Script Variable for know when the process musts abort
    private static String fVersionString = null;
    private String flVersion = null;    
    Date DateNow = new Date();
    Map<Date, String> fLastBalloon = new HashMap<Date, String>();
    private NumberFormat fDoubleFormatProvider = null; //https://zetcode.com/java/numberformat/
    
    public MyCartes(String csvAbort) throws SecurityException, IllegalArgumentException,
    NoSuchMethodException, IllegalAccessException,
    InvocationTargetException, NoSuchFieldException,
    InterruptedException,Exception //"Owner" is Cartes. "csvAbort" is a Cartes variable that when valid one will indicate to the instance that it must abort.
    {
        fAbort = csvAbort.trim();
        flVersion = null;
    }
    
    protected void Load() throws InterruptedException, Exception
    {
        try
        {
            MergeLibrariesAndLoadVariables();
        }
        catch (Exception e)
        {
            forensic(MyCartes.class.getName() + ".MergeLibrariesAndLoadVariables", e);
        }
    }
    
    protected void UnLoad() throws InterruptedException, Exception
    {
        try
        {
            UnMergeLibrariesAndUnLoadVariables();
        }
        catch (Exception e)
        {
            forensic(MyCartes.class.getName() + ".UnMergeLibrariesAndUnLoadVariables", e);
        }
    }
    
    private String getNeededRPASuiteVersionP() throws Exception // It returns the version of RPA Suite needed by this library
    {
        try
        {
            if (flVersion == null)
            {
                flVersion = getNeededRPASuiteVersion();
            }
        }catch(Exception e)
        {
            forensic("MyCartes.getNeededRPASuiteVersionP", e);
            throw new Exception("MyCartes.getNeededRPASuiteVersionP.");
        }
        return flVersion;
    }
    
    private boolean GetIsRPASuiteInstalled()
    {
        boolean result;
        try
        {
            String v = CurrentRPASuiteVersion();
            result = v.toString().length() > 0;
        }
        catch(Exception e)
        {
            result = false;
        }
        return result;
    }
    
    protected abstract ICartesObj getCartes() throws IOException, InterruptedException, Exception;
    protected abstract String getCartesPath() throws IllegalArgumentException, IllegalAccessException, InvocationTargetException, TransformerException, SAXException, IOException, ParserConfigurationException;  // It returns the file of Cartes
    protected abstract void MergeLibrariesAndLoadVariables() throws InterruptedException, Exception;  // Rewrite this method to load the libraries and Cartesa variables that your class handles.
    protected abstract void UnMergeLibrariesAndUnLoadVariables() throws InterruptedException, Exception; // Rewrite this method to unload the libraries and Cartesa variables that your class handles.
    
    protected String getCurrentRPASuiteVersion() throws Exception
    {
        if (fVersionString == null)
        {
        	
            Object lvalue;
            lvalue = WinRegistry.readString (
                    WinRegistry.HKEY_LOCAL_MACHINE, //HKEY
                   "SOFTWARE\\Wow6432Node\\Cartes", //Key
                   "Product Version");  
            if (lvalue == null)
                    lvalue = WinRegistry.readString (
                        WinRegistry.HKEY_LOCAL_MACHINE, //HKEY
                       "SOFTWARE\\Cartes", //Key
                       "Product Version");
            fVersionString = lvalue.toString();
            
            if (lvalue == null){
            	throw new Exception("RPA Suite is not installed. Please install RPA Suite.");
            }  	
        }
        return fVersionString;
    }
    
    protected String getNeededRPASuiteVersion() // It returns a string with the version of RPA Suite needed by this library
    {
    	
    	return "3.4.1.1";
    }
    protected void CheckRPASuiteVersion() throws Exception // It checks if the current version and needed are OK
    {
    	if(!CurrentRPASuiteVersion().equals(NeededRPASuiteVersion())){
        	  
        	throw new Exception("You need RPA Suite v" + NeededRPASuiteVersion() + " or higher.");
        }
            
    }
    protected NumberFormat getDoubleFormatProvider()
    {

        DecimalFormat decimal;
        if (fDoubleFormatProvider == null)
        {
            decimal = (DecimalFormat) NumberFormat.getInstance();
            DecimalFormatSymbols symbols = decimal.getDecimalFormatSymbols();
            symbols.setDecimalSeparator(',');           
            ((DecimalFormat) fDoubleFormatProvider).setDecimalFormatSymbols(symbols);
            
            fDoubleFormatProvider.setGroupingUsed(true);
            fDoubleFormatProvider.setMaximumFractionDigits(3);
            
        }
        return fDoubleFormatProvider;
    }
    
    protected abstract String getProjectId() throws Exception; // Returns the ID of the loaded project in Cartes. If Cartes does not have a loaded project, it returns the empty string.
    
    protected String GetProjectName() throws Exception // returns the Name of the loaded project in Cartes. If Cartes does not have a loaded project, it returns the empty string.
    {
        return (Execute("Name;").toString());
    }
    protected void reset(IRPAComponent component) throws 
InterruptedException, Exception
    {
        cartes().reset(component.api());
    }
    protected boolean isVariable(String VariableName)  // If a variable-component exists in the rpa project, returns true
    {
        String result = "";
        try
        {
            result = Execute("isVariable(\"" + VariableName + "\");");
            if(result.length() > 0) return true;
            else return false;
        }
        catch(Exception e)
        {
            return false;
        }
    }
    protected IRPAComponent GetComponent(String variablename) throws 
InterruptedException, Exception
    {
        return cartes().component(variablename);
    }
    protected String Execute(String command) throws Exception // It Executes a Cartes Script in cartes.execute and check if errors
    {
        String result;
        result = cartes().execute(command);
        if ((cartes().lastError() != null) && (cartes().lastError().length() > 0)){
            throw new Exception(cartes().lastError());
        }
        else if (result == null) return "";
        else return result;
    }
    
    protected void Balloon(String message) throws InterruptedException, Exception
    {
        boolean ok;
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        Date tempDate = cal.getTime();
        cal.set(Calendar.SECOND, cal.get(Calendar.SECOND)- 10);
        tempDate = cal.getTime();

        for(Map.Entry<Date, String> entry  : fLastBalloon.entrySet()) {
            Date key = entry.getKey();
            if( entry.getValue() == message){
                if(key.before(tempDate))
                    ok = true;
                else ok = false;
            }
            else ok = true; 
            if (ok)
            {
                cartes().balloon(message);
                fLastBalloon.put(DateNow, message);
            }
        }
    }
    
    protected void forensic(String message) throws 
InterruptedException, Exception
    {
        cartes().forensic(message);
    } 
    
    protected void forensic(String message, Exception e) throws InterruptedException, Exception
    {
        forensic(message + "\r\n" + e.getMessage());
    }
    protected void CheckAbort() throws Exception // It checks if the variable to abort is 1 to throw an exception
    {
        String valor = cartes().execute(Abort() + ".value;");
        Thread.sleep(2000);  
        if ((Abort().length() > 0) &&  valor.equals("1")){
        	cartes().balloon("Abort by user.");
        	cartes().close();
        	throw new Exception("Abort by user.");
        	 
        }          
    }
    
    protected boolean ComponentsExist(int seconds, IRPAComponent[] components) throws Exception /* The method waits for the indicated
    seconds until one of the components exists. If any of the components exist, returns true. */
    {
      Date timeout;
      boolean exit, result = false;
      ArrayList<String> lAPI = new ArrayList<String>();
    
      try
      {
          if (components == null) result = true;
          else
          {
            exit = false;
            Calendar cal = Calendar.getInstance();
            cal.setTime(new Date());
            cal.set(Calendar.SECOND, cal.get(Calendar.SECOND) + seconds);
            timeout = cal.getTime();
              do
              {
                  CheckAbort();
                  
                  for (final IRPAComponent component : components) {
                      // Here your room is available
                      if (component.componentexist(0) == 1)
                      {
                          result = true;
                          exit = true;
                          break;
                      }
                      else if (!lAPI.contains(component.api()))
                          lAPI.add(component.api());
                  }
               
                  if (!exit)
                  {
                      if (timeout.before(new Date())) exit = true;
                      Thread.sleep(400);
                      for(final String api : lAPI){
                          cartes().reset(api); 
                      }
                          
                  }
              } while (!exit);
          }
      }
      catch (Exception e)
      {
          forensic("MyCartes.ComponentsExist", e);
          throw new Exception("MyCartes.ComponentsExist");
      }
      return result;
    }
    protected String WaitForCartesMethodValue(IRPAComponent component, String method, int seconds) throws Exception /* It waits until the indicated method has
    value and returns it. Once the waiting time has been exceeded, it throws an exception. */
    {
        IRPAParameters parameters = null;
        Date timeout;
        String result;
    
        try
        {
            Calendar cal = Calendar.getInstance();
            cal.setTime(new Date());
            cal.set(Calendar.SECOND, cal.get(Calendar.SECOND) + seconds);
            timeout = cal.getTime();
            do
            {
                CheckAbort();
                cartes().reset(component.api());
                Thread.sleep(400);
                if (timeout.before(new Date())) throw new Exception("Timeout");
                else result = component.execute(method, parameters);
            } while (result.length() == 0);
            return result;
        }
        catch (Exception e)
        {
            forensic("MyCartes::WaitForCartesMethodValue", e);
            throw new Exception("MyCartes::WaitForCartesMethodValue");
        }
    }        
    protected void AssignValueInsistently(Date timeout, IRPAWin32Component component, String value, boolean typed) throws Exception
    {
        do
        {
            if (typed)
                try
                {
                    component.typeFromClipboardCheck(value, 0, 0);
                }
                catch(Exception e) 
                {
                    component.typeWordCheck(value, 0, 0);
                }
            else component.value(value);
            CheckAbort();
            Thread.sleep(1000);
            reset(component);
            if ((component.value()).toString().toLowerCase() == value.toLowerCase()) break;
            else
            {
                if (timeout.before(new Date())) throw new Exception("I can't assign the value \"" + value + "\" to the component.");
                Thread.sleep(1000);
            }
        } while (true);
    }
    protected Double SimilarStrings(String a, String b) throws Exception
    {
        String sresult;
        Double dresult;
        DecimalFormat decimal;

        try
        {
            decimal = (DecimalFormat) NumberFormat.getInstance();
            DecimalFormatSymbols symbols = decimal.getDecimalFormatSymbols();
            symbols.setDecimalSeparator(',');           
            ((DecimalFormat) fDoubleFormatProvider).setDecimalFormatSymbols(symbols);
            
            fDoubleFormatProvider.setGroupingUsed(true);
            fDoubleFormatProvider.setMaximumFractionDigits(3);
            
            sresult = cartes().execute("similarstrings(\"spa\", \"" + a.replace("\"", "\"\"") + "\", \"" + b.replace("\"", "\"\"") + "\");");
            dresult = Double.parseDouble(sresult);
        }
        catch(Exception e)
        {
            forensic("MyCartes.SimilarStrings", e);
            throw new Exception("MyCartes.SimilarStrings");
        }
        return dresult;
    }      
    
    protected void AdjustWindow(IRPAWin32Component component, int width, int height) // Adjusts the main component window to the indicated size.
    {
        IRPAWin32Component lpWindow = (IRPAWin32Component) component.getComponentRoot();
        String[] params = {"Minimized","Maximized"};
        if (lpWindow.componentexist(0)== 1)
        {
            if (StringIn(lpWindow.windowState(), params) || (lpWindow.visible() == 0))
                lpWindow.show("Restore");
            if ((lpWindow.width() != width) || (lpWindow.height() != height))
                lpWindow.reSize(width, height);
            if ((lpWindow.x() != 0) || (lpWindow.y() != 0))
                lpWindow.move(0, 0);
        }
    }
    protected void CloseWindow(Date timeout, IRPAWin32Component CloseButton, String name) throws 
Exception
    {
        reset(CloseButton);
        if (CloseButton.componentexist(0)==1)
        {
            Date init = new Date();
            int handle = CloseButton.handle();
            while (CloseButton.componentexist(0)==1 && (handle == CloseButton.handle()))
            {
                Balloon("Closing \"" + name + "\"...");
                if (timeout.before(new Date()))
                {   
                    Date d1 = new Date();
                    long diff = d1.getTime() - init.getTime();
                    TimeUnit time = TimeUnit.SECONDS;
                    long diffrence = time.convert(diff, TimeUnit.SECONDS);
                    
                    int seconds = Math.round(diffrence);
                    throw new Exception("Timeout, " + Integer.toString(seconds)+ " seconds. I can't close the \"" + name + "\" window.");

                }
                if (CloseButton.focused() != 1)
                    CloseButton.focus();
                CloseButton.click(0);
                CloseButton.componentexist(5);
                Thread.sleep(250);
                reset(CloseButton);
            }
        }
    }
    protected void CloseWindow(IRPAWin32Component CloseButton, String name) throws Exception
    {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        Date tempDate = cal.getTime();
        cal.set(Calendar.SECOND, cal.get(Calendar.SECOND) + 60);
        tempDate = cal.getTime();
        CloseWindow(tempDate, CloseButton, name);
    }
    protected void CloseWindow(IRPAWin32Component CloseButton) throws Exception
    {
        CloseWindow(CloseButton, CloseButton.route().trim());
    }
    protected void CloseWindows(IRPAWin32Component CloseButton) throws Exception
    {
        while (CloseButton.componentexist(0)==1)
        {
            CloseWindow(CloseButton);
        }
    }
    protected void scrollUp(int mouseX, int mouseY, IRPAWin32Accessibility component) throws Exception
    {
        IRPAParameters parametros = CartesObj.ClassFactory.createRPAParameters();
        Date timeout;
        int n, y;
        try
        {
            parametros.item(mouseX);
            parametros.item(mouseY);
            component.focus();
            component.doroot("SetMouse", parametros);
            n = 0;
            y = component.y();
            Calendar cal = Calendar.getInstance();
            cal.setTime(new Date());
            cal.set(Calendar.SECOND, cal.get(Calendar.SECOND) + 30);
            timeout = cal.getTime();
            while (component.offScreen() == 1)
            {
                if (timeout.before(new Date())) throw new Exception("Timeout waiting by scrolling.");
                CheckAbort();
                cartes().balloon("Scroll...");
                component.doroot("SetMouse", parametros);
                component.up();
                Thread.sleep(500);
                if (n > 3) throw new Exception("I can not scroll up.");
                if (y == component.y()) n++;
                else n = 0;
            }
        }
        catch (Exception e)
        {
            forensic("MyCartes.scrollUp", e);
            throw new Exception("MyCartes.scrollUp.");
        }
    }
    protected void scrollDown(int mouseX, int mouseY, IRPAWin32Accessibility component) throws Exception
    {
        IRPAParameters parameters = CartesObj.ClassFactory.createRPAParameters();
        Date timeout;
        int n, y;

        try
        {
            parameters.item(mouseX);
            parameters.item(mouseY);
            component.focus();
            component.doroot("SetMouse", parameters);
            n = 0;
            y = component.y();
            
            Calendar cal = Calendar.getInstance();
            cal.setTime(new Date());
            cal.set(Calendar.SECOND, cal.get(Calendar.SECOND) + 30);
            timeout = cal.getTime();
           
            while (component.offScreen() == 1)
            {
                if (timeout.before(new Date())) throw new Exception("Timeout waiting by scrolling.");
                CheckAbort();
                cartes().balloon("Scroll...");
                component.doroot("SetMouse", parameters);
                component.down();
                Thread.sleep(500);
                if (n > 3) throw new Exception("I can not scroll down.");
                if (y == component.y()) n++;
                else n = 0;
            }
        }
        catch (Exception e)
        {
            cartes().forensic("MyCartes.scrollDown(RPAWin32Accessibility)\r\n" + e.getMessage());
            throw new Exception("MyCartes.scrollDown(RPAWin32Accessibility)");
        }
    }
    protected void scrollDown(int mouseX, int y, int height, IRPAWin32Component component) throws Exception
    {
        IRPAParameters parametros = CartesObj.ClassFactory.createRPAParameters();
        Date timeout;
        try
        {
            parametros.item(mouseX);
            parametros.item((y + 2));
            component.focus();
            component.doroot("SetMouse", parametros);
            Calendar cal = Calendar.getInstance();
            cal.setTime(new Date());
            cal.set(Calendar.SECOND, cal.get(Calendar.SECOND) + 20);
            timeout = cal.getTime();

            while (component.y() < y)
            {
                if (timeout.before(new Date())) throw new Exception("Timeout waiting by scrolling.");
                CheckAbort();
                Balloon("Scroll up...");
                component.up();
                Thread.sleep(500);
            }
            while (y + height < component.y() + component.height() )
            {
                if (timeout.before(new Date())) throw new Exception("Timeout waiting by scrolling.");
                CheckAbort();
                Balloon("Scroll down...");
                component.down();
                Thread.sleep(500);
            }
        }
        catch (Exception e)
        {
            forensic("MyCartes.scrollDown(RPAWin32Component)", e);
            throw new Exception("MyCartes.scrollDown(RPAWin32Component)");
        }
    }
    
    @Override
    public Double ToDouble(String value)
    {
        return Double.parseDouble((getDoubleFormatProvider().toString()));
    }

    public boolean IsRPASuiteInstalled()
    {
       return GetIsRPASuiteInstalled(); 
    }  // Read Only. It returns if RPA Suite is installed
    public String CurrentRPASuiteVersion() throws Exception
    {
       return getCurrentRPASuiteVersion();
    }  // Read Only. It returns the version of RPA Suite
    public String NeededRPASuiteVersion() throws Exception
    {
       return getNeededRPASuiteVersionP(); 
    }  // Read Only. It returns the version of RPA Suite needed by this library
    public String CartesPath() throws IllegalArgumentException, IllegalAccessException, InvocationTargetException, TransformerException, SAXException, IOException, ParserConfigurationException
    {
        return getCartesPath();
    } // Read. It returns the file of Cartes
    public ICartesObj cartes() throws InterruptedException, Exception
    {
       return getCartes(); 
    }  // Read Only
    public String ProjectId() throws Exception
    {
       return getProjectId(); 
    }  // Read Only. Returns the ID of the loaded project in Cartes. If Cartes does not have a loaded project, it returns the empty string.
    public String Name() throws Exception
    {
       return GetProjectName(); 
    }  // Read Only. Returns the Name of the loaded project in Cartes. If Cartes does not have a loaded project, it returns the empty string.
    public String Abort()
    {
        return fAbort; 
    }  // Read Only
    public NumberFormat DoubleFormatProvider()
    {
        return getDoubleFormatProvider(); 
    }  // Read Only
}




