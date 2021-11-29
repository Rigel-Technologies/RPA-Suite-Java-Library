package RTExcelObj  ;

import com4j.*;

@IID("{00020893-0001-0000-C000-000000000046}")
public interface IWindow extends Com4jObject {
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
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(10)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object activate();


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(11)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object activateNext();


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(12)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object activatePrevious();


  /**
   * <p>
   * Getter method for the COM property "ActiveCell"
   * </p>
   * @return  Returns a value of type RTExcelObj.Range
   */

  @VTID(13)
  RTExcelObj.Range activeCell();


  /**
   * <p>
   * Getter method for the COM property "ActiveChart"
   * </p>
   * @return  Returns a value of type RTExcelObj._Chart
   */

  @VTID(14)
  RTExcelObj._Chart activeChart();


  /**
   * <p>
   * Getter method for the COM property "ActivePane"
   * </p>
   * @return  Returns a value of type RTExcelObj.Pane
   */

  @VTID(15)
  RTExcelObj.Pane activePane();


  /**
   * <p>
   * Getter method for the COM property "ActiveSheet"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(16)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject activeSheet();


  /**
   * <p>
   * Getter method for the COM property "Caption"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(17)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object caption();


  /**
   * <p>
   * Setter method for the COM property "Caption"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(18)
  void caption(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * @param saveChanges Optional parameter. Default value is com4j.Variant.getMissing()
   * @param filename Optional parameter. Default value is com4j.Variant.getMissing()
   * @param routeWorkbook Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type boolean
   */

  @VTID(19)
  boolean close(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object saveChanges,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object filename,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object routeWorkbook);


  /**
   * <p>
   * Getter method for the COM property "DisplayFormulas"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(20)
  boolean displayFormulas();


  /**
   * <p>
   * Setter method for the COM property "DisplayFormulas"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(21)
  void displayFormulas(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayGridlines"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(22)
  boolean displayGridlines();


  /**
   * <p>
   * Setter method for the COM property "DisplayGridlines"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(23)
  void displayGridlines(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayHeadings"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(24)
  boolean displayHeadings();


  /**
   * <p>
   * Setter method for the COM property "DisplayHeadings"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(25)
  void displayHeadings(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayHorizontalScrollBar"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(26)
  boolean displayHorizontalScrollBar();


  /**
   * <p>
   * Setter method for the COM property "DisplayHorizontalScrollBar"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(27)
  void displayHorizontalScrollBar(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayOutline"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(28)
  boolean displayOutline();


  /**
   * <p>
   * Setter method for the COM property "DisplayOutline"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(29)
  void displayOutline(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "_DisplayRightToLeft"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(30)
  boolean _DisplayRightToLeft();


  /**
   * <p>
   * Setter method for the COM property "_DisplayRightToLeft"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(31)
  void _DisplayRightToLeft(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayVerticalScrollBar"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(32)
  boolean displayVerticalScrollBar();


  /**
   * <p>
   * Setter method for the COM property "DisplayVerticalScrollBar"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(33)
  void displayVerticalScrollBar(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayWorkbookTabs"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(34)
  boolean displayWorkbookTabs();


  /**
   * <p>
   * Setter method for the COM property "DisplayWorkbookTabs"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(35)
  void displayWorkbookTabs(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayZeros"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(36)
  boolean displayZeros();


  /**
   * <p>
   * Setter method for the COM property "DisplayZeros"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(37)
  void displayZeros(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "EnableResize"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(38)
  boolean enableResize();


  /**
   * <p>
   * Setter method for the COM property "EnableResize"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(39)
  void enableResize(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "FreezePanes"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(40)
  boolean freezePanes();


  /**
   * <p>
   * Setter method for the COM property "FreezePanes"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(41)
  void freezePanes(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "GridlineColor"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(42)
  int gridlineColor();


  /**
   * <p>
   * Setter method for the COM property "GridlineColor"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(43)
  void gridlineColor(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "GridlineColorIndex"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlColorIndex
   */

  @VTID(44)
  RTExcelObj.XlColorIndex gridlineColorIndex();


  /**
   * <p>
   * Setter method for the COM property "GridlineColorIndex"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlColorIndex parameter.
   */

  @VTID(45)
  void gridlineColorIndex(
    RTExcelObj.XlColorIndex rhs);


