package RT_MSOutlook  ;

import com4j.*;

@IID("{000C03D7-0000-0000-C000-000000000046}")
public interface IConverter extends Com4jObject {
  // Methods:
  /**
   * @param pcap Mandatory RT_MSOutlook.IConverterApplicationPreferences parameter.
   * @param pcuic Mandatory RT_MSOutlook.IConverterUICallback parameter.
   * @return  Returns a value of type RT_MSOutlook.IConverterPreferences
   */

  @VTID(3)
  @ReturnValue(index=1)
  RT_MSOutlook.IConverterPreferences hrInitConverter(
    RT_MSOutlook.IConverterApplicationPreferences pcap,
    RT_MSOutlook.IConverterUICallback pcuic);


  /**
   * @param pcuic Mandatory RT_MSOutlook.IConverterUICallback parameter.
   */

  @VTID(4)
  void hrUninitConverter(
    RT_MSOutlook.IConverterUICallback pcuic);


  /**
   * @param bstrSourcePath Mandatory java.lang.String parameter.
   * @param bstrDestPath Mandatory java.lang.String parameter.
   * @param pcap Mandatory RT_MSOutlook.IConverterApplicationPreferences parameter.
   * @param pcuic Mandatory RT_MSOutlook.IConverterUICallback parameter.
   * @return  Returns a value of type RT_MSOutlook.IConverterPreferences
   */

  @VTID(5)
  @ReturnValue(index=3)
  RT_MSOutlook.IConverterPreferences hrImport(
    java.lang.String bstrSourcePath,
    java.lang.String bstrDestPath,
    RT_MSOutlook.IConverterApplicationPreferences pcap,
    RT_MSOutlook.IConverterUICallback pcuic);


  /**
   * @param bstrSourcePath Mandatory java.lang.String parameter.
   * @param bstrDestPath Mandatory java.lang.String parameter.
   * @param bstrClass Mandatory java.lang.String parameter.
   * @param pcap Mandatory RT_MSOutlook.IConverterApplicationPreferences parameter.
   * @param pcuic Mandatory RT_MSOutlook.IConverterUICallback parameter.
   * @return  Returns a value of type RT_MSOutlook.IConverterPreferences
   */

  @VTID(6)
  @ReturnValue(index=4)
  RT_MSOutlook.IConverterPreferences hrExport(
    java.lang.String bstrSourcePath,
    java.lang.String bstrDestPath,
    java.lang.String bstrClass,
    RT_MSOutlook.IConverterApplicationPreferences pcap,
    RT_MSOutlook.IConverterUICallback pcuic);


  /**
   * @param bstrPath Mandatory java.lang.String parameter.
   * @param pbstrClass Mandatory Holder<java.lang.String> parameter.
   * @param pcap Mandatory RT_MSOutlook.IConverterApplicationPreferences parameter.
   * @param ppcp Mandatory Holder<RT_MSOutlook.IConverterPreferences> parameter.
   * @param pcuic Mandatory RT_MSOutlook.IConverterUICallback parameter.
   */

  @VTID(7)
  void hrGetFormat(
    java.lang.String bstrPath,
    Holder<java.lang.String> pbstrClass,
    RT_MSOutlook.IConverterApplicationPreferences pcap,
    Holder<RT_MSOutlook.IConverterPreferences> ppcp,
    RT_MSOutlook.IConverterUICallback pcuic);


  /**
   * @param hrErr Mandatory int parameter.
   * @param pcap Mandatory RT_MSOutlook.IConverterApplicationPreferences parameter.
   * @return  Returns a value of type java.lang.String
   */

  @VTID(8)
  @ReturnValue(index=1)
  java.lang.String hrGetErrorString(
    int hrErr,
    RT_MSOutlook.IConverterApplicationPreferences pcap);


  // Properties:
}
