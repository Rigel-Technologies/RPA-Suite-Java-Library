package main;

import java.util.Calendar;

import CartesObj.*;

public class Program 
{
	//Creamos un objeto tipo CartesObj ----------------------
	static ICartesObj robot = ClassFactory.createCartesObj();
	//--------------------------------------------------------

	public static void main(String[] args) 
	{
		Calendar calendar = Calendar.getInstance();
		IRPAWin32Component notepad;
		String workingFile = null;
		
		try 
		{
        	workingFile = System.getProperty("user.dir");
        	robot.open(workingFile + "\\rpa projects\\notepad.rpa");
        	notepad = robot.component("$NotePadEditor").queryInterface(IRPAWin32Component.class);
        	if (notepad.componentexist(0) == 0)
            {
        		robot.run("notepad.exe");
        		notepad.waitforcomponent(30);
            }
        	notepad.value(WalkTree(0, notepad.getComponentRoot().queryInterface(IRPAWin32Component.class)));
        	notepad.focus();
        	robot.balloon("This example has opened the notepad and has presented you the component tree with its structure.");
        	
		} catch (Exception e) {
			robot.registerIteration(calendar.getTime(), "nok", "<task>" + e + "</task>", 0);
		} finally {
			robot.registerIteration(calendar.getTime(), "ok", "<task>Put your trace here in xml</task>", 0);
            robot.forensic("This is a trace for the swarm log, and the Windows event viewer.");
			robot.close();
		}
	}
	
	 public static String WalkTree (int level, IRPAWin32Component component)
     {
		 IRPAParameters param = ClassFactory.createRPAParameters();
         String margin = "";
         String result = "";
         int i;
         
         i = 0;
         while (i < level)
         {
             margin = margin + "  ";
             i = i + 1;
         }
         result = margin + level + " - " + component.name() + " " + "[" + component.execute("class", param) + "] = " + component.wrapper();
         i = 0;
         while (i < component.descendants())
         {
             result = result + "\r\n" + WalkTree(level + 1, component.child(i).queryInterface(IRPAWin32Component.class));
             i = i + 1;
          }
         return result;
     }
}
