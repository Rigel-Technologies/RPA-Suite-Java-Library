package RTExcelObj  ;

import com4j.*;

@IID("{000244E0-0001-0000-C000-000000000046}")
public interface ITimelineViewState extends Com4jObject {
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
   * Getter method for the COM property "ShowHeader"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(10)
  boolean showHeader();


  /**
   * <p>
   * Setter method for the COM property "ShowHeader"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(11)
  void showHeader(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowSelectionLabel"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(12)
  boolean showSelectionLabel();


  /**
   * <p>
   * Setter method for the COM property "ShowSelectionLabel"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(13)
  void showSelectionLabel(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowTimeLevel"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(14)
  boolean showTimeLevel();


  /**
   * <p>
   * Setter method for the COM property "ShowTimeLevel"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(15)
  void showTimeLevel(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowHorizontalScrollbar"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(16)
  boolean showHorizontalScrollbar();


  /**
   * <p>
   * Setter method for the COM property "ShowHorizontalScrollbar"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(17)
  void showHorizontalScrollbar(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Level"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlTimelineLevel
   */

  @VTID(18)
  RTExcelObj.XlTimelineLevel level();


  /**
   * <p>
   * Setter method for the COM property "Level"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlTimelineLevel parameter.
   */

  @VTID(19)
  void level(
    RTExcelObj.XlTimelineLevel rhs);


  // Properties:
}
