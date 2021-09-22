package MiTools;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.xml.sax.SAXException;

import com.sun.corba.se.impl.orbutil.concurrent.Mutex;

public class MyObject extends Object {
    
    private static Mutex fRCel = new Mutex();
    private static String[] sgbt = { "true", "1" }, sgbf = { "false", "0" };
    private static String fCurrentPath = null, fCurrentApp = null;
    private static String fCurrent = null;
    private static int fInstances = 0;
    private static boolean fVerbose = false;
    private static final boolean DEBUG = true;
    
    public MyObject() throws SecurityException, IllegalArgumentException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, NoSuchFieldException, InterruptedException
    {
        //fRCel.wait();
        try
        {
            if (fCurrentPath == null)
            {
                //final File f = new File(MyObject.class.getProtectionDomain().getCodeSource().getLocation().getPath());
             
                fVerbose = GetIsDebug(); 
                fCurrentPath = CurrentValues("Path");               
                fCurrentApp = "Java.exe";
            }
        }
        finally
        {
            fInstances++;
        }
    }
    
    private String CurrentValues( String type) throws SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, NoSuchFieldException{    
        try{
            return new File("").getAbsolutePath().toString(); //path.toAbsolutePath().toString();            
        }catch(Exception e){
            
        }
        return type;  
    }
    
    private static boolean GetIsDebug()
    {
        if(DEBUG){
            return true;
        }
        return false;  
    }
        
    private String getLibraryVersionP() throws Exception // It returns the version of this library
    {
        try{
            if (fCurrent == null)
            {
                fCurrent= getLibraryVersion();
            }
        }catch(Exception e){
            throw new Exception(getLibraryVersion() + " is not a valid version number.");
        }
        return fCurrent;
    }
    
    // Returns the xml in string
    private static String ConvertXmlToString(File value) throws TransformerException, SAXException, IOException, ParserConfigurationException{
         DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
         DocumentBuilder dBuilder = factory.newDocumentBuilder();
         org.w3c.dom.Document doc = dBuilder.parse(value);
         TransformerFactory tf = TransformerFactory.newInstance();
         Transformer transformer = tf.newTransformer();
         transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
         StringWriter writer = new StringWriter();
         transformer.transform(new DOMSource(doc), new StreamResult(writer));
         return writer.getBuffer().toString().replaceAll("\n|\r", "");
    }
    
    protected static String getLibraryVersion()
    {
        return "1.6.5.51";
    }
    protected String getCurrentFile()
    {
        return fCurrentApp;
    }
    protected Date getNow() // Returns the system date and time
    {
         return new Date();
    }
    
    @SuppressWarnings({ "null", "unchecked" })
    public static <T> T Casting(Object value) throws Exception
    {
        try
        {
            Class<T> type = null;
            if (value == null) return null;
            else if (type.isInstance(value)) return (T) value;
            else if (value instanceof MyObject) throw new Exception("object is a MyObject");
            else
                throw new Exception("object is a MyObject");
        }
        catch (Exception e)
        {
            throw new Exception("T MyObject::Casting<T>(object).");
        }
    }
    
    public static String AlignRight(String text, char character, int length)
    {
        if (text == null) return AlignRight("", character, length);
        else while (text.length() < length)
                text = character + text;
        return text;
    }
    
    public static String ConcatenateSpecial(String a, String separator, String b)
    {
        if (a == null) return ConcatenateSpecial("", separator, b);
        else if (separator == null) return ConcatenateSpecial(a, "", b);
        else if (b == null) return ConcatenateSpecial(a, separator, "");
        else if (a.length() == 0) return b;
        else if (separator.length() == 0) return a + b;
        else if (b.length() == 0) return a;
        else return a + separator + b;
    }
    
    public static String ConcatenateSpecial(String[] a, String separator)
    {
        String result = "";
        for (int i = 0; i < a.length; i++){
            result = ConcatenateSpecial(result, separator, a[i]);
        }
        return result;
    }
    
    public static String NoDiacritics(String a) // It returns a String without diacritic symbols
    {
        String[] resultado = a.split("");        
        int i;
        i = resultado.length - 1;
        while (i >= 0)
        {
            String cad = resultado[i].toString();
              if (cad == "á"){
                    cad = "a";
                    break;
                  } 
                  if (cad == "é"){
                    cad = "e";
                    break;
                  } 
                  if (cad == "í"){
                    cad = "i";
                    break;
                  } 
                  if (cad == "ó"){
                    cad = "o";
                    break;
                  } 
                  if (cad == "ú"){
                    cad = "u";
                    break;
                  } 
                  if (cad == "ñ"){
                    cad = "n";
                    break;
                  } 
                  if (cad == "à"){
                    cad = "a";
                    break;
                  } 
                  if (cad == "è"){
                    cad = "e";
                    break;
                  } 
                  if (cad == "ì"){
                    cad = "i";
                    break;
                  } 
                  if (cad == "ò"){
                    cad = "o";
                    break;
                  } 
                  if (cad == "ù"){
                    cad = "u";
                    break;
                  } 
                  if (cad == "ü"){
                    cad = "u";
                    break;
                  }
            i--;
        }
        return resultado.toString().trim();
    }
    
