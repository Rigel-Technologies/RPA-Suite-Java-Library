package RTExcelObj  ;

import com4j.*;

@IID("{00020846-0001-0000-C000-000000000046}")
public interface IRange extends Com4jObject,Iterable<Com4jObject> {
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
   * <p>
   * Getter method for the COM property "AddIndent"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(11)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object addIndent();


  /**
   * <p>
   * Setter method for the COM property "AddIndent"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(12)
  void addIndent(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "Address"
   * </p>
   * @param rowAbsolute Optional parameter. Default value is com4j.Variant.getMissing()
   * @param columnAbsolute Optional parameter. Default value is com4j.Variant.getMissing()
   * @param referenceStyle Optional parameter. Default value is 1
   * @param external Optional parameter. Default value is com4j.Variant.getMissing()
   * @param relativeTo Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @VTID(13)
  java.lang.String address(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object rowAbsolute,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object columnAbsolute,
    @Optional @DefaultValue("1") RTExcelObj.XlReferenceStyle referenceStyle,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object external,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object relativeTo,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "AddressLocal"
   * </p>
   * @param rowAbsolute Optional parameter. Default value is com4j.Variant.getMissing()
   * @param columnAbsolute Optional parameter. Default value is com4j.Variant.getMissing()
   * @param referenceStyle Optional parameter. Default value is 1
   * @param external Optional parameter. Default value is com4j.Variant.getMissing()
   * @param relativeTo Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.String
   */

  @VTID(14)
  java.lang.String addressLocal(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object rowAbsolute,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object columnAbsolute,
    @Optional @DefaultValue("1") RTExcelObj.XlReferenceStyle referenceStyle,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object external,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object relativeTo);


  /**
   * @param action Mandatory RTExcelObj.XlFilterAction parameter.
   * @param criteriaRange Optional parameter. Default value is com4j.Variant.getMissing()
   * @param copyToRange Optional parameter. Default value is com4j.Variant.getMissing()
   * @param unique Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(15)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object advancedFilter(
    RTExcelObj.XlFilterAction action,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object criteriaRange,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object copyToRange,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object unique);


  /**
   * @param names Optional parameter. Default value is com4j.Variant.getMissing()
   * @param ignoreRelativeAbsolute Optional parameter. Default value is com4j.Variant.getMissing()
   * @param useRowColumnNames Optional parameter. Default value is com4j.Variant.getMissing()
   * @param omitColumn Optional parameter. Default value is com4j.Variant.getMissing()
   * @param omitRow Optional parameter. Default value is com4j.Variant.getMissing()
   * @param order Optional parameter. Default value is 1
   * @param appendLast Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(16)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object applyNames(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object names,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object ignoreRelativeAbsolute,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object useRowColumnNames,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object omitColumn,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object omitRow,
    @Optional @DefaultValue("1") RTExcelObj.XlApplyNamesOrder order,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object appendLast);


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(17)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object applyOutlineStyles();


  /**
   * <p>
   * Getter method for the COM property "Areas"
   * </p>
   * @return  Returns a value of type RTExcelObj.Areas
   */

  @VTID(18)
  RTExcelObj.Areas areas();


  /**
   * @param string Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @VTID(19)
  java.lang.String autoComplete(
    java.lang.String string);


  /**
   * @param destination Mandatory RTExcelObj.Range parameter.
   * @param type Optional parameter. Default value is 0
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(20)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object autoFill(
    RTExcelObj.Range destination,
    @Optional @DefaultValue("0") RTExcelObj.XlAutoFillType type);


  /**
   * @param field Optional parameter. Default value is com4j.Variant.getMissing()
   * @param criteria1 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param operator Optional parameter. Default value is 1
   * @param criteria2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param visibleDropDown Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(21)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object autoFilter(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object field,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object criteria1,
    @Optional @DefaultValue("1") RTExcelObj.XlAutoFilterOperator operator,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object criteria2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object visibleDropDown);


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(22)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object autoFit();


  /**
   * @param format Optional parameter. Default value is 1
   * @param number Optional parameter. Default value is com4j.Variant.getMissing()
   * @param font Optional parameter. Default value is com4j.Variant.getMissing()
   * @param alignment Optional parameter. Default value is com4j.Variant.getMissing()
   * @param border Optional parameter. Default value is com4j.Variant.getMissing()
   * @param pattern Optional parameter. Default value is com4j.Variant.getMissing()
   * @param width Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(23)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object autoFormat(
    @Optional @DefaultValue("1") RTExcelObj.XlRangeAutoFormat format,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object number,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object font,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object alignment,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object border,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object pattern,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object width);


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(24)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object autoOutline();


  /**
   * @param lineStyle Optional parameter. Default value is com4j.Variant.getMissing()
   * @param weight Optional parameter. Default value is 2
   * @param colorIndex Optional parameter. Default value is -4105
   * @param color Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(25)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object _BorderAround(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object lineStyle,
    @Optional @DefaultValue("2") RTExcelObj.XlBorderWeight weight,
    @Optional @DefaultValue("-4105") RTExcelObj.XlColorIndex colorIndex,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object color);


  /**
   * <p>
   * Getter method for the COM property "Borders"
   * </p>
   * @return  Returns a value of type RTExcelObj.Borders
   */

  @VTID(26)
  RTExcelObj.Borders borders();


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(27)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object calculate();


