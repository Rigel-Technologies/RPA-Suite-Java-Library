package main;

import CartesObj.*;
import java.util.Calendar;

public class Program {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//Creamos un objeto tipo CartesObj -------------------
		ICartesObj robot = ClassFactory.createCartesObj();
		//----------------------------------------------------
		IRPAWin32Component notepad = null;
		
		String primes = null;
		String workingFile = null;
		String primesFile = null;
		Calendar calendar = Calendar.getInstance();  
		
		try 
		{
			workingFile = System.getProperty("user.dir");
			primesFile = workingFile + "\\src\\primes.txt";
			
			robot.open(workingFile + "\\rpa projects\\notepad.rpa");
			robot.execute("visualmode(true);");
			primes = robot.execute("LoadFromTxtFile(\"" + primesFile + "\");");
			notepad = robot.component("$NotePadEditor").queryInterface(IRPAWin32Component.class);
			
			if (notepad.componentexist(0) == 0)
			{
				robot.run("notepad.exe");
				notepad.waitforcomponent(30);
                robot.reset(notepad.api()); 
                /* "reset" warns Cartes of changes in
               	screen applications. Cartes reduces consumption of C.P.U. with
               	this notice. The A.I. of Cartes presupposes these opportune
               	notices in the source code. */
			}
			notepad.value(notepad.activeXClass() + "\r\n" + primes);
			notepad.focus();
			robot.balloon("This example has opened the Notepad to write the first prime numbers.");
			
		} catch (Exception e) {
			robot.registerIteration(calendar.getTime(), "nok", "<task>" + e + "</task>", 0);
		} finally {
			robot.registerIteration(calendar.getTime(), "ok", "<task>Put your trace here in xml</task>", 0);
			robot.forensic("This is a trace for the swarm log, and the Windows event viewer.");
			robot.close();
		}
	}

}
