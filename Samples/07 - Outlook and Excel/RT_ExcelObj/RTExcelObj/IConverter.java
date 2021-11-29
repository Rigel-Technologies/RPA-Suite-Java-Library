package RTExcelObj  ;

import com4j.*;

@IID("{000C03D7-0000-0000-C000-000000000046}")
public interface IConverter extends Com4jObject {
  // Methods:
  /**
   * @param pcap Mandatory RTExcelObj.IConverterApplicationPreferences parameter.
   * @param pcuic Mandatory RTExcelObj.IConverterUICallback parameter.
   * @return  Returns a value of type RTExcelObj.IConverterPreferences
   */

  @VTID(3)
  @ReturnValue(index=1)
  RTExcelObj.IConverterPreferences hrInitConverter(
    RTExcelObj.IConverterApplicationPreferences pcap,
    RTExcelObj.IConverterUICallback pcuic);


  /**
   * @param pcuic Mandatory RTExcelObj.IConverterUICallback parameter.
   */

  @VTID(4)
  void hrUninitConverter(
    RTExcelObj.IConverterUICallback pcuic);


  /**
   * @param bstrSourcePath Mandatory java.lang.String parameter.
   * @param bstrDestPath Mandatory java.lang.String parameter.
   * @param pcap Mandatory RTExcelObj.IConverterApplicationPreferences parameter.
   * @param pcuic Mandatory RTExcelObj.IConverterUICallback parameter.
   * @return  Returns a value of type RTExcelObj.IConverterPreferences
   */

  @VTID(5)
  @ReturnValue(index=3)
  RTExcelObj.IConverterPreferences hrImport(
    java.lang.String bstrSourcePath,
    java.lang.String bstrDestPath,
    RTExcelObj.IConverterApplicationPreferences pcap,
    RTExcelObj.IConverterUICallback pcuic);


  /**
   * @param bstrSourcePath Mandatory java.lang.String parameter.
   * @param bstrDestPath Mandatory java.lang.String parameter.
   * @param bstrClass Mandatory java.lang.String parameter.
   * @param pcap Mandatory RTExcelObj.IConverterApplicationPreferences parameter.
   * @param pcuic Mandatory RTExcelObj.IConverterUICallback parameter.
   * @return  Returns a value of type RTExcelObj.IConverterPreferences
   */

  @VTID(6)
  @ReturnValue(index=4)
  RTExcelObj.IConverterPreferences hrExport(
    java.lang.String bstrSourcePath,
    java.lang.String bstrDestPath,
    java.lang.String bstrClass,
    RTExcelObj.IConverterApplicationPreferences pcap,
    RTExcelObj.IConverterUICallback pcuic);


  /**
   * @param bstrPath Mandatory java.lang.String parameter.
   * @param pbstrClass Mandatory Holder<java.lang.String> parameter.
   * @param pcap Mandatory RTExcelObj.IConverterApplicationPreferences parameter.
   * @param ppcp Mandatory Holder<RTExcelObj.IConverterPreferences> parameter.
   * @param pcuic Mandatory RTExcelObj.IConverterUICallback parameter.
   */

  @VTID(7)
  void hrGetFormat(
    java.lang.String bstrPath,
    Holder<java.lang.String> pbstrClass,
    RTExcelObj.IConverterApplicationPreferences pcap,
    Holder<RTExcelObj.IConverterPreferences> ppcp,
    RTExcelObj.IConverterUICallback pcuic);


  /**
   * @param hrErr Mandatory int parameter.
   * @param pcap Mandatory RTExcelObj.IConverterApplicationPreferences parameter.
   * @return  Returns a value of type java.lang.String
   */

  @VTID(8)
  @ReturnValue(index=1)
  java.lang.String hrGetErrorString(
    int hrErr,
    RTExcelObj.IConverterApplicationPreferences pcap);


  // Properties:
}
