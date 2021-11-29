package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface Slicer extends Com4jObject {
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
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(110)
  @PropPut
  void name(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Caption"
   * </p>
   */

  @DISPID(139)
  @PropGet
  java.lang.String caption();


  /**
   * <p>
   * Setter method for the COM property "Caption"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(139)
  @PropPut
  void caption(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Top"
   * </p>
   */

  @DISPID(126)
  @PropGet
  double top();


  /**
   * <p>
   * Setter method for the COM property "Top"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @DISPID(126)
  @PropPut
  void top(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "Left"
   * </p>
   */

  @DISPID(127)
  @PropGet
  double left();


  /**
   * <p>
   * Setter method for the COM property "Left"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @DISPID(127)
  @PropPut
  void left(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "DisableMoveResizeUI"
   * </p>
   */

  @DISPID(2983)
  @PropGet
  boolean disableMoveResizeUI();


  /**
   * <p>
   * Setter method for the COM property "DisableMoveResizeUI"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2983)
  @PropPut
  void disableMoveResizeUI(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Width"
   * </p>
   */

  @DISPID(122)
  @PropGet
  double width();


  /**
   * <p>
   * Setter method for the COM property "Width"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @DISPID(122)
  @PropPut
  void width(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "Height"
   * </p>
   */

  @DISPID(123)
  @PropGet
  double height();


  /**
   * <p>
   * Setter method for the COM property "Height"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @DISPID(123)
  @PropPut
  void height(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "RowHeight"
   * </p>
   */

  @DISPID(272)
  @PropGet
  double rowHeight();


  /**
   * <p>
   * Setter method for the COM property "RowHeight"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @DISPID(272)
  @PropPut
  void rowHeight(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "ColumnWidth"
   * </p>
   */

  @DISPID(242)
  @PropGet
  double columnWidth();


  /**
   * <p>
   * Setter method for the COM property "ColumnWidth"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @DISPID(242)
  @PropPut
  void columnWidth(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "NumberOfColumns"
   * </p>
   */

  @DISPID(2984)
  @PropGet
  int numberOfColumns();


  /**
   * <p>
   * Setter method for the COM property "NumberOfColumns"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(2984)
  @PropPut
  void numberOfColumns(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayHeader"
   * </p>
   */

  @DISPID(2985)
  @PropGet
  boolean displayHeader();


  /**
   * <p>
   * Setter method for the COM property "DisplayHeader"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2985)
  @PropPut
  void displayHeader(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Locked"
   * </p>
   */

  @DISPID(269)
  @PropGet
  boolean locked();


  /**
   * <p>
   * Setter method for the COM property "Locked"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(269)
  @PropPut
  void locked(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "SlicerCache"
   * </p>
   */

  @DISPID(2986)
  @PropGet
  RTExcelObj.SlicerCache slicerCache();


  /**
   * <p>
   * Getter method for the COM property "SlicerCacheLevel"
   * </p>
   */

  @DISPID(2987)
  @PropGet
  RTExcelObj.SlicerCacheLevel slicerCacheLevel();


  /**
   * <p>
   * Getter method for the COM property "Shape"
   * </p>
   */

  @DISPID(1582)
  @PropGet
  RTExcelObj.Shape shape();


  /**
   * <p>
   * Getter method for the COM property "Style"
   * </p>
   */

  @DISPID(260)
  @PropGet
  java.lang.Object style();


  /**
   * <p>
   * Setter method for the COM property "Style"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(260)
  @PropPut
  void style(
    java.lang.Object rhs);


  /**
   */

  @DISPID(117)
  void delete();


  /**
   */

  @DISPID(565)
  void cut();


  /**
   */

  @DISPID(551)
  void copy();


  /**
   * <p>
   * Getter method for the COM property "ActiveItem"
   * </p>
   */

  @DISPID(2988)
  @PropGet
  RTExcelObj.SlicerItem activeItem();


  /**
   * <p>
   * Getter method for the COM property "TimelineViewState"
   * </p>
   */

  @DISPID(3116)
  @PropGet
  RTExcelObj.TimelineViewState timelineViewState();


  /**
   * <p>
   * Getter method for the COM property "SlicerCacheType"
   * </p>
   */

  @DISPID(3111)
  @PropGet
  RTExcelObj.XlSlicerCacheType slicerCacheType();


  // Properties:
}
