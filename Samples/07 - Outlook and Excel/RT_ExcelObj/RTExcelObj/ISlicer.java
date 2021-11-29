package RTExcelObj  ;

import com4j.*;

@IID("{000244C8-0001-0000-C000-000000000046}")
public interface ISlicer extends Com4jObject {
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
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(10)
  java.lang.String name();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(11)
  void name(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Caption"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(12)
  java.lang.String caption();


  /**
   * <p>
   * Setter method for the COM property "Caption"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(13)
  void caption(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Top"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(14)
  double top();


  /**
   * <p>
   * Setter method for the COM property "Top"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @VTID(15)
  void top(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "Left"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(16)
  double left();


  /**
   * <p>
   * Setter method for the COM property "Left"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @VTID(17)
  void left(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "DisableMoveResizeUI"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(18)
  boolean disableMoveResizeUI();


  /**
   * <p>
   * Setter method for the COM property "DisableMoveResizeUI"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(19)
  void disableMoveResizeUI(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Width"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(20)
  double width();


  /**
   * <p>
   * Setter method for the COM property "Width"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @VTID(21)
  void width(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "Height"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(22)
  double height();


  /**
   * <p>
   * Setter method for the COM property "Height"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @VTID(23)
  void height(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "RowHeight"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(24)
  double rowHeight();


  /**
   * <p>
   * Setter method for the COM property "RowHeight"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @VTID(25)
  void rowHeight(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "ColumnWidth"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(26)
  double columnWidth();


  /**
   * <p>
   * Setter method for the COM property "ColumnWidth"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @VTID(27)
  void columnWidth(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "NumberOfColumns"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(28)
  int numberOfColumns();


  /**
   * <p>
   * Setter method for the COM property "NumberOfColumns"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(29)
  void numberOfColumns(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayHeader"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(30)
  boolean displayHeader();


  /**
   * <p>
   * Setter method for the COM property "DisplayHeader"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(31)
  void displayHeader(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Locked"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(32)
  boolean locked();


  /**
   * <p>
   * Setter method for the COM property "Locked"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(33)
  void locked(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "SlicerCache"
   * </p>
   * @return  Returns a value of type RTExcelObj.SlicerCache
   */

  @VTID(34)
  RTExcelObj.SlicerCache slicerCache();


  /**
   * <p>
   * Getter method for the COM property "SlicerCacheLevel"
   * </p>
   * @return  Returns a value of type RTExcelObj.SlicerCacheLevel
   */

  @VTID(35)
  RTExcelObj.SlicerCacheLevel slicerCacheLevel();


  /**
   * <p>
   * Getter method for the COM property "Shape"
   * </p>
   * @return  Returns a value of type RTExcelObj.Shape
   */

  @VTID(36)
  RTExcelObj.Shape shape();


  /**
   * <p>
   * Getter method for the COM property "Style"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(37)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object style();


  /**
   * <p>
   * Setter method for the COM property "Style"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(38)
  void style(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   */

  @VTID(39)
  void delete();


  /**
   */

  @VTID(40)
  void cut();


  /**
   */

  @VTID(41)
  void copy();


  /**
   * <p>
   * Getter method for the COM property "ActiveItem"
   * </p>
   * @return  Returns a value of type RTExcelObj.SlicerItem
   */

  @VTID(42)
  RTExcelObj.SlicerItem activeItem();


  /**
   * <p>
   * Getter method for the COM property "TimelineViewState"
   * </p>
   * @return  Returns a value of type RTExcelObj.TimelineViewState
   */

  @VTID(43)
  RTExcelObj.TimelineViewState timelineViewState();


  /**
   * <p>
   * Getter method for the COM property "SlicerCacheType"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlSlicerCacheType
   */

  @VTID(44)
  RTExcelObj.XlSlicerCacheType slicerCacheType();


  // Properties:
}
