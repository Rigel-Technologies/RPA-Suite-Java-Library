package main;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import Baseapi.MyCartesProcessBase;
import CartesObj.ICartesObj;
import RTExcelObj.*;
import com4j.Com4jObject;
import com4j.MarshalAs;
import com4j.NativeType;

import static com4j.Variant.MISSING; 


public class SampleOutlook extends MyCartesProcessBase 
{

    private ICartesObj fCartes;
    private String fMessage;
    private _Application objExcel;
	
	public SampleOutlook() throws Exception 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
    protected String getNeededRPASuiteVersion()
    {
		return "3.4.1.1";
    }
	
	@Override
    protected String getRPAMainFile() {
        // TODO Auto-generated method stub
        return CurrentPath() + "\\Cartes\\Outlook and Excel.cartes.rpa";
    }

    @Override
    protected void LoadConfiguration(File XmlCfg) {
        // TODO Auto-generated method stub
    	fMessage = ReadSettings("//setting//emails");
    	System.out.println("fMessage --->"+fMessage);
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
    protected void DoExecute(Date start) 
    {
        // TODO Auto-generated method stub
    	boolean readOnly = true;
        try 
        {  
        	objExcel = ClassFactory.createApplication();
        	objExcel.displayAlerts(0);
        	objExcel.visible(1, true);
        	
        	RTExcelObj._Workbook wb;        	
        	wb = objExcel.workbooks().open(
	        			CurrentPath() + fMessage, 
	        			false, 
	        			false, 
	        			com4j.Variant.getMissing(), 
	        			com4j.Variant.getMissing(),
	        			com4j.Variant.getMissing(), 
	        			com4j.Variant.getMissing(), 
	        			com4j.Variant.getMissing(), 
	        			com4j.Variant.getMissing(), 
	        			com4j.Variant.getMissing(), 
	        			com4j.Variant.getMissing(), 
	        			com4j.Variant.getMissing(), 
	        			com4j.Variant.getMissing(), 
	        			com4j.Variant.getMissing(), 
	        			com4j.Variant.getMissing(), 
	        			0
        			);
        	
        	RTExcelObj._Worksheet xlWorkSheet;
        	xlWorkSheet = wb.worksheets().item(1).queryInterface(_Worksheet.class);
        	String EmailTo; 
        	String EmailSubject; 
        	String EmailMessage;
        	
        	EmailTo = ((Com4jObject)xlWorkSheet.cells().item(2,1)).queryInterface(Range.class).value2().toString();
        	EmailSubject = ((Com4jObject)xlWorkSheet.cells().item(2,1)).queryInterface(Range.class).value2().toString();
        	EmailMessage = ((Com4jObject)xlWorkSheet.cells().item(2,1)).queryInterface(Range.class).value2().toString();
        	
        	
            CheckAbort();            
            
            OutlookAPI outLookAPI = new OutlookAPI(this);
            outLookAPI.sendMail(EmailTo, EmailSubject, EmailMessage);
            outLookAPI.Close();
            
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }



}