  /**
   * <p>
   * Getter method for the COM property "Cells"
   * </p>
   * @return  Returns a value of type RTExcelObj.Range
   */

  @VTID(28)
  RTExcelObj.Range cells();


  /**
   * <p>
   * Getter method for the COM property "Characters"
   * </p>
   * @param start Optional parameter. Default value is com4j.Variant.getMissing()
   * @param length Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type RTExcelObj.Characters
   */

  @VTID(29)
  RTExcelObj.Characters characters(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object start,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object length);


  /**
   * @param customDictionary Optional parameter. Default value is com4j.Variant.getMissing()
   * @param ignoreUppercase Optional parameter. Default value is com4j.Variant.getMissing()
   * @param alwaysSuggest Optional parameter. Default value is com4j.Variant.getMissing()
   * @param spellLang Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(30)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object checkSpelling(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object customDictionary,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object ignoreUppercase,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object alwaysSuggest,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object spellLang);


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(31)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object clear();


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(32)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object clearContents();


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(33)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object clearFormats();


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(34)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object clearNotes();


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(35)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object clearOutline();


  /**
   * <p>
   * Getter method for the COM property "Column"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(36)
  int column();


  /**
   * @param comparison Mandatory java.lang.Object parameter.
   * @return  Returns a value of type RTExcelObj.Range
   */

  @VTID(37)
  RTExcelObj.Range columnDifferences(
    @MarshalAs(NativeType.VARIANT) java.lang.Object comparison);


  /**
   * <p>
   * Getter method for the COM property "Columns"
   * </p>
   * @return  Returns a value of type RTExcelObj.Range
   */

  @VTID(38)
  RTExcelObj.Range columns();


  /**
   * <p>
   * Getter method for the COM property "ColumnWidth"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(39)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object columnWidth();


  /**
   * <p>
   * Setter method for the COM property "ColumnWidth"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(40)
  void columnWidth(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * @param sources Optional parameter. Default value is com4j.Variant.getMissing()
   * @param function Optional parameter. Default value is com4j.Variant.getMissing()
   * @param topRow Optional parameter. Default value is com4j.Variant.getMissing()
   * @param leftColumn Optional parameter. Default value is com4j.Variant.getMissing()
   * @param createLinks Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(41)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object consolidate(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object sources,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object function,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object topRow,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object leftColumn,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object createLinks);


  /**
   * @param destination Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(42)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object copy(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object destination);


  /**
   * @param data Mandatory com4j.Com4jObject parameter.
   * @param maxRows Optional parameter. Default value is com4j.Variant.getMissing()
   * @param maxColumns Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type int
   */

  @VTID(43)
  int copyFromRecordset(
    com4j.Com4jObject data,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object maxRows,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object maxColumns);


  /**
   * @param appearance Optional parameter. Default value is 1
   * @param format Optional parameter. Default value is -4147
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(44)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object copyPicture(
    @Optional @DefaultValue("1") RTExcelObj.XlPictureAppearance appearance,
    @Optional @DefaultValue("-4147") RTExcelObj.XlCopyPictureFormat format);


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(45)
  int count();


  /**
   * @param top Optional parameter. Default value is com4j.Variant.getMissing()
   * @param left Optional parameter. Default value is com4j.Variant.getMissing()
   * @param bottom Optional parameter. Default value is com4j.Variant.getMissing()
   * @param right Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(46)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object createNames(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object top,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object left,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object bottom,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object right);


  /**
   * @param edition Optional parameter. Default value is com4j.Variant.getMissing()
   * @param appearance Optional parameter. Default value is 1
   * @param containsPICT Optional parameter. Default value is com4j.Variant.getMissing()
   * @param containsBIFF Optional parameter. Default value is com4j.Variant.getMissing()
   * @param containsRTF Optional parameter. Default value is com4j.Variant.getMissing()
   * @param containsVALU Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(47)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object createPublisher(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object edition,
    @Optional @DefaultValue("1") RTExcelObj.XlPictureAppearance appearance,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object containsPICT,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object containsBIFF,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object containsRTF,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object containsVALU);


  /**
   * <p>
   * Getter method for the COM property "CurrentArray"
   * </p>
   * @return  Returns a value of type RTExcelObj.Range
   */

  @VTID(48)
  RTExcelObj.Range currentArray();


  /**
   * <p>
   * Getter method for the COM property "CurrentRegion"
   * </p>
   * @return  Returns a value of type RTExcelObj.Range
   */

  @VTID(49)
  RTExcelObj.Range currentRegion();


  /**
   * @param destination Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(50)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object cut(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object destination);


  /**
   * @param rowcol Optional parameter. Default value is com4j.Variant.getMissing()
   * @param type Optional parameter. Default value is -4132
   * @param date Optional parameter. Default value is 1
   * @param step Optional parameter. Default value is com4j.Variant.getMissing()
   * @param stop Optional parameter. Default value is com4j.Variant.getMissing()
   * @param trend Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(51)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object dataSeries(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object rowcol,
    @Optional @DefaultValue("-4132") RTExcelObj.XlDataSeriesType type,
    @Optional @DefaultValue("1") RTExcelObj.XlDataSeriesDate date,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object step,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object stop,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object trend);


  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   * @param rowIndex Optional parameter. Default value is com4j.Variant.getMissing()
   * @param columnIndex Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(52)
  @DefaultMethod
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object _Default(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object rowIndex,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object columnIndex,
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "_Default"
   * </p>
   * @param rowIndex Optional parameter. Default value is com4j.Variant.getMissing()
   * @param columnIndex Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(53)
  @DefaultMethod
  void _Default(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object rowIndex,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object columnIndex,
    @LCID int lcid,
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * @param shift Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(54)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object delete(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object shift);


  /**
   * <p>
   * Getter method for the COM property "Dependents"
   * </p>
   * @return  Returns a value of type RTExcelObj.Range
   */

