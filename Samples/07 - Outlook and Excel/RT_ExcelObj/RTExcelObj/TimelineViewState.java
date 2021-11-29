package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface TimelineViewState extends Com4jObject {
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
   * Getter method for the COM property "ShowHeader"
   * </p>
   */

  @DISPID(3139)
  @PropGet
  boolean showHeader();


  /**
   * <p>
   * Setter method for the COM property "ShowHeader"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(3139)
  @PropPut
  void showHeader(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowSelectionLabel"
   * </p>
   */

  @DISPID(3140)
  @PropGet
  boolean showSelectionLabel();


  /**
   * <p>
   * Setter method for the COM property "ShowSelectionLabel"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(3140)
  @PropPut
  void showSelectionLabel(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowTimeLevel"
   * </p>
   */

  @DISPID(3141)
  @PropGet
  boolean showTimeLevel();


  /**
   * <p>
   * Setter method for the COM property "ShowTimeLevel"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(3141)
  @PropPut
  void showTimeLevel(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowHorizontalScrollbar"
   * </p>
   */

  @DISPID(3142)
  @PropGet
  boolean showHorizontalScrollbar();


  /**
   * <p>
   * Setter method for the COM property "ShowHorizontalScrollbar"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(3142)
  @PropPut
  void showHorizontalScrollbar(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Level"
   * </p>
   */

  @DISPID(2980)
  @PropGet
  RTExcelObj.XlTimelineLevel level();


  /**
   * <p>
   * Setter method for the COM property "Level"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlTimelineLevel parameter.
   */

  @DISPID(2980)
  @PropPut
  void level(
    RTExcelObj.XlTimelineLevel rhs);


  // Properties:
}
