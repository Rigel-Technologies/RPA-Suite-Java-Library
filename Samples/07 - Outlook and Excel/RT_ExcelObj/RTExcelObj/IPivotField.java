package RTExcelObj  ;

import com4j.*;

@IID("{00020874-0001-0000-C000-000000000046}")
public interface IPivotField extends Com4jObject {
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
   * Getter method for the COM property "Calculation"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlPivotFieldCalculation
   */

  @VTID(10)
  RTExcelObj.XlPivotFieldCalculation calculation();


  /**
   * <p>
   * Setter method for the COM property "Calculation"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlPivotFieldCalculation parameter.
   */

  @VTID(11)
  void calculation(
    RTExcelObj.XlPivotFieldCalculation rhs);


  /**
   * <p>
   * Getter method for the COM property "ChildField"
   * </p>
   * @return  Returns a value of type RTExcelObj.PivotField
   */

  @VTID(12)
  RTExcelObj.PivotField childField();


  /**
   * <p>
   * Getter method for the COM property "ChildItems"
   * </p>
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(13)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object childItems(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "CurrentPage"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(14)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object currentPage();


  /**
   * <p>
   * Setter method for the COM property "CurrentPage"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(15)
  void currentPage(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "DataRange"
   * </p>
   * @return  Returns a value of type RTExcelObj.Range
   */

  @VTID(16)
  RTExcelObj.Range dataRange();


  /**
   * <p>
   * Getter method for the COM property "DataType"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlPivotFieldDataType
   */

  @VTID(17)
  RTExcelObj.XlPivotFieldDataType dataType();


  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(18)
  @DefaultMethod
  java.lang.String _Default();


  /**
   * <p>
   * Setter method for the COM property "_Default"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(19)
  @DefaultMethod
  void _Default(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Function"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlConsolidationFunction
   */

  @VTID(20)
  RTExcelObj.XlConsolidationFunction function();


  /**
   * <p>
   * Setter method for the COM property "Function"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlConsolidationFunction parameter.
   */

  @VTID(21)
  void function(
    RTExcelObj.XlConsolidationFunction rhs);


  /**
   * <p>
   * Getter method for the COM property "GroupLevel"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(22)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object groupLevel();


  /**
   * <p>
   * Getter method for the COM property "HiddenItems"
   * </p>
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(23)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object hiddenItems(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "LabelRange"
   * </p>
   * @return  Returns a value of type RTExcelObj.Range
   */