  @VTID(55)
  RTExcelObj.Range dependents();


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(56)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object dialogBox();


  /**
   * <p>
   * Getter method for the COM property "DirectDependents"
   * </p>
   * @return  Returns a value of type RTExcelObj.Range
   */

  @VTID(57)
  RTExcelObj.Range directDependents();


  /**
   * <p>
   * Getter method for the COM property "DirectPrecedents"
   * </p>
   * @return  Returns a value of type RTExcelObj.Range
   */

  @VTID(58)
  RTExcelObj.Range directPrecedents();


  /**
   * @param type Mandatory RTExcelObj.XlEditionType parameter.
   * @param option Mandatory RTExcelObj.XlEditionOptionsOption parameter.
   * @param name Optional parameter. Default value is com4j.Variant.getMissing()
   * @param reference Optional parameter. Default value is com4j.Variant.getMissing()
   * @param appearance Optional parameter. Default value is 1
   * @param chartSize Optional parameter. Default value is 1
   * @param format Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(59)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object editionOptions(
    RTExcelObj.XlEditionType type,
    RTExcelObj.XlEditionOptionsOption option,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object name,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object reference,
    @Optional @DefaultValue("1") RTExcelObj.XlPictureAppearance appearance,
    @Optional @DefaultValue("1") RTExcelObj.XlPictureAppearance chartSize,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object format);


  /**
   * <p>
   * Getter method for the COM property "End"
   * </p>
   * @param direction Mandatory RTExcelObj.XlDirection parameter.
   * @return  Returns a value of type RTExcelObj.Range
   */

  @VTID(60)
  RTExcelObj.Range end(
    RTExcelObj.XlDirection direction);


  /**
   * <p>
   * Getter method for the COM property "EntireColumn"
   * </p>
   * @return  Returns a value of type RTExcelObj.Range
   */

  @VTID(61)
  RTExcelObj.Range entireColumn();


  /**
   * <p>
   * Getter method for the COM property "EntireRow"
   * </p>
   * @return  Returns a value of type RTExcelObj.Range
   */

  @VTID(62)
  RTExcelObj.Range entireRow();


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(63)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object fillDown();


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(64)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object fillLeft();


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(65)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object fillRight();


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(66)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object fillUp();


  /**
   * @param what Mandatory java.lang.Object parameter.
   * @param after Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lookIn Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lookAt Optional parameter. Default value is com4j.Variant.getMissing()
   * @param searchOrder Optional parameter. Default value is com4j.Variant.getMissing()
   * @param searchDirection Optional parameter. Default value is 1
   * @param matchCase Optional parameter. Default value is com4j.Variant.getMissing()
   * @param matchByte Optional parameter. Default value is com4j.Variant.getMissing()
   * @param searchFormat Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type RTExcelObj.Range
   */

  @VTID(67)
  RTExcelObj.Range find(
    @MarshalAs(NativeType.VARIANT) java.lang.Object what,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object after,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object lookIn,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object lookAt,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object searchOrder,
    @Optional @DefaultValue("1") RTExcelObj.XlSearchDirection searchDirection,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object matchCase,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object matchByte,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object searchFormat);


  /**
   * @param after Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type RTExcelObj.Range
   */

  @VTID(68)
  RTExcelObj.Range findNext(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object after);


  /**
   * @param after Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type RTExcelObj.Range
   */

  @VTID(69)
  RTExcelObj.Range findPrevious(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object after);


  /**
   * <p>
   * Getter method for the COM property "Font"
   * </p>
   * @return  Returns a value of type RTExcelObj.Font
   */

  @VTID(70)
  RTExcelObj.Font font();


  /**
   * <p>
   * Getter method for the COM property "Formula"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(71)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object formula(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "Formula"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(72)
  void formula(
    @LCID int lcid,
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "FormulaArray"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(73)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object formulaArray();


  /**
   * <p>
   * Setter method for the COM property "FormulaArray"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(74)
  void formulaArray(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "FormulaLabel"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlFormulaLabel
   */

  @VTID(75)
  RTExcelObj.XlFormulaLabel formulaLabel();


  /**
   * <p>
   * Setter method for the COM property "FormulaLabel"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlFormulaLabel parameter.
   */

  @VTID(76)
  void formulaLabel(
    RTExcelObj.XlFormulaLabel rhs);


