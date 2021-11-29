package MiTools;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.text.NumberFormat;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.xml.sax.SAXException;

import CartesObj.ICartesObj;


public abstract class MyCartesAPI extends MyCartes // This abstract class allows you to inherit to create application APIs (Chrome, SAP ...) using Cartes for MyCartesProcess.
{
    private MyCartesProcess fowner;
    private boolean fChecked;

    public  MyCartesAPI(MyCartesProcess owner) throws 
    SecurityException, IllegalArgumentException,
    NoSuchMethodException, IllegalAccessException,
    InvocationTargetException, NoSuchFieldException,
    InterruptedException, Exception
    {
    	super(owner.Abort());
        fowner = owner;
        fChecked = false;
        fowner.AddAPI(this);
        
    }

    @Override
    protected ICartesObj getCartes() throws Exception
    {
        if (!fChecked)
        {
            CheckRPASuiteVersion();
            fChecked = true;
        }
        return super.cartes();
    }
    @Override
    protected String getCartesPath() throws IllegalArgumentException, IllegalAccessException, InvocationTargetException, TransformerException, SAXException, IOException, ParserConfigurationException
    {
        return super.CartesPath();
    }
    @Override
    protected NumberFormat getDoubleFormatProvider()
    {
        return super.DoubleFormatProvider();
    }
    @Override
    protected String getProjectId() throws Exception
    {
        return super.ProjectId();
    }
    @Override
    public Double ToDouble(String value)
    {
        return super.ToDouble(value);
    }
    public abstract void Close(); // This method should close all the application windows

    public MyCartesProcess Owner()
    {
        return fowner;
    }
}