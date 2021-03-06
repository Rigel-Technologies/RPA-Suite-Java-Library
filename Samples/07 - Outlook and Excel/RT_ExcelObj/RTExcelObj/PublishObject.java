package RTExcelObj  ;

import com4j.*;

@IID("{00024444-0000-0000-C000-000000000046}")
public interface PublishObject extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type RTExcelObj._Application
   */

  @DISPID(148) //= 0x94. The runtime will prefer the VTID if present
  @VTID(7)
  RTExcelObj._Application application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlCreator
   */

  @DISPID(149) //= 0x95. The runtime will prefer the VTID if present
  @VTID(8)
  RTExcelObj.XlCreator creator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(150) //= 0x96. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   */

  @DISPID(117) //= 0x75. The runtime will prefer the VTID if present
  @VTID(10)
  void delete();


  /**
   * @param create Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1895) //= 0x767. The runtime will prefer the VTID if present
  @VTID(11)
  void publish(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object create);


  /**
   * <p>
   * Getter method for the COM property "DivID"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1894) //= 0x766. The runtime will prefer the VTID if present
  @VTID(12)
  java.lang.String divID();


  /**
   * <p>
   * Getter method for the COM property "Sheet"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(751) //= 0x2ef. The runtime will prefer the VTID if present
  @VTID(13)
  java.lang.String sheet();


  /**
   * <p>
   * Getter method for the COM property "SourceType"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlSourceType
   */

  @DISPID(685) //= 0x2ad. The runtime will prefer the VTID if present
  @VTID(14)
  RTExcelObj.XlSourceType sourceType();


  /**
   * <p>
   * Getter method for the COM property "Source"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(222) //= 0xde. The runtime will prefer the VTID if present
  @VTID(15)
  java.lang.String source();


  /**
   * <p>
   * Getter method for the COM property "HtmlType"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlHtmlType
   */

  @DISPID(1893) //= 0x765. The runtime will prefer the VTID if present
  @VTID(16)
  RTExcelObj.XlHtmlType htmlType();


  /**
   * <p>
   * Setter method for the COM property "HtmlType"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlHtmlType parameter.
   */

  @DISPID(1893) //= 0x765. The runtime will prefer the VTID if present
  @VTID(17)
  void htmlType(
    RTExcelObj.XlHtmlType rhs);


  /**
   * <p>
   * Getter method for the COM property "Title"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(199) //= 0xc7. The runtime will prefer the VTID if present
  @VTID(18)
  java.lang.String title();


  /**
   * <p>
   * Setter method for the COM property "Title"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(199) //= 0xc7. The runtime will prefer the VTID if present
  @VTID(19)
  void title(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Filename"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1415) //= 0x587. The runtime will prefer the VTID if present
  @VTID(20)
  java.lang.String filename();


  /**
   * <p>
   * Setter method for the COM property "Filename"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1415) //= 0x587. The runtime will prefer the VTID if present
  @VTID(21)
  void filename(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "AutoRepublish"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2178) //= 0x882. The runtime will prefer the VTID if present
  @VTID(22)
  boolean autoRepublish();


  /**
   * <p>
   * Setter method for the COM property "AutoRepublish"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2178) //= 0x882. The runtime will prefer the VTID if present
  @VTID(23)
  void autoRepublish(
    boolean rhs);


  // Properties:
}