  /**
   * <p>
   * Getter method for the COM property "Height"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(46)
  double height();


  /**
   * <p>
   * Setter method for the COM property "Height"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @VTID(47)
  void height(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "Index"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(48)
  int index();


  /**
   * @param down Optional parameter. Default value is com4j.Variant.getMissing()
   * @param up Optional parameter. Default value is com4j.Variant.getMissing()
   * @param toRight Optional parameter. Default value is com4j.Variant.getMissing()
   * @param toLeft Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(49)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object largeScroll(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object down,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object up,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object toRight,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object toLeft);


  /**
   * <p>
   * Getter method for the COM property "Left"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(50)
  double left();


  /**
   * <p>
   * Setter method for the COM property "Left"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @VTID(51)
  void left(
    double rhs);


  /**
   * @return  Returns a value of type RTExcelObj.Window
   */

  @VTID(52)
  RTExcelObj.Window newWindow();


  /**
   * <p>
   * Getter method for the COM property "OnWindow"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(53)
  java.lang.String onWindow();


  /**
   * <p>
   * Setter method for the COM property "OnWindow"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(54)
  void onWindow(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Panes"
   * </p>
   * @return  Returns a value of type RTExcelObj.Panes
   */

  @VTID(55)
  RTExcelObj.Panes panes();


  /**
   * @param from Optional parameter. Default value is com4j.Variant.getMissing()
   * @param to Optional parameter. Default value is com4j.Variant.getMissing()
   * @param copies Optional parameter. Default value is com4j.Variant.getMissing()
   * @param preview Optional parameter. Default value is com4j.Variant.getMissing()
   * @param activePrinter Optional parameter. Default value is com4j.Variant.getMissing()
   * @param printToFile Optional parameter. Default value is com4j.Variant.getMissing()
   * @param collate Optional parameter. Default value is com4j.Variant.getMissing()
   * @param prToFileName Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(56)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object _PrintOut(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object from,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object to,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object copies,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object preview,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object activePrinter,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object printToFile,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object collate,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object prToFileName);


  /**
   * @param enableChanges Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(57)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object printPreview(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object enableChanges);


  /**
   * <p>
   * Getter method for the COM property "RangeSelection"
   * </p>
   * @return  Returns a value of type RTExcelObj.Range
   */

  @VTID(58)
  RTExcelObj.Range rangeSelection();


  /**
   * <p>
   * Getter method for the COM property "ScrollColumn"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(59)
  int scrollColumn();


  /**
   * <p>
   * Setter method for the COM property "ScrollColumn"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(60)
  void scrollColumn(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "ScrollRow"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(61)
  int scrollRow();


  /**
   * <p>
   * Setter method for the COM property "ScrollRow"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(62)
  void scrollRow(
    int rhs);


  /**
   * @param sheets Optional parameter. Default value is com4j.Variant.getMissing()
   * @param position Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(63)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object scrollWorkbookTabs(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object sheets,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object position);


  /**
   * <p>
   * Getter method for the COM property "SelectedSheets"
   * </p>
   * @return  Returns a value of type RTExcelObj.Sheets
   */

  @VTID(64)
  RTExcelObj.Sheets selectedSheets();


