package RTExcelObj  ;

import com4j.*;

@IID("{000244AC-0001-0000-C000-000000000046}")
public interface IResearch extends Com4jObject {
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
   * @param serviceID Mandatory java.lang.String parameter.
   * @param queryString Optional parameter. Default value is com4j.Variant.getMissing()
   * @param queryLanguage Optional parameter. Default value is com4j.Variant.getMissing()
   * @param useSelection Optional parameter. Default value is com4j.Variant.getMissing()
   * @param launchQuery Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(10)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object query(
    java.lang.String serviceID,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object queryString,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object queryLanguage,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object useSelection,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object launchQuery);


  /**
   * @param serviceID Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @VTID(11)
  boolean isResearchService(
    java.lang.String serviceID);


  /**
   * @param languageFrom Mandatory int parameter.
   * @param languageTo Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(12)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object setLanguagePair(
    int languageFrom,
    int languageTo);


  // Properties:
}
