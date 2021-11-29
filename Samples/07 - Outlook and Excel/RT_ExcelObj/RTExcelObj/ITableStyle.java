package RTExcelObj  ;

import com4j.*;

@IID("{000244A7-0001-0000-C000-000000000046}")
public interface ITableStyle extends Com4jObject {
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
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(11)
  java.lang.String name();


  /**
   * <p>
   * Getter method for the COM property "NameLocal"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(12)
  java.lang.String nameLocal();


  /**
   * <p>
   * Getter method for the COM property "BuiltIn"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(13)
  boolean builtIn();


  /**
   * <p>
   * Getter method for the COM property "TableStyleElements"
   * </p>
   * @return  Returns a value of type RTExcelObj.TableStyleElements
   */

  @VTID(14)
  RTExcelObj.TableStyleElements tableStyleElements();


  /**
   * <p>
   * Getter method for the COM property "ShowAsAvailableTableStyle"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(15)
  boolean showAsAvailableTableStyle();


  /**
   * <p>
   * Setter method for the COM property "ShowAsAvailableTableStyle"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(16)
  void showAsAvailableTableStyle(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowAsAvailablePivotTableStyle"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(17)
  boolean showAsAvailablePivotTableStyle();


  /**
   * <p>
   * Setter method for the COM property "ShowAsAvailablePivotTableStyle"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(18)
  void showAsAvailablePivotTableStyle(
    boolean rhs);


  /**
   */

  @VTID(19)
  void delete();


  /**
   * @param newTableStyleName Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type RTExcelObj.TableStyle
   */

  @VTID(20)
  RTExcelObj.TableStyle duplicate(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object newTableStyleName);


  /**
   * <p>
   * Getter method for the COM property "ShowAsAvailableSlicerStyle"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(21)
  boolean showAsAvailableSlicerStyle();


  /**
   * <p>
   * Setter method for the COM property "ShowAsAvailableSlicerStyle"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(22)
  void showAsAvailableSlicerStyle(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowAsAvailableTimelineStyle"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(23)
  boolean showAsAvailableTimelineStyle();


  /**
   * <p>
   * Setter method for the COM property "ShowAsAvailableTimelineStyle"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(24)
  void showAsAvailableTimelineStyle(
    boolean rhs);


  // Properties:
}
