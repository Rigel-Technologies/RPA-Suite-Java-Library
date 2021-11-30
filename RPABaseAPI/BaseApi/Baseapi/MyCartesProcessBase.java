package Baseapi;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;

import MiTools.MyCartesProcess;

public class MyCartesProcessBase extends MyCartesProcess {
	
	private ClassEclipse fEclipse = null;
	
	
	public MyCartesProcessBase() throws Exception {
		super("$Abort");
	}
	@Override
    protected void MergeLibrariesAndLoadVariables() throws InterruptedException, Exception
    {
        try
        {
            System.out.println("CurrentPath() --->"+CurrentPath());
        	cartes().merge(CurrentPath()+"\\BaseApi\\Cartes\\RPABaseAPI.cartes.rpa");    
            super.MergeLibrariesAndLoadVariables();
        }
        catch (Exception e)
        {
            forensic("MyCartesProcessBase.MergeLibrariesAndLoadVariables", e);
            throw new Exception("RPABaseapi does not exits");
        }
    }
	
	
	@Override
    protected boolean DoInit() throws SecurityException, IllegalArgumentException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, NoSuchFieldException, InterruptedException, Exception
    {
		Eclipse().Minimize();
        return super.DoInit();
    }
	
	@Override
    protected void DoEnd() throws SecurityException, IllegalArgumentException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, NoSuchFieldException, InterruptedException, Exception 
    {
		Eclipse().Restore();
        super.DoEnd();
    }
	
    protected ClassEclipse GetClassEclipse() throws SecurityException, IllegalArgumentException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, NoSuchFieldException, InterruptedException, Exception
    {
        if (fEclipse == null) fEclipse = new ClassEclipse(this);
        return fEclipse;
    }
    
    public ClassEclipse Eclipse() throws SecurityException, IllegalArgumentException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, NoSuchFieldException, InterruptedException, Exception{
    	return GetClassEclipse();
    }
	
	@Override
	protected String getRPAMainFile() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void LoadConfiguration(File XmlCfg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void DoExecute(Date start) {
		// TODO Auto-generated method stub
		
	}

}