  /**
   * <p>
   * Getter method for the COM property "FormulaHidden"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(77)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object formulaHidden();


  /**
   * <p>
   * Setter method for the COM property "FormulaHidden"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(78)
  void formulaHidden(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "FormulaLocal"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(79)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object formulaLocal();


  /**
   * <p>
   * Setter method for the COM property "FormulaLocal"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(80)
  void formulaLocal(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "FormulaR1C1"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(81)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object formulaR1C1(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "FormulaR1C1"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(82)
  void formulaR1C1(
    @LCID int lcid,
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "FormulaR1C1Local"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(83)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object formulaR1C1Local();


  /**
   * <p>
   * Setter method for the COM property "FormulaR1C1Local"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(84)
  void formulaR1C1Local(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(85)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object functionWizard();


  /**
   * @param goal Mandatory java.lang.Object parameter.
   * @param changingCell Mandatory RTExcelObj.Range parameter.
   * @return  Returns a value of type boolean
   */

  @VTID(86)
  boolean goalSeek(
    @MarshalAs(NativeType.VARIANT) java.lang.Object goal,
    RTExcelObj.Range changingCell);


  /**
   * @param start Optional parameter. Default value is com4j.Variant.getMissing()
   * @param end Optional parameter. Default value is com4j.Variant.getMissing()
   * @param by Optional parameter. Default value is com4j.Variant.getMissing()
   * @param periods Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(87)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object group(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object start,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object end,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object by,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object periods);


  /**
   * <p>
   * Getter method for the COM property "HasArray"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(88)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object hasArray();


  /**
   * <p>
   * Getter method for the COM property "HasFormula"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(89)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object hasFormula();


  /**
   * <p>
   * Getter method for the COM property "Height"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(90)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object height();


  /**
   * <p>
   * Getter method for the COM property "Hidden"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(91)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object hidden();


  /**
   * <p>
   * Setter method for the COM property "Hidden"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(92)
  void hidden(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "HorizontalAlignment"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(93)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object horizontalAlignment();


  /**
   * <p>
   * Setter method for the COM property "HorizontalAlignment"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(94)
  void horizontalAlignment(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "IndentLevel"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(95)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object indentLevel();


  /**
   * <p>
   * Setter method for the COM property "IndentLevel"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(96)
  void indentLevel(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * @param insertAmount Mandatory int parameter.
   */

  @VTID(97)
  void insertIndent(
    int insertAmount);


  /**
   * @param shift Optional parameter. Default value is com4j.Variant.getMissing()
   * @param copyOrigin Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(98)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object insert(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object shift,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object copyOrigin);


  /**
   * <p>
   * Getter method for the COM property "Interior"
   * </p>
   * @return  Returns a value of type RTExcelObj.Interior
   */

  @VTID(99)
  RTExcelObj.Interior interior();


  /**
   * <p>
   * Getter method for the COM property "Item"
   * </p>
   * @param rowIndex Mandatory java.lang.Object parameter.
   * @param columnIndex Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(100)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object item(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rowIndex,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object columnIndex,
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "Item"
   * </p>
   * @param rowIndex Mandatory java.lang.Object parameter.
   * @param columnIndex Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(101)
  void item(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rowIndex,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object columnIndex,
    @LCID int lcid,
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(102)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object justify();


  /**
   * <p>
   * Getter method for the COM property "Left"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(103)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object left();


  /**
   * <p>
   * Getter method for the COM property "ListHeaderRows"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(104)
  int listHeaderRows();


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(105)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object listNames();


  /**
   * <p>
   * Getter method for the COM property "LocationInTable"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlLocationInTable
   */

  @VTID(106)
  RTExcelObj.XlLocationInTable locationInTable();


  /**
   * <p>
   * Getter method for the COM property "Locked"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(107)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object locked();


  /**
   * <p>
   * Setter method for the COM property "Locked"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(108)
  void locked(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * @param across Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @VTID(109)
  void merge(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object across);


  /**
   */

  @VTID(110)
  void unMerge();


  /**
   * <p>
   * Getter method for the COM property "MergeArea"
   * </p>
   * @return  Returns a value of type RTExcelObj.Range
   */

  @VTID(111)
  RTExcelObj.Range mergeArea();


  /**
   * <p>
   * Getter method for the COM property "MergeCells"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(112)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object mergeCells();


  /**
   * <p>
   * Setter method for the COM property "MergeCells"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(113)
  void mergeCells(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(114)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object name();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(115)
  void name(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * @param towardPrecedent Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arrowNumber Optional parameter. Default value is com4j.Variant.getMissing()
   * @param linkNumber Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(116)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object navigateArrow(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object towardPrecedent,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arrowNumber,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object linkNumber);


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @VTID(117)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * <p>
   * Getter method for the COM property "Next"
   * </p>
   * @return  Returns a value of type RTExcelObj.Range
   */

  @VTID(118)
  RTExcelObj.Range next();


  /**
   * @param text Optional parameter. Default value is com4j.Variant.getMissing()
   * @param start Optional parameter. Default value is com4j.Variant.getMissing()
   * @param length Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.String
   */

  @VTID(119)
  java.lang.String noteText(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object text,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object start,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object length);


  /**
   * <p>
   * Getter method for the COM property "NumberFormat"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(120)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object numberFormat();


  /**
   * <p>
   * Setter method for the COM property "NumberFormat"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(121)
  void numberFormat(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "NumberFormatLocal"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(122)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object numberFormatLocal();


  /**
   * <p>
   * Setter method for the COM property "NumberFormatLocal"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(123)
  void numberFormatLocal(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "Offset"
   * </p>
   * @param rowOffset Optional parameter. Default value is com4j.Variant.getMissing()
   * @param columnOffset Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type RTExcelObj.Range
   */

