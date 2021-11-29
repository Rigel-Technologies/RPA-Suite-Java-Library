package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface TableStyle extends Com4jObject {
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
   * Getter method for the COM property "_Default"
   * </p>
   */

  @DISPID(0)
  @PropGet
  @DefaultMethod
  java.lang.String _Default();


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   */

  @DISPID(110)
  @PropGet
  java.lang.String name();


  /**
   * <p>
   * Getter method for the COM property "NameLocal"
   * </p>
   */

  @DISPID(937)
  @PropGet
  java.lang.String nameLocal();


  /**
   * <p>
   * Getter method for the COM property "BuiltIn"
   * </p>
   */

  @DISPID(553)
  @PropGet
  boolean builtIn();


  /**
   * <p>
   * Getter method for the COM property "TableStyleElements"
   * </p>
   */

  @DISPID(2737)
  @PropGet
  RTExcelObj.TableStyleElements tableStyleElements();


  /**
   * <p>
   * Getter method for the COM property "ShowAsAvailableTableStyle"
   * </p>
   */

  @DISPID(2738)
  @PropGet
  boolean showAsAvailableTableStyle();


  /**
   * <p>
   * Setter method for the COM property "ShowAsAvailableTableStyle"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2738)
  @PropPut
  void showAsAvailableTableStyle(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowAsAvailablePivotTableStyle"
   * </p>
   */

  @DISPID(2739)
  @PropGet
  boolean showAsAvailablePivotTableStyle();


  /**
   * <p>
   * Setter method for the COM property "ShowAsAvailablePivotTableStyle"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2739)
  @PropPut
  void showAsAvailablePivotTableStyle(
    boolean rhs);


  /**
   */

  @DISPID(117)
  void delete();


  /**
   * @param newTableStyleName Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1039)
  RTExcelObj.TableStyle duplicate(
    @Optional java.lang.Object newTableStyleName);


  /**
   * <p>
   * Getter method for the COM property "ShowAsAvailableSlicerStyle"
   * </p>
   */

  @DISPID(2946)
  @PropGet
  boolean showAsAvailableSlicerStyle();


  /**
   * <p>
   * Setter method for the COM property "ShowAsAvailableSlicerStyle"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2946)
  @PropPut
  void showAsAvailableSlicerStyle(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowAsAvailableTimelineStyle"
   * </p>
   */

  @DISPID(3110)
  @PropGet
  boolean showAsAvailableTimelineStyle();


  /**
   * <p>
   * Setter method for the COM property "ShowAsAvailableTimelineStyle"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(3110)
  @PropPut
  void showAsAvailableTimelineStyle(
    boolean rhs);


  // Properties:
}
