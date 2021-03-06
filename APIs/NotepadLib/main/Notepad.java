package main;
import java.io.File;
import java.io.FileReader;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.net.URL;
import java.util.Properties;

import Baseapi.*;
import CartesObj.ICartesObj;
import CartesObj.IRPAWin32Component;
import MiTools.*;

public class Notepad extends MyCartesAPIBase{
     private static boolean loaded;
     private IRPAWin32Component notepad;
     private ICartesObj fCartes;
  
     public Notepad(MyCartesProcess owner) throws SecurityException, IllegalArgumentException,
        NoSuchMethodException, IllegalAccessException,
        InvocationTargetException, NoSuchFieldException,
        InterruptedException,Exception {
        // TODO Auto-generated constructor stub
        super(owner);
    }
    
    @Override
    protected String getNeededRPASuiteVersion()
    {
        System.out.println("en getNeededRPASuiteVersion de NotePAd.java");
    	return "3.4.1.1";
    }
    

    @Override
    public void Close() {
        // TODO Auto-generated method stub
    }

    @Override
    protected void MergeLibrariesAndLoadVariables()
            throws InterruptedException, Exception {
        // TODO Auto-generated method stub
        try {
            fCartes = CartesObj.ClassFactory.createCartesObj();
            if(notepad == null)
            {
            	boolean loaded = fCartes.merge(CurrentPath() + "\\NotepadLib\\Cartes\\NotepadLib.cartes.rpa") == 1;
            	if(loaded)
            	{
	              Thread.sleep(2000);
	              notepad = fCartes.component("$NotePadEditor").queryInterface(IRPAWin32Component.class);
            	}
            }
          } catch (Exception e) {
            System.out.println("EXCEPCION MergeLibrariesAndLoadVariables "+e.getMessage()+ " ");
        }   
    }
    
    public void Open() throws InterruptedException, Exception{
        fCartes.run("notepad.exe");
    }
    
    public void Write (String value)
    {
        Boolean exit;
        exit = false;
        fCartes.balloon("Notepad - Write");
        fCartes.reset("win32"); 
        /* "reset" warns Cartes of changes in
        screen applications. Cartes reduces consumption of C.P.U. with
        this notice. The A.I. of Cartes presupposes these opportune
        notices in your source code. */
        do{
        	 if (notepad.componentexist(0) == 1)
             {
                 notepad.value(value);
                 notepad.focus();
                 exit = true;
             }
        }while(!exit);
       fCartes.close();
    } 
}
