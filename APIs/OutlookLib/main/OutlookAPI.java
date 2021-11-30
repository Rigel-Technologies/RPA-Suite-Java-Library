package main;


import java.lang.reflect.InvocationTargetException;

//import java.lang.reflect.InvocationTargetException;

import Baseapi.MyCartesAPIBase;
import MiTools.MyCartesProcess;
import RT_MSOutlook._Application;
import RT_MSOutlook._MailItem;
import RT_MSOutlook._NameSpace;
import RT_MSOutlook.ClassFactory;
import RT_MSOutlook.MAPIFolder;
import RT_MSOutlook.OlItemType;

public class OutlookAPI extends MyCartesAPIBase 
{

	private _Application objOutlook = ClassFactory.createApplication();
	private _MailItem objMailItem;
	private OlItemType objOlItemType;
	
	public OutlookAPI(MyCartesProcess owner) throws 
		SecurityException, IllegalArgumentException, NoSuchMethodException,
		IllegalAccessException, InvocationTargetException, NoSuchFieldException, InterruptedException, Exception 
	{
		super(owner);
		// TODO Auto-generated constructor stub
		
	}
	
	public void sendMail(String EmailTo, String EmailSubject, String EmailMessage)
	{
		objOutlook.activeWindow();
		try {
			objMailItem = objOutlook.createItem(objOlItemType.olMailItem).queryInterface(_MailItem.class);
			objMailItem.subject(EmailSubject);
			objMailItem.body(EmailMessage);
			objMailItem.to(EmailTo);
			objMailItem.send();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("sendMail - Exception e --->"+ e.toString());
		}
		
	}
	
	
	@Override
	public void Close() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void MergeLibrariesAndLoadVariables() throws InterruptedException, Exception {
		// TODO Auto-generated method stub
		
	}
    
	@Override
    protected String getNeededRPASuiteVersion()
    {
    	return "3.4.1.1";
    }



}
