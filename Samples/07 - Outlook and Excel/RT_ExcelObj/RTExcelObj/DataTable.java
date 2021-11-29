package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface DataTable extends Com4jObject {
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
   * Getter method for the COM property "ShowLegendKey"
   * </p>
   */

  @DISPID(171)
  @PropGet
  boolean showLegendKey();


  /**
   * <p>
   * Setter method for the COM property "ShowLegendKey"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(171)
  @PropPut
  void showLegendKey(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "HasBorderHorizontal"
   * </p>
   */

  @DISPID(1671)
  @PropGet
  boolean hasBorderHorizontal();


  /**
   * <p>
   * Setter method for the COM property "HasBorderHorizontal"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1671)
  @PropPut
  void hasBorderHorizontal(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "HasBorderVertical"
   * </p>
   */

  @DISPID(1672)
  @PropGet
  boolean hasBorderVertical();


  /**
   * <p>
   * Setter method for the COM property "HasBorderVertical"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1672)
  @PropPut
  void hasBorderVertical(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "HasBorderOutline"
   * </p>
   */

  @DISPID(1673)
  @PropGet
  boolean hasBorderOutline();


  /**
   * <p>
   * Setter method for the COM property "HasBorderOutline"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1673)
  @PropPut
  void hasBorderOutline(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Border"
   * </p>
   */

  @DISPID(128)
  @PropGet
  RTExcelObj.Border border();


  /**
   * <p>
   * Getter method for the COM property "Font"
   * </p>
   */

  @DISPID(146)
  @PropGet
  RTExcelObj.Font font();


  /**
   */

  @DISPID(235)
  void select();


  /**
   */

  @DISPID(117)
  void delete();


  /**
   * <p>
   * Getter method for the COM property "AutoScaleFont"
   * </p>
   */

  @DISPID(1525)
  @PropGet
  java.lang.Object autoScaleFont();


  /**
   * <p>
   * Setter method for the COM property "AutoScaleFont"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(1525)
  @PropPut
  void autoScaleFont(
    java.lang.Object rhs);


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