  @VTID(124)
  RTExcelObj.Range offset(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object rowOffset,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object columnOffset);


  /**
   * <p>
   * Getter method for the COM property "Orientation"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(125)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object orientation();


  /**
   * <p>
   * Setter method for the COM property "Orientation"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(126)
  void orientation(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "OutlineLevel"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(127)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object outlineLevel();


  /**
   * <p>
   * Setter method for the COM property "OutlineLevel"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(128)
  void outlineLevel(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "PageBreak"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(129)
  int pageBreak();


  /**
   * <p>
   * Setter method for the COM property "PageBreak"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(130)
  void pageBreak(
    int rhs);


  /**
   * @param parseLine Optional parameter. Default value is com4j.Variant.getMissing()
   * @param destination Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(131)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object parse(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object parseLine,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object destination);


  /**
   * @param paste Optional parameter. Default value is -4104
   * @param operation Optional parameter. Default value is -4142
   * @param skipBlanks Optional parameter. Default value is com4j.Variant.getMissing()
   * @param transpose Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(132)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object _PasteSpecial(
    @Optional @DefaultValue("-4104") RTExcelObj.XlPasteType paste,
    @Optional @DefaultValue("-4142") RTExcelObj.XlPasteSpecialOperation operation,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object skipBlanks,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object transpose);


  /**
   * <p>
   * Getter method for the COM property "PivotField"
   * </p>
   * @return  Returns a value of type RTExcelObj.PivotField
   */

  @VTID(133)
  RTExcelObj.PivotField pivotField();


  /**
   * <p>
   * Getter method for the COM property "PivotItem"
   * </p>
   * @return  Returns a value of type RTExcelObj.PivotItem
   */

  @VTID(134)
  RTExcelObj.PivotItem pivotItem();


  /**
   * <p>
   * Getter method for the COM property "PivotTable"
   * </p>
   * @return  Returns a value of type RTExcelObj.PivotTable
   */

  @VTID(135)
  RTExcelObj.PivotTable pivotTable();


  /**
   * <p>
   * Getter method for the COM property "Precedents"
   * </p>
   * @return  Returns a value of type RTExcelObj.Range
   */

  @VTID(136)
  RTExcelObj.Range precedents();


  /**
   * <p>
   * Getter method for the COM property "PrefixCharacter"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(137)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object prefixCharacter();


  /**
   * <p>
   * Getter method for the COM property "Previous"
   * </p>
   * @return  Returns a value of type RTExcelObj.Range
   */

  @VTID(138)
  RTExcelObj.Range previous();


  /**
   * @param from Optional parameter. Default value is com4j.Variant.getMissing()
   * @param to Optional parameter. Default value is com4j.Variant.getMissing()
   * @param copies Optional parameter. Default value is com4j.Variant.getMissing()
   * @param preview Optional parameter. Default value is com4j.Variant.getMissing()
   * @param activePrinter Optional parameter. Default value is com4j.Variant.getMissing()
   * @param printToFile Optional parameter. Default value is com4j.Variant.getMissing()
   * @param collate Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(139)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object __PrintOut(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object from,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object to,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object copies,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object preview,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object activePrinter,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object printToFile,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object collate);


  /**
   * @param enableChanges Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(140)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object printPreview(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object enableChanges);


  /**
   * <p>
   * Getter method for the COM property "QueryTable"
   * </p>
   * @return  Returns a value of type RTExcelObj._QueryTable
   */

  @VTID(141)
  RTExcelObj._QueryTable queryTable();


  /**
   * <p>
   * Getter method for the COM property "Range"
   * </p>
   * @param cell1 Mandatory java.lang.Object parameter.
   * @param cell2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type RTExcelObj.Range
   */

  @VTID(142)
  RTExcelObj.Range range(
    @MarshalAs(NativeType.VARIANT) java.lang.Object cell1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object cell2);


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(143)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object removeSubtotal();


  /**
   * @param what Mandatory java.lang.Object parameter.
   * @param replacement Mandatory java.lang.Object parameter.
   * @param lookAt Optional parameter. Default value is com4j.Variant.getMissing()
   * @param searchOrder Optional parameter. Default value is com4j.Variant.getMissing()
   * @param matchCase Optional parameter. Default value is com4j.Variant.getMissing()
   * @param matchByte Optional parameter. Default value is com4j.Variant.getMissing()
   * @param searchFormat Optional parameter. Default value is com4j.Variant.getMissing()
   * @param replaceFormat Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type boolean
   */

  @VTID(144)
  boolean replace(
    @MarshalAs(NativeType.VARIANT) java.lang.Object what,
    @MarshalAs(NativeType.VARIANT) java.lang.Object replacement,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object lookAt,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object searchOrder,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object matchCase,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object matchByte,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object searchFormat,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object replaceFormat);


  /**
   * <p>
   * Getter method for the COM property "Resize"
   * </p>
   * @param rowSize Optional parameter. Default value is com4j.Variant.getMissing()
   * @param columnSize Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type RTExcelObj.Range
   */

  @VTID(145)
  RTExcelObj.Range resize(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object rowSize,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object columnSize);


  /**
   * <p>
   * Getter method for the COM property "Row"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(146)
  int row();


  /**
   * @param comparison Mandatory java.lang.Object parameter.
   * @return  Returns a value of type RTExcelObj.Range
   */