  @VTID(64)
  @ReturnValue(type=NativeType.Dispatch,defaultPropertyThrough={RTExcelObj.Sheets.class})
  com4j.Com4jObject selectedSheets(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "Selection"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(65)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject selection();


  /**
   * @param down Optional parameter. Default value is com4j.Variant.getMissing()
   * @param up Optional parameter. Default value is com4j.Variant.getMissing()
   * @param toRight Optional parameter. Default value is com4j.Variant.getMissing()
   * @param toLeft Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(66)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object smallScroll(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object down,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object up,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object toRight,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object toLeft);


  /**
   * <p>
   * Getter method for the COM property "Split"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(67)
  boolean split();


  /**
   * <p>
   * Setter method for the COM property "Split"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(68)
  void split(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "SplitColumn"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(69)
  int splitColumn();


  /**
   * <p>
   * Setter method for the COM property "SplitColumn"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(70)
  void splitColumn(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "SplitHorizontal"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(71)
  double splitHorizontal();


  /**
   * <p>
   * Setter method for the COM property "SplitHorizontal"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @VTID(72)
  void splitHorizontal(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "SplitRow"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(73)
  int splitRow();


  /**
   * <p>
   * Setter method for the COM property "SplitRow"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(74)
  void splitRow(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "SplitVertical"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(75)
  double splitVertical();


  /**
   * <p>
   * Setter method for the COM property "SplitVertical"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @VTID(76)
  void splitVertical(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "TabRatio"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(77)
  double tabRatio();


  /**
   * <p>
   * Setter method for the COM property "TabRatio"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @VTID(78)
  void tabRatio(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "Top"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(79)
  double top();


  /**
   * <p>
   * Setter method for the COM property "Top"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @VTID(80)
  void top(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlWindowType
   */

  @VTID(81)
  RTExcelObj.XlWindowType type();


  /**
   * <p>
   * Getter method for the COM property "UsableHeight"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(82)
  double usableHeight();


  /**
   * <p>
   * Getter method for the COM property "UsableWidth"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(83)
  double usableWidth();


  /**
   * <p>
   * Getter method for the COM property "Visible"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(84)
  boolean visible();


  /**
   * <p>
   * Setter method for the COM property "Visible"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(85)
  void visible(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "VisibleRange"
   * </p>
   * @return  Returns a value of type RTExcelObj.Range
   */

  @VTID(86)
  RTExcelObj.Range visibleRange();


  /**
   * <p>
   * Getter method for the COM property "Width"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(87)
  double width();


  /**
   * <p>
   * Setter method for the COM property "Width"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @VTID(88)
  void width(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "WindowNumber"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(89)
  int windowNumber();


  /**
   * <p>
   * Getter method for the COM property "WindowState"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlWindowState
   */

  @VTID(90)
  RTExcelObj.XlWindowState windowState();


  /**
   * <p>
   * Setter method for the COM property "WindowState"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlWindowState parameter.
   */

  @VTID(91)
  void windowState(
    RTExcelObj.XlWindowState rhs);


  /**
   * <p>
   * Getter method for the COM property "Zoom"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(92)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object zoom();


  /**
   * <p>
   * Setter method for the COM property "Zoom"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(93)
  void zoom(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "View"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlWindowView
   */

  @VTID(94)
  RTExcelObj.XlWindowView view();


  /**
   * <p>
   * Setter method for the COM property "View"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlWindowView parameter.
   */

  @VTID(95)
  void view(
    RTExcelObj.XlWindowView rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayRightToLeft"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(96)
  boolean displayRightToLeft();


  /**
   * <p>
   * Setter method for the COM property "DisplayRightToLeft"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(97)
  void displayRightToLeft(
    boolean rhs);


  /**
   * @param points Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @VTID(98)
  int pointsToScreenPixelsX(
    int points);


  /**
   * @param points Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @VTID(99)
  int pointsToScreenPixelsY(
    int points);


  /**
   * @param x Mandatory int parameter.
   * @param y Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(100)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject rangeFromPoint(
    int x,
    int y);


  /**
   * @param left Mandatory int parameter.
   * @param top Mandatory int parameter.
   * @param width Mandatory int parameter.
   * @param height Mandatory int parameter.
   * @param start Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @VTID(101)
  void scrollIntoView(
    int left,
    int top,
    int width,
    int height,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object start);


  /**
   * <p>
   * Getter method for the COM property "SheetViews"
   * </p>
   * @return  Returns a value of type RTExcelObj.SheetViews
   */

  @VTID(102)
  RTExcelObj.SheetViews sheetViews();


  /**
   * <p>
   * Getter method for the COM property "ActiveSheetView"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(103)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject activeSheetView();


  /**
   * @param from Optional parameter. Default value is com4j.Variant.getMissing()
   * @param to Optional parameter. Default value is com4j.Variant.getMissing()
   * @param copies Optional parameter. Default value is com4j.Variant.getMissing()
   * @param preview Optional parameter. Default value is com4j.Variant.getMissing()
   * @param activePrinter Optional parameter. Default value is com4j.Variant.getMissing()
   * @param printToFile Optional parameter. Default value is com4j.Variant.getMissing()
   * @param collate Optional parameter. Default value is com4j.Variant.getMissing()
   * @param prToFileName Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(104)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object printOut(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object from,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object to,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object copies,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object preview,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object activePrinter,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object printToFile,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object collate,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object prToFileName);


  /**
   * <p>
   * Getter method for the COM property "DisplayRuler"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(105)
  boolean displayRuler();


  /**
   * <p>
   * Setter method for the COM property "DisplayRuler"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(106)
  void displayRuler(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "AutoFilterDateGrouping"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(107)
  boolean autoFilterDateGrouping();


  /**
   * <p>
   * Setter method for the COM property "AutoFilterDateGrouping"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(108)
  void autoFilterDateGrouping(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayWhitespace"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(109)
  boolean displayWhitespace();


  /**
   * <p>
   * Setter method for the COM property "DisplayWhitespace"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(110)
  void displayWhitespace(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Hwnd"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(111)
  int hwnd();


  // Properties:
}
