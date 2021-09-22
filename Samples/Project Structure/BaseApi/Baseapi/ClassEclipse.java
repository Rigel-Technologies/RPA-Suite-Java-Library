package Baseapi;

import java.lang.reflect.InvocationTargetException;

import CartesObj.ICartesObj;
import CartesObj.IRPAWin32Component;
import MiTools.MyCartesProcess;

public class ClassEclipse extends MyCartesAPIBase {

     private boolean loaded = false;
     private IRPAWin32Component vsWindow = null;
     private ICartesObj fCartes;
    
    public ClassEclipse(MyCartesProcess owner) throws SecurityException,
            IllegalArgumentException, NoSuchMethodException,
            IllegalAccessException, InvocationTargetException,
            NoSuchFieldException, InterruptedException, Exception {
        super(owner);
        // TODO Auto-generated constructor stub
    }
    
    @Override
    protected void UnMergeLibrariesAndUnLoadVariables()
    {
        loaded = false;
        vsWindow = null;
    }

    @Override
    public void Close() {
        // TODO Auto-generated method stub
    }
    
    public boolean Minimize() throws Exception
    {
   	 	boolean result = false;
    	try{
	        vsWindow = fCartes.component("$eclip").queryInterface(IRPAWin32Component.class);
	        Thread.sleep(1000);
	        if(vsWindow!=null){        	
	        	if(vsWindow.visible()==1){
	        		vsWindow.show("Minimize");
	        		result = true;
	        	}
	        }
    	}
    	catch(Exception e){
        	System.out.println("ERROR "+e.getMessage());
        }
        return result;
    }
    
    public boolean Restore() // Restore the Visual Studio
    {
        boolean result = false;
        
        try{
        	Thread.sleep(1000);
        	loaded = fCartes.open(CurrentPath() + "\\BaseApi\\Cartes\\IDEEclipse.rpa") == 1;
        	vsWindow = fCartes.component("$eclip").queryInterface(IRPAWin32Component.class);
        	if(vsWindow.windowState().equals("Minimized")) {
        		vsWindow.show("Restore");
        		result = true;
        	}		
        }catch(Exception e){
        	System.out.println("ERROR "+e.getMessage());
        }
        fCartes.close();
        return result;
    }

    @Override
    protected void MergeLibrariesAndLoadVariables() throws InterruptedException, Exception 
    {
          fCartes = CartesObj.ClassFactory.createCartesObj();
          
          if (!loaded || !isVariable("$eclip"))
          {
              loaded = fCartes.merge(CurrentPath() + "\\BaseApi\\Cartes\\IDEEclipse.rpa") == 1;
              Thread.sleep(4000);
          }
    }
    
    
    

}