  @VTID(147)
  RTExcelObj.Range rowDifferences(
    @MarshalAs(NativeType.VARIANT) java.lang.Object comparison);


  /**
   * <p>
   * Getter method for the COM property "RowHeight"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(148)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object rowHeight();


  /**
   * <p>
   * Setter method for the COM property "RowHeight"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(149)
  void rowHeight(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "Rows"
   * </p>
   * @return  Returns a value of type RTExcelObj.Range
   */

  @VTID(150)
  RTExcelObj.Range rows();


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
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(151)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object run(
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
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(152)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object select();


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(153)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object show();


  /**
   * @param remove Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(154)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object showDependents(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object remove);


  /**
   * <p>
   * Getter method for the COM property "ShowDetail"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(155)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object showDetail();


  /**
   * <p>
   * Setter method for the COM property "ShowDetail"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(156)
  void showDetail(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(157)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object showErrors();


  /**
   * @param remove Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(158)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object showPrecedents(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object remove);


  /**
   * <p>
   * Getter method for the COM property "ShrinkToFit"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(159)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object shrinkToFit();


  /**
   * <p>
   * Setter method for the COM property "ShrinkToFit"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(160)
  void shrinkToFit(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * @param key1 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param order1 Optional parameter. Default value is 1
   * @param key2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param type Optional parameter. Default value is com4j.Variant.getMissing()
   * @param order2 Optional parameter. Default value is 1
   * @param key3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param order3 Optional parameter. Default value is 1
   * @param header Optional parameter. Default value is 2
   * @param orderCustom Optional parameter. Default value is com4j.Variant.getMissing()
   * @param matchCase Optional parameter. Default value is com4j.Variant.getMissing()
   * @param orientation Optional parameter. Default value is 2
   * @param sortMethod Optional parameter. Default value is 1
   * @param dataOption1 Optional parameter. Default value is 0
   * @param dataOption2 Optional parameter. Default value is 0
   * @param dataOption3 Optional parameter. Default value is 0
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(161)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object sort(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object key1,
    @Optional @DefaultValue("1") RTExcelObj.XlSortOrder order1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object key2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object type,
    @Optional @DefaultValue("1") RTExcelObj.XlSortOrder order2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object key3,
    @Optional @DefaultValue("1") RTExcelObj.XlSortOrder order3,
    @Optional @DefaultValue("2") RTExcelObj.XlYesNoGuess header,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object orderCustom,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object matchCase,
    @Optional @DefaultValue("2") RTExcelObj.XlSortOrientation orientation,
    @Optional @DefaultValue("1") RTExcelObj.XlSortMethod sortMethod,
    @Optional @DefaultValue("0") RTExcelObj.XlSortDataOption dataOption1,
    @Optional @DefaultValue("0") RTExcelObj.XlSortDataOption dataOption2,
    @Optional @DefaultValue("0") RTExcelObj.XlSortDataOption dataOption3);


  /**
   * @param sortMethod Optional parameter. Default value is 1
   * @param key1 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param order1 Optional parameter. Default value is 1
   * @param type Optional parameter. Default value is com4j.Variant.getMissing()
   * @param key2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param order2 Optional parameter. Default value is 1
   * @param key3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param order3 Optional parameter. Default value is 1
   * @param header Optional parameter. Default value is 2
   * @param orderCustom Optional parameter. Default value is com4j.Variant.getMissing()
   * @param matchCase Optional parameter. Default value is com4j.Variant.getMissing()
   * @param orientation Optional parameter. Default value is 2
   * @param dataOption1 Optional parameter. Default value is 0
   * @param dataOption2 Optional parameter. Default value is 0
   * @param dataOption3 Optional parameter. Default value is 0
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(162)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object sortSpecial(
    @Optional @DefaultValue("1") RTExcelObj.XlSortMethod sortMethod,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object key1,
    @Optional @DefaultValue("1") RTExcelObj.XlSortOrder order1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object type,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object key2,
    @Optional @DefaultValue("1") RTExcelObj.XlSortOrder order2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object key3,
    @Optional @DefaultValue("1") RTExcelObj.XlSortOrder order3,
    @Optional @DefaultValue("2") RTExcelObj.XlYesNoGuess header,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object orderCustom,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object matchCase,
    @Optional @DefaultValue("2") RTExcelObj.XlSortOrientation orientation,
    @Optional @DefaultValue("0") RTExcelObj.XlSortDataOption dataOption1,
    @Optional @DefaultValue("0") RTExcelObj.XlSortDataOption dataOption2,
    @Optional @DefaultValue("0") RTExcelObj.XlSortDataOption dataOption3);


  /**
   * <p>
   * Getter method for the COM property "SoundNote"
   * </p>
   * @return  Returns a value of type RTExcelObj.SoundNote
   */

  @VTID(163)
  RTExcelObj.SoundNote soundNote();


  /**
   * @param type Mandatory RTExcelObj.XlCellType parameter.
   * @param value Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type RTExcelObj.Range
   */

  @VTID(164)
  RTExcelObj.Range specialCells(
    RTExcelObj.XlCellType type,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object value);


  /**
   * <p>
   * Getter method for the COM property "Style"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(165)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object style();


  /**
   * <p>
   * Setter method for the COM property "Style"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(166)
  void style(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * @param edition Mandatory java.lang.String parameter.
   * @param format Optional parameter. Default value is -4158
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(167)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object subscribeTo(
    java.lang.String edition,
    @Optional @DefaultValue("-4158") RTExcelObj.XlSubscribeToFormat format);


  /**
   * @param groupBy Mandatory int parameter.
   * @param function Mandatory RTExcelObj.XlConsolidationFunction parameter.
   * @param totalList Mandatory java.lang.Object parameter.
   * @param replace Optional parameter. Default value is com4j.Variant.getMissing()
   * @param pageBreaks Optional parameter. Default value is com4j.Variant.getMissing()
   * @param summaryBelowData Optional parameter. Default value is 1
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(168)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object subtotal(
    int groupBy,
    RTExcelObj.XlConsolidationFunction function,
    @MarshalAs(NativeType.VARIANT) java.lang.Object totalList,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object replace,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object pageBreaks,
    @Optional @DefaultValue("1") RTExcelObj.XlSummaryRow summaryBelowData);


  /**
   * <p>
   * Getter method for the COM property "Summary"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(169)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object summary();


  /**
   * @param rowInput Optional parameter. Default value is com4j.Variant.getMissing()
   * @param columnInput Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(170)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object table(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object rowInput,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object columnInput);


  /**
   * <p>
   * Getter method for the COM property "Text"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(171)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object text();


  /**
   * @param destination Optional parameter. Default value is com4j.Variant.getMissing()
   * @param dataType Optional parameter. Default value is 1
   * @param textQualifier Optional parameter. Default value is 1
   * @param consecutiveDelimiter Optional parameter. Default value is com4j.Variant.getMissing()
   * @param tab Optional parameter. Default value is com4j.Variant.getMissing()
   * @param semicolon Optional parameter. Default value is com4j.Variant.getMissing()
   * @param comma Optional parameter. Default value is com4j.Variant.getMissing()
   * @param space Optional parameter. Default value is com4j.Variant.getMissing()
   * @param other Optional parameter. Default value is com4j.Variant.getMissing()
   * @param otherChar Optional parameter. Default value is com4j.Variant.getMissing()
   * @param fieldInfo Optional parameter. Default value is com4j.Variant.getMissing()
   * @param decimalSeparator Optional parameter. Default value is com4j.Variant.getMissing()
   * @param thousandsSeparator Optional parameter. Default value is com4j.Variant.getMissing()
   * @param trailingMinusNumbers Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(172)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object textToColumns(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object destination,
    @Optional @DefaultValue("1") RTExcelObj.XlTextParsingType dataType,
    @Optional @DefaultValue("1") RTExcelObj.XlTextQualifier textQualifier,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object consecutiveDelimiter,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object tab,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object semicolon,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object comma,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object space,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object other,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object otherChar,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object fieldInfo,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object decimalSeparator,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object thousandsSeparator,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object trailingMinusNumbers);


  /**
   * <p>
   * Getter method for the COM property "Top"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(173)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object top();


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(174)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object ungroup();


  /**
   * <p>
   * Getter method for the COM property "UseStandardHeight"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(175)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object useStandardHeight();


  /**
   * <p>
   * Setter method for the COM property "UseStandardHeight"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(176)
  void useStandardHeight(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "UseStandardWidth"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(177)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object useStandardWidth();


  /**
   * <p>
   * Setter method for the COM property "UseStandardWidth"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(178)
  void useStandardWidth(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "Validation"
   * </p>
   * @return  Returns a value of type RTExcelObj.Validation
   */

  @VTID(179)
  RTExcelObj.Validation validation();


  /**
   * <p>
   * Getter method for the COM property "Value"
   * </p>
   * @param rangeValueDataType Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(180)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object value(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object rangeValueDataType,
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "Value"
   * </p>
   * @param rangeValueDataType Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(181)
  void value(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object rangeValueDataType,
    @LCID int lcid,
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "Value2"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(182)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object value2(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "Value2"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(183)
  void value2(
    @LCID int lcid,
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "VerticalAlignment"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(184)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object verticalAlignment();


  /**
   * <p>
   * Setter method for the COM property "VerticalAlignment"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(185)
  void verticalAlignment(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "Width"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(186)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object width();


  /**
   * <p>
   * Getter method for the COM property "Worksheet"
   * </p>
   * @return  Returns a value of type RTExcelObj._Worksheet
   */

  @VTID(187)
  RTExcelObj._Worksheet worksheet();


  /**
   * <p>
   * Getter method for the COM property "WrapText"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(188)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object wrapText();


  /**
   * <p>
   * Setter method for the COM property "WrapText"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(189)
  void wrapText(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * @param text Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type RTExcelObj.Comment
   */

  @VTID(190)
  RTExcelObj.Comment addComment(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object text);


  /**
   * <p>
   * Getter method for the COM property "Comment"
   * </p>
   * @return  Returns a value of type RTExcelObj.Comment
   */

  @VTID(191)
  RTExcelObj.Comment comment();


  /**
   */

  @VTID(192)
  void clearComments();


  /**
   * <p>
   * Getter method for the COM property "Phonetic"
   * </p>
   * @return  Returns a value of type RTExcelObj.Phonetic
   */

  @VTID(193)
  RTExcelObj.Phonetic phonetic();


  /**
   * <p>
   * Getter method for the COM property "FormatConditions"
   * </p>
   * @return  Returns a value of type RTExcelObj.FormatConditions
   */

  @VTID(194)
  RTExcelObj.FormatConditions formatConditions();


  /**
   * <p>
   * Getter method for the COM property "ReadingOrder"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(195)
  int readingOrder();


  /**
   * <p>
   * Setter method for the COM property "ReadingOrder"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(196)
  void readingOrder(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "Hyperlinks"
   * </p>
   * @return  Returns a value of type RTExcelObj.Hyperlinks
   */

  @VTID(197)
  RTExcelObj.Hyperlinks hyperlinks();


  /**
   * <p>
   * Getter method for the COM property "Phonetics"
   * </p>
   * @return  Returns a value of type RTExcelObj.Phonetics
   */

  @VTID(198)
  RTExcelObj.Phonetics phonetics();


  /**
   */

  @VTID(199)
  void setPhonetic();


  /**
   * <p>
   * Getter method for the COM property "ID"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(200)
  java.lang.String id();


  /**
   * <p>
   * Setter method for the COM property "ID"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(201)
  void id(
    java.lang.String rhs);


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

  @VTID(202)
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
   * <p>
   * Getter method for the COM property "PivotCell"
   * </p>
   * @return  Returns a value of type RTExcelObj.PivotCell
   */

  @VTID(203)
  RTExcelObj.PivotCell pivotCell();


  /**
   */

  @VTID(204)
  void dirty();


  /**
   * <p>
   * Getter method for the COM property "Errors"
   * </p>
   * @return  Returns a value of type RTExcelObj.Errors
   */

  @VTID(205)
  RTExcelObj.Errors errors();


  /**
   * <p>
   * Getter method for the COM property "SmartTags"
   * </p>
   * @return  Returns a value of type RTExcelObj.SmartTags
   */

  @VTID(206)
  RTExcelObj.SmartTags smartTags();


  /**
   * @param speakDirection Optional parameter. Default value is com4j.Variant.getMissing()
   * @param speakFormulas Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @VTID(207)
  void speak(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object speakDirection,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object speakFormulas);


  /**
   * @param paste Optional parameter. Default value is -4104
   * @param operation Optional parameter. Default value is -4142
   * @param skipBlanks Optional parameter. Default value is com4j.Variant.getMissing()
   * @param transpose Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(208)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object pasteSpecial(
    @Optional @DefaultValue("-4104") RTExcelObj.XlPasteType paste,
    @Optional @DefaultValue("-4142") RTExcelObj.XlPasteSpecialOperation operation,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object skipBlanks,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object transpose);


  /**
   * <p>
   * Getter method for the COM property "AllowEdit"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(209)
  boolean allowEdit();


  /**
   * <p>
   * Getter method for the COM property "ListObject"
   * </p>
   * @return  Returns a value of type RTExcelObj.ListObject
   */

  @VTID(210)
  RTExcelObj.ListObject listObject();


  /**
   * <p>
   * Getter method for the COM property "XPath"
   * </p>
   * @return  Returns a value of type RTExcelObj.XPath
   */

  @VTID(211)
  RTExcelObj.XPath xPath();


  /**
   * <p>
   * Getter method for the COM property "ServerActions"
   * </p>
   * @return  Returns a value of type RTExcelObj.Actions
   */

  @VTID(212)
  RTExcelObj.Actions serverActions();


  /**
   * @param columns Optional parameter. Default value is com4j.Variant.getMissing()
   * @param header Optional parameter. Default value is 2
   */

  @VTID(213)
  void removeDuplicates(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object columns,
    @Optional @DefaultValue("2") RTExcelObj.XlYesNoGuess header);


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

  @VTID(214)
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
   * Getter method for the COM property "MDX"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(215)
  java.lang.String mdx();


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

  @VTID(216)
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
   * Getter method for the COM property "CountLarge"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(217)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object countLarge();


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(218)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object calculateRowMajorOrder();


  /**
   * <p>
   * Getter method for the COM property "SparklineGroups"
   * </p>
   * @return  Returns a value of type RTExcelObj.SparklineGroups
   */

  @VTID(219)
  RTExcelObj.SparklineGroups sparklineGroups();


  /**
   */

  @VTID(220)
  void clearHyperlinks();


  /**
   * <p>
   * Getter method for the COM property "DisplayFormat"
   * </p>
   * @return  Returns a value of type RTExcelObj.DisplayFormat
   */

  @VTID(221)
  RTExcelObj.DisplayFormat displayFormat();


  /**
   * @param lineStyle Optional parameter. Default value is com4j.Variant.getMissing()
   * @param weight Optional parameter. Default value is 2
   * @param colorIndex Optional parameter. Default value is -4105
   * @param color Optional parameter. Default value is com4j.Variant.getMissing()
   * @param themeColor Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(222)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object borderAround(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object lineStyle,
    @Optional @DefaultValue("2") RTExcelObj.XlBorderWeight weight,
    @Optional @DefaultValue("-4105") RTExcelObj.XlColorIndex colorIndex,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object color,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object themeColor);


  /**
   */

  @VTID(223)
  void allocateChanges();


  /**
   */

  @VTID(224)
  void discardChanges();


  /**
   */

  @VTID(225)
  void flashFill();


  // Properties:
}
