package main;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

//import main.Notepad;

import Baseapi.MyCartesProcessBase;
import CartesObj.ICartesObj;
import main.Notepad;

public class SampleNotepad extends MyCartesProcessBase

{
    private ICartesObj fCartes;
    private String fMessage;
	
	
	public SampleNotepad() throws SecurityException, IllegalArgumentException,
    NoSuchMethodException, IllegalAccessException,
    InvocationTargetException, NoSuchFieldException,
    InterruptedException, Exception 
	{
		super();
	}

	@Override
    protected String getNeededRPASuiteVersion()
    {
		return "3.4.1.1";
    }
    
	@Override
    protected String getRPAMainFile() {
        return CurrentPath() + "\\Cartes\\Project Structure.cartes.rpa";
    }

    @Override
    protected void LoadConfiguration(File XmlCfg) {
    	fMessage = ReadSettings("//demo//message");
    }
    
    public String ReadSettings(String value)
	{
		try 
		{
			String[] parts = value.split("//");
			String tagName = parts[1];
			String valueTagName = parts[2];
			
	        File file = new File(System.getProperty("user.dir").concat("\\src\\settings.xml"));
	        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
	        DocumentBuilder db = dbf.newDocumentBuilder();
	        Document document = db.parse(file);
	        document.getDocumentElement().normalize();
	        NodeList nList = document.getElementsByTagName(tagName);
	        for (int temp = 0; temp < nList.getLength(); temp++) {
	            Node nNode = nList.item(temp);
	            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
	                Element eElement = (Element) nNode;
	                value = eElement.getElementsByTagName(valueTagName).item(0).getTextContent();
	            }
	        }
	    }
	    catch(IOException e) {
	        System.out.println("IOException --->"+e);
	    } catch (ParserConfigurationException e) {
	    	System.out.println("ParserConfigurationException -->"+e);
		} catch (SAXException e) {
			System.out.println("SAXException-->"+e);
		}
		return value; 
	}
    
    @Override
    protected void DoExecute(Date start) {
        // TODO Auto-generated method stub
        try {  
        	Notepad notepad = new Notepad(this);
            notepad.Open();
            CheckAbort();            
            notepad.Write(fMessage);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


}
