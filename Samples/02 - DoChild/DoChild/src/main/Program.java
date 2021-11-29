package main;

import java.util.Calendar;

import CartesObj.*;

public class Program {
	
	//Creamos un objeto tipo CartesObj -------------------
	static ICartesObj robot = ClassFactory.createCartesObj();
	//----------------------------------------------------

	public static void main(String[] args) 
	{
		Calendar calendar = Calendar.getInstance();
		IRPAParameters parameters = ClassFactory.createRPAParameters();
		IRPAComponent notepad = null;
		IRPAWin32Component editor;		
        String workingFile = null, editorRoute = null;
        
        try 
        {
        	workingFile = System.getProperty("user.dir");
        	robot.open(workingFile + "\\rpa projects\\notepad.rpa");
        	editor = robot.component("$NotePadEditor").queryInterface(IRPAWin32Component.class);
        	if (editor.componentexist(0) == 0)
            {
        		robot.run("notepad.exe");
                editor.waitforcomponent(30);
            }
        	editorRoute = editor.route();
        	notepad = editor.getComponentRoot();
        	parameters.item(0, WalkTree(0, notepad, ""));
        	notepad.dochild(editorRoute, "TypeFromClipboard", parameters);
            editor.focus();
            robot.balloon("This example has opened the notepad and has presented you the component tree with its structure.");
             
		} catch (Exception e) {
			robot.registerIteration(calendar.getTime(), "nok", "<task>" + e + "</task>", 0);
		} finally {
            robot.registerIteration(calendar.getTime(), "ok", "<task>Put your trace here in xml</task>", 1);
            robot.forensic("This is a trace for the swarm log, and the Windows event viewer.");
			robot.close();
		}
	}
	
	public static String WalkTree(int level, IRPAComponent component, String path)
    {
        IRPAParameters param = ClassFactory.createRPAParameters();
        String margin = "";
        String result = "";
        int i;

        robot.balloon("Component : " + path + "\r\nClass : " + component.dochild(path, "class", param));
        i = 0;
        while (i < level)
        {
            margin = margin + "  ";
            i = i + 1;
        }
        result = margin + level + " - " + component.dochild(path, "name", param) + " " + "[" + component.dochild(path, "class", param) + "] = " + component.dochild(path, "wrapper", param);
        i = 0;
        while (i < Integer.parseInt(component.dochild(path, "descendants", param)))
        {
            result = result + "\r\n" + WalkTree(level + 1, component, path + "\\" + String.valueOf(i));
            i = i + 1;
        }
        return result;
    }
}
