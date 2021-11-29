package Baseapi;
import java.lang.reflect.InvocationTargetException;

import MiTools.*;

public abstract class MyCartesAPIBase extends MyCartesAPI
{
    public MyCartesAPIBase(MyCartesProcess owner) 
    	throws SecurityException, IllegalArgumentException,
    NoSuchMethodException, IllegalAccessException,
    InvocationTargetException, NoSuchFieldException,
    InterruptedException, Exception
    { 
      super(owner);
    }
    
    @Override
    protected void UnMergeLibrariesAndUnLoadVariables() // Normally, you don't need to do anything to download the library.
    {
      
    }
}


