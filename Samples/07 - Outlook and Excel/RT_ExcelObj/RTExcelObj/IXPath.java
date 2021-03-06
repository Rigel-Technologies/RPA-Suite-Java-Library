package RTExcelObj  ;

import com4j.*;

@IID("{0002447E-0001-0000-C000-000000000046}")
public interface IXPath extends Com4jObject {
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
   * <p>
   * Getter method for the COM property "Value"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(11)
  java.lang.String value();


  /**
   * <p>
   * Getter method for the COM property "Map"
   * </p>
   * @return  Returns a value of type RTExcelObj.XmlMap
   */

  @VTID(12)
  RTExcelObj.XmlMap map();


  /**
   * @param map Mandatory RTExcelObj.XmlMap parameter.
   * @param xPath Mandatory java.lang.String parameter.
   * @param selectionNamespace Optional parameter. Default value is com4j.Variant.getMissing()
   * @param repeating Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @VTID(13)
  void setValue(
    RTExcelObj.XmlMap map,
    java.lang.String xPath,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object selectionNamespace,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object repeating);


  /**
   */

  @VTID(14)
  void clear();


  /**
   * <p>
   * Getter method for the COM property "Repeating"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(15)
  boolean repeating();


  // Properties:
}
