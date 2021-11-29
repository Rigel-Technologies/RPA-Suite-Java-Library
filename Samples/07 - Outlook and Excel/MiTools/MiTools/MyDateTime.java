package MiTools;

import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

public class MyDateTime extends MyObject  {

  public MyDateTime() throws SecurityException, IllegalArgumentException, NoSuchMethodException,
      IllegalAccessException, InvocationTargetException, NoSuchFieldException, InterruptedException {
    super();
    // TODO Auto-generated constructor stub
  }
  private enum ModoTruncar { mtTzquierda, mTDerecha, mTFraccion };
    final private static char[] CaracteresEspecial = { 'Y', 'M', 'D', 'H', 'N', 'S', 'F' };
    final private static char[] CaracteresDigitos = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
    final private static char[] CaracteresSeparador = { '/', '-', '.' };

  private static Calendar dateToCalendar(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar;
    }
    
    private static String IgualesM(char car, int i, String cadena)
    {
        String resultado = "";

        while ((i < cadena.length()) && (car == cadena.charAt(i)))
        {
            resultado = resultado + cadena.charAt(i);
            i++;
        }
        return resultado;
    }
    
    private static int LeerNumeroM(int maximo, int i, String cadena)
    {
        String n = "";

        while ((i < cadena.length()) && (maximo > n.length()) && cadena.contains(CaracteresDigitos.toString()))
        {
            n = n + cadena.charAt(i);
            i++;
        }
        return Integer.parseInt(n);
    }
    
    private static int SacarCampoM(int i,int j, String formato, String valor, int longitud)
    {
        int resultado;
        String subformato;

        subformato = IgualesM(formato.charAt(i), i, formato);
        longitud = subformato.length();
        if (i < formato.length())
        {
            if (formato.contains(CaracteresEspecial.toString()))
                resultado = LeerNumeroM(longitud, j, valor);
            else resultado = LeerNumeroM(100, j, valor);
        }
        else resultado = LeerNumeroM(100, j, valor);
        return resultado;
    }
    
    private static String SacarCampoM(int i, String formato, int precision, ModoTruncar truncar, int valor)
    {
        String resultado = "", subformato, lsValor;
        int longitud, liTrunc;

        subformato = IgualesM(formato.charAt(i), i, formato);
        longitud = subformato.length();
        lsValor = MyObject.AlignRight(Integer.toString(valor), '0', precision);
        if (lsValor.length() == longitud) resultado = lsValor;
        else if (lsValor.length() < longitud) resultado = MyObject.AlignRight(lsValor, '0', longitud);
        else if (truncar == ModoTruncar.mTDerecha)
        {
            liTrunc = Maximum(longitud,2);
            resultado = lsValor.substring(lsValor.length() - liTrunc - 1, liTrunc);
        }
        else if (truncar == ModoTruncar.mtTzquierda)
        {
            liTrunc = Maximum(longitud,precision);
            resultado = lsValor.substring(0, liTrunc);
        }
        else resultado = lsValor.substring(0, Minimum(longitud,lsValor.length()));
        return resultado;
    }
  
    /* The format used is this:
    - yyyy for 4-digit years, yy for 2-digit years
    - MM for 2-digit months, m for 1-digit
    - d y dd
    - h y hh
    - n y nn for minutes
    - s y ss for seconds
    *****************************************************************/
    
    public static String FormatDateTime(String format, Date value) throws Exception
    {
        String resultado = "";
        String lsUFormato;
        int i;
        Calendar date = dateToCalendar(value);
        try
        {
            lsUFormato = format.toUpperCase();
            i = 0;
            while (i < lsUFormato.length())
            {
                switch (lsUFormato.charAt(i))
                {
                    case 'Y':
                        resultado = resultado + SacarCampoM(i, lsUFormato, 4, ModoTruncar.mTDerecha, date.get(Calendar.YEAR));
                        break;
                    case 'M':
                        resultado = resultado + SacarCampoM(i, lsUFormato, 2, ModoTruncar.mtTzquierda, date.get(Calendar.MONTH));
                        break;
                    case 'D':
                        resultado = resultado + SacarCampoM(i, lsUFormato, 2, ModoTruncar.mtTzquierda, date.get(Calendar.DAY_OF_MONTH));
                        break;
                    case 'H':
                        resultado = resultado + SacarCampoM(i, lsUFormato, 2, ModoTruncar.mtTzquierda, date.get(Calendar.HOUR_OF_DAY));
                        break;
                    case 'N':
                        resultado = resultado + SacarCampoM(i, lsUFormato, 2, ModoTruncar.mtTzquierda, date.get(Calendar.MINUTE));
                        break;
                    case 'S':
                        resultado = resultado + SacarCampoM(i, lsUFormato, 2, ModoTruncar.mtTzquierda, date.get(Calendar.SECOND));
                        break;
                    case 'F':
                        resultado = resultado + SacarCampoM(i, lsUFormato, 3, ModoTruncar.mTFraccion, date.get(Calendar.MILLISECOND));
                        break;
                    default:
                        resultado = resultado + format.charAt(i);
                        i++;
                        break;
                }
            }
        }
        catch (Exception e)
        {
          throw new Exception("MyDateTime.FormatDateTime(string, DateTime)");
        }
        return resultado;
    }
    
