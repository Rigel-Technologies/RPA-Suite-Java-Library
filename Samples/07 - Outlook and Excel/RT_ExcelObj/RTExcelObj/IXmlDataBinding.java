package RTExcelObj  ;

import com4j.*;

@IID("{00024478-0001-0000-C000-000000000046}")
public interface IXmlDataBinding extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type RTExcelObj._Application
   */

  @VTID(7)
  RTExcelObj._Application application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlCreator
   */

  @VTID(8)
  RTExcelObj.XlCreator creator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(10)
  @DefaultMethod
  java.lang.String _Default();


  /**
   * @return  Returns a value of type RTExcelObj.XlXmlImportResult
   */

  @VTID(11)
  RTExcelObj.XlXmlImportResult refresh();


  /**
   * @param url Mandatory java.lang.String parameter.
   */

  @VTID(12)
  void loadSettings(
    java.lang.String url);


  /**
   */

  @VTID(13)
  void clearSettings();


  /**
   * <p>
   * Getter method for the COM property "SourceUrl"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(14)
  java.lang.String sourceUrl();


  // Properties:
}
