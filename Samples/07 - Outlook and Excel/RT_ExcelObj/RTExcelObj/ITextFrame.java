package RTExcelObj  ;

import com4j.*;

@IID("{0002443D-0001-0000-C000-000000000046}")
public interface ITextFrame extends Com4jObject {
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
   * Getter method for the COM property "MarginBottom"
   * </p>
   * @return  Returns a value of type float
   */

  @VTID(10)
  float marginBottom();


  /**
   * <p>
   * Setter method for the COM property "MarginBottom"
   * </p>
   * @param rhs Mandatory float parameter.
   */

  @VTID(11)
  void marginBottom(
    float rhs);


  /**
   * <p>
   * Getter method for the COM property "MarginLeft"
   * </p>
   * @return  Returns a value of type float
   */

  @VTID(12)
  float marginLeft();


  /**
   * <p>
   * Setter method for the COM property "MarginLeft"
   * </p>
   * @param rhs Mandatory float parameter.
   */

  @VTID(13)
  void marginLeft(
    float rhs);


  /**
   * <p>
   * Getter method for the COM property "MarginRight"
   * </p>
   * @return  Returns a value of type float
   */

  @VTID(14)
  float marginRight();


  /**
   * <p>
   * Setter method for the COM property "MarginRight"
   * </p>
   * @param rhs Mandatory float parameter.
   */

  @VTID(15)
  void marginRight(
    float rhs);


  /**
   * <p>
   * Getter method for the COM property "MarginTop"
   * </p>
   * @return  Returns a value of type float
   */

  @VTID(16)
  float marginTop();


  /**
   * <p>
   * Setter method for the COM property "MarginTop"
   * </p>
   * @param rhs Mandatory float parameter.
   */

  @VTID(17)
  void marginTop(
    float rhs);


  /**
   * <p>
   * Getter method for the COM property "Orientation"
   * </p>
   * @return  Returns a value of type RTExcelObj.MsoTextOrientation
   */

  @VTID(18)
  RTExcelObj.MsoTextOrientation orientation();


  /**
   * <p>
   * Setter method for the COM property "Orientation"
   * </p>
   * @param rhs Mandatory RTExcelObj.MsoTextOrientation parameter.
   */

  @VTID(19)
  void orientation(
    RTExcelObj.MsoTextOrientation rhs);


  /**
   * @param start Optional parameter. Default value is com4j.Variant.getMissing()
   * @param length Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type RTExcelObj.Characters
   */

  @VTID(20)
  RTExcelObj.Characters characters(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object start,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object length);


  /**
   * <p>
   * Getter method for the COM property "HorizontalAlignment"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlHAlign
   */

  @VTID(21)
  RTExcelObj.XlHAlign horizontalAlignment();


  /**
   * <p>
   * Setter method for the COM property "HorizontalAlignment"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlHAlign parameter.
   */

  @VTID(22)
  void horizontalAlignment(
    RTExcelObj.XlHAlign rhs);


  /**
   * <p>
   * Getter method for the COM property "VerticalAlignment"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlVAlign
   */

  @VTID(23)
  RTExcelObj.XlVAlign verticalAlignment();


  /**
   * <p>
   * Setter method for the COM property "VerticalAlignment"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlVAlign parameter.
   */

  @VTID(24)
  void verticalAlignment(
    RTExcelObj.XlVAlign rhs);


  /**
   * <p>
   * Getter method for the COM property "AutoSize"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(25)
  boolean autoSize();


  /**
   * <p>
   * Setter method for the COM property "AutoSize"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(26)
  void autoSize(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ReadingOrder"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(27)
  int readingOrder();


  /**
   * <p>
   * Setter method for the COM property "ReadingOrder"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(28)
  void readingOrder(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "AutoMargins"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(29)
  boolean autoMargins();


  /**
   * <p>
   * Setter method for the COM property "AutoMargins"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(30)
  void autoMargins(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "VerticalOverflow"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlOartVerticalOverflow
   */

  @VTID(31)
  RTExcelObj.XlOartVerticalOverflow verticalOverflow();


  /**
   * <p>
   * Setter method for the COM property "VerticalOverflow"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlOartVerticalOverflow parameter.
   */

  @VTID(32)
  void verticalOverflow(
    RTExcelObj.XlOartVerticalOverflow rhs);


  /**
   * <p>
   * Getter method for the COM property "HorizontalOverflow"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlOartHorizontalOverflow
   */

  @VTID(33)
  RTExcelObj.XlOartHorizontalOverflow horizontalOverflow();


  /**
   * <p>
   * Setter method for the COM property "HorizontalOverflow"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlOartHorizontalOverflow parameter.
   */

  @VTID(34)
  void horizontalOverflow(
    RTExcelObj.XlOartHorizontalOverflow rhs);


  // Properties:
}
