package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface Walls extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   */

  @DISPID(148)
  @PropGet
  RTExcelObj._Application application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   */

  @DISPID(149)
  @PropGet
  RTExcelObj.XlCreator creator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   */

  @DISPID(150)
  @PropGet
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   */

  @DISPID(110)
  @PropGet
  java.lang.String name();


  /**
   */

  @DISPID(235)
  java.lang.Object select();


  /**
   * <p>
   * Getter method for the COM property "Border"
   * </p>
   */

  @DISPID(128)
  @PropGet
  RTExcelObj.Border border();


  /**
   */

  @DISPID(112)
  java.lang.Object clearFormats();


  /**
   * <p>
   * Getter method for the COM property "Interior"
   * </p>
   */

  @DISPID(129)
  @PropGet
  RTExcelObj.Interior interior();


  /**
   * <p>
   * Getter method for the COM property "Fill"
   * </p>
   */

  @DISPID(1663)
  @PropGet
  RTExcelObj.ChartFillFormat fill();


  /**
   * <p>
   * Getter method for the COM property "PictureType"
   * </p>
   */

  @DISPID(161)
  @PropGet
  java.lang.Object pictureType();


  /**
   * <p>
   * Setter method for the COM property "PictureType"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(161)
  @PropPut
  void pictureType(
    java.lang.Object rhs);


  /**
   */

  @DISPID(211)
  void paste();


  /**
   * <p>
   * Getter method for the COM property "PictureUnit"
   * </p>
   */

  @DISPID(162)
  @PropGet
  java.lang.Object pictureUnit();


  /**
   * <p>
   * Setter method for the COM property "PictureUnit"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(162)
  @PropPut
  void pictureUnit(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "Thickness"
   * </p>
   */

  @DISPID(2652)
  @PropGet
  int thickness();


  /**
   * <p>
   * Setter method for the COM property "Thickness"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(2652)
  @PropPut
  void thickness(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "Format"
   * </p>
   */

  @DISPID(116)
  @PropGet
  RTExcelObj.ChartFormat format();


  // Properties:
}