    public static Boolean StringIn(String text, Object[] objects) // If "text" is in "texts" (case insensitive), it returns true
    {
        Boolean result = false;
        String sAux;
        sAux = text.toLowerCase();

        for (Object item : objects)
        {
            if (text == null){
                if (item == null){
                    result = true;
                    break;
                }
            }
            else if ((item != null) && (sAux == ((String) item).toLowerCase())){
                result = true;
                break;
            }
        }
        return result;
    }

    public static Boolean StringIn(String text, List<String> texts)
    {
        return StringIn(text, texts.toArray());
    }

    public static Boolean IntegerIn(int value, int[] values) // If "value" is in "values", it returns true
    {
        Boolean result = false;
        
        for (int item : values){
            if (value == item){
                result = true;
                break;
            }
        }
        return result;
    }
    
    public static boolean IsString(Object any) // validates if an object is string
    {  
        return any instanceof String;
    }
    
    @SuppressWarnings({ "unchecked" })
    public static String ToString(Object value) throws TransformerException, SAXException, IOException, ParserConfigurationException // If "value" is null, it returns an empty string.
    {
                
        if (value == null){
           
            return "";
        } 
        else if (!IsString(value)){
            
            return "";
        } 
        else if (value instanceof File){
           
            return value == null ? "" : ConvertXmlToString((File) value);
        } 
        else if (value instanceof String[]){
            
            return ConcatenateSpecial((String[])value, ", ");
        } 
        else if (value instanceof Map<?,?>)
        {
            
            String result = "";
            
            Map<String, String> map = (Map<String, String>) value;
            for (Entry<String, String> entry : map.entrySet() ) {
                 result += entry.getKey() + "=" + entry.getValue() + LF();
            } 
            return result;
        }
        else if (value instanceof String[])
        {
            
            String result = "";
            for (String cad : (String[]) value) {
                result += cad + LF();
            }
            return result;
        }
        else{
            
            return value.toString();
        }
    }
     
    public static Boolean ToBool(String text) throws Exception // It converts to bool
    {
        if (text == null) return false;
        else if (StringIn(text, sgbt)) return true;
        else if (StringIn(text, sgbf)) return false;
        else throw new Exception("\"" + text + "\" is not a valid boolean value.");
    }
    
    public static Boolean ToBool(int value) // It converts to bool
    {
        if (value == 0) return false;
        else return true;
    }
    
    public static Integer ToIntDef(String value, int defaultvalue)
    {
        int result;
        try 
        {
            result = Integer.parseInt(value);
            return result;
        }catch (NumberFormatException excepcion) 
        {
            return defaultvalue;
        }
    }
    
    public Double ToDouble(String value)
    {
        return Double.parseDouble(value);
        
    }
    
    public Double ToDoubleDef(String value, Double defaultvalue)
    {
        double resultado = 0;

        try
        {
            resultado = ToDouble(value);
        }
        catch(NumberFormatException excepcion)
        {
            resultado = defaultvalue;
        }
        return resultado;
    }
    
    public String ClassName()
    {
       return getClass().getName(); 
    } // Returns the instance class name
    public String LibraryVersion() throws Exception
    {
        return getLibraryVersionP();
    }  // Read Only. It returns the version of this library
    public static int Instances() // Instances counter
    {
        return fInstances;
    }
    
    public static boolean Verbose() // Enables or disables the ability to write exceptions thrown during execution to the Windows Event Viewer.
    {
        return fVerbose;
    }
    public static void SetVerbose(boolean value) // Enables or disables the ability to write exceptions thrown during execution to the Windows Event Viewer.
    {
        fVerbose = value;
    }
    public String CurrentPath() // The directory of the executable
    {
         return fCurrentPath;
    }
    public String CurrentFile() // The name of the executable file
    {
        return getCurrentFile();
    }
    public static String LF() // Returns a string with a line break and carriage return
    {
        return "\r\n"; 
    }
    public Date Now() // Returns the system date and time
    {
       return getNow(); 
    }
    
    //Public Class MiToolsExtensions  ---------------------------------------------------------------
    public static class MiToolsExtensions
    {
        public static String Concatenate(String[] instance, String separator)
        {
            return MyObject.ConcatenateSpecial(instance, separator);
        }
        
        public static Boolean IsIn(int a, int[] values)
        {
            return MyObject.IntegerIn(a, values);
        }
        
        public static Boolean IsIn(String a, String[] texts)
        {
            return MyObject.StringIn(a, texts);
        }
        
        public static Boolean IsIn(String a, List<String> texts)
        {
            return MyObject.StringIn(a, texts);
        }
        
        public static Boolean IsIn(char a, char[] chars)
        {
            Boolean result = false;

            for(char item : chars){
                if (a == item){
                    result = true;
                    break;
                }
            }
            return result;
        }
        
        public static String ToXML(Map<String, String> instance, String bleeding) throws TransformerException, SAXException, IOException, ParserConfigurationException
        {
            String result = "", s;
            
            for (Entry<String, String> entry : instance.entrySet() ) {
                 s = MyObject.ToString(entry.getValue()).trim();
                if(s.length() > 0)
                    result = result + bleeding + "<" + entry.getKey() + ">" + s + "</" + entry.getValue() + ">" + "\r\n";
                else
                    result = result + bleeding + "</" + entry.getKey() + ">" + "\r\n";
            } 
            return result;
        }        
    }
    //------------------------------------------------------------------------------------
    
    
}
