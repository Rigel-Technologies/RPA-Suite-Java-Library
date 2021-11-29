package main;

import java.util.Calendar;


import CartesObj.ClassFactory;
import CartesObj.ICartesObj;
import CartesObj.IRPAParameters;
import CartesObj.IRPAWin32Component;

public class Program 
{
	
	//Creamos un objeto tipo CartesObj ----------------------
		static ICartesObj robot = ClassFactory.createCartesObj();
		//--------------------------------------------------------

	public static void main(String[] args) 
	{
		Calendar calendar = Calendar.getInstance();
		IRPAWin32Component notepad, notepadclose, notepadeditor, notepadnosave, notepaddialog;
		IRPAParameters parameters = ClassFactory.createRPAParameters();
		IRPAParameters output = ClassFactory.createRPAParameters();
		
		String workingFile = null;
		String language = "eng"; 
		String imageCloseButton = null;
		workingFile = System.getProperty("user.dir");
		
		try 
		{
			imageCloseButton = workingFile + "\\closebutton.bmp";
			robot.open(workingFile + "\\rpa projects\\Notepad2.rpa");
			
            notepad = robot.component("$Notepad").queryInterface(IRPAWin32Component.class);
            notepadclose = robot.component("$NotepadClose").queryInterface(IRPAWin32Component.class);
            notepadeditor = robot.component("$NotepadEditor").queryInterface(IRPAWin32Component.class);
            notepadnosave = robot.component("$NotepadNoSave").queryInterface(IRPAWin32Component.class);
            notepaddialog = robot.component("$NotepadDialog").queryInterface(IRPAWin32Component.class);
            
            if (notepadeditor.componentexist(0) == 0)
            {
            	robot.run("notepad.exe");
                notepadeditor.waitforcomponent(30);
            }
            notepad.reSize(890, 600);
            notepad.move(1, 5);
            notepad.focus();
            notepad.saveRectPartToFile(notepadclose.x() - notepad.x(), 
            		notepadclose.y() - notepad.y(), 
            		notepadclose.width(), 
            		notepadclose.height(), 
            		imageCloseButton);
            
            parameters.clear();
            parameters.item(0, imageCloseButton);
            output = notepad.findPicture(parameters);
            
            if (output.item(0).equals("1"))
            {
            	System.out.println("toi aca");
            	notepadeditor.typeFromClipboard("RESULT : " + output.item(0) + "\r\n" +
                        "X      : " + output.item(1) + "\r\n" +
                        "Y      : " + output.item(2) + "\r\n" +
                        "WIDTH  : " + output.item(3) + "\r\n" +
                        "HEIGHT : " + output.item(4) + "\r\n" +
                        "INDEX  : " + output.item(5) + "\r\n");
            	
            	System.out.println(notepadeditor.recognitionRatio(language, 1.3, 1));
            	Thread.sleep(2000);
                notepadeditor.focus();
                notepadeditor.saveRectToFile(imageCloseButton);
                System.out.println(imageCloseButton + "/" + language);
                robot.execute("$OCR = new OCR;\r\n" +
                        "ShowMessage($OCR.run(\"" + imageCloseButton + "\", \"" + language + "\"));\r\n");
                
                notepad.clickon(Integer.parseInt(output.item(1)) + Integer.parseInt(output.item(3)) / 2,
                		Integer.parseInt(output.item(2)) + Integer.parseInt(output.item(4)) / 2, 1); // I use the "ClickOn" function directly with the coordinates
                
                Thread.sleep(1000);
                robot.reset(notepadnosave.api());
                notepadnosave.waitforcomponent(10);
                notepaddialog.saveRectPartToFile(notepadnosave.x() - notepaddialog.x(),
                                                 notepadnosave.y() - notepaddialog.y(),
                                                 notepadnosave.width(), notepadnosave.height(),
                                                 imageCloseButton);
                
                parameters.clear();
                parameters.item(0, imageCloseButton);
                notepaddialog.clickonimage(parameters, 1);
                
                robot.balloon("This example has opened the notepad and has shown how to use image recognition and OCR.");
            }
			
		} catch (Exception e) 
		{
			robot.registerIteration(calendar.getTime(), "nok", "<task>" + e + "</task>", 0);
			
		} finally 
		{
            robot.registerIteration(calendar.getTime(), "ok", "<task>Put your trace here in xml for your swarm</task>", 1);
            robot.forensic("This is a trace for the swarm log, and the Windows event viewer.");
		}
	}

}