  @VTID(24)
  RTExcelObj.Range labelRange();


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(25)
  java.lang.String name();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(26)
  void name(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "NumberFormat"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(27)
  java.lang.String numberFormat();


  /**
   * <p>
   * Setter method for the COM property "NumberFormat"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(28)
  void numberFormat(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Orientation"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlPivotFieldOrientation
   */

  @VTID(29)
  RTExcelObj.XlPivotFieldOrientation orientation();


  /**
   * <p>
   * Setter method for the COM property "Orientation"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlPivotFieldOrientation parameter.
   */

  @VTID(30)
  void orientation(
    RTExcelObj.XlPivotFieldOrientation rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowAllItems"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(31)
  boolean showAllItems();


  /**
   * <p>
   * Setter method for the COM property "ShowAllItems"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(32)
  void showAllItems(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ParentField"
   * </p>
   * @return  Returns a value of type RTExcelObj.PivotField
   */

  @VTID(33)
  RTExcelObj.PivotField parentField();


  /**
   * <p>
   * Getter method for the COM property "ParentItems"
   * </p>
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(34)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object parentItems(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(35)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object pivotItems(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "Position"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(36)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object position();


  /**
   * <p>
   * Setter method for the COM property "Position"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(37)
  void position(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "SourceName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(38)
  java.lang.String sourceName();


  /**
   * <p>
   * Getter method for the COM property "Subtotals"
   * </p>
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(39)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object subtotals(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Setter method for the COM property "Subtotals"
   * </p>
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(40)
  void subtotals(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "BaseField"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(41)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object baseField();


  /**
   * <p>
   * Setter method for the COM property "BaseField"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(42)
  void baseField(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "BaseItem"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(43)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object baseItem();


  /**
   * <p>
   * Setter method for the COM property "BaseItem"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(44)
  void baseItem(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "TotalLevels"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(45)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object totalLevels();


  /**
   * <p>
   * Getter method for the COM property "Value"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(46)
  java.lang.String value();


  /**
   * <p>
   * Setter method for the COM property "Value"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(47)
  void value(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "VisibleItems"
   * </p>
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(48)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object visibleItems(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * @return  Returns a value of type RTExcelObj.CalculatedItems
   */

  @VTID(49)
  RTExcelObj.CalculatedItems calculatedItems();


  /**
   */

  @VTID(50)
  void delete();


  /**
   * <p>
   * Getter method for the COM property "DragToColumn"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(51)
  boolean dragToColumn();


  /**
   * <p>
   * Setter method for the COM property "DragToColumn"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(52)
  void dragToColumn(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DragToHide"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(53)
  boolean dragToHide();


  /**
   * <p>
   * Setter method for the COM property "DragToHide"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(54)
  void dragToHide(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DragToPage"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(55)
  boolean dragToPage();


  /**
   * <p>
   * Setter method for the COM property "DragToPage"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(56)
  void dragToPage(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DragToRow"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(57)
  boolean dragToRow();


  /**
   * <p>
   * Setter method for the COM property "DragToRow"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(58)
  void dragToRow(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DragToData"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(59)
  boolean dragToData();


  /**
   * <p>
   * Setter method for the COM property "DragToData"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(60)
  void dragToData(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Formula"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(61)
  java.lang.String formula();


  /**
   * <p>
   * Setter method for the COM property "Formula"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(62)
  void formula(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "IsCalculated"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(63)
  boolean isCalculated();


  /**
   * <p>
   * Getter method for the COM property "MemoryUsed"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(64)
  int memoryUsed();


  /**
   * <p>
   * Getter method for the COM property "ServerBased"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(65)
  boolean serverBased();


  /**
   * <p>
   * Setter method for the COM property "ServerBased"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(66)
  void serverBased(
    boolean rhs);


  /**
   * @param order Mandatory int parameter.
   * @param field Mandatory java.lang.String parameter.
   */

  @VTID(67)
  void _AutoSort(
    int order,
    java.lang.String field);


  /**
   * @param type Mandatory int parameter.
   * @param range Mandatory int parameter.
   * @param count Mandatory int parameter.
   * @param field Mandatory java.lang.String parameter.
   */

  @VTID(68)
  void autoShow(
    int type,
    int range,
    int count,
    java.lang.String field);


  /**
   * <p>
   * Getter method for the COM property "AutoSortOrder"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(69)
  int autoSortOrder();


  /**
   * <p>
   * Getter method for the COM property "AutoSortField"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(70)
  java.lang.String autoSortField();


  /**
   * <p>
   * Getter method for the COM property "AutoShowType"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(71)
  int autoShowType();


  /**
   * <p>
   * Getter method for the COM property "AutoShowRange"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(72)
  int autoShowRange();


  /**
   * <p>
   * Getter method for the COM property "AutoShowCount"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(73)
  int autoShowCount();


  /**
   * <p>
   * Getter method for the COM property "AutoShowField"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(74)
  java.lang.String autoShowField();


  /**
   * <p>
   * Getter method for the COM property "LayoutBlankLine"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(75)
  boolean layoutBlankLine();


  /**
   * <p>
   * Setter method for the COM property "LayoutBlankLine"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(76)
  void layoutBlankLine(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "LayoutSubtotalLocation"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlSubtototalLocationType
   */

  @VTID(77)
  RTExcelObj.XlSubtototalLocationType layoutSubtotalLocation();


  /**
   * <p>
   * Setter method for the COM property "LayoutSubtotalLocation"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlSubtototalLocationType parameter.
   */

  @VTID(78)
  void layoutSubtotalLocation(
    RTExcelObj.XlSubtototalLocationType rhs);


  /**
   * <p>
   * Getter method for the COM property "LayoutPageBreak"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(79)
  boolean layoutPageBreak();


  /**
   * <p>
   * Setter method for the COM property "LayoutPageBreak"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(80)
  void layoutPageBreak(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "LayoutForm"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlLayoutFormType
   */

  @VTID(81)
  RTExcelObj.XlLayoutFormType layoutForm();


  /**
   * <p>
   * Setter method for the COM property "LayoutForm"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlLayoutFormType parameter.
   */

  @VTID(82)
  void layoutForm(
    RTExcelObj.XlLayoutFormType rhs);


  /**
   * <p>
   * Getter method for the COM property "SubtotalName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(83)
  java.lang.String subtotalName();


  /**
   * <p>
   * Setter method for the COM property "SubtotalName"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(84)
  void subtotalName(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Caption"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(85)
  java.lang.String caption();


  /**
   * <p>
   * Setter method for the COM property "Caption"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(86)
  void caption(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "DrilledDown"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(87)
  boolean drilledDown();


  /**
   * <p>
   * Setter method for the COM property "DrilledDown"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(88)
  void drilledDown(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "CubeField"
   * </p>
   * @return  Returns a value of type RTExcelObj.CubeField
   */

  @VTID(89)
  RTExcelObj.CubeField cubeField();


  /**
   * <p>
   * Getter method for the COM property "CurrentPageName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(90)
  java.lang.String currentPageName();


  /**
   * <p>
   * Setter method for the COM property "CurrentPageName"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(91)
  void currentPageName(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "StandardFormula"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(92)
  java.lang.String standardFormula();


  /**
   * <p>
   * Setter method for the COM property "StandardFormula"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(93)
  void standardFormula(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "HiddenItemsList"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(94)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object hiddenItemsList();


  /**
   * <p>
   * Setter method for the COM property "HiddenItemsList"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(95)
  void hiddenItemsList(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "DatabaseSort"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(96)
  boolean databaseSort();


  /**
   * <p>
   * Setter method for the COM property "DatabaseSort"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(97)
  void databaseSort(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "IsMemberProperty"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(98)
  boolean isMemberProperty();


  /**
   * <p>
   * Getter method for the COM property "PropertyParentField"
   * </p>
   * @return  Returns a value of type RTExcelObj.PivotField
   */

  @VTID(99)
  RTExcelObj.PivotField propertyParentField();


  /**
   * <p>
   * Getter method for the COM property "PropertyOrder"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(100)
  int propertyOrder();


  /**
   * <p>
   * Setter method for the COM property "PropertyOrder"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(101)
  void propertyOrder(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "EnableItemSelection"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(102)
  boolean enableItemSelection();


  /**
   * <p>
   * Setter method for the COM property "EnableItemSelection"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(103)
  void enableItemSelection(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "CurrentPageList"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(104)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object currentPageList();


  /**
   * <p>
   * Setter method for the COM property "CurrentPageList"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(105)
  void currentPageList(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * @param item Mandatory java.lang.String parameter.
   * @param clearList Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @VTID(106)
  void addPageItem(
    java.lang.String item,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object clearList);


  /**
   * <p>
   * Getter method for the COM property "Hidden"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(107)
  boolean hidden();


  /**
   * <p>
   * Setter method for the COM property "Hidden"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(108)
  void hidden(
    boolean rhs);


  /**
   * @param field Mandatory java.lang.String parameter.
   */

  @VTID(109)
  void drillTo(
    java.lang.String field);


  /**
   * <p>
   * Getter method for the COM property "UseMemberPropertyAsCaption"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(110)
  boolean useMemberPropertyAsCaption();


  /**
   * <p>
   * Setter method for the COM property "UseMemberPropertyAsCaption"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(111)
  void useMemberPropertyAsCaption(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "MemberPropertyCaption"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(112)
  java.lang.String memberPropertyCaption();


  /**
   * <p>
   * Setter method for the COM property "MemberPropertyCaption"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(113)
  void memberPropertyCaption(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayAsTooltip"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(114)
  boolean displayAsTooltip();


  /**
   * <p>
   * Setter method for the COM property "DisplayAsTooltip"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(115)
  void displayAsTooltip(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayInReport"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(116)
  boolean displayInReport();


  /**
   * <p>
   * Setter method for the COM property "DisplayInReport"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(117)
  void displayInReport(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayAsCaption"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(118)
  boolean displayAsCaption();


  /**
   * <p>
   * Getter method for the COM property "LayoutCompactRow"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(119)
  boolean layoutCompactRow();


  /**
   * <p>
   * Setter method for the COM property "LayoutCompactRow"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(120)
  void layoutCompactRow(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "IncludeNewItemsInFilter"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(121)
  boolean includeNewItemsInFilter();


  /**
   * <p>
   * Setter method for the COM property "IncludeNewItemsInFilter"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(122)
  void includeNewItemsInFilter(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "VisibleItemsList"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(123)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object visibleItemsList();


  /**
   * <p>
   * Setter method for the COM property "VisibleItemsList"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(124)
  void visibleItemsList(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "PivotFilters"
   * </p>
   * @return  Returns a value of type RTExcelObj.PivotFilters
   */

  @VTID(125)
  RTExcelObj.PivotFilters pivotFilters();


  /**
   * <p>
   * Getter method for the COM property "AutoSortPivotLine"
   * </p>
   * @return  Returns a value of type RTExcelObj.PivotLine
   */

  @VTID(126)
  RTExcelObj.PivotLine autoSortPivotLine();


  /**
   * <p>
   * Getter method for the COM property "AutoSortCustomSubtotal"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(127)
  int autoSortCustomSubtotal();


  /**
   * <p>
   * Getter method for the COM property "ShowingInAxis"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(128)
  boolean showingInAxis();


  /**
   * <p>
   * Getter method for the COM property "EnableMultiplePageItems"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(129)
  boolean enableMultiplePageItems();


  /**
   * <p>
   * Setter method for the COM property "EnableMultiplePageItems"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(130)
  void enableMultiplePageItems(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "AllItemsVisible"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(131)
  boolean allItemsVisible();


  /**
   */

  @VTID(132)
  void clearManualFilter();


  /**
   */

  @VTID(133)
  void clearAllFilters();


  /**
   */

  @VTID(134)
  void clearValueFilters();


  /**
   */

  @VTID(135)
  void clearLabelFilters();


  /**
   * @param order Mandatory int parameter.
   * @param field Mandatory java.lang.String parameter.
   * @param pivotLine Optional parameter. Default value is com4j.Variant.getMissing()
   * @param customSubtotal Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @VTID(136)
  void autoSort(
    int order,
    java.lang.String field,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object pivotLine,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object customSubtotal);


  /**
   * <p>
   * Getter method for the COM property "SourceCaption"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(137)
  java.lang.String sourceCaption();


  /**
   * <p>
   * Getter method for the COM property "ShowDetail"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(138)
  boolean showDetail();


  /**
   * <p>
   * Setter method for the COM property "ShowDetail"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(139)
  void showDetail(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "RepeatLabels"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(140)
  boolean repeatLabels();


  /**
   * <p>
   * Setter method for the COM property "RepeatLabels"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(141)
  void repeatLabels(
    boolean rhs);


  /**
   */

  @VTID(142)
  void autoGroup();


  // Properties:
}