    public static Date SetFromFormat(String format, String value) throws Exception
    {
        Date resultado = null;
        int ano = 0, mes = 0, dia = 0, hora = 0, minuto = 0, segundo = 0, mili = 0;
        int lsiglo, lano;
        boolean lbOano = false, lbOmes = false, lbOdia = false;
        int lbOminuto = 0;
        int i, j, z, subformato = 0;
        Date d=new Date();
        Calendar date = dateToCalendar(d);
        try
        {
            if (value == null) value = "";
            format = format.toUpperCase();
            i = 0;
            while (i < format.length())
            {
                switch (format.charAt(i))
                {
                    case 'Y':
                        lbOano = true;
                        break;
                    case 'M':
                        lbOmes = true;
                        break;
                    case 'D':
                        lbOdia = true;
                        break;
                    case 'N':
                        lbOminuto = 1;
                        break;
                }
                i++;
            }
            i = 0;
            j = 0;
            while ((i < format.length()) && (j < value.length()))
            {
                switch (format.charAt(i))
                {
                    case 'Y':
                      lano = date.get(Calendar.YEAR);
                        lsiglo = lano / 100;
                        ano = SacarCampoM(i, j, format, value,subformato);
                        lbOano = false;
                        if ((subformato == 2) && (ano < 100))
                            ano = lsiglo * 100 + ano;
                        break;
                    case 'M':
                        mes = SacarCampoM(i, j, format, value, subformato);
                        lbOmes = false;
                        break;
                    case 'D':
                        dia = SacarCampoM(i,j, format, value, subformato);
                        lbOdia = false;
                        break;
                    case 'H':
                        hora = SacarCampoM(i, j, format, value,subformato);
                        lbOminuto++;
                        break;
                    case 'N':
                        minuto = SacarCampoM(i, j, format, value, subformato);
                        lbOminuto = -1;
                        break;
                    case 'S':
                        segundo = SacarCampoM(i, j, format, value,subformato);
                        break;
                    case 'F':
                        z = j;
                        mili = SacarCampoM(i,j, format, value,subformato);
                        if (subformato > 3) throw new Exception("Format exceeds precision in milliseconds.");
                        if ((j - z) < 3)
                        {
                            mili = mili * (int)Math.pow(10, 3 - (j - z));
                        }
                        break;
                    default:
                        if ((format.charAt(i) == value.charAt(j)) ||
                            (format.contains(CaracteresSeparador.toString()) && value.contains(CaracteresSeparador.toString())))
                        {
                            i++;
                            j++;
                        }
                        else throw new Exception("The value '" + value + "' does not correspond to the specified format : '" + format + "'");
                        break;
                }
            }
            if (lbOano || lbOmes || lbOdia || (lbOminuto == 2))
                throw new Exception("The value '" + value + "' does not correspond to the specified format : '" + format + "'");
           
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-M-dd hh:mm:ss");
            String dateInString = ano +"/"+ mes +"/"+ dia +"/"+ hora +":"+ minuto +":"+ segundo +":"+ mili;
            resultado = sdf.parse(dateInString);
                
        }
        catch (Exception e)
        {
            //MyObject.Coroner.write("MyDateTime.SetFromFormatt(string, string)", e);
          throw new Exception("SetFromFormat(String format, String value)");
        }
        return resultado;
    }
    
    public static String FormatDateTime(MyObject a, String formato, Date value) throws Exception
    {
        return FormatDateTime(formato, value);
    }
    public static Date ToDateTime(MyObject a, String formato, String valor) throws Exception
    {
        return MyDateTime.SetFromFormat(formato, valor);
    }
   
    public static int Maximum(int a, int b)
    {
        if (a > b) return a;
        else return b;
    }
    public static int Minimum(int a, int b)
    {
        if (a > b) return b;
        else return a;
    }   
}