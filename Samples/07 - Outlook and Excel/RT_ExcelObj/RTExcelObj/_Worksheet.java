package RTExcelObj  ;

import com4j.*;

@IID("{000208D8-0000-0000-C000-000000000046}")
public interface _Worksheet extends Com4jObject {
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
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(150) //= 0x96. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * @param lcid Mandatory int parameter.
   */

  @DISPID(304) //= 0x130. The runtime will prefer the VTID if present
  @VTID(10)
  void activate(
    @LCID int lcid);


  /**
   * @param before Optional parameter. Default value is com4j.Variant.getMissing()
   * @param after Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(551) //= 0x227. The runtime will prefer the VTID if present
  @VTID(11)
  void copy(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object before,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object after,
    @LCID int lcid);


  /**
   * @param lcid Mandatory int parameter.
   */

  @DISPID(117) //= 0x75. The runtime will prefer the VTID if present
  @VTID(12)
  void delete(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "CodeName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1373) //= 0x55d. The runtime will prefer the VTID if present
  @VTID(13)
  java.lang.String codeName();


  /**
   * <p>
   * Getter method for the COM property "_CodeName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147418112) //= 0x80010000. The runtime will prefer the VTID if present
  @VTID(14)
  java.lang.String _CodeName();


  /**
   * <p>
   * Setter method for the COM property "_CodeName"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147418112) //= 0x80010000. The runtime will prefer the VTID if present
  @VTID(15)
  void _CodeName(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Index"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(486) //= 0x1e6. The runtime will prefer the VTID if present
  @VTID(16)
  int index(
    @LCID int lcid);


  /**
   * @param before Optional parameter. Default value is com4j.Variant.getMissing()
   * @param after Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(637) //= 0x27d. The runtime will prefer the VTID if present
  @VTID(17)
  void move(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object before,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object after,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(18)
  java.lang.String name();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(19)
  void name(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Next"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(502) //= 0x1f6. The runtime will prefer the VTID if present
  @VTID(20)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject next();


  /**
   * <p>
   * Getter method for the COM property "OnDoubleClick"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(628) //= 0x274. The runtime will prefer the VTID if present
  @VTID(21)
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
  @VTID(22)
  void onDoubleClick(
    @LCID int lcid,
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "OnSheetActivate"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1031) //= 0x407. The runtime will prefer the VTID if present
  @VTID(23)
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
  @VTID(24)
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
  @VTID(25)
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
  @VTID(26)
  void onSheetDeactivate(
    @LCID int lcid,
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "PageSetup"
   * </p>
   * @return  Returns a value of type RTExcelObj.PageSetup
   */

  @DISPID(998) //= 0x3e6. The runtime will prefer the VTID if present
  @VTID(27)
  RTExcelObj.PageSetup pageSetup();


  /**
   * <p>
   * Getter method for the COM property "Previous"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(503) //= 0x1f7. The runtime will prefer the VTID if present
  @VTID(28)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject previous();


  /**
   * @param from Optional parameter. Default value is com4j.Variant.getMissing()
   * @param to Optional parameter. Default value is com4j.Variant.getMissing()
   * @param copies Optional parameter. Default value is com4j.Variant.getMissing()
   * @param preview Optional parameter. Default value is com4j.Variant.getMissing()
   * @param activePrinter Optional parameter. Default value is com4j.Variant.getMissing()
   * @param printToFile Optional parameter. Default value is com4j.Variant.getMissing()
   * @param collate Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(905) //= 0x389. The runtime will prefer the VTID if present
  @VTID(29)
  void __PrintOut(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object from,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object to,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object copies,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object preview,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object activePrinter,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object printToFile,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object collate,
    @LCID int lcid);


  /**
   * @param enableChanges Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(281) //= 0x119. The runtime will prefer the VTID if present
  @VTID(30)
  void printPreview(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object enableChanges,
    @LCID int lcid);


  /**
   * @param password Optional parameter. Default value is com4j.Variant.getMissing()
   * @param drawingObjects Optional parameter. Default value is com4j.Variant.getMissing()
   * @param contents Optional parameter. Default value is com4j.Variant.getMissing()
   * @param scenarios Optional parameter. Default value is com4j.Variant.getMissing()
   * @param userInterfaceOnly Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(282) //= 0x11a. The runtime will prefer the VTID if present
  @VTID(31)
  void _Protect(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object password,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object drawingObjects,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object contents,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object scenarios,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object userInterfaceOnly,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "ProtectContents"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(292) //= 0x124. The runtime will prefer the VTID if present
  @VTID(32)
  boolean protectContents(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "ProtectDrawingObjects"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(293) //= 0x125. The runtime will prefer the VTID if present
  @VTID(33)
  boolean protectDrawingObjects(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "ProtectionMode"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1159) //= 0x487. The runtime will prefer the VTID if present
  @VTID(34)
  boolean protectionMode(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "ProtectScenarios"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(294) //= 0x126. The runtime will prefer the VTID if present
  @VTID(35)
  boolean protectScenarios(
    @LCID int lcid);


  /**
   * @param filename Mandatory java.lang.String parameter.
   * @param fileFormat Optional parameter. Default value is com4j.Variant.getMissing()
   * @param password Optional parameter. Default value is com4j.Variant.getMissing()
   * @param writeResPassword Optional parameter. Default value is com4j.Variant.getMissing()
   * @param readOnlyRecommended Optional parameter. Default value is com4j.Variant.getMissing()
   * @param createBackup Optional parameter. Default value is com4j.Variant.getMissing()
   * @param addToMru Optional parameter. Default value is com4j.Variant.getMissing()
   * @param textCodepage Optional parameter. Default value is com4j.Variant.getMissing()
   * @param textVisualLayout Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(284) //= 0x11c. The runtime will prefer the VTID if present
  @VTID(36)
  void _SaveAs(
    java.lang.String filename,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object fileFormat,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object password,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object writeResPassword,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object readOnlyRecommended,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object createBackup,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object addToMru,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object textCodepage,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object textVisualLayout,
    @LCID int lcid);


  /**
   * @param replace Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(235) //= 0xeb. The runtime will prefer the VTID if present
  @VTID(37)
  void select(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object replace,
    @LCID int lcid);


  /**
   * @param password Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(285) //= 0x11d. The runtime will prefer the VTID if present
  @VTID(38)
  void unprotect(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object password,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "Visible"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type RTExcelObj.XlSheetVisibility
   */

  @DISPID(558) //= 0x22e. The runtime will prefer the VTID if present
  @VTID(39)
  RTExcelObj.XlSheetVisibility visible(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "Visible"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory RTExcelObj.XlSheetVisibility parameter.
   */

  @DISPID(558) //= 0x22e. The runtime will prefer the VTID if present
  @VTID(40)
  void visible(
    @LCID int lcid,
    RTExcelObj.XlSheetVisibility rhs);


  /**
   * <p>
   * Getter method for the COM property "Shapes"
   * </p>
   * @return  Returns a value of type RTExcelObj.Shapes
   */

  @DISPID(1377) //= 0x561. The runtime will prefer the VTID if present
  @VTID(41)
  RTExcelObj.Shapes shapes();


  /**
   * <p>
   * Getter method for the COM property "TransitionExpEval"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(401) //= 0x191. The runtime will prefer the VTID if present
  @VTID(42)
  boolean transitionExpEval(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "TransitionExpEval"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(401) //= 0x191. The runtime will prefer the VTID if present
  @VTID(43)
  void transitionExpEval(
    @LCID int lcid,
    boolean rhs);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(760) //= 0x2f8. The runtime will prefer the VTID if present
  @VTID(44)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject arcs(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "AutoFilterMode"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(792) //= 0x318. The runtime will prefer the VTID if present
  @VTID(45)
  boolean autoFilterMode(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "AutoFilterMode"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(792) //= 0x318. The runtime will prefer the VTID if present
  @VTID(46)
  void autoFilterMode(
    @LCID int lcid,
    boolean rhs);


  /**
   * @param filename Mandatory java.lang.String parameter.
   */

  @DISPID(1188) //= 0x4a4. The runtime will prefer the VTID if present
  @VTID(47)
  void setBackgroundPicture(
    java.lang.String filename);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(557) //= 0x22d. The runtime will prefer the VTID if present
  @VTID(48)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject buttons(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * @param lcid Mandatory int parameter.
   */

  @DISPID(279) //= 0x117. The runtime will prefer the VTID if present
  @VTID(49)
  void calculate(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "EnableCalculation"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1424) //= 0x590. The runtime will prefer the VTID if present
  @VTID(50)
  boolean enableCalculation();


  /**
   * <p>
   * Setter method for the COM property "EnableCalculation"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1424) //= 0x590. The runtime will prefer the VTID if present
  @VTID(51)
  void enableCalculation(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Cells"
   * </p>
   * @return  Returns a value of type RTExcelObj.Range
   */

  @DISPID(238) //= 0xee. The runtime will prefer the VTID if present
  @VTID(52)
  RTExcelObj.Range cells();


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1060) //= 0x424. The runtime will prefer the VTID if present
  @VTID(53)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject chartObjects(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(824) //= 0x338. The runtime will prefer the VTID if present
  @VTID(54)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject checkBoxes(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * @param customDictionary Optional parameter. Default value is com4j.Variant.getMissing()
   * @param ignoreUppercase Optional parameter. Default value is com4j.Variant.getMissing()
   * @param alwaysSuggest Optional parameter. Default value is com4j.Variant.getMissing()
   * @param spellLang Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(505) //= 0x1f9. The runtime will prefer the VTID if present
  @VTID(55)
  void checkSpelling(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object customDictionary,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object ignoreUppercase,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object alwaysSuggest,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object spellLang,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "CircularReference"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type RTExcelObj.Range
   */

  @DISPID(1069) //= 0x42d. The runtime will prefer the VTID if present
  @VTID(56)
  RTExcelObj.Range circularReference(
    @LCID int lcid);


  /**
   * @param lcid Mandatory int parameter.
   */

  @DISPID(970) //= 0x3ca. The runtime will prefer the VTID if present
  @VTID(57)
  void clearArrows(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "Columns"
   * </p>
   * @return  Returns a value of type RTExcelObj.Range
   */

  @DISPID(241) //= 0xf1. The runtime will prefer the VTID if present
  @VTID(58)
  RTExcelObj.Range columns();


  /**
   * <p>
   * Getter method for the COM property "ConsolidationFunction"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type RTExcelObj.XlConsolidationFunction
   */

  @DISPID(789) //= 0x315. The runtime will prefer the VTID if present
  @VTID(59)
  RTExcelObj.XlConsolidationFunction consolidationFunction(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "ConsolidationOptions"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(790) //= 0x316. The runtime will prefer the VTID if present
  @VTID(60)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object consolidationOptions(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "ConsolidationSources"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(791) //= 0x317. The runtime will prefer the VTID if present
  @VTID(61)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object consolidationSources(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "DisplayAutomaticPageBreaks"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(643) //= 0x283. The runtime will prefer the VTID if present
  @VTID(62)
  boolean displayAutomaticPageBreaks(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "DisplayAutomaticPageBreaks"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(643) //= 0x283. The runtime will prefer the VTID if present
  @VTID(63)
  void displayAutomaticPageBreaks(
    @LCID int lcid,
    boolean rhs);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(772) //= 0x304. The runtime will prefer the VTID if present
  @VTID(64)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject drawings(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(88) //= 0x58. The runtime will prefer the VTID if present
  @VTID(65)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject drawingObjects(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(836) //= 0x344. The runtime will prefer the VTID if present
  @VTID(66)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject dropDowns(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "EnableAutoFilter"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1156) //= 0x484. The runtime will prefer the VTID if present
  @VTID(67)
  boolean enableAutoFilter(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "EnableAutoFilter"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1156) //= 0x484. The runtime will prefer the VTID if present
  @VTID(68)
  void enableAutoFilter(
    @LCID int lcid,
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "EnableSelection"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlEnableSelection
   */

  @DISPID(1425) //= 0x591. The runtime will prefer the VTID if present
  @VTID(69)
  RTExcelObj.XlEnableSelection enableSelection();


  /**
   * <p>
   * Setter method for the COM property "EnableSelection"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlEnableSelection parameter.
   */

  @DISPID(1425) //= 0x591. The runtime will prefer the VTID if present
  @VTID(70)
  void enableSelection(
    RTExcelObj.XlEnableSelection rhs);


  /**
   * <p>
   * Getter method for the COM property "EnableOutlining"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1157) //= 0x485. The runtime will prefer the VTID if present
  @VTID(71)
  boolean enableOutlining(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "EnableOutlining"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1157) //= 0x485. The runtime will prefer the VTID if present
  @VTID(72)
  void enableOutlining(
    @LCID int lcid,
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "EnablePivotTable"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1158) //= 0x486. The runtime will prefer the VTID if present
  @VTID(73)
  boolean enablePivotTable(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "EnablePivotTable"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1158) //= 0x486. The runtime will prefer the VTID if present
  @VTID(74)
  void enablePivotTable(
    @LCID int lcid,
    boolean rhs);


  /**
   * @param name Mandatory java.lang.Object parameter.
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(75)
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
  @VTID(76)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object _Evaluate(
    @MarshalAs(NativeType.VARIANT) java.lang.Object name,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "FilterMode"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(800) //= 0x320. The runtime will prefer the VTID if present
  @VTID(77)
  boolean filterMode(
    @LCID int lcid);


  /**
   */

  @DISPID(1426) //= 0x592. The runtime will prefer the VTID if present
  @VTID(78)
  void resetAllPageBreaks();


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(834) //= 0x342. The runtime will prefer the VTID if present
  @VTID(79)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject groupBoxes(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1113) //= 0x459. The runtime will prefer the VTID if present
  @VTID(80)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject groupObjects(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(841) //= 0x349. The runtime will prefer the VTID if present
  @VTID(81)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject labels(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(767) //= 0x2ff. The runtime will prefer the VTID if present
  @VTID(82)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject lines(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(832) //= 0x340. The runtime will prefer the VTID if present
  @VTID(83)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject listBoxes(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "Names"
   * </p>
   * @return  Returns a value of type RTExcelObj.Names
   */

  @DISPID(442) //= 0x1ba. The runtime will prefer the VTID if present
  @VTID(84)
  RTExcelObj.Names names();


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(799) //= 0x31f. The runtime will prefer the VTID if present
  @VTID(85)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject oleObjects(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "OnCalculate"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(625) //= 0x271. The runtime will prefer the VTID if present
  @VTID(86)
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
  @VTID(87)
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
  @VTID(88)
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
  @VTID(89)
  void onData(
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
  @VTID(90)
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
  @VTID(91)
  void onEntry(
    @LCID int lcid,
    java.lang.String rhs);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(826) //= 0x33a. The runtime will prefer the VTID if present
  @VTID(92)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject optionButtons(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "Outline"
   * </p>
   * @return  Returns a value of type RTExcelObj.Outline
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(93)
  RTExcelObj.Outline outline();


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(801) //= 0x321. The runtime will prefer the VTID if present
  @VTID(94)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject ovals(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * @param destination Optional parameter. Default value is com4j.Variant.getMissing()
   * @param link Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(211) //= 0xd3. The runtime will prefer the VTID if present
  @VTID(95)
  void paste(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object destination,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object link,
    @LCID int lcid);


  /**
   * @param format Optional parameter. Default value is com4j.Variant.getMissing()
   * @param link Optional parameter. Default value is com4j.Variant.getMissing()
   * @param displayAsIcon Optional parameter. Default value is com4j.Variant.getMissing()
   * @param iconFileName Optional parameter. Default value is com4j.Variant.getMissing()
   * @param iconIndex Optional parameter. Default value is com4j.Variant.getMissing()
   * @param iconLabel Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(1027) //= 0x403. The runtime will prefer the VTID if present
  @VTID(96)
  void _PasteSpecial(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object format,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object link,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object displayAsIcon,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object iconFileName,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object iconIndex,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object iconLabel,
    @LCID int lcid);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(771) //= 0x303. The runtime will prefer the VTID if present
  @VTID(97)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject pictures(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(690) //= 0x2b2. The runtime will prefer the VTID if present
  @VTID(98)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject pivotTables(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * @param sourceType Optional parameter. Default value is com4j.Variant.getMissing()
   * @param sourceData Optional parameter. Default value is com4j.Variant.getMissing()
   * @param tableDestination Optional parameter. Default value is com4j.Variant.getMissing()
   * @param tableName Optional parameter. Default value is com4j.Variant.getMissing()
   * @param rowGrand Optional parameter. Default value is com4j.Variant.getMissing()
   * @param columnGrand Optional parameter. Default value is com4j.Variant.getMissing()
   * @param saveData Optional parameter. Default value is com4j.Variant.getMissing()
   * @param hasAutoFormat Optional parameter. Default value is com4j.Variant.getMissing()
   * @param autoPage Optional parameter. Default value is com4j.Variant.getMissing()
   * @param reserved Optional parameter. Default value is com4j.Variant.getMissing()
   * @param backgroundQuery Optional parameter. Default value is com4j.Variant.getMissing()
   * @param optimizeCache Optional parameter. Default value is com4j.Variant.getMissing()
   * @param pageFieldOrder Optional parameter. Default value is com4j.Variant.getMissing()
   * @param pageFieldWrapCount Optional parameter. Default value is com4j.Variant.getMissing()
   * @param readData Optional parameter. Default value is com4j.Variant.getMissing()
   * @param connection Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type RTExcelObj.PivotTable
   */

  @DISPID(684) //= 0x2ac. The runtime will prefer the VTID if present
  @VTID(99)
  RTExcelObj.PivotTable pivotTableWizard(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object sourceType,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object sourceData,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object tableDestination,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object tableName,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object rowGrand,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object columnGrand,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object saveData,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object hasAutoFormat,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object autoPage,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object reserved,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object backgroundQuery,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object optimizeCache,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object pageFieldOrder,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object pageFieldWrapCount,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object readData,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object connection,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "Range"
   * </p>
   * @param cell1 Mandatory java.lang.Object parameter.
   * @param cell2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type RTExcelObj.Range
   */

  @DISPID(197) //= 0xc5. The runtime will prefer the VTID if present
  @VTID(100)
  RTExcelObj.Range range(
    @MarshalAs(NativeType.VARIANT) java.lang.Object cell1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object cell2);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(774) //= 0x306. The runtime will prefer the VTID if present
  @VTID(101)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject rectangles(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "Rows"
   * </p>
   * @return  Returns a value of type RTExcelObj.Range
   */

  @DISPID(258) //= 0x102. The runtime will prefer the VTID if present
  @VTID(102)
  RTExcelObj.Range rows();


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(908) //= 0x38c. The runtime will prefer the VTID if present
  @VTID(103)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject scenarios(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "ScrollArea"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1433) //= 0x599. The runtime will prefer the VTID if present
  @VTID(104)
  java.lang.String scrollArea();


  /**
   * <p>
   * Setter method for the COM property "ScrollArea"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1433) //= 0x599. The runtime will prefer the VTID if present
  @VTID(105)
  void scrollArea(
    java.lang.String rhs);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(830) //= 0x33e. The runtime will prefer the VTID if present
  @VTID(106)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject scrollBars(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * @param lcid Mandatory int parameter.
   */

  @DISPID(794) //= 0x31a. The runtime will prefer the VTID if present
  @VTID(107)
  void showAllData(
    @LCID int lcid);


  /**
   * @param lcid Mandatory int parameter.
   */

  @DISPID(409) //= 0x199. The runtime will prefer the VTID if present
  @VTID(108)
  void showDataForm(
    @LCID int lcid);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(838) //= 0x346. The runtime will prefer the VTID if present
  @VTID(109)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject spinners(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "StandardHeight"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type double
   */

  @DISPID(407) //= 0x197. The runtime will prefer the VTID if present
  @VTID(110)
  double standardHeight(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "StandardWidth"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type double
   */

  @DISPID(408) //= 0x198. The runtime will prefer the VTID if present
  @VTID(111)
  double standardWidth(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "StandardWidth"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory double parameter.
   */

  @DISPID(408) //= 0x198. The runtime will prefer the VTID if present
  @VTID(112)
  void standardWidth(
    @LCID int lcid,
    double rhs);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(777) //= 0x309. The runtime will prefer the VTID if present
  @VTID(113)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject textBoxes(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "TransitionFormEntry"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(402) //= 0x192. The runtime will prefer the VTID if present
  @VTID(114)
  boolean transitionFormEntry(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "TransitionFormEntry"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(402) //= 0x192. The runtime will prefer the VTID if present
  @VTID(115)
  void transitionFormEntry(
    @LCID int lcid,
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type RTExcelObj.XlSheetType
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(116)
  RTExcelObj.XlSheetType type(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "UsedRange"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type RTExcelObj.Range
   */

  @DISPID(412) //= 0x19c. The runtime will prefer the VTID if present
  @VTID(117)
  RTExcelObj.Range usedRange(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "HPageBreaks"
   * </p>
   * @return  Returns a value of type RTExcelObj.HPageBreaks
   */

  @DISPID(1418) //= 0x58a. The runtime will prefer the VTID if present
  @VTID(118)
  RTExcelObj.HPageBreaks hPageBreaks();


  /**
   * <p>
   * Getter method for the COM property "VPageBreaks"
   * </p>
   * @return  Returns a value of type RTExcelObj.VPageBreaks
   */

  @DISPID(1419) //= 0x58b. The runtime will prefer the VTID if present
  @VTID(119)
  RTExcelObj.VPageBreaks vPageBreaks();


  /**
   * <p>
   * Getter method for the COM property "QueryTables"
   * </p>
   * @return  Returns a value of type RTExcelObj.QueryTables
   */

  @DISPID(1434) //= 0x59a. The runtime will prefer the VTID if present
  @VTID(120)
  RTExcelObj.QueryTables queryTables();


  /**
   * <p>
   * Getter method for the COM property "DisplayPageBreaks"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1435) //= 0x59b. The runtime will prefer the VTID if present
  @VTID(121)
  boolean displayPageBreaks();


  /**
   * <p>
   * Setter method for the COM property "DisplayPageBreaks"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1435) //= 0x59b. The runtime will prefer the VTID if present
  @VTID(122)
  void displayPageBreaks(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Comments"
   * </p>
   * @return  Returns a value of type RTExcelObj.Comments
   */

  @DISPID(575) //= 0x23f. The runtime will prefer the VTID if present
  @VTID(123)
  RTExcelObj.Comments comments();


  /**
   * <p>
   * Getter method for the COM property "Hyperlinks"
   * </p>
   * @return  Returns a value of type RTExcelObj.Hyperlinks
   */

  @DISPID(1393) //= 0x571. The runtime will prefer the VTID if present
  @VTID(124)
  RTExcelObj.Hyperlinks hyperlinks();


  /**
   */

  @DISPID(1436) //= 0x59c. The runtime will prefer the VTID if present
  @VTID(125)
  void clearCircles();


  /**
   */

  @DISPID(1437) //= 0x59d. The runtime will prefer the VTID if present
  @VTID(126)
  void circleInvalid();


  /**
   * <p>
   * Getter method for the COM property "_DisplayRightToLeft"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(648) //= 0x288. The runtime will prefer the VTID if present
  @VTID(127)
  int _DisplayRightToLeft(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "_DisplayRightToLeft"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory int parameter.
   */

  @DISPID(648) //= 0x288. The runtime will prefer the VTID if present
  @VTID(128)
  void _DisplayRightToLeft(
    @LCID int lcid,
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "AutoFilter"
   * </p>
   * @return  Returns a value of type RTExcelObj.AutoFilter
   */

  @DISPID(793) //= 0x319. The runtime will prefer the VTID if present
  @VTID(129)
  RTExcelObj.AutoFilter autoFilter();


  /**
   * <p>
   * Getter method for the COM property "DisplayRightToLeft"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1774) //= 0x6ee. The runtime will prefer the VTID if present
  @VTID(130)
  boolean displayRightToLeft(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "DisplayRightToLeft"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1774) //= 0x6ee. The runtime will prefer the VTID if present
  @VTID(131)
  void displayRightToLeft(
    @LCID int lcid,
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Scripts"
   * </p>
   * @return  Returns a value of type RTExcelObj.Scripts
   */

  @DISPID(1816) //= 0x718. The runtime will prefer the VTID if present
  @VTID(132)
  RTExcelObj.Scripts scripts();


  @VTID(132)
  @ReturnValue(defaultPropertyThrough={RTExcelObj.Scripts.class})
  RTExcelObj.Script scripts(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * @param from Optional parameter. Default value is com4j.Variant.getMissing()
   * @param to Optional parameter. Default value is com4j.Variant.getMissing()
   * @param copies Optional parameter. Default value is com4j.Variant.getMissing()
   * @param preview Optional parameter. Default value is com4j.Variant.getMissing()
   * @param activePrinter Optional parameter. Default value is com4j.Variant.getMissing()
   * @param printToFile Optional parameter. Default value is com4j.Variant.getMissing()
   * @param collate Optional parameter. Default value is com4j.Variant.getMissing()
   * @param prToFileName Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(1772) //= 0x6ec. The runtime will prefer the VTID if present
  @VTID(133)
  void _PrintOut(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object from,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object to,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object copies,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object preview,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object activePrinter,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object printToFile,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object collate,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object prToFileName,
    @LCID int lcid);


  /**
   * @param customDictionary Optional parameter. Default value is com4j.Variant.getMissing()
   * @param ignoreUppercase Optional parameter. Default value is com4j.Variant.getMissing()
   * @param alwaysSuggest Optional parameter. Default value is com4j.Variant.getMissing()
   * @param spellLang Optional parameter. Default value is com4j.Variant.getMissing()
   * @param ignoreFinalYaa Optional parameter. Default value is com4j.Variant.getMissing()
   * @param spellScript Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(1817) //= 0x719. The runtime will prefer the VTID if present
  @VTID(134)
  void _CheckSpelling(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object customDictionary,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object ignoreUppercase,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object alwaysSuggest,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object spellLang,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object ignoreFinalYaa,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object spellScript,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "Tab"
   * </p>
   * @return  Returns a value of type RTExcelObj.Tab
   */

  @DISPID(1041) //= 0x411. The runtime will prefer the VTID if present
  @VTID(135)
  RTExcelObj.Tab tab();


  /**
   * <p>
   * Getter method for the COM property "MailEnvelope"
   * </p>
   * @return  Returns a value of type RTExcelObj.IMsoEnvelopeVB
   */

  @DISPID(2021) //= 0x7e5. The runtime will prefer the VTID if present
  @VTID(136)
  RTExcelObj.IMsoEnvelopeVB mailEnvelope();


  /**
   * @param filename Mandatory java.lang.String parameter.
   * @param fileFormat Optional parameter. Default value is com4j.Variant.getMissing()
   * @param password Optional parameter. Default value is com4j.Variant.getMissing()
   * @param writeResPassword Optional parameter. Default value is com4j.Variant.getMissing()
   * @param readOnlyRecommended Optional parameter. Default value is com4j.Variant.getMissing()
   * @param createBackup Optional parameter. Default value is com4j.Variant.getMissing()
   * @param addToMru Optional parameter. Default value is com4j.Variant.getMissing()
   * @param textCodepage Optional parameter. Default value is com4j.Variant.getMissing()
   * @param textVisualLayout Optional parameter. Default value is com4j.Variant.getMissing()
   * @param local Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1925) //= 0x785. The runtime will prefer the VTID if present
  @VTID(137)
  void saveAs(
    java.lang.String filename,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object fileFormat,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object password,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object writeResPassword,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object readOnlyRecommended,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object createBackup,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object addToMru,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object textCodepage,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object textVisualLayout,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object local);


  /**
   * <p>
   * Getter method for the COM property "CustomProperties"
   * </p>
   * @return  Returns a value of type RTExcelObj.CustomProperties
   */

  @DISPID(2030) //= 0x7ee. The runtime will prefer the VTID if present
  @VTID(138)
  RTExcelObj.CustomProperties customProperties();


  /**
   * <p>
   * Getter method for the COM property "SmartTags"
   * </p>
   * @return  Returns a value of type RTExcelObj.SmartTags
   */

  @DISPID(2016) //= 0x7e0. The runtime will prefer the VTID if present
  @VTID(139)
  RTExcelObj.SmartTags smartTags();


  /**
   * <p>
   * Getter method for the COM property "Protection"
   * </p>
   * @return  Returns a value of type RTExcelObj.Protection
   */

  @DISPID(176) //= 0xb0. The runtime will prefer the VTID if present
  @VTID(140)
  RTExcelObj.Protection protection();


  /**
   * @param format Optional parameter. Default value is com4j.Variant.getMissing()
   * @param link Optional parameter. Default value is com4j.Variant.getMissing()
   * @param displayAsIcon Optional parameter. Default value is com4j.Variant.getMissing()
   * @param iconFileName Optional parameter. Default value is com4j.Variant.getMissing()
   * @param iconIndex Optional parameter. Default value is com4j.Variant.getMissing()
   * @param iconLabel Optional parameter. Default value is com4j.Variant.getMissing()
   * @param noHTMLFormatting Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(1928) //= 0x788. The runtime will prefer the VTID if present
  @VTID(141)
  void pasteSpecial(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object format,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object link,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object displayAsIcon,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object iconFileName,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object iconIndex,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object iconLabel,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object noHTMLFormatting,
    @LCID int lcid);


  /**
   * @param password Optional parameter. Default value is com4j.Variant.getMissing()
   * @param drawingObjects Optional parameter. Default value is com4j.Variant.getMissing()
   * @param contents Optional parameter. Default value is com4j.Variant.getMissing()
   * @param scenarios Optional parameter. Default value is com4j.Variant.getMissing()
   * @param userInterfaceOnly Optional parameter. Default value is com4j.Variant.getMissing()
   * @param allowFormattingCells Optional parameter. Default value is com4j.Variant.getMissing()
   * @param allowFormattingColumns Optional parameter. Default value is com4j.Variant.getMissing()
   * @param allowFormattingRows Optional parameter. Default value is com4j.Variant.getMissing()
   * @param allowInsertingColumns Optional parameter. Default value is com4j.Variant.getMissing()
   * @param allowInsertingRows Optional parameter. Default value is com4j.Variant.getMissing()
   * @param allowInsertingHyperlinks Optional parameter. Default value is com4j.Variant.getMissing()
   * @param allowDeletingColumns Optional parameter. Default value is com4j.Variant.getMissing()
   * @param allowDeletingRows Optional parameter. Default value is com4j.Variant.getMissing()
   * @param allowSorting Optional parameter. Default value is com4j.Variant.getMissing()
   * @param allowFiltering Optional parameter. Default value is com4j.Variant.getMissing()
   * @param allowUsingPivotTables Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(2029) //= 0x7ed. The runtime will prefer the VTID if present
  @VTID(142)
  void protect(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object password,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object drawingObjects,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object contents,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object scenarios,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object userInterfaceOnly,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object allowFormattingCells,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object allowFormattingColumns,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object allowFormattingRows,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object allowInsertingColumns,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object allowInsertingRows,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object allowInsertingHyperlinks,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object allowDeletingColumns,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object allowDeletingRows,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object allowSorting,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object allowFiltering,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object allowUsingPivotTables);


  /**
   * <p>
   * Getter method for the COM property "ListObjects"
   * </p>
   * @return  Returns a value of type RTExcelObj.ListObjects
   */

  @DISPID(2259) //= 0x8d3. The runtime will prefer the VTID if present
  @VTID(143)
  RTExcelObj.ListObjects listObjects();


  /**
   * @param xPath Mandatory java.lang.String parameter.
   * @param selectionNamespaces Optional parameter. Default value is com4j.Variant.getMissing()
   * @param map Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type RTExcelObj.Range
   */

  @DISPID(2260) //= 0x8d4. The runtime will prefer the VTID if present
  @VTID(144)
  RTExcelObj.Range xmlDataQuery(
    java.lang.String xPath,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object selectionNamespaces,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object map);


  /**
   * @param xPath Mandatory java.lang.String parameter.
   * @param selectionNamespaces Optional parameter. Default value is com4j.Variant.getMissing()
   * @param map Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type RTExcelObj.Range
   */

  @DISPID(2263) //= 0x8d7. The runtime will prefer the VTID if present
  @VTID(145)
  RTExcelObj.Range xmlMapQuery(
    java.lang.String xPath,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object selectionNamespaces,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object map);


  /**
   * @param from Optional parameter. Default value is com4j.Variant.getMissing()
   * @param to Optional parameter. Default value is com4j.Variant.getMissing()
   * @param copies Optional parameter. Default value is com4j.Variant.getMissing()
   * @param preview Optional parameter. Default value is com4j.Variant.getMissing()
   * @param activePrinter Optional parameter. Default value is com4j.Variant.getMissing()
   * @param printToFile Optional parameter. Default value is com4j.Variant.getMissing()
   * @param collate Optional parameter. Default value is com4j.Variant.getMissing()
   * @param prToFileName Optional parameter. Default value is com4j.Variant.getMissing()
   * @param ignorePrintAreas Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(2361) //= 0x939. The runtime will prefer the VTID if present
  @VTID(146)
  void printOut(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object from,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object to,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object copies,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object preview,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object activePrinter,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object printToFile,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object collate,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object prToFileName,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object ignorePrintAreas,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "EnableFormatConditionsCalculation"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2511) //= 0x9cf. The runtime will prefer the VTID if present
  @VTID(147)
  boolean enableFormatConditionsCalculation();


  /**
   * <p>
   * Setter method for the COM property "EnableFormatConditionsCalculation"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2511) //= 0x9cf. The runtime will prefer the VTID if present
  @VTID(148)
  void enableFormatConditionsCalculation(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Sort"
   * </p>
   * @return  Returns a value of type RTExcelObj.Sort
   */

  @DISPID(880) //= 0x370. The runtime will prefer the VTID if present
  @VTID(149)
  RTExcelObj.Sort sort();


  /**
   * @param type Mandatory RTExcelObj.XlFixedFormatType parameter.
   * @param filename Optional parameter. Default value is com4j.Variant.getMissing()
   * @param quality Optional parameter. Default value is com4j.Variant.getMissing()
   * @param includeDocProperties Optional parameter. Default value is com4j.Variant.getMissing()
   * @param ignorePrintAreas Optional parameter. Default value is com4j.Variant.getMissing()
   * @param from Optional parameter. Default value is com4j.Variant.getMissing()
   * @param to Optional parameter. Default value is com4j.Variant.getMissing()
   * @param openAfterPublish Optional parameter. Default value is com4j.Variant.getMissing()
   * @param fixedFormatExtClassPtr Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(2493) //= 0x9bd. The runtime will prefer the VTID if present
  @VTID(150)
  void exportAsFixedFormat(
    RTExcelObj.XlFixedFormatType type,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object filename,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object quality,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object includeDocProperties,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object ignorePrintAreas,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object from,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object to,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object openAfterPublish,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object fixedFormatExtClassPtr);


  /**
   * <p>
   * Getter method for the COM property "PrintedCommentPages"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2857) //= 0xb29. The runtime will prefer the VTID if present
  @VTID(151)
  int printedCommentPages();


  // Properties:
}
