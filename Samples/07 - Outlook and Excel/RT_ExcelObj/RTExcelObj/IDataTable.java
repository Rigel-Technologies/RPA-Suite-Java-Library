package RTExcelObj  ;

import com4j.*;

@IID("{00020843-0001-0000-C000-000000000046}")
public interface IDataTable extends Com4jObject {
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
   * Getter method for the COM property "ShowLegendKey"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(10)
  boolean showLegendKey();


  /**
   * <p>
   * Setter method for the COM property "ShowLegendKey"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(11)
  void showLegendKey(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "HasBorderHorizontal"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(12)
  boolean hasBorderHorizontal();


  /**
   * <p>
   * Setter method for the COM property "HasBorderHorizontal"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(13)
  void hasBorderHorizontal(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "HasBorderVertical"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(14)
  boolean hasBorderVertical();


  /**
   * <p>
   * Setter method for the COM property "HasBorderVertical"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(15)
  void hasBorderVertical(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "HasBorderOutline"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(16)
  boolean hasBorderOutline();


  /**
   * <p>
   * Setter method for the COM property "HasBorderOutline"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(17)
  void hasBorderOutline(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Border"
   * </p>
   * @return  Returns a value of type RTExcelObj.Border
   */

  @VTID(18)
  RTExcelObj.Border border();


  /**
   * <p>
   * Getter method for the COM property "Font"
   * </p>
   * @return  Returns a value of type RTExcelObj.Font
   */

  @VTID(19)
  RTExcelObj.Font font();


  /**
   */

  @VTID(20)
  void select();


  /**
   */

  @VTID(21)
  void delete();


  /**
   * <p>
   * Getter method for the COM property "AutoScaleFont"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(22)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object autoScaleFont();


  /**
   * <p>
   * Setter method for the COM property "AutoScaleFont"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(23)
  void autoScaleFont(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "Format"
   * </p>
   * @return  Returns a value of type RTExcelObj.ChartFormat
   */

  @VTID(24)
  RTExcelObj.ChartFormat format();


  // Properties:
}
