package main;

import java.io.File;
import java.util.Calendar;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

//Objects Cartes ----------------
import CartesObj.*;
import CartesObj.ClassFactory;
import CE_Data.*;
//-------------------------------

public class Program {
	
	//Creamos un objeto tipo CartesObj ----------------------
	static ICartesObj robot = ClassFactory.createCartesObj();
	//--------------------------------------------------------

	public static void main(String[] args) 
	{
		IRPADataString Abort;
		String workingFile = null;
		Calendar calendar = Calendar.getInstance();
		
		try 
		{
        	workingFile = System.getProperty("user.dir");
        	robot.open(workingFile + "\\rpa projects\\AbortAndXML.rpa");
        	
        	//Create file XML with CE_Data using Cartes -------------
        	IXMLFile datos2 = CE_Data.ClassFactory.createXMLFile();
        	//-------------------------------------------------------
        	
        	DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
        	DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
        	Document document = documentBuilder.newDocument();
        	
        	//root element ----------------------------------
            Element root = document.createElement("users");
            document.appendChild(root);
            //-----------------------------------------------
        	
        	Abort = robot.component("$Abort").queryInterface(IRPADataString.class);
        	Abort.showAbortDialog("Presss the button to end", "Bye", "Abort");
        	
        	if (Abort.value().equals("0"))
            {
        		Element userNode = null;
        		Element phoneNode = null;
        		
        		//Create value of xml file -------------------------------------
                userNode = document.createElement("name");
                userNode.appendChild(document.createTextNode("Federico Codd"));
                root.appendChild(userNode);
                phoneNode = document.createElement("telephone");
                phoneNode.appendChild(document.createTextNode("985124753"));
                root.appendChild(phoneNode);
                phoneNode = document.createElement("telephone");
                phoneNode.appendChild(document.createTextNode("654357951"));
                root.appendChild(phoneNode);
                //---------------------------------------------------------------
                
                //Create value of xml file CE_Data  -------
                datos2.asString("name", "Federico Codd");
                datos2.asString("telephone", "985124753");
                //-----------------------------------------
                
                //Sleep process to valide Abort Windows --
                do
                {
                    Thread.sleep(2000);
                }
                while (Abort.value().equals("0"));
                //----------------------------------------
                
                
                //Save xml files -------------------------------------------------------------------------
                TransformerFactory transformerFactory = TransformerFactory.newInstance();
                Transformer transformer = transformerFactory.newTransformer();
                DOMSource domSource = new DOMSource(document);
                StreamResult streamResult = new StreamResult(new File(workingFile + "\\xmlfile1.xml"));
                transformer.transform(domSource, streamResult);
                datos2.saveToFile(workingFile + "\\xmlfile2.xml");
                //-----------------------------------------------------------------------------------------
                
            }
        	
		} catch (Exception e) 
		{
			robot.registerIteration(calendar.getTime(), "nok", "<task>" + e + "</task>", 0);
		} finally 
		{
			robot.registerIteration(calendar.getTime(), "ok", "<task>Put your trace here in xml</task>", 0);
            robot.forensic("<task>Put your trace here in xml</task>");
			robot.close();
		}
	}
}
