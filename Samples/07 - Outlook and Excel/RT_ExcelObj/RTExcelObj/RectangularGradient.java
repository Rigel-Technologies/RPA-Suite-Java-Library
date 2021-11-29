package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface RectangularGradient extends Com4jObject {
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
   * Getter method for the COM property "ColorStops"
   * </p>
   */

  @DISPID(2761)
  @PropGet
  RTExcelObj.ColorStops colorStops();


  /**
   * <p>
   * Getter method for the COM property "RectangleTop"
   * </p>
   */

  @DISPID(2762)
  @PropGet
  double rectangleTop();


  /**
   * <p>
   * Setter method for the COM property "RectangleTop"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @DISPID(2762)
  @PropPut
  void rectangleTop(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "RectangleBottom"
   * </p>
   */

  @DISPID(2763)
  @PropGet
  double rectangleBottom();


  /**
   * <p>
   * Setter method for the COM property "RectangleBottom"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @DISPID(2763)
  @PropPut
  void rectangleBottom(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "RectangleLeft"
   * </p>
   */

  @DISPID(2764)
  @PropGet
  double rectangleLeft();


  /**
   * <p>
   * Setter method for the COM property "RectangleLeft"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @DISPID(2764)
  @PropPut
  void rectangleLeft(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "RectangleRight"
   * </p>
   */

  @DISPID(2765)
  @PropGet
  double rectangleRight();


  /**
   * <p>
   * Setter method for the COM property "RectangleRight"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @DISPID(2765)
  @PropPut
  void rectangleRight(
    double rhs);


  // Properties:
}
