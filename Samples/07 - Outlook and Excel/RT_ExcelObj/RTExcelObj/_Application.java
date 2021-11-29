package RTExcelObj  ;

import com4j.*;

@IID("{000208D5-0000-0000-C000-000000000046}")
public interface _Application extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type RTExcelObj._Application
   */

  @DISPID(148) //= 0x94. The runtime will prefer the VTID if present
  @VTID(7)
  RTExcelObj._Application application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlCreator
   */

  @DISPID(149) //= 0x95. The runtime will prefer the VTID if present
  @VTID(8)
  RTExcelObj.XlCreator creator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type RTExcelObj._Application
   */

  @DISPID(150) //= 0x96. The runtime will prefer the VTID if present
  @VTID(9)
  RTExcelObj._Application parent();


  /**
   * <p>
   * Getter method for the COM property "ActiveCell"
   * </p>
   * @return  Returns a value of type RTExcelObj.Range
   */

  @DISPID(305) //= 0x131. The runtime will prefer the VTID if present
  @VTID(10)
  RTExcelObj.Range activeCell();


  /**
   * <p>
   * Getter method for the COM property "ActiveChart"
   * </p>
   * @return  Returns a value of type RTExcelObj._Chart
   */

  @DISPID(183) //= 0xb7. The runtime will prefer the VTID if present
  @VTID(11)
  RTExcelObj._Chart activeChart();


  /**
   * <p>
   * Getter method for the COM property "ActiveDialog"
   * </p>
   * @return  Returns a value of type RTExcelObj.DialogSheet
   */

  @DISPID(815) //= 0x32f. The runtime will prefer the VTID if present
  @VTID(12)
  RTExcelObj.DialogSheet activeDialog();


  /**
   * <p>
   * Getter method for the COM property "ActiveMenuBar"
   * </p>
   * @return  Returns a value of type RTExcelObj.MenuBar
   */

  @DISPID(758) //= 0x2f6. The runtime will prefer the VTID if present
  @VTID(13)
  RTExcelObj.MenuBar activeMenuBar();


  /**
   * <p>
   * Getter method for the COM property "ActivePrinter"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(306) //= 0x132. The runtime will prefer the VTID if present
  @VTID(14)
  java.lang.String activePrinter(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "ActivePrinter"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(306) //= 0x132. The runtime will prefer the VTID if present
  @VTID(15)
  void activePrinter(
    @LCID int lcid,
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "ActiveSheet"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(307) //= 0x133. The runtime will prefer the VTID if present
  @VTID(16)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject activeSheet();


  /**
   * <p>
   * Getter method for the COM property "ActiveWindow"
   * </p>
   * @return  Returns a value of type RTExcelObj.Window
   */

  @DISPID(759) //= 0x2f7. The runtime will prefer the VTID if present
  @VTID(17)
  RTExcelObj.Window activeWindow();


  /**
   * <p>
   * Getter method for the COM property "ActiveWorkbook"
   * </p>
   * @return  Returns a value of type RTExcelObj._Workbook
   */

  @DISPID(308) //= 0x134. The runtime will prefer the VTID if present
  @VTID(18)
  RTExcelObj._Workbook activeWorkbook();


  /**
   * <p>
   * Getter method for the COM property "AddIns"
   * </p>
   * @return  Returns a value of type RTExcelObj.AddIns
   */

  @DISPID(549) //= 0x225. The runtime will prefer the VTID if present
  @VTID(19)
  RTExcelObj.AddIns addIns();


  /**
   * <p>
   * Getter method for the COM property "Assistant"
   * </p>
   * @return  Returns a value of type RTExcelObj.Assistant
   */

  @DISPID(1438) //= 0x59e. The runtime will prefer the VTID if present
  @VTID(20)
  RTExcelObj.Assistant assistant();


  /**
   * @param lcid Mandatory int parameter.
   */

  @DISPID(279) //= 0x117. The runtime will prefer the VTID if present
  @VTID(21)
  void calculate(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "Cells"
   * </p>
   * @return  Returns a value of type RTExcelObj.Range
   */

  @DISPID(238) //= 0xee. The runtime will prefer the VTID if present
  @VTID(22)
  RTExcelObj.Range cells();


  /**
   * <p>
   * Getter method for the COM property "Charts"
   * </p>
   * @return  Returns a value of type RTExcelObj.Sheets
   */

  @DISPID(121) //= 0x79. The runtime will prefer the VTID if present
  @VTID(23)
  RTExcelObj.Sheets charts();


  @VTID(23)
  @ReturnValue(type=NativeType.Dispatch,defaultPropertyThrough={RTExcelObj.Sheets.class})
  com4j.Com4jObject charts(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "Columns"
   * </p>
   * @return  Returns a value of type RTExcelObj.Range
   */

  @DISPID(241) //= 0xf1. The runtime will prefer the VTID if present
  @VTID(24)
  RTExcelObj.Range columns();


  /**
   * <p>
   * Getter method for the COM property "CommandBars"
   * </p>
   * @return  Returns a value of type RTExcelObj._CommandBars
   */

  @DISPID(1439) //= 0x59f. The runtime will prefer the VTID if present
  @VTID(25)
  RTExcelObj._CommandBars commandBars();


  /**
   * <p>
   * Getter method for the COM property "DDEAppReturnCode"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(332) //= 0x14c. The runtime will prefer the VTID if present
  @VTID(26)
  int ddeAppReturnCode(
    @LCID int lcid);


  /**
   * @param channel Mandatory int parameter.
   * @param string Mandatory java.lang.String parameter.
   * @param lcid Mandatory int parameter.
   */

  @DISPID(333) //= 0x14d. The runtime will prefer the VTID if present
  @VTID(27)
  void ddeExecute(
    int channel,
    java.lang.String string,
    @LCID int lcid);


  /**
   * @param app Mandatory java.lang.String parameter.
   * @param topic Mandatory java.lang.String parameter.
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(334) //= 0x14e. The runtime will prefer the VTID if present
  @VTID(28)
  int ddeInitiate(
    java.lang.String app,
    java.lang.String topic,
    @LCID int lcid);


  /**
   * @param channel Mandatory int parameter.
   * @param item Mandatory java.lang.Object parameter.
   * @param data Mandatory java.lang.Object parameter.
   * @param lcid Mandatory int parameter.
   */

  @DISPID(335) //= 0x14f. The runtime will prefer the VTID if present
  @VTID(29)
  void ddePoke(
    int channel,
    @MarshalAs(NativeType.VARIANT) java.lang.Object item,
    @MarshalAs(NativeType.VARIANT) java.lang.Object data,
    @LCID int lcid);


  /**
   * @param channel Mandatory int parameter.
   * @param item Mandatory java.lang.String parameter.
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(336) //= 0x150. The runtime will prefer the VTID if present
  @VTID(30)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object ddeRequest(
    int channel,
    java.lang.String item,
    @LCID int lcid);


  /**
   * @param channel Mandatory int parameter.
   * @param lcid Mandatory int parameter.
   */

  @DISPID(337) //= 0x151. The runtime will prefer the VTID if present
  @VTID(31)
  void ddeTerminate(
    int channel,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "DialogSheets"
   * </p>
   * @return  Returns a value of type RTExcelObj.Sheets
   */

  @DISPID(764) //= 0x2fc. The runtime will prefer the VTID if present
  @VTID(32)
  RTExcelObj.Sheets dialogSheets();


  @VTID(32)
  @ReturnValue(type=NativeType.Dispatch,defaultPropertyThrough={RTExcelObj.Sheets.class})
  com4j.Com4jObject dialogSheets(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * @param name Mandatory java.lang.Object parameter.
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(33)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object evaluate(
    @MarshalAs(NativeType.VARIANT) java.lang.Object name,
    @LCID int lcid);


  /**
   * @param name Mandatory java.lang.Object parameter.
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-5) //= 0xfffffffb. The runtime will prefer the VTID if present
  @VTID(34)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object _Evaluate(
    @MarshalAs(NativeType.VARIANT) java.lang.Object name,
    @LCID int lcid);


  /**
   * @param string Mandatory java.lang.String parameter.
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(350) //= 0x15e. The runtime will prefer the VTID if present
  @VTID(35)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object executeExcel4Macro(
    java.lang.String string,
    @LCID int lcid);


  /**
   * @param arg1 Mandatory RTExcelObj.Range parameter.
   * @param arg2 Mandatory RTExcelObj.Range parameter.
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg5 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg6 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg7 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg8 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg9 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg10 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg11 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg12 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg13 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg14 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg15 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg16 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg17 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg18 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg19 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg20 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg21 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg22 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg23 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg24 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg25 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg26 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg27 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg28 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg29 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg30 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type RTExcelObj.Range
   */

  @DISPID(766) //= 0x2fe. The runtime will prefer the VTID if present
  @VTID(36)
  RTExcelObj.Range intersect(
    RTExcelObj.Range arg1,
    RTExcelObj.Range arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg4,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg5,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg6,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg7,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg8,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg9,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg10,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg11,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg12,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg13,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg14,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg15,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg16,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg17,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg18,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg19,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg20,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg21,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg22,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg23,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg24,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg25,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg26,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg27,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg28,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg29,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg30,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "MenuBars"
   * </p>
   * @return  Returns a value of type RTExcelObj.MenuBars
   */

  @DISPID(589) //= 0x24d. The runtime will prefer the VTID if present
  @VTID(37)
  RTExcelObj.MenuBars menuBars();


  /**
   * <p>
   * Getter method for the COM property "Modules"
   * </p>
   * @return  Returns a value of type RTExcelObj.Modules
   */

  @DISPID(582) //= 0x246. The runtime will prefer the VTID if present
  @VTID(38)
  RTExcelObj.Modules modules();


  /**
   * <p>
   * Getter method for the COM property "Names"
   * </p>
   * @return  Returns a value of type RTExcelObj.Names
   */

  @DISPID(442) //= 0x1ba. The runtime will prefer the VTID if present
  @VTID(39)
  RTExcelObj.Names names();


  /**
   * <p>
   * Getter method for the COM property "Range"
   * </p>
   * @param cell1 Mandatory java.lang.Object parameter.
   * @param cell2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type RTExcelObj.Range
   */

  @DISPID(197) //= 0xc5. The runtime will prefer the VTID if present
  @VTID(40)
  RTExcelObj.Range range(
    @MarshalAs(NativeType.VARIANT) java.lang.Object cell1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object cell2);


  /**
   * <p>
   * Getter method for the COM property "Rows"
   * </p>
   * @return  Returns a value of type RTExcelObj.Range
   */

  @DISPID(258) //= 0x102. The runtime will prefer the VTID if present
  @VTID(41)
  RTExcelObj.Range rows();


  /**
   * @param macro Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg1 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg5 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg6 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg7 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg8 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg9 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg10 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg11 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg12 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg13 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg14 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg15 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg16 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg17 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg18 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg19 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg20 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg21 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg22 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg23 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg24 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg25 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg26 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg27 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg28 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg29 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg30 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(259) //= 0x103. The runtime will prefer the VTID if present
  @VTID(42)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object run(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object macro,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg4,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg5,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg6,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg7,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg8,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg9,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg10,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg11,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg12,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg13,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg14,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg15,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg16,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg17,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg18,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg19,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg20,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg21,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg22,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg23,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg24,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg25,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg26,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg27,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg28,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg29,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg30);


  /**
   * @param macro Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg1 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg5 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg6 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg7 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg8 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg9 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg10 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg11 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg12 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg13 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg14 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg15 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg16 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg17 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg18 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg19 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg20 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg21 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg22 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg23 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg24 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg25 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg26 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg27 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg28 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg29 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg30 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(806) //= 0x326. The runtime will prefer the VTID if present
  @VTID(43)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object _Run2(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object macro,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg4,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg5,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg6,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg7,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg8,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg9,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg10,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg11,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg12,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg13,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg14,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg15,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg16,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg17,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg18,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg19,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg20,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg21,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg22,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg23,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg24,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg25,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg26,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg27,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg28,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg29,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg30,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "Selection"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(147) //= 0x93. The runtime will prefer the VTID if present
  @VTID(44)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject selection(
    @LCID int lcid);


  /**
   * @param keys Mandatory java.lang.Object parameter.
   * @param wait Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(383) //= 0x17f. The runtime will prefer the VTID if present
  @VTID(45)
  void sendKeys(
    @MarshalAs(NativeType.VARIANT) java.lang.Object keys,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object wait,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "Sheets"
   * </p>
   * @return  Returns a value of type RTExcelObj.Sheets
   */

  @DISPID(485) //= 0x1e5. The runtime will prefer the VTID if present
  @VTID(46)
  RTExcelObj.Sheets sheets();


  @VTID(46)
  @ReturnValue(type=NativeType.Dispatch,defaultPropertyThrough={RTExcelObj.Sheets.class})
  com4j.Com4jObject sheets(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "ShortcutMenus"
   * </p>
   * @param index Mandatory int parameter.
   * @return  Returns a value of type RTExcelObj.Menu
   */

  @DISPID(776) //= 0x308. The runtime will prefer the VTID if present
  @VTID(47)
  RTExcelObj.Menu shortcutMenus(
    int index);


  /**
   * <p>
   * Getter method for the COM property "ThisWorkbook"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type RTExcelObj._Workbook
   */

  @DISPID(778) //= 0x30a. The runtime will prefer the VTID if present
  @VTID(48)
  RTExcelObj._Workbook thisWorkbook(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "Toolbars"
   * </p>
   * @return  Returns a value of type RTExcelObj.Toolbars
   */

  @DISPID(552) //= 0x228. The runtime will prefer the VTID if present
  @VTID(49)
  RTExcelObj.Toolbars toolbars();


  /**
   * @param arg1 Mandatory RTExcelObj.Range parameter.
   * @param arg2 Mandatory RTExcelObj.Range parameter.
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg5 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg6 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg7 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg8 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg9 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg10 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg11 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg12 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg13 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg14 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg15 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg16 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg17 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg18 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg19 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg20 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg21 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg22 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg23 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg24 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg25 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg26 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg27 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg28 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg29 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg30 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type RTExcelObj.Range
   */

  @DISPID(779) //= 0x30b. The runtime will prefer the VTID if present
  @VTID(50)
  RTExcelObj.Range union(
    RTExcelObj.Range arg1,
    RTExcelObj.Range arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg4,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg5,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg6,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg7,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg8,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg9,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg10,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg11,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg12,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg13,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg14,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg15,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg16,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg17,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg18,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg19,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg20,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg21,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg22,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg23,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg24,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg25,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg26,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg27,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg28,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg29,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg30,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "Windows"
   * </p>
   * @return  Returns a value of type RTExcelObj.Windows
   */

  @DISPID(430) //= 0x1ae. The runtime will prefer the VTID if present
  @VTID(51)
  RTExcelObj.Windows windows();


  /**
   * <p>
   * Getter method for the COM property "Workbooks"
   * </p>
   * @return  Returns a value of type RTExcelObj.Workbooks
   */

  @DISPID(572) //= 0x23c. The runtime will prefer the VTID if present
  @VTID(52)
  RTExcelObj.Workbooks workbooks();


  @VTID(52)
  @ReturnValue(defaultPropertyThrough={RTExcelObj.Workbooks.class})
  RTExcelObj._Workbook workbooks(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "WorksheetFunction"
   * </p>
   * @return  Returns a value of type RTExcelObj.WorksheetFunction
   */

  @DISPID(1440) //= 0x5a0. The runtime will prefer the VTID if present
  @VTID(53)
  RTExcelObj.WorksheetFunction worksheetFunction();


  /**
   * <p>
   * Getter method for the COM property "Worksheets"
   * </p>
   * @return  Returns a value of type RTExcelObj.Sheets
   */

  @DISPID(494) //= 0x1ee. The runtime will prefer the VTID if present
  @VTID(54)
  RTExcelObj.Sheets worksheets();


  @VTID(54)
  @ReturnValue(type=NativeType.Dispatch,defaultPropertyThrough={RTExcelObj.Sheets.class})
  com4j.Com4jObject worksheets(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "Excel4IntlMacroSheets"
   * </p>
   * @return  Returns a value of type RTExcelObj.Sheets
   */

  @DISPID(581) //= 0x245. The runtime will prefer the VTID if present
  @VTID(55)
  RTExcelObj.Sheets excel4IntlMacroSheets();


  @VTID(55)
  @ReturnValue(type=NativeType.Dispatch,defaultPropertyThrough={RTExcelObj.Sheets.class})
  com4j.Com4jObject excel4IntlMacroSheets(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "Excel4MacroSheets"
   * </p>
   * @return  Returns a value of type RTExcelObj.Sheets
   */

  @DISPID(579) //= 0x243. The runtime will prefer the VTID if present
  @VTID(56)
  RTExcelObj.Sheets excel4MacroSheets();


  @VTID(56)
  @ReturnValue(type=NativeType.Dispatch,defaultPropertyThrough={RTExcelObj.Sheets.class})
  com4j.Com4jObject excel4MacroSheets(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * @param index Mandatory RTExcelObj.XlMSApplication parameter.
   * @param lcid Mandatory int parameter.
   */

  @DISPID(1095) //= 0x447. The runtime will prefer the VTID if present
  @VTID(57)
  void activateMicrosoftApp(
    RTExcelObj.XlMSApplication index,
    @LCID int lcid);


  /**
   * @param chart Mandatory java.lang.Object parameter.
   * @param name Mandatory java.lang.String parameter.
   * @param description Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(216) //= 0xd8. The runtime will prefer the VTID if present
  @VTID(58)
  void addChartAutoFormat(
    @MarshalAs(NativeType.VARIANT) java.lang.Object chart,
    java.lang.String name,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object description,
    @LCID int lcid);


  /**
   * @param listArray Mandatory java.lang.Object parameter.
   * @param byRow Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(780) //= 0x30c. The runtime will prefer the VTID if present
  @VTID(59)
  void addCustomList(
    @MarshalAs(NativeType.VARIANT) java.lang.Object listArray,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object byRow,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "AlertBeforeOverwriting"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(930) //= 0x3a2. The runtime will prefer the VTID if present
  @VTID(60)
  boolean alertBeforeOverwriting(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "AlertBeforeOverwriting"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(930) //= 0x3a2. The runtime will prefer the VTID if present
  @VTID(61)
  void alertBeforeOverwriting(
    @LCID int lcid,
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "AltStartupPath"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(313) //= 0x139. The runtime will prefer the VTID if present
  @VTID(62)
  java.lang.String altStartupPath(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "AltStartupPath"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(313) //= 0x139. The runtime will prefer the VTID if present
  @VTID(63)
  void altStartupPath(
    @LCID int lcid,
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "AskToUpdateLinks"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(992) //= 0x3e0. The runtime will prefer the VTID if present
  @VTID(64)
  boolean askToUpdateLinks(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "AskToUpdateLinks"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(992) //= 0x3e0. The runtime will prefer the VTID if present
  @VTID(65)
  void askToUpdateLinks(
    @LCID int lcid,
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "EnableAnimations"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1180) //= 0x49c. The runtime will prefer the VTID if present
  @VTID(66)
  boolean enableAnimations(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "EnableAnimations"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1180) //= 0x49c. The runtime will prefer the VTID if present
  @VTID(67)
  void enableAnimations(
    @LCID int lcid,
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "AutoCorrect"
   * </p>
   * @return  Returns a value of type RTExcelObj.AutoCorrect
   */

  @DISPID(1145) //= 0x479. The runtime will prefer the VTID if present
  @VTID(68)
  RTExcelObj.AutoCorrect autoCorrect();


  /**
   * <p>
   * Getter method for the COM property "Build"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(314) //= 0x13a. The runtime will prefer the VTID if present
  @VTID(69)
  int build(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "CalculateBeforeSave"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(315) //= 0x13b. The runtime will prefer the VTID if present
  @VTID(70)
  boolean calculateBeforeSave(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "CalculateBeforeSave"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(315) //= 0x13b. The runtime will prefer the VTID if present
  @VTID(71)
  void calculateBeforeSave(
    @LCID int lcid,
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Calculation"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type RTExcelObj.XlCalculation
   */

  @DISPID(316) //= 0x13c. The runtime will prefer the VTID if present
  @VTID(72)
  RTExcelObj.XlCalculation calculation(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "Calculation"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory RTExcelObj.XlCalculation parameter.
   */

  @DISPID(316) //= 0x13c. The runtime will prefer the VTID if present
  @VTID(73)
  void calculation(
    @LCID int lcid,
    RTExcelObj.XlCalculation rhs);


  /**
   * <p>
   * Getter method for the COM property "Caller"
   * </p>
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(317) //= 0x13d. The runtime will prefer the VTID if present
  @VTID(74)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object caller(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "CanPlaySounds"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(318) //= 0x13e. The runtime will prefer the VTID if present
  @VTID(75)
  boolean canPlaySounds(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "CanRecordSounds"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(319) //= 0x13f. The runtime will prefer the VTID if present
  @VTID(76)
  boolean canRecordSounds(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "Caption"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(139) //= 0x8b. The runtime will prefer the VTID if present
  @VTID(77)
  java.lang.String caption();


  /**
   * <p>
   * Setter method for the COM property "Caption"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(139) //= 0x8b. The runtime will prefer the VTID if present
  @VTID(78)
  void caption(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "CellDragAndDrop"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(320) //= 0x140. The runtime will prefer the VTID if present
  @VTID(79)
  boolean cellDragAndDrop(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "CellDragAndDrop"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(320) //= 0x140. The runtime will prefer the VTID if present
  @VTID(80)
  void cellDragAndDrop(
    @LCID int lcid,
    boolean rhs);


  /**
   * @param centimeters Mandatory double parameter.
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type double
   */

  @DISPID(1086) //= 0x43e. The runtime will prefer the VTID if present
  @VTID(81)
  double centimetersToPoints(
    double centimeters,
    @LCID int lcid);


  /**
   * @param word Mandatory java.lang.String parameter.
   * @param customDictionary Optional parameter. Default value is com4j.Variant.getMissing()
   * @param ignoreUppercase Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(505) //= 0x1f9. The runtime will prefer the VTID if present
  @VTID(82)
  boolean checkSpelling(
    java.lang.String word,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object customDictionary,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object ignoreUppercase,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "ClipboardFormats"
   * </p>
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(321) //= 0x141. The runtime will prefer the VTID if present
  @VTID(83)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object clipboardFormats(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "DisplayClipboardWindow"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(322) //= 0x142. The runtime will prefer the VTID if present
  @VTID(84)
  boolean displayClipboardWindow(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "DisplayClipboardWindow"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(322) //= 0x142. The runtime will prefer the VTID if present
  @VTID(85)
  void displayClipboardWindow(
    @LCID int lcid,
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ColorButtons"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(365) //= 0x16d. The runtime will prefer the VTID if present
  @VTID(86)
  boolean colorButtons();


  /**
   * <p>
   * Setter method for the COM property "ColorButtons"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(365) //= 0x16d. The runtime will prefer the VTID if present
  @VTID(87)
  void colorButtons(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "CommandUnderlines"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type RTExcelObj.XlCommandUnderlines
   */

  @DISPID(323) //= 0x143. The runtime will prefer the VTID if present
  @VTID(88)
  RTExcelObj.XlCommandUnderlines commandUnderlines(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "CommandUnderlines"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory RTExcelObj.XlCommandUnderlines parameter.
   */

  @DISPID(323) //= 0x143. The runtime will prefer the VTID if present
  @VTID(89)
  void commandUnderlines(
    @LCID int lcid,
    RTExcelObj.XlCommandUnderlines rhs);


  /**
   * <p>
   * Getter method for the COM property "ConstrainNumeric"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(324) //= 0x144. The runtime will prefer the VTID if present
  @VTID(90)
  boolean constrainNumeric(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "ConstrainNumeric"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(324) //= 0x144. The runtime will prefer the VTID if present
  @VTID(91)
  void constrainNumeric(
    @LCID int lcid,
    boolean rhs);


  /**
   * @param formula Mandatory java.lang.Object parameter.
   * @param fromReferenceStyle Mandatory RTExcelObj.XlReferenceStyle parameter.
   * @param toReferenceStyle Optional parameter. Default value is com4j.Variant.getMissing()
   * @param toAbsolute Optional parameter. Default value is com4j.Variant.getMissing()
   * @param relativeTo Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(325) //= 0x145. The runtime will prefer the VTID if present
  @VTID(92)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object convertFormula(
    @MarshalAs(NativeType.VARIANT) java.lang.Object formula,
    RTExcelObj.XlReferenceStyle fromReferenceStyle,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object toReferenceStyle,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object toAbsolute,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object relativeTo,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "CopyObjectsWithCells"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(991) //= 0x3df. The runtime will prefer the VTID if present
  @VTID(93)
  boolean copyObjectsWithCells(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "CopyObjectsWithCells"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(991) //= 0x3df. The runtime will prefer the VTID if present
  @VTID(94)
  void copyObjectsWithCells(
    @LCID int lcid,
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Cursor"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type RTExcelObj.XlMousePointer
   */

  @DISPID(1161) //= 0x489. The runtime will prefer the VTID if present
  @VTID(95)
  RTExcelObj.XlMousePointer cursor(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "Cursor"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory RTExcelObj.XlMousePointer parameter.
   */

  @DISPID(1161) //= 0x489. The runtime will prefer the VTID if present
  @VTID(96)
  void cursor(
    @LCID int lcid,
    RTExcelObj.XlMousePointer rhs);


  /**
   * <p>
   * Getter method for the COM property "CustomListCount"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(787) //= 0x313. The runtime will prefer the VTID if present
  @VTID(97)
  int customListCount(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "CutCopyMode"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type RTExcelObj.XlCutCopyMode
   */

  @DISPID(330) //= 0x14a. The runtime will prefer the VTID if present
  @VTID(98)
  RTExcelObj.XlCutCopyMode cutCopyMode(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "CutCopyMode"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory RTExcelObj.XlCutCopyMode parameter.
   */

  @DISPID(330) //= 0x14a. The runtime will prefer the VTID if present
  @VTID(99)
  void cutCopyMode(
    @LCID int lcid,
    RTExcelObj.XlCutCopyMode rhs);


  /**
   * <p>
   * Getter method for the COM property "DataEntryMode"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(331) //= 0x14b. The runtime will prefer the VTID if present
  @VTID(100)
  int dataEntryMode(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "DataEntryMode"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory int parameter.
   */

  @DISPID(331) //= 0x14b. The runtime will prefer the VTID if present
  @VTID(101)
  void dataEntryMode(
    @LCID int lcid,
    int rhs);


  /**
   * @param arg1 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1782) //= 0x6f6. The runtime will prefer the VTID if present
  @VTID(102)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object dummy1(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg4);


  /**
   * @param arg1 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg5 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg6 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg7 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg8 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1783) //= 0x6f7. The runtime will prefer the VTID if present
  @VTID(103)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object dummy2(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg4,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg5,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg6,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg7,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg8);


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1784) //= 0x6f8. The runtime will prefer the VTID if present
  @VTID(104)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object dummy3();


  /**
   * @param arg1 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg5 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg6 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg7 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg8 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg9 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg10 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg11 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg12 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg13 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg14 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg15 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1785) //= 0x6f9. The runtime will prefer the VTID if present
  @VTID(105)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object dummy4(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg4,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg5,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg6,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg7,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg8,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg9,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg10,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg11,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg12,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg13,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg14,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg15);


  /**
   * @param arg1 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg5 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg6 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg7 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg8 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg9 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg10 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg11 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg12 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg13 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1786) //= 0x6fa. The runtime will prefer the VTID if present
  @VTID(106)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object dummy5(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg4,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg5,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg6,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg7,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg8,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg9,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg10,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg11,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg12,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg13);


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1787) //= 0x6fb. The runtime will prefer the VTID if present
  @VTID(107)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object dummy6();


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1788) //= 0x6fc. The runtime will prefer the VTID if present
  @VTID(108)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object dummy7();


  /**
   * @param arg1 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1789) //= 0x6fd. The runtime will prefer the VTID if present
  @VTID(109)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object dummy8(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg1);


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1790) //= 0x6fe. The runtime will prefer the VTID if present
  @VTID(110)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object dummy9();


  /**
   * @param arg Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type boolean
   */

  @DISPID(1791) //= 0x6ff. The runtime will prefer the VTID if present
  @VTID(111)
  boolean dummy10(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg);


  /**
   */

  @DISPID(1792) //= 0x700. The runtime will prefer the VTID if present
  @VTID(112)
  void dummy11();


  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(113)
  @DefaultMethod
  java.lang.String _Default();


  /**
   * <p>
   * Getter method for the COM property "DefaultFilePath"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1038) //= 0x40e. The runtime will prefer the VTID if present
  @VTID(114)
  java.lang.String defaultFilePath(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "DefaultFilePath"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1038) //= 0x40e. The runtime will prefer the VTID if present
  @VTID(115)
  void defaultFilePath(
    @LCID int lcid,
    java.lang.String rhs);


  /**
   * @param name Mandatory java.lang.String parameter.
   * @param lcid Mandatory int parameter.
   */

  @DISPID(217) //= 0xd9. The runtime will prefer the VTID if present
  @VTID(116)
  void deleteChartAutoFormat(
    java.lang.String name,
    @LCID int lcid);


  /**
   * @param listNum Mandatory int parameter.
   * @param lcid Mandatory int parameter.
   */

  @DISPID(783) //= 0x30f. The runtime will prefer the VTID if present
  @VTID(117)
  void deleteCustomList(
    int listNum,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "Dialogs"
   * </p>
   * @return  Returns a value of type RTExcelObj.Dialogs
   */

  @DISPID(761) //= 0x2f9. The runtime will prefer the VTID if present
  @VTID(118)
  RTExcelObj.Dialogs dialogs();


  /**
   * <p>
   * Getter method for the COM property "DisplayAlerts"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(343) //= 0x157. The runtime will prefer the VTID if present
  @VTID(119)
  boolean displayAlerts(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "DisplayAlerts"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(343) //= 0x157. The runtime will prefer the VTID if present
  @VTID(120)
  void displayAlerts(
    @LCID int lcid,
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayFormulaBar"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(344) //= 0x158. The runtime will prefer the VTID if present
  @VTID(121)
  boolean displayFormulaBar(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "DisplayFormulaBar"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(344) //= 0x158. The runtime will prefer the VTID if present
  @VTID(122)
  void displayFormulaBar(
    @LCID int lcid,
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayFullScreen"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1061) //= 0x425. The runtime will prefer the VTID if present
  @VTID(123)
  boolean displayFullScreen(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "DisplayFullScreen"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1061) //= 0x425. The runtime will prefer the VTID if present
  @VTID(124)
  void displayFullScreen(
    @LCID int lcid,
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayNoteIndicator"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(345) //= 0x159. The runtime will prefer the VTID if present
  @VTID(125)
  boolean displayNoteIndicator();


  /**
   * <p>
   * Setter method for the COM property "DisplayNoteIndicator"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(345) //= 0x159. The runtime will prefer the VTID if present
  @VTID(126)
  void displayNoteIndicator(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayCommentIndicator"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlCommentDisplayMode
   */

  @DISPID(1196) //= 0x4ac. The runtime will prefer the VTID if present
  @VTID(127)
  RTExcelObj.XlCommentDisplayMode displayCommentIndicator();


  /**
   * <p>
   * Setter method for the COM property "DisplayCommentIndicator"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlCommentDisplayMode parameter.
   */

  @DISPID(1196) //= 0x4ac. The runtime will prefer the VTID if present
  @VTID(128)
  void displayCommentIndicator(
    RTExcelObj.XlCommentDisplayMode rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayExcel4Menus"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(927) //= 0x39f. The runtime will prefer the VTID if present
  @VTID(129)
  boolean displayExcel4Menus(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "DisplayExcel4Menus"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(927) //= 0x39f. The runtime will prefer the VTID if present
  @VTID(130)
  void displayExcel4Menus(
    @LCID int lcid,
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayRecentFiles"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(926) //= 0x39e. The runtime will prefer the VTID if present
  @VTID(131)
  boolean displayRecentFiles();


  /**
   * <p>
   * Setter method for the COM property "DisplayRecentFiles"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(926) //= 0x39e. The runtime will prefer the VTID if present
  @VTID(132)
  void displayRecentFiles(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayScrollBars"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(346) //= 0x15a. The runtime will prefer the VTID if present
  @VTID(133)
  boolean displayScrollBars(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "DisplayScrollBars"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(346) //= 0x15a. The runtime will prefer the VTID if present
  @VTID(134)
  void displayScrollBars(
    @LCID int lcid,
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayStatusBar"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(347) //= 0x15b. The runtime will prefer the VTID if present
  @VTID(135)
  boolean displayStatusBar(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "DisplayStatusBar"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(347) //= 0x15b. The runtime will prefer the VTID if present
  @VTID(136)
  void displayStatusBar(
    @LCID int lcid,
    boolean rhs);


  /**
   * @param lcid Mandatory int parameter.
   */

  @DISPID(349) //= 0x15d. The runtime will prefer the VTID if present
  @VTID(137)
  void doubleClick(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "EditDirectlyInCell"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(929) //= 0x3a1. The runtime will prefer the VTID if present
  @VTID(138)
  boolean editDirectlyInCell(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "EditDirectlyInCell"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(929) //= 0x3a1. The runtime will prefer the VTID if present
  @VTID(139)
  void editDirectlyInCell(
    @LCID int lcid,
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "EnableAutoComplete"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1179) //= 0x49b. The runtime will prefer the VTID if present
  @VTID(140)
  boolean enableAutoComplete();


  /**
   * <p>
   * Setter method for the COM property "EnableAutoComplete"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1179) //= 0x49b. The runtime will prefer the VTID if present
  @VTID(141)
  void enableAutoComplete(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "EnableCancelKey"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type RTExcelObj.XlEnableCancelKey
   */

  @DISPID(1096) //= 0x448. The runtime will prefer the VTID if present
  @VTID(142)
  RTExcelObj.XlEnableCancelKey enableCancelKey(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "EnableCancelKey"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory RTExcelObj.XlEnableCancelKey parameter.
   */

  @DISPID(1096) //= 0x448. The runtime will prefer the VTID if present
  @VTID(143)
  void enableCancelKey(
    @LCID int lcid,
    RTExcelObj.XlEnableCancelKey rhs);


  /**
   * <p>
   * Getter method for the COM property "EnableSound"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1197) //= 0x4ad. The runtime will prefer the VTID if present
  @VTID(144)
  boolean enableSound();


  /**
   * <p>
   * Setter method for the COM property "EnableSound"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1197) //= 0x4ad. The runtime will prefer the VTID if present
  @VTID(145)
  void enableSound(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "EnableTipWizard"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1064) //= 0x428. The runtime will prefer the VTID if present
  @VTID(146)
  boolean enableTipWizard(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "EnableTipWizard"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1064) //= 0x428. The runtime will prefer the VTID if present
  @VTID(147)
  void enableTipWizard(
    @LCID int lcid,
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "FileConverters"
   * </p>
   * @param index1 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param index2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(931) //= 0x3a3. The runtime will prefer the VTID if present
  @VTID(148)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object fileConverters(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index2,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "FileSearch"
   * </p>
   * @return  Returns a value of type RTExcelObj.FileSearch
   */

  @DISPID(1200) //= 0x4b0. The runtime will prefer the VTID if present
  @VTID(149)
  RTExcelObj.FileSearch fileSearch();


  /**
   * <p>
   * Getter method for the COM property "FileFind"
   * </p>
   * @return  Returns a value of type RTExcelObj.IFind
   */

  @DISPID(1201) //= 0x4b1. The runtime will prefer the VTID if present
  @VTID(150)
  RTExcelObj.IFind fileFind();


  /**
   * @param lcid Mandatory int parameter.
   */

  @DISPID(1068) //= 0x42c. The runtime will prefer the VTID if present
  @VTID(151)
  void _FindFile(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "FixedDecimal"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(351) //= 0x15f. The runtime will prefer the VTID if present
  @VTID(152)
  boolean fixedDecimal(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "FixedDecimal"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(351) //= 0x15f. The runtime will prefer the VTID if present
  @VTID(153)
  void fixedDecimal(
    @LCID int lcid,
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "FixedDecimalPlaces"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(352) //= 0x160. The runtime will prefer the VTID if present
  @VTID(154)
  int fixedDecimalPlaces(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "FixedDecimalPlaces"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory int parameter.
   */

  @DISPID(352) //= 0x160. The runtime will prefer the VTID if present
  @VTID(155)
  void fixedDecimalPlaces(
    @LCID int lcid,
    int rhs);


  /**
   * @param listNum Mandatory int parameter.
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(786) //= 0x312. The runtime will prefer the VTID if present
  @VTID(156)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getCustomListContents(
    int listNum,
    @LCID int lcid);


  /**
   * @param listArray Mandatory java.lang.Object parameter.
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(785) //= 0x311. The runtime will prefer the VTID if present
  @VTID(157)
  int getCustomListNum(
    @MarshalAs(NativeType.VARIANT) java.lang.Object listArray,
    @LCID int lcid);


  /**
   * @param fileFilter Optional parameter. Default value is com4j.Variant.getMissing()
   * @param filterIndex Optional parameter. Default value is com4j.Variant.getMissing()
   * @param title Optional parameter. Default value is com4j.Variant.getMissing()
   * @param buttonText Optional parameter. Default value is com4j.Variant.getMissing()
   * @param multiSelect Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1075) //= 0x433. The runtime will prefer the VTID if present
  @VTID(158)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getOpenFilename(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object fileFilter,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object filterIndex,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object title,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object buttonText,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object multiSelect,
    @LCID int lcid);


  /**
   * @param initialFilename Optional parameter. Default value is com4j.Variant.getMissing()
   * @param fileFilter Optional parameter. Default value is com4j.Variant.getMissing()
   * @param filterIndex Optional parameter. Default value is com4j.Variant.getMissing()
   * @param title Optional parameter. Default value is com4j.Variant.getMissing()
   * @param buttonText Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1076) //= 0x434. The runtime will prefer the VTID if present
  @VTID(159)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getSaveAsFilename(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object initialFilename,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object fileFilter,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object filterIndex,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object title,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object buttonText,
    @LCID int lcid);


  /**
   * @param reference Optional parameter. Default value is com4j.Variant.getMissing()
   * @param scroll Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(475) //= 0x1db. The runtime will prefer the VTID if present
  @VTID(160)
  void _goto(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object reference,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object scroll,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "Height"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type double
   */

  @DISPID(123) //= 0x7b. The runtime will prefer the VTID if present
  @VTID(161)
  double height(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "Height"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory double parameter.
   */

  @DISPID(123) //= 0x7b. The runtime will prefer the VTID if present
  @VTID(162)
  void height(
    @LCID int lcid,
    double rhs);


  /**
   * @param helpFile Optional parameter. Default value is com4j.Variant.getMissing()
   * @param helpContextID Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(354) //= 0x162. The runtime will prefer the VTID if present
  @VTID(163)
  void help(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object helpFile,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object helpContextID,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "IgnoreRemoteRequests"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(356) //= 0x164. The runtime will prefer the VTID if present
  @VTID(164)
  boolean ignoreRemoteRequests(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "IgnoreRemoteRequests"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(356) //= 0x164. The runtime will prefer the VTID if present
  @VTID(165)
  void ignoreRemoteRequests(
    @LCID int lcid,
    boolean rhs);


  /**
   * @param inches Mandatory double parameter.
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type double
   */

  @DISPID(1087) //= 0x43f. The runtime will prefer the VTID if present
  @VTID(166)
  double inchesToPoints(
    double inches,
    @LCID int lcid);


  /**
   * @param prompt Mandatory java.lang.String parameter.
   * @param title Optional parameter. Default value is com4j.Variant.getMissing()
   * @param _default Optional parameter. Default value is com4j.Variant.getMissing()
   * @param left Optional parameter. Default value is com4j.Variant.getMissing()
   * @param top Optional parameter. Default value is com4j.Variant.getMissing()
   * @param helpFile Optional parameter. Default value is com4j.Variant.getMissing()
   * @param helpContextID Optional parameter. Default value is com4j.Variant.getMissing()
   * @param type Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(357) //= 0x165. The runtime will prefer the VTID if present
  @VTID(167)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object inputBox(
    java.lang.String prompt,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object title,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object _default,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object left,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object top,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object helpFile,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object helpContextID,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object type,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "Interactive"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(361) //= 0x169. The runtime will prefer the VTID if present
  @VTID(168)
  boolean interactive(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "Interactive"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(361) //= 0x169. The runtime will prefer the VTID if present
  @VTID(169)
  void interactive(
    @LCID int lcid,
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "International"
   * </p>
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(362) //= 0x16a. The runtime will prefer the VTID if present
  @VTID(170)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object international(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "Iteration"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(363) //= 0x16b. The runtime will prefer the VTID if present
  @VTID(171)
  boolean iteration(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "Iteration"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(363) //= 0x16b. The runtime will prefer the VTID if present
  @VTID(172)
  void iteration(
    @LCID int lcid,
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "LargeButtons"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(364) //= 0x16c. The runtime will prefer the VTID if present
  @VTID(173)
  boolean largeButtons();


  /**
   * <p>
   * Setter method for the COM property "LargeButtons"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(364) //= 0x16c. The runtime will prefer the VTID if present
  @VTID(174)
  void largeButtons(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Left"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type double
   */

  @DISPID(127) //= 0x7f. The runtime will prefer the VTID if present
  @VTID(175)
  double left(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "Left"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory double parameter.
   */

  @DISPID(127) //= 0x7f. The runtime will prefer the VTID if present
  @VTID(176)
  void left(
    @LCID int lcid,
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "LibraryPath"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(366) //= 0x16e. The runtime will prefer the VTID if present
  @VTID(177)
  java.lang.String libraryPath(
    @LCID int lcid);


  /**
   * @param macro Optional parameter. Default value is com4j.Variant.getMissing()
   * @param description Optional parameter. Default value is com4j.Variant.getMissing()
   * @param hasMenu Optional parameter. Default value is com4j.Variant.getMissing()
   * @param menuText Optional parameter. Default value is com4j.Variant.getMissing()
   * @param hasShortcutKey Optional parameter. Default value is com4j.Variant.getMissing()
   * @param shortcutKey Optional parameter. Default value is com4j.Variant.getMissing()
   * @param category Optional parameter. Default value is com4j.Variant.getMissing()
   * @param statusBar Optional parameter. Default value is com4j.Variant.getMissing()
   * @param helpContextID Optional parameter. Default value is com4j.Variant.getMissing()
   * @param helpFile Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(1135) //= 0x46f. The runtime will prefer the VTID if present
  @VTID(178)
  void _MacroOptions(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object macro,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object description,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object hasMenu,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object menuText,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object hasShortcutKey,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object shortcutKey,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object category,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object statusBar,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object helpContextID,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object helpFile,
    @LCID int lcid);


  /**
   * @param lcid Mandatory int parameter.
   */

  @DISPID(945) //= 0x3b1. The runtime will prefer the VTID if present
  @VTID(179)
  void mailLogoff(
    @LCID int lcid);


  /**
   * @param name Optional parameter. Default value is com4j.Variant.getMissing()
   * @param password Optional parameter. Default value is com4j.Variant.getMissing()
   * @param downloadNewMail Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(943) //= 0x3af. The runtime will prefer the VTID if present
  @VTID(180)
  void mailLogon(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object name,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object password,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object downloadNewMail,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "MailSession"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(942) //= 0x3ae. The runtime will prefer the VTID if present
  @VTID(181)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object mailSession(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "MailSystem"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type RTExcelObj.XlMailSystem
   */

  @DISPID(971) //= 0x3cb. The runtime will prefer the VTID if present
  @VTID(182)
  RTExcelObj.XlMailSystem mailSystem(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "MathCoprocessorAvailable"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(367) //= 0x16f. The runtime will prefer the VTID if present
  @VTID(183)
  boolean mathCoprocessorAvailable(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "MaxChange"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type double
   */

  @DISPID(368) //= 0x170. The runtime will prefer the VTID if present
  @VTID(184)
  double maxChange(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "MaxChange"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory double parameter.
   */

  @DISPID(368) //= 0x170. The runtime will prefer the VTID if present
  @VTID(185)
  void maxChange(
    @LCID int lcid,
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "MaxIterations"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(369) //= 0x171. The runtime will prefer the VTID if present
  @VTID(186)
  int maxIterations(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "MaxIterations"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory int parameter.
   */

  @DISPID(369) //= 0x171. The runtime will prefer the VTID if present
  @VTID(187)
  void maxIterations(
    @LCID int lcid,
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "MemoryFree"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(370) //= 0x172. The runtime will prefer the VTID if present
  @VTID(188)
  int memoryFree(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "MemoryTotal"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(371) //= 0x173. The runtime will prefer the VTID if present
  @VTID(189)
  int memoryTotal(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "MemoryUsed"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(372) //= 0x174. The runtime will prefer the VTID if present
  @VTID(190)
  int memoryUsed(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "MouseAvailable"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(373) //= 0x175. The runtime will prefer the VTID if present
  @VTID(191)
  boolean mouseAvailable(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "MoveAfterReturn"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(374) //= 0x176. The runtime will prefer the VTID if present
  @VTID(192)
  boolean moveAfterReturn(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "MoveAfterReturn"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(374) //= 0x176. The runtime will prefer the VTID if present
  @VTID(193)
  void moveAfterReturn(
    @LCID int lcid,
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "MoveAfterReturnDirection"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type RTExcelObj.XlDirection
   */

  @DISPID(1144) //= 0x478. The runtime will prefer the VTID if present
  @VTID(194)
  RTExcelObj.XlDirection moveAfterReturnDirection(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "MoveAfterReturnDirection"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory RTExcelObj.XlDirection parameter.
   */

  @DISPID(1144) //= 0x478. The runtime will prefer the VTID if present
  @VTID(195)
  void moveAfterReturnDirection(
    @LCID int lcid,
    RTExcelObj.XlDirection rhs);


  /**
   * <p>
   * Getter method for the COM property "RecentFiles"
   * </p>
   * @return  Returns a value of type RTExcelObj.RecentFiles
   */

  @DISPID(1202) //= 0x4b2. The runtime will prefer the VTID if present
  @VTID(196)
  RTExcelObj.RecentFiles recentFiles();


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(197)
  java.lang.String name();


  /**
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type RTExcelObj._Workbook
   */

  @DISPID(972) //= 0x3cc. The runtime will prefer the VTID if present
  @VTID(198)
  RTExcelObj._Workbook nextLetter(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "NetworkTemplatesPath"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(388) //= 0x184. The runtime will prefer the VTID if present
  @VTID(199)
  java.lang.String networkTemplatesPath(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "ODBCErrors"
   * </p>
   * @return  Returns a value of type RTExcelObj.ODBCErrors
   */

  @DISPID(1203) //= 0x4b3. The runtime will prefer the VTID if present
  @VTID(200)
  RTExcelObj.ODBCErrors odbcErrors();


  /**
   * <p>
   * Getter method for the COM property "ODBCTimeout"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1204) //= 0x4b4. The runtime will prefer the VTID if present
  @VTID(201)
  int odbcTimeout();


  /**
   * <p>
   * Setter method for the COM property "ODBCTimeout"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(1204) //= 0x4b4. The runtime will prefer the VTID if present
  @VTID(202)
  void odbcTimeout(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "OnCalculate"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(625) //= 0x271. The runtime will prefer the VTID if present
  @VTID(203)
  java.lang.String onCalculate(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "OnCalculate"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(625) //= 0x271. The runtime will prefer the VTID if present
  @VTID(204)
  void onCalculate(
    @LCID int lcid,
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "OnData"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(629) //= 0x275. The runtime will prefer the VTID if present
  @VTID(205)
  java.lang.String onData(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "OnData"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(629) //= 0x275. The runtime will prefer the VTID if present
  @VTID(206)
  void onData(
    @LCID int lcid,
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "OnDoubleClick"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(628) //= 0x274. The runtime will prefer the VTID if present
  @VTID(207)
  java.lang.String onDoubleClick(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "OnDoubleClick"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(628) //= 0x274. The runtime will prefer the VTID if present
  @VTID(208)
  void onDoubleClick(
    @LCID int lcid,
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "OnEntry"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(627) //= 0x273. The runtime will prefer the VTID if present
  @VTID(209)
  java.lang.String onEntry(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "OnEntry"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(627) //= 0x273. The runtime will prefer the VTID if present
  @VTID(210)
  void onEntry(
    @LCID int lcid,
    java.lang.String rhs);


  /**
   * @param key Mandatory java.lang.String parameter.
   * @param procedure Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(626) //= 0x272. The runtime will prefer the VTID if present
  @VTID(211)
  void onKey(
    java.lang.String key,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object procedure,
    @LCID int lcid);


  /**
   * @param text Mandatory java.lang.String parameter.
   * @param procedure Mandatory java.lang.String parameter.
   * @param lcid Mandatory int parameter.
   */

  @DISPID(769) //= 0x301. The runtime will prefer the VTID if present
  @VTID(212)
  void onRepeat(
    java.lang.String text,
    java.lang.String procedure,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "OnSheetActivate"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1031) //= 0x407. The runtime will prefer the VTID if present
  @VTID(213)
  java.lang.String onSheetActivate(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "OnSheetActivate"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1031) //= 0x407. The runtime will prefer the VTID if present
  @VTID(214)
  void onSheetActivate(
    @LCID int lcid,
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "OnSheetDeactivate"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1081) //= 0x439. The runtime will prefer the VTID if present
  @VTID(215)
  java.lang.String onSheetDeactivate(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "OnSheetDeactivate"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1081) //= 0x439. The runtime will prefer the VTID if present
  @VTID(216)
  void onSheetDeactivate(
    @LCID int lcid,
    java.lang.String rhs);


  /**
   * @param earliestTime Mandatory java.lang.Object parameter.
   * @param procedure Mandatory java.lang.String parameter.
   * @param latestTime Optional parameter. Default value is com4j.Variant.getMissing()
   * @param schedule Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(624) //= 0x270. The runtime will prefer the VTID if present
  @VTID(217)
  void onTime(
    @MarshalAs(NativeType.VARIANT) java.lang.Object earliestTime,
    java.lang.String procedure,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object latestTime,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object schedule,
    @LCID int lcid);


  /**
   * @param text Mandatory java.lang.String parameter.
   * @param procedure Mandatory java.lang.String parameter.
   * @param lcid Mandatory int parameter.
   */

  @DISPID(770) //= 0x302. The runtime will prefer the VTID if present
  @VTID(218)
  void onUndo(
    java.lang.String text,
    java.lang.String procedure,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "OnWindow"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(623) //= 0x26f. The runtime will prefer the VTID if present
  @VTID(219)
  java.lang.String onWindow(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "OnWindow"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(623) //= 0x26f. The runtime will prefer the VTID if present
  @VTID(220)
  void onWindow(
    @LCID int lcid,
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "OperatingSystem"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(375) //= 0x177. The runtime will prefer the VTID if present
  @VTID(221)
  java.lang.String operatingSystem(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "OrganizationName"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(376) //= 0x178. The runtime will prefer the VTID if present
  @VTID(222)
  java.lang.String organizationName(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "Path"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(291) //= 0x123. The runtime will prefer the VTID if present
  @VTID(223)
  java.lang.String path(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "PathSeparator"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(377) //= 0x179. The runtime will prefer the VTID if present
  @VTID(224)
  java.lang.String pathSeparator(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "PreviousSelections"
   * </p>
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(378) //= 0x17a. The runtime will prefer the VTID if present
  @VTID(225)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object previousSelections(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "PivotTableSelection"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1205) //= 0x4b5. The runtime will prefer the VTID if present
  @VTID(226)
  boolean pivotTableSelection();


  /**
   * <p>
   * Setter method for the COM property "PivotTableSelection"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1205) //= 0x4b5. The runtime will prefer the VTID if present
  @VTID(227)
  void pivotTableSelection(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "PromptForSummaryInfo"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1062) //= 0x426. The runtime will prefer the VTID if present
  @VTID(228)
  boolean promptForSummaryInfo(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "PromptForSummaryInfo"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1062) //= 0x426. The runtime will prefer the VTID if present
  @VTID(229)
  void promptForSummaryInfo(
    @LCID int lcid,
    boolean rhs);


  /**
   */

  @DISPID(302) //= 0x12e. The runtime will prefer the VTID if present
  @VTID(230)
  void quit();


  /**
   * @param basicCode Optional parameter. Default value is com4j.Variant.getMissing()
   * @param xlmCode Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(773) //= 0x305. The runtime will prefer the VTID if present
  @VTID(231)
  void recordMacro(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object basicCode,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object xlmCode,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "RecordRelative"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(379) //= 0x17b. The runtime will prefer the VTID if present
  @VTID(232)
  boolean recordRelative(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "ReferenceStyle"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type RTExcelObj.XlReferenceStyle
   */

  @DISPID(380) //= 0x17c. The runtime will prefer the VTID if present
  @VTID(233)
  RTExcelObj.XlReferenceStyle referenceStyle(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "ReferenceStyle"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory RTExcelObj.XlReferenceStyle parameter.
   */

  @DISPID(380) //= 0x17c. The runtime will prefer the VTID if present
  @VTID(234)
  void referenceStyle(
    @LCID int lcid,
    RTExcelObj.XlReferenceStyle rhs);


  /**
   * <p>
   * Getter method for the COM property "RegisteredFunctions"
   * </p>
   * @param index1 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param index2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(775) //= 0x307. The runtime will prefer the VTID if present
  @VTID(235)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object registeredFunctions(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index2,
    @LCID int lcid);


  /**
   * @param filename Mandatory java.lang.String parameter.
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(30) //= 0x1e. The runtime will prefer the VTID if present
  @VTID(236)
  boolean registerXLL(
    java.lang.String filename,
    @LCID int lcid);


  /**
   * @param lcid Mandatory int parameter.
   */

  @DISPID(301) //= 0x12d. The runtime will prefer the VTID if present
  @VTID(237)
  void repeat(
    @LCID int lcid);


  /**
   * @param lcid Mandatory int parameter.
   */

  @DISPID(928) //= 0x3a0. The runtime will prefer the VTID if present
  @VTID(238)
  void resetTipWizard(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "RollZoom"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1206) //= 0x4b6. The runtime will prefer the VTID if present
  @VTID(239)
  boolean rollZoom();


  /**
   * <p>
   * Setter method for the COM property "RollZoom"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1206) //= 0x4b6. The runtime will prefer the VTID if present
  @VTID(240)
  void rollZoom(
    boolean rhs);


  /**
   * @param filename Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(283) //= 0x11b. The runtime will prefer the VTID if present
  @VTID(241)
  void save(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object filename,
    @LCID int lcid);


  /**
   * @param filename Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(212) //= 0xd4. The runtime will prefer the VTID if present
  @VTID(242)
  void saveWorkspace(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object filename,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "ScreenUpdating"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(382) //= 0x17e. The runtime will prefer the VTID if present
  @VTID(243)
  boolean screenUpdating(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "ScreenUpdating"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(382) //= 0x17e. The runtime will prefer the VTID if present
  @VTID(244)
  void screenUpdating(
    @LCID int lcid,
    boolean rhs);


  /**
   * @param formatName Optional parameter. Default value is com4j.Variant.getMissing()
   * @param gallery Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(219) //= 0xdb. The runtime will prefer the VTID if present
  @VTID(245)
  void setDefaultChart(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object formatName,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object gallery);


  /**
   * <p>
   * Getter method for the COM property "SheetsInNewWorkbook"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(993) //= 0x3e1. The runtime will prefer the VTID if present
  @VTID(246)
  int sheetsInNewWorkbook(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "SheetsInNewWorkbook"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory int parameter.
   */

  @DISPID(993) //= 0x3e1. The runtime will prefer the VTID if present
  @VTID(247)
  void sheetsInNewWorkbook(
    @LCID int lcid,
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowChartTipNames"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1207) //= 0x4b7. The runtime will prefer the VTID if present
  @VTID(248)
  boolean showChartTipNames();


  /**
   * <p>
   * Setter method for the COM property "ShowChartTipNames"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1207) //= 0x4b7. The runtime will prefer the VTID if present
  @VTID(249)
  void showChartTipNames(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowChartTipValues"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1208) //= 0x4b8. The runtime will prefer the VTID if present
  @VTID(250)
  boolean showChartTipValues();


  /**
   * <p>
   * Setter method for the COM property "ShowChartTipValues"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1208) //= 0x4b8. The runtime will prefer the VTID if present
  @VTID(251)
  void showChartTipValues(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "StandardFont"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(924) //= 0x39c. The runtime will prefer the VTID if present
  @VTID(252)
  java.lang.String standardFont(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "StandardFont"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(924) //= 0x39c. The runtime will prefer the VTID if present
  @VTID(253)
  void standardFont(
    @LCID int lcid,
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "StandardFontSize"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type double
   */

  @DISPID(925) //= 0x39d. The runtime will prefer the VTID if present
  @VTID(254)
  double standardFontSize(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "StandardFontSize"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory double parameter.
   */

  @DISPID(925) //= 0x39d. The runtime will prefer the VTID if present
  @VTID(255)
  void standardFontSize(
    @LCID int lcid,
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "StartupPath"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(385) //= 0x181. The runtime will prefer the VTID if present
  @VTID(256)
  java.lang.String startupPath(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "StatusBar"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(386) //= 0x182. The runtime will prefer the VTID if present
  @VTID(257)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object statusBar(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "StatusBar"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(386) //= 0x182. The runtime will prefer the VTID if present
  @VTID(258)
  void statusBar(
    @LCID int lcid,
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "TemplatesPath"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(381) //= 0x17d. The runtime will prefer the VTID if present
  @VTID(259)
  java.lang.String templatesPath(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "ShowToolTips"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(387) //= 0x183. The runtime will prefer the VTID if present
  @VTID(260)
  boolean showToolTips();


  /**
   * <p>
   * Setter method for the COM property "ShowToolTips"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(387) //= 0x183. The runtime will prefer the VTID if present
  @VTID(261)
  void showToolTips(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Top"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type double
   */

  @DISPID(126) //= 0x7e. The runtime will prefer the VTID if present
  @VTID(262)
  double top(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "Top"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory double parameter.
   */

  @DISPID(126) //= 0x7e. The runtime will prefer the VTID if present
  @VTID(263)
  void top(
    @LCID int lcid,
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "DefaultSaveFormat"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlFileFormat
   */

  @DISPID(1209) //= 0x4b9. The runtime will prefer the VTID if present
  @VTID(264)
  RTExcelObj.XlFileFormat defaultSaveFormat();


  /**
   * <p>
   * Setter method for the COM property "DefaultSaveFormat"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlFileFormat parameter.
   */

  @DISPID(1209) //= 0x4b9. The runtime will prefer the VTID if present
  @VTID(265)
  void defaultSaveFormat(
    RTExcelObj.XlFileFormat rhs);


  /**
   * <p>
   * Getter method for the COM property "TransitionMenuKey"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(310) //= 0x136. The runtime will prefer the VTID if present
  @VTID(266)
  java.lang.String transitionMenuKey(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "TransitionMenuKey"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(310) //= 0x136. The runtime will prefer the VTID if present
  @VTID(267)
  void transitionMenuKey(
    @LCID int lcid,
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "TransitionMenuKeyAction"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(311) //= 0x137. The runtime will prefer the VTID if present
  @VTID(268)
  int transitionMenuKeyAction(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "TransitionMenuKeyAction"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory int parameter.
   */

  @DISPID(311) //= 0x137. The runtime will prefer the VTID if present
  @VTID(269)
  void transitionMenuKeyAction(
    @LCID int lcid,
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "TransitionNavigKeys"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(312) //= 0x138. The runtime will prefer the VTID if present
  @VTID(270)
  boolean transitionNavigKeys(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "TransitionNavigKeys"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(312) //= 0x138. The runtime will prefer the VTID if present
  @VTID(271)
  void transitionNavigKeys(
    @LCID int lcid,
    boolean rhs);


  /**
   * @param lcid Mandatory int parameter.
   */

  @DISPID(303) //= 0x12f. The runtime will prefer the VTID if present
  @VTID(272)
  void undo(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "UsableHeight"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type double
   */

  @DISPID(389) //= 0x185. The runtime will prefer the VTID if present
  @VTID(273)
  double usableHeight(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "UsableWidth"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type double
   */

  @DISPID(390) //= 0x186. The runtime will prefer the VTID if present
  @VTID(274)
  double usableWidth(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "UserControl"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1210) //= 0x4ba. The runtime will prefer the VTID if present
  @VTID(275)
  boolean userControl();


  /**
   * <p>
   * Setter method for the COM property "UserControl"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1210) //= 0x4ba. The runtime will prefer the VTID if present
  @VTID(276)
  void userControl(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "UserName"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(391) //= 0x187. The runtime will prefer the VTID if present
  @VTID(277)
  java.lang.String userName(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "UserName"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(391) //= 0x187. The runtime will prefer the VTID if present
  @VTID(278)
  void userName(
    @LCID int lcid,
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Value"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(279)
  java.lang.String value();


  /**
   * <p>
   * Getter method for the COM property "VBE"
   * </p>
   * @return  Returns a value of type RTExcelObj.VBE
   */

  @DISPID(1211) //= 0x4bb. The runtime will prefer the VTID if present
  @VTID(280)
  RTExcelObj.VBE vbe();


  /**
   * <p>
   * Getter method for the COM property "Version"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(392) //= 0x188. The runtime will prefer the VTID if present
  @VTID(281)
  java.lang.String version(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "Visible"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(558) //= 0x22e. The runtime will prefer the VTID if present
  @VTID(282)
  boolean visible(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "Visible"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(558) //= 0x22e. The runtime will prefer the VTID if present
  @VTID(283)
  void visible(
    @LCID int lcid,
    boolean rhs);


  /**
   * @param _volatile Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(788) //= 0x314. The runtime will prefer the VTID if present
  @VTID(284)
  void _volatile(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object _volatile,
    @LCID int lcid);


  /**
   * @param time Mandatory java.lang.Object parameter.
   * @param lcid Mandatory int parameter.
   */

  @DISPID(393) //= 0x189. The runtime will prefer the VTID if present
  @VTID(285)
  void _Wait(
    @MarshalAs(NativeType.VARIANT) java.lang.Object time,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "Width"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type double
   */

  @DISPID(122) //= 0x7a. The runtime will prefer the VTID if present
  @VTID(286)
  double width(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "Width"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory double parameter.
   */

  @DISPID(122) //= 0x7a. The runtime will prefer the VTID if present
  @VTID(287)
  void width(
    @LCID int lcid,
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "WindowsForPens"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(395) //= 0x18b. The runtime will prefer the VTID if present
  @VTID(288)
  boolean windowsForPens(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "WindowState"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type RTExcelObj.XlWindowState
   */

  @DISPID(396) //= 0x18c. The runtime will prefer the VTID if present
  @VTID(289)
  RTExcelObj.XlWindowState windowState(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "WindowState"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory RTExcelObj.XlWindowState parameter.
   */

  @DISPID(396) //= 0x18c. The runtime will prefer the VTID if present
  @VTID(290)
  void windowState(
    @LCID int lcid,
    RTExcelObj.XlWindowState rhs);


  /**
   * <p>
   * Getter method for the COM property "UILanguage"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(291)
  int uiLanguage(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "UILanguage"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory int parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(292)
  void uiLanguage(
    @LCID int lcid,
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "DefaultSheetDirection"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(229) //= 0xe5. The runtime will prefer the VTID if present
  @VTID(293)
  int defaultSheetDirection(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "DefaultSheetDirection"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory int parameter.
   */

  @DISPID(229) //= 0xe5. The runtime will prefer the VTID if present
  @VTID(294)
  void defaultSheetDirection(
    @LCID int lcid,
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "CursorMovement"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(232) //= 0xe8. The runtime will prefer the VTID if present
  @VTID(295)
  int cursorMovement(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "CursorMovement"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory int parameter.
   */

  @DISPID(232) //= 0xe8. The runtime will prefer the VTID if present
  @VTID(296)
  void cursorMovement(
    @LCID int lcid,
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "ControlCharacters"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(233) //= 0xe9. The runtime will prefer the VTID if present
  @VTID(297)
  boolean controlCharacters(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "ControlCharacters"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(233) //= 0xe9. The runtime will prefer the VTID if present
  @VTID(298)
  void controlCharacters(
    @LCID int lcid,
    boolean rhs);


  /**
   * @param arg1 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg5 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg6 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg7 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg8 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg9 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg10 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg11 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg12 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg13 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg14 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg15 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg16 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg17 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg18 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg19 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg20 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg21 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg22 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg23 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg24 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg25 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg26 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg27 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg28 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg29 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg30 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(169) //= 0xa9. The runtime will prefer the VTID if present
  @VTID(299)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object _WSFunction(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg4,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg5,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg6,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg7,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg8,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg9,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg10,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg11,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg12,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg13,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg14,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg15,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg16,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg17,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg18,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg19,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg20,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg21,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg22,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg23,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg24,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg25,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg26,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg27,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg28,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg29,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg30,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "EnableEvents"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1212) //= 0x4bc. The runtime will prefer the VTID if present
  @VTID(300)
  boolean enableEvents();


  /**
   * <p>
   * Setter method for the COM property "EnableEvents"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1212) //= 0x4bc. The runtime will prefer the VTID if present
  @VTID(301)
  void enableEvents(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayInfoWindow"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1213) //= 0x4bd. The runtime will prefer the VTID if present
  @VTID(302)
  boolean displayInfoWindow();


  /**
   * <p>
   * Setter method for the COM property "DisplayInfoWindow"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1213) //= 0x4bd. The runtime will prefer the VTID if present
  @VTID(303)
  void displayInfoWindow(
    boolean rhs);


  /**
   * @param time Mandatory java.lang.Object parameter.
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1770) //= 0x6ea. The runtime will prefer the VTID if present
  @VTID(304)
  boolean wait_(
    @MarshalAs(NativeType.VARIANT) java.lang.Object time,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "ExtendList"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1793) //= 0x701. The runtime will prefer the VTID if present
  @VTID(305)
  boolean extendList();


  /**
   * <p>
   * Setter method for the COM property "ExtendList"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1793) //= 0x701. The runtime will prefer the VTID if present
  @VTID(306)
  void extendList(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "OLEDBErrors"
   * </p>
   * @return  Returns a value of type RTExcelObj.OLEDBErrors
   */

  @DISPID(1794) //= 0x702. The runtime will prefer the VTID if present
  @VTID(307)
  RTExcelObj.OLEDBErrors oledbErrors();


  /**
   * @param text Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1795) //= 0x703. The runtime will prefer the VTID if present
  @VTID(308)
  java.lang.String getPhonetic(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object text);


  /**
   * <p>
   * Getter method for the COM property "COMAddIns"
   * </p>
   * @return  Returns a value of type RTExcelObj.COMAddIns
   */

  @DISPID(1796) //= 0x704. The runtime will prefer the VTID if present
  @VTID(309)
  RTExcelObj.COMAddIns comAddIns();


  @VTID(309)
  @ReturnValue(defaultPropertyThrough={RTExcelObj.COMAddIns.class})
  RTExcelObj.COMAddIn comAddIns(
    java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "DefaultWebOptions"
   * </p>
   * @return  Returns a value of type RTExcelObj.DefaultWebOptions
   */

  @DISPID(1797) //= 0x705. The runtime will prefer the VTID if present
  @VTID(310)
  RTExcelObj.DefaultWebOptions defaultWebOptions();


  /**
   * <p>
   * Getter method for the COM property "ProductCode"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1798) //= 0x706. The runtime will prefer the VTID if present
  @VTID(311)
  java.lang.String productCode();


  /**
   * <p>
   * Getter method for the COM property "UserLibraryPath"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1799) //= 0x707. The runtime will prefer the VTID if present
  @VTID(312)
  java.lang.String userLibraryPath();


  /**
   * <p>
   * Getter method for the COM property "AutoPercentEntry"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1800) //= 0x708. The runtime will prefer the VTID if present
  @VTID(313)
  boolean autoPercentEntry();


  /**
   * <p>
   * Setter method for the COM property "AutoPercentEntry"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1800) //= 0x708. The runtime will prefer the VTID if present
  @VTID(314)
  void autoPercentEntry(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "LanguageSettings"
   * </p>
   * @return  Returns a value of type RTExcelObj.LanguageSettings
   */

  @DISPID(1801) //= 0x709. The runtime will prefer the VTID if present
  @VTID(315)
  RTExcelObj.LanguageSettings languageSettings();


  /**
   * <p>
   * Getter method for the COM property "Dummy101"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1802) //= 0x70a. The runtime will prefer the VTID if present
  @VTID(316)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject dummy101();


  /**
   * @param p1 Mandatory RTExcelObj.PivotTable parameter.
   * @param p2 Mandatory RTExcelObj.PivotTable parameter.
   */

  @DISPID(1803) //= 0x70b. The runtime will prefer the VTID if present
  @VTID(317)
  void dummy12(
    RTExcelObj.PivotTable p1,
    RTExcelObj.PivotTable p2);


  /**
   * <p>
   * Getter method for the COM property "AnswerWizard"
   * </p>
   * @return  Returns a value of type RTExcelObj.AnswerWizard
   */

  @DISPID(1804) //= 0x70c. The runtime will prefer the VTID if present
  @VTID(318)
  RTExcelObj.AnswerWizard answerWizard();


  /**
   */

  @DISPID(1805) //= 0x70d. The runtime will prefer the VTID if present
  @VTID(319)
  void calculateFull();


  /**
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1771) //= 0x6eb. The runtime will prefer the VTID if present
  @VTID(320)
  boolean findFile(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "CalculationVersion"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1806) //= 0x70e. The runtime will prefer the VTID if present
  @VTID(321)
  int calculationVersion();


  /**
   * <p>
   * Getter method for the COM property "ShowWindowsInTaskbar"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1807) //= 0x70f. The runtime will prefer the VTID if present
  @VTID(322)
  boolean showWindowsInTaskbar();


  /**
   * <p>
   * Setter method for the COM property "ShowWindowsInTaskbar"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1807) //= 0x70f. The runtime will prefer the VTID if present
  @VTID(323)
  void showWindowsInTaskbar(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "FeatureInstall"
   * </p>
   * @return  Returns a value of type RTExcelObj.MsoFeatureInstall
   */

  @DISPID(1808) //= 0x710. The runtime will prefer the VTID if present
  @VTID(324)
  RTExcelObj.MsoFeatureInstall featureInstall();


  /**
   * <p>
   * Setter method for the COM property "FeatureInstall"
   * </p>
   * @param rhs Mandatory RTExcelObj.MsoFeatureInstall parameter.
   */

  @DISPID(1808) //= 0x710. The runtime will prefer the VTID if present
  @VTID(325)
  void featureInstall(
    RTExcelObj.MsoFeatureInstall rhs);


  /**
   * <p>
   * Getter method for the COM property "Ready"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1932) //= 0x78c. The runtime will prefer the VTID if present
  @VTID(326)
  boolean ready();


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg5 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg6 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg7 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg8 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg9 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg10 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg11 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg12 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg13 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg14 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg15 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg16 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg17 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg18 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg19 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg20 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg21 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg22 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg23 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg24 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg25 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg26 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg27 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg28 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg29 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg30 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1933) //= 0x78d. The runtime will prefer the VTID if present
  @VTID(327)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object dummy13(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg4,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg5,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg6,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg7,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg8,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg9,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg10,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg11,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg12,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg13,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg14,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg15,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg16,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg17,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg18,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg19,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg20,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg21,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg22,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg23,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg24,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg25,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg26,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg27,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg28,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg29,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg30);


  /**
   * <p>
   * Getter method for the COM property "FindFormat"
   * </p>
   * @return  Returns a value of type RTExcelObj.CellFormat
   */

  @DISPID(1934) //= 0x78e. The runtime will prefer the VTID if present
  @VTID(328)
  RTExcelObj.CellFormat findFormat();


  /**
   * <p>
   * Setter method for the COM property "FindFormat"
   * </p>
   * @param rhs Mandatory RTExcelObj.CellFormat parameter.
   */

  @DISPID(1934) //= 0x78e. The runtime will prefer the VTID if present
  @VTID(329)
  void findFormat(
    RTExcelObj.CellFormat rhs);


  /**
   * <p>
   * Getter method for the COM property "ReplaceFormat"
   * </p>
   * @return  Returns a value of type RTExcelObj.CellFormat
   */

  @DISPID(1935) //= 0x78f. The runtime will prefer the VTID if present
  @VTID(330)
  RTExcelObj.CellFormat replaceFormat();


  /**
   * <p>
   * Setter method for the COM property "ReplaceFormat"
   * </p>
   * @param rhs Mandatory RTExcelObj.CellFormat parameter.
   */

  @DISPID(1935) //= 0x78f. The runtime will prefer the VTID if present
  @VTID(331)
  void replaceFormat(
    RTExcelObj.CellFormat rhs);


  /**
   * <p>
   * Getter method for the COM property "UsedObjects"
   * </p>
   * @return  Returns a value of type RTExcelObj.UsedObjects
   */

  @DISPID(1936) //= 0x790. The runtime will prefer the VTID if present
  @VTID(332)
  RTExcelObj.UsedObjects usedObjects();


  /**
   * <p>
   * Getter method for the COM property "CalculationState"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlCalculationState
   */

  @DISPID(1937) //= 0x791. The runtime will prefer the VTID if present
  @VTID(333)
  RTExcelObj.XlCalculationState calculationState();


  /**
   * <p>
   * Getter method for the COM property "CalculationInterruptKey"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlCalculationInterruptKey
   */

  @DISPID(1938) //= 0x792. The runtime will prefer the VTID if present
  @VTID(334)
  RTExcelObj.XlCalculationInterruptKey calculationInterruptKey();


  /**
   * <p>
   * Setter method for the COM property "CalculationInterruptKey"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlCalculationInterruptKey parameter.
   */

  @DISPID(1938) //= 0x792. The runtime will prefer the VTID if present
  @VTID(335)
  void calculationInterruptKey(
    RTExcelObj.XlCalculationInterruptKey rhs);


  /**
   * <p>
   * Getter method for the COM property "Watches"
   * </p>
   * @return  Returns a value of type RTExcelObj.Watches
   */

  @DISPID(1939) //= 0x793. The runtime will prefer the VTID if present
  @VTID(336)
  RTExcelObj.Watches watches();


  /**
   * <p>
   * Getter method for the COM property "DisplayFunctionToolTips"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1940) //= 0x794. The runtime will prefer the VTID if present
  @VTID(337)
  boolean displayFunctionToolTips();


  /**
   * <p>
   * Setter method for the COM property "DisplayFunctionToolTips"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1940) //= 0x794. The runtime will prefer the VTID if present
  @VTID(338)
  void displayFunctionToolTips(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "AutomationSecurity"
   * </p>
   * @return  Returns a value of type RTExcelObj.MsoAutomationSecurity
   */

  @DISPID(1941) //= 0x795. The runtime will prefer the VTID if present
  @VTID(339)
  RTExcelObj.MsoAutomationSecurity automationSecurity();


  /**
   * <p>
   * Setter method for the COM property "AutomationSecurity"
   * </p>
   * @param rhs Mandatory RTExcelObj.MsoAutomationSecurity parameter.
   */

  @DISPID(1941) //= 0x795. The runtime will prefer the VTID if present
  @VTID(340)
  void automationSecurity(
    RTExcelObj.MsoAutomationSecurity rhs);


  /**
   * <p>
   * Getter method for the COM property "FileDialog"
   * </p>
   * @param fileDialogType Mandatory RTExcelObj.MsoFileDialogType parameter.
   * @return  Returns a value of type RTExcelObj.FileDialog
   */

  @DISPID(1942) //= 0x796. The runtime will prefer the VTID if present
  @VTID(341)
  RTExcelObj.FileDialog fileDialog(
    RTExcelObj.MsoFileDialogType fileDialogType);


  /**
   */

  @DISPID(1944) //= 0x798. The runtime will prefer the VTID if present
  @VTID(342)
  void dummy14();


  /**
   */

  @DISPID(1945) //= 0x799. The runtime will prefer the VTID if present
  @VTID(343)
  void calculateFullRebuild();


  /**
   * <p>
   * Getter method for the COM property "DisplayPasteOptions"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1946) //= 0x79a. The runtime will prefer the VTID if present
  @VTID(344)
  boolean displayPasteOptions();


  /**
   * <p>
   * Setter method for the COM property "DisplayPasteOptions"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1946) //= 0x79a. The runtime will prefer the VTID if present
  @VTID(345)
  void displayPasteOptions(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayInsertOptions"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1947) //= 0x79b. The runtime will prefer the VTID if present
  @VTID(346)
  boolean displayInsertOptions();


  /**
   * <p>
   * Setter method for the COM property "DisplayInsertOptions"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1947) //= 0x79b. The runtime will prefer the VTID if present
  @VTID(347)
  void displayInsertOptions(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "GenerateGetPivotData"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1948) //= 0x79c. The runtime will prefer the VTID if present
  @VTID(348)
  boolean generateGetPivotData();


  /**
   * <p>
   * Setter method for the COM property "GenerateGetPivotData"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1948) //= 0x79c. The runtime will prefer the VTID if present
  @VTID(349)
  void generateGetPivotData(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "AutoRecover"
   * </p>
   * @return  Returns a value of type RTExcelObj.AutoRecover
   */

  @DISPID(1949) //= 0x79d. The runtime will prefer the VTID if present
  @VTID(350)
  RTExcelObj.AutoRecover autoRecover();


  /**
   * <p>
   * Getter method for the COM property "Hwnd"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1950) //= 0x79e. The runtime will prefer the VTID if present
  @VTID(351)
  int hwnd();


  /**
   * <p>
   * Getter method for the COM property "Hinstance"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1951) //= 0x79f. The runtime will prefer the VTID if present
  @VTID(352)
  int hinstance();


  /**
   * @param keepAbort Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1952) //= 0x7a0. The runtime will prefer the VTID if present
  @VTID(353)
  void checkAbort(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object keepAbort);


  /**
   * <p>
   * Getter method for the COM property "ErrorCheckingOptions"
   * </p>
   * @return  Returns a value of type RTExcelObj.ErrorCheckingOptions
   */

  @DISPID(1954) //= 0x7a2. The runtime will prefer the VTID if present
  @VTID(354)
  RTExcelObj.ErrorCheckingOptions errorCheckingOptions();


  /**
   * <p>
   * Getter method for the COM property "AutoFormatAsYouTypeReplaceHyperlinks"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1955) //= 0x7a3. The runtime will prefer the VTID if present
  @VTID(355)
  boolean autoFormatAsYouTypeReplaceHyperlinks();


  /**
   * <p>
   * Setter method for the COM property "AutoFormatAsYouTypeReplaceHyperlinks"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1955) //= 0x7a3. The runtime will prefer the VTID if present
  @VTID(356)
  void autoFormatAsYouTypeReplaceHyperlinks(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "SmartTagRecognizers"
   * </p>
   * @return  Returns a value of type RTExcelObj.SmartTagRecognizers
   */

  @DISPID(1956) //= 0x7a4. The runtime will prefer the VTID if present
  @VTID(357)
  RTExcelObj.SmartTagRecognizers smartTagRecognizers();


  /**
   * <p>
   * Getter method for the COM property "NewWorkbook"
   * </p>
   * @return  Returns a value of type RTExcelObj.NewFile
   */

  @DISPID(1565) //= 0x61d. The runtime will prefer the VTID if present
  @VTID(358)
  RTExcelObj.NewFile newWorkbook();


  /**
   * <p>
   * Getter method for the COM property "SpellingOptions"
   * </p>
   * @return  Returns a value of type RTExcelObj.SpellingOptions
   */

  @DISPID(1957) //= 0x7a5. The runtime will prefer the VTID if present
  @VTID(359)
  RTExcelObj.SpellingOptions spellingOptions();


  /**
   * <p>
   * Getter method for the COM property "Speech"
   * </p>
   * @return  Returns a value of type RTExcelObj.Speech
   */

  @DISPID(1958) //= 0x7a6. The runtime will prefer the VTID if present
  @VTID(360)
  RTExcelObj.Speech speech();


  /**
   * <p>
   * Getter method for the COM property "MapPaperSize"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1959) //= 0x7a7. The runtime will prefer the VTID if present
  @VTID(361)
  boolean mapPaperSize();


  /**
   * <p>
   * Setter method for the COM property "MapPaperSize"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1959) //= 0x7a7. The runtime will prefer the VTID if present
  @VTID(362)
  void mapPaperSize(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowStartupDialog"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1960) //= 0x7a8. The runtime will prefer the VTID if present
  @VTID(363)
  boolean showStartupDialog();


  /**
   * <p>
   * Setter method for the COM property "ShowStartupDialog"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1960) //= 0x7a8. The runtime will prefer the VTID if present
  @VTID(364)
  void showStartupDialog(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DecimalSeparator"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1809) //= 0x711. The runtime will prefer the VTID if present
  @VTID(365)
  java.lang.String decimalSeparator();


  /**
   * <p>
   * Setter method for the COM property "DecimalSeparator"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1809) //= 0x711. The runtime will prefer the VTID if present
  @VTID(366)
  void decimalSeparator(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "ThousandsSeparator"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1810) //= 0x712. The runtime will prefer the VTID if present
  @VTID(367)
  java.lang.String thousandsSeparator();


  /**
   * <p>
   * Setter method for the COM property "ThousandsSeparator"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1810) //= 0x712. The runtime will prefer the VTID if present
  @VTID(368)
  void thousandsSeparator(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "UseSystemSeparators"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1961) //= 0x7a9. The runtime will prefer the VTID if present
  @VTID(369)
  boolean useSystemSeparators();


  /**
   * <p>
   * Setter method for the COM property "UseSystemSeparators"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1961) //= 0x7a9. The runtime will prefer the VTID if present
  @VTID(370)
  void useSystemSeparators(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ThisCell"
   * </p>
   * @return  Returns a value of type RTExcelObj.Range
   */

  @DISPID(1962) //= 0x7aa. The runtime will prefer the VTID if present
  @VTID(371)
  RTExcelObj.Range thisCell();


  /**
   * <p>
   * Getter method for the COM property "RTD"
   * </p>
   * @return  Returns a value of type RTExcelObj.RTD
   */

  @DISPID(1963) //= 0x7ab. The runtime will prefer the VTID if present
  @VTID(372)
  RTExcelObj.RTD rtd();


  /**
   * <p>
   * Getter method for the COM property "DisplayDocumentActionTaskPane"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2251) //= 0x8cb. The runtime will prefer the VTID if present
  @VTID(373)
  boolean displayDocumentActionTaskPane();


  /**
   * <p>
   * Setter method for the COM property "DisplayDocumentActionTaskPane"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2251) //= 0x8cb. The runtime will prefer the VTID if present
  @VTID(374)
  void displayDocumentActionTaskPane(
    boolean rhs);


  /**
   * @param xmlMap Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(2252) //= 0x8cc. The runtime will prefer the VTID if present
  @VTID(375)
  void displayXMLSourcePane(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object xmlMap);


  /**
   * <p>
   * Getter method for the COM property "ArbitraryXMLSupportAvailable"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2254) //= 0x8ce. The runtime will prefer the VTID if present
  @VTID(376)
  boolean arbitraryXMLSupportAvailable();


  /**
   * @param object Mandatory com4j.Com4jObject parameter.
   * @param id Mandatory int parameter.
   * @param arg Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(2255) //= 0x8cf. The runtime will prefer the VTID if present
  @VTID(377)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object support(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject object,
    int id,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg);


  /**
   * @param grfCompareFunctions Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(2373) //= 0x945. The runtime will prefer the VTID if present
  @VTID(378)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object dummy20(
    int grfCompareFunctions);


  /**
   * <p>
   * Getter method for the COM property "MeasurementUnit"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2375) //= 0x947. The runtime will prefer the VTID if present
  @VTID(379)
  int measurementUnit();


  /**
   * <p>
   * Setter method for the COM property "MeasurementUnit"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(2375) //= 0x947. The runtime will prefer the VTID if present
  @VTID(380)
  void measurementUnit(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowSelectionFloaties"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2376) //= 0x948. The runtime will prefer the VTID if present
  @VTID(381)
  boolean showSelectionFloaties();


  /**
   * <p>
   * Setter method for the COM property "ShowSelectionFloaties"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2376) //= 0x948. The runtime will prefer the VTID if present
  @VTID(382)
  void showSelectionFloaties(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowMenuFloaties"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2377) //= 0x949. The runtime will prefer the VTID if present
  @VTID(383)
  boolean showMenuFloaties();


  /**
   * <p>
   * Setter method for the COM property "ShowMenuFloaties"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2377) //= 0x949. The runtime will prefer the VTID if present
  @VTID(384)
  void showMenuFloaties(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowDevTools"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2378) //= 0x94a. The runtime will prefer the VTID if present
  @VTID(385)
  boolean showDevTools();


  /**
   * <p>
   * Setter method for the COM property "ShowDevTools"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2378) //= 0x94a. The runtime will prefer the VTID if present
  @VTID(386)
  void showDevTools(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "EnableLivePreview"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2379) //= 0x94b. The runtime will prefer the VTID if present
  @VTID(387)
  boolean enableLivePreview();


  /**
   * <p>
   * Setter method for the COM property "EnableLivePreview"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2379) //= 0x94b. The runtime will prefer the VTID if present
  @VTID(388)
  void enableLivePreview(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayDocumentInformationPanel"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2380) //= 0x94c. The runtime will prefer the VTID if present
  @VTID(389)
  boolean displayDocumentInformationPanel();


  /**
   * <p>
   * Setter method for the COM property "DisplayDocumentInformationPanel"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2380) //= 0x94c. The runtime will prefer the VTID if present
  @VTID(390)
  void displayDocumentInformationPanel(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "AlwaysUseClearType"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2381) //= 0x94d. The runtime will prefer the VTID if present
  @VTID(391)
  boolean alwaysUseClearType();


  /**
   * <p>
   * Setter method for the COM property "AlwaysUseClearType"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2381) //= 0x94d. The runtime will prefer the VTID if present
  @VTID(392)
  void alwaysUseClearType(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "WarnOnFunctionNameConflict"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2382) //= 0x94e. The runtime will prefer the VTID if present
  @VTID(393)
  boolean warnOnFunctionNameConflict();


  /**
   * <p>
   * Setter method for the COM property "WarnOnFunctionNameConflict"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2382) //= 0x94e. The runtime will prefer the VTID if present
  @VTID(394)
  void warnOnFunctionNameConflict(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "FormulaBarHeight"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2383) //= 0x94f. The runtime will prefer the VTID if present
  @VTID(395)
  int formulaBarHeight();


  /**
   * <p>
   * Setter method for the COM property "FormulaBarHeight"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(2383) //= 0x94f. The runtime will prefer the VTID if present
  @VTID(396)
  void formulaBarHeight(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayFormulaAutoComplete"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2384) //= 0x950. The runtime will prefer the VTID if present
  @VTID(397)
  boolean displayFormulaAutoComplete();


  /**
   * <p>
   * Setter method for the COM property "DisplayFormulaAutoComplete"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2384) //= 0x950. The runtime will prefer the VTID if present
  @VTID(398)
  void displayFormulaAutoComplete(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "GenerateTableRefs"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type RTExcelObj.XlGenerateTableRefs
   */

  @DISPID(2385) //= 0x951. The runtime will prefer the VTID if present
  @VTID(399)
  RTExcelObj.XlGenerateTableRefs generateTableRefs(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "GenerateTableRefs"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory RTExcelObj.XlGenerateTableRefs parameter.
   */

  @DISPID(2385) //= 0x951. The runtime will prefer the VTID if present
  @VTID(400)
  void generateTableRefs(
    @LCID int lcid,
    RTExcelObj.XlGenerateTableRefs rhs);


  /**
   * <p>
   * Getter method for the COM property "Assistance"
   * </p>
   * @return  Returns a value of type RTExcelObj.IAssistance
   */

  @DISPID(2386) //= 0x952. The runtime will prefer the VTID if present
  @VTID(401)
  RTExcelObj.IAssistance assistance();


  /**
   */

  @DISPID(2387) //= 0x953. The runtime will prefer the VTID if present
  @VTID(402)
  void calculateUntilAsyncQueriesDone();


  /**
   * <p>
   * Getter method for the COM property "EnableLargeOperationAlert"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2388) //= 0x954. The runtime will prefer the VTID if present
  @VTID(403)
  boolean enableLargeOperationAlert();


  /**
   * <p>
   * Setter method for the COM property "EnableLargeOperationAlert"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2388) //= 0x954. The runtime will prefer the VTID if present
  @VTID(404)
  void enableLargeOperationAlert(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "LargeOperationCellThousandCount"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2389) //= 0x955. The runtime will prefer the VTID if present
  @VTID(405)
  int largeOperationCellThousandCount();


  /**
   * <p>
   * Setter method for the COM property "LargeOperationCellThousandCount"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(2389) //= 0x955. The runtime will prefer the VTID if present
  @VTID(406)
  void largeOperationCellThousandCount(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "DeferAsyncQueries"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2390) //= 0x956. The runtime will prefer the VTID if present
  @VTID(407)
  boolean deferAsyncQueries();


  /**
   * <p>
   * Setter method for the COM property "DeferAsyncQueries"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2390) //= 0x956. The runtime will prefer the VTID if present
  @VTID(408)
  void deferAsyncQueries(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "MultiThreadedCalculation"
   * </p>
   * @return  Returns a value of type RTExcelObj.MultiThreadedCalculation
   */

  @DISPID(2391) //= 0x957. The runtime will prefer the VTID if present
  @VTID(409)
  RTExcelObj.MultiThreadedCalculation multiThreadedCalculation();


  /**
   * @param bstrUrl Mandatory java.lang.String parameter.
   * @return  Returns a value of type int
   */

  @DISPID(2392) //= 0x958. The runtime will prefer the VTID if present
  @VTID(410)
  int sharePointVersion(
    java.lang.String bstrUrl);


  /**
   * <p>
   * Getter method for the COM property "ActiveEncryptionSession"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2394) //= 0x95a. The runtime will prefer the VTID if present
  @VTID(411)
  int activeEncryptionSession();


  /**
   * <p>
   * Getter method for the COM property "HighQualityModeForGraphics"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2395) //= 0x95b. The runtime will prefer the VTID if present
  @VTID(412)
  boolean highQualityModeForGraphics();


  /**
   * <p>
   * Setter method for the COM property "HighQualityModeForGraphics"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2395) //= 0x95b. The runtime will prefer the VTID if present
  @VTID(413)
  void highQualityModeForGraphics(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "FileExportConverters"
   * </p>
   * @return  Returns a value of type RTExcelObj.FileExportConverters
   */

  @DISPID(2768) //= 0xad0. The runtime will prefer the VTID if present
  @VTID(414)
  RTExcelObj.FileExportConverters fileExportConverters();


  /**
   * <p>
   * Getter method for the COM property "SmartArtLayouts"
   * </p>
   * @return  Returns a value of type RTExcelObj.SmartArtLayouts
   */

  @DISPID(2772) //= 0xad4. The runtime will prefer the VTID if present
  @VTID(415)
  RTExcelObj.SmartArtLayouts smartArtLayouts();


  @VTID(415)
  @ReturnValue(defaultPropertyThrough={RTExcelObj.SmartArtLayouts.class})
  RTExcelObj.SmartArtLayout smartArtLayouts(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "SmartArtQuickStyles"
   * </p>
   * @return  Returns a value of type RTExcelObj.SmartArtQuickStyles
   */

  @DISPID(2773) //= 0xad5. The runtime will prefer the VTID if present
  @VTID(416)
  RTExcelObj.SmartArtQuickStyles smartArtQuickStyles();


  @VTID(416)
  @ReturnValue(defaultPropertyThrough={RTExcelObj.SmartArtQuickStyles.class})
  RTExcelObj.SmartArtQuickStyle smartArtQuickStyles(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "SmartArtColors"
   * </p>
   * @return  Returns a value of type RTExcelObj.SmartArtColors
   */

  @DISPID(2774) //= 0xad6. The runtime will prefer the VTID if present
  @VTID(417)
  RTExcelObj.SmartArtColors smartArtColors();


  @VTID(417)
  @ReturnValue(defaultPropertyThrough={RTExcelObj.SmartArtColors.class})
  RTExcelObj.SmartArtColor smartArtColors(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "AddIns2"
   * </p>
   * @return  Returns a value of type RTExcelObj.AddIns2
   */

  @DISPID(2775) //= 0xad7. The runtime will prefer the VTID if present
  @VTID(418)
  RTExcelObj.AddIns2 addIns2();


  /**
   * <p>
   * Getter method for the COM property "PrintCommunication"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2776) //= 0xad8. The runtime will prefer the VTID if present
  @VTID(419)
  boolean printCommunication();


  /**
   * <p>
   * Setter method for the COM property "PrintCommunication"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2776) //= 0xad8. The runtime will prefer the VTID if present
  @VTID(420)
  void printCommunication(
    boolean rhs);


  /**
   * @param macro Optional parameter. Default value is com4j.Variant.getMissing()
   * @param description Optional parameter. Default value is com4j.Variant.getMissing()
   * @param hasMenu Optional parameter. Default value is com4j.Variant.getMissing()
   * @param menuText Optional parameter. Default value is com4j.Variant.getMissing()
   * @param hasShortcutKey Optional parameter. Default value is com4j.Variant.getMissing()
   * @param shortcutKey Optional parameter. Default value is com4j.Variant.getMissing()
   * @param category Optional parameter. Default value is com4j.Variant.getMissing()
   * @param statusBar Optional parameter. Default value is com4j.Variant.getMissing()
   * @param helpContextID Optional parameter. Default value is com4j.Variant.getMissing()
   * @param helpFile Optional parameter. Default value is com4j.Variant.getMissing()
   * @param argumentDescriptions Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(2770) //= 0xad2. The runtime will prefer the VTID if present
  @VTID(421)
  void macroOptions(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object macro,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object description,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object hasMenu,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object menuText,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object hasShortcutKey,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object shortcutKey,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object category,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object statusBar,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object helpContextID,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object helpFile,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object argumentDescriptions,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "UseClusterConnector"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2778) //= 0xada. The runtime will prefer the VTID if present
  @VTID(422)
  boolean useClusterConnector();


  /**
   * <p>
   * Setter method for the COM property "UseClusterConnector"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2778) //= 0xada. The runtime will prefer the VTID if present
  @VTID(423)
  void useClusterConnector(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ClusterConnector"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2779) //= 0xadb. The runtime will prefer the VTID if present
  @VTID(424)
  java.lang.String clusterConnector();


  /**
   * <p>
   * Setter method for the COM property "ClusterConnector"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(2779) //= 0xadb. The runtime will prefer the VTID if present
  @VTID(425)
  void clusterConnector(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Quitting"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2780) //= 0xadc. The runtime will prefer the VTID if present
  @VTID(426)
  boolean quitting();


  /**
   * <p>
   * Getter method for the COM property "Dummy22"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2781) //= 0xadd. The runtime will prefer the VTID if present
  @VTID(427)
  boolean dummy22();


  /**
   * <p>
   * Setter method for the COM property "Dummy22"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2781) //= 0xadd. The runtime will prefer the VTID if present
  @VTID(428)
  void dummy22(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Dummy23"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2782) //= 0xade. The runtime will prefer the VTID if present
  @VTID(429)
  boolean dummy23();


  /**
   * <p>
   * Setter method for the COM property "Dummy23"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2782) //= 0xade. The runtime will prefer the VTID if present
  @VTID(430)
  void dummy23(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ProtectedViewWindows"
   * </p>
   * @return  Returns a value of type RTExcelObj.ProtectedViewWindows
   */

  @DISPID(2783) //= 0xadf. The runtime will prefer the VTID if present
  @VTID(431)
  RTExcelObj.ProtectedViewWindows protectedViewWindows();


  /**
   * <p>
   * Getter method for the COM property "ActiveProtectedViewWindow"
   * </p>
   * @return  Returns a value of type RTExcelObj.ProtectedViewWindow
   */

  @DISPID(2784) //= 0xae0. The runtime will prefer the VTID if present
  @VTID(432)
  RTExcelObj.ProtectedViewWindow activeProtectedViewWindow();


  /**
   * <p>
   * Getter method for the COM property "IsSandboxed"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2785) //= 0xae1. The runtime will prefer the VTID if present
  @VTID(433)
  boolean isSandboxed();


  /**
   * <p>
   * Getter method for the COM property "SaveISO8601Dates"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2786) //= 0xae2. The runtime will prefer the VTID if present
  @VTID(434)
  boolean saveISO8601Dates();


  /**
   * <p>
   * Setter method for the COM property "SaveISO8601Dates"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2786) //= 0xae2. The runtime will prefer the VTID if present
  @VTID(435)
  void saveISO8601Dates(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "HinstancePtr"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(2787) //= 0xae3. The runtime will prefer the VTID if present
  @VTID(436)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object hinstancePtr();


  /**
   * <p>
   * Getter method for the COM property "FileValidation"
   * </p>
   * @return  Returns a value of type RTExcelObj.MsoFileValidationMode
   */

  @DISPID(2788) //= 0xae4. The runtime will prefer the VTID if present
  @VTID(437)
  RTExcelObj.MsoFileValidationMode fileValidation();


  /**
   * <p>
   * Setter method for the COM property "FileValidation"
   * </p>
   * @param rhs Mandatory RTExcelObj.MsoFileValidationMode parameter.
   */

  @DISPID(2788) //= 0xae4. The runtime will prefer the VTID if present
  @VTID(438)
  void fileValidation(
    RTExcelObj.MsoFileValidationMode rhs);


  /**
   * <p>
   * Getter method for the COM property "FileValidationPivot"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlFileValidationPivotMode
   */

  @DISPID(2789) //= 0xae5. The runtime will prefer the VTID if present
  @VTID(439)
  RTExcelObj.XlFileValidationPivotMode fileValidationPivot();


  /**
   * <p>
   * Setter method for the COM property "FileValidationPivot"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlFileValidationPivotMode parameter.
   */

  @DISPID(2789) //= 0xae5. The runtime will prefer the VTID if present
  @VTID(440)
  void fileValidationPivot(
    RTExcelObj.XlFileValidationPivotMode rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowQuickAnalysis"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2994) //= 0xbb2. The runtime will prefer the VTID if present
  @VTID(441)
  boolean showQuickAnalysis();


  /**
   * <p>
   * Setter method for the COM property "ShowQuickAnalysis"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2994) //= 0xbb2. The runtime will prefer the VTID if present
  @VTID(442)
  void showQuickAnalysis(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "QuickAnalysis"
   * </p>
   * @return  Returns a value of type RTExcelObj.QuickAnalysis
   */

  @DISPID(2995) //= 0xbb3. The runtime will prefer the VTID if present
  @VTID(443)
  RTExcelObj.QuickAnalysis quickAnalysis();


  /**
   * <p>
   * Getter method for the COM property "FlashFill"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2996) //= 0xbb4. The runtime will prefer the VTID if present
  @VTID(444)
  boolean flashFill();


  /**
   * <p>
   * Setter method for the COM property "FlashFill"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2996) //= 0xbb4. The runtime will prefer the VTID if present
  @VTID(445)
  void flashFill(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "EnableMacroAnimations"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2997) //= 0xbb5. The runtime will prefer the VTID if present
  @VTID(446)
  boolean enableMacroAnimations();


  /**
   * <p>
   * Setter method for the COM property "EnableMacroAnimations"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2997) //= 0xbb5. The runtime will prefer the VTID if present
  @VTID(447)
  void enableMacroAnimations(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ChartDataPointTrack"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2998) //= 0xbb6. The runtime will prefer the VTID if present
  @VTID(448)
  boolean chartDataPointTrack();


  /**
   * <p>
   * Setter method for the COM property "ChartDataPointTrack"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2998) //= 0xbb6. The runtime will prefer the VTID if present
  @VTID(449)
  void chartDataPointTrack(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "FlashFillMode"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2999) //= 0xbb7. The runtime will prefer the VTID if present
  @VTID(450)
  boolean flashFillMode();


  /**
   * <p>
   * Setter method for the COM property "FlashFillMode"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2999) //= 0xbb7. The runtime will prefer the VTID if present
  @VTID(451)
  void flashFillMode(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "MergeInstances"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(3000) //= 0xbb8. The runtime will prefer the VTID if present
  @VTID(452)
  boolean mergeInstances();


  /**
   * <p>
   * Setter method for the COM property "MergeInstances"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(3000) //= 0xbb8. The runtime will prefer the VTID if present
  @VTID(453)
  void mergeInstances(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "EnableCheckFileExtensions"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(3158) //= 0xc56. The runtime will prefer the VTID if present
  @VTID(454)
  boolean enableCheckFileExtensions();


  /**
   * <p>
   * Setter method for the COM property "EnableCheckFileExtensions"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(3158) //= 0xc56. The runtime will prefer the VTID if present
  @VTID(455)
  void enableCheckFileExtensions(
    boolean rhs);


  // Properties:
}
