package RTExcelObj  ;

import com4j.*;

@IID("{000244DB-0001-0000-C000-000000000046}")
public interface IModel extends Com4jObject {
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
   * Getter method for the COM property "ModelTables"
   * </p>
   * @return  Returns a value of type RTExcelObj.ModelTables
   */

  @VTID(10)
  RTExcelObj.ModelTables modelTables();


  /**
   * <p>
   * Getter method for the COM property "ModelRelationships"
   * </p>
   * @return  Returns a value of type RTExcelObj.ModelRelationships
   */

  @VTID(11)
  RTExcelObj.ModelRelationships modelRelationships();


  /**
   */

  @VTID(12)
  void refresh();


  /**
   * @param connectionToDataSource Mandatory RTExcelObj.WorkbookConnection parameter.
   * @return  Returns a value of type RTExcelObj.WorkbookConnection
   */

  @VTID(13)
  RTExcelObj.WorkbookConnection addConnection(
    RTExcelObj.WorkbookConnection connectionToDataSource);


  /**
   * @param modelTable Mandatory java.lang.Object parameter.
   * @return  Returns a value of type RTExcelObj.WorkbookConnection
   */

  @VTID(14)
  RTExcelObj.WorkbookConnection createModelWorkbookConnection(
    @MarshalAs(NativeType.VARIANT) java.lang.Object modelTable);


  /**
   * <p>
   * Getter method for the COM property "DataModelConnection"
   * </p>
   * @return  Returns a value of type RTExcelObj.WorkbookConnection
   */

  @VTID(15)
  RTExcelObj.WorkbookConnection dataModelConnection();


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(16)
  java.lang.String name();


  /**
   */

  @VTID(17)
  void initialize();


  /**
   * <p>
   * Getter method for the COM property "ModelMeasures"
   * </p>
   * @return  Returns a value of type RTExcelObj.ModelMeasures
   */

  @VTID(18)
  RTExcelObj.ModelMeasures modelMeasures();


  /**
   * <p>
   * Getter method for the COM property "ModelFormatGeneral"
   * </p>
   * @return  Returns a value of type RTExcelObj.ModelFormatGeneral
   */

  @VTID(19)
  RTExcelObj.ModelFormatGeneral modelFormatGeneral();


  /**
   * <p>
   * Getter method for the COM property "ModelFormatDate"
   * </p>
   * @param formatString Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type RTExcelObj.ModelFormatDate
   */

  @VTID(20)
  RTExcelObj.ModelFormatDate modelFormatDate(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object formatString);


  /**
   * <p>
   * Getter method for the COM property "ModelFormatDecimalNumber"
   * </p>
   * @param useThousandSeparator Optional parameter. Default value is com4j.Variant.getMissing()
   * @param decimalPlaces Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type RTExcelObj.ModelFormatDecimalNumber
   */

  @VTID(21)
  RTExcelObj.ModelFormatDecimalNumber modelFormatDecimalNumber(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object useThousandSeparator,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object decimalPlaces);


  /**
   * <p>
   * Getter method for the COM property "ModelFormatWholeNumber"
   * </p>
   * @param useThousandSeparator Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type RTExcelObj.ModelFormatWholeNumber
   */

  @VTID(22)
  RTExcelObj.ModelFormatWholeNumber modelFormatWholeNumber(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object useThousandSeparator);


  /**
   * <p>
   * Getter method for the COM property "ModelFormatPercentageNumber"
   * </p>
   * @param useThousandSeparator Optional parameter. Default value is com4j.Variant.getMissing()
   * @param decimalPlaces Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type RTExcelObj.ModelFormatPercentageNumber
   */

  @VTID(23)
  RTExcelObj.ModelFormatPercentageNumber modelFormatPercentageNumber(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object useThousandSeparator,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object decimalPlaces);


  /**
   * <p>
   * Getter method for the COM property "ModelFormatScientificNumber"
   * </p>
   * @param decimalPlaces Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type RTExcelObj.ModelFormatScientificNumber
   */

  @VTID(24)
  RTExcelObj.ModelFormatScientificNumber modelFormatScientificNumber(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object decimalPlaces);


  /**
   * <p>
   * Getter method for the COM property "ModelFormatCurrency"
   * </p>
   * @param symbol Optional parameter. Default value is com4j.Variant.getMissing()
   * @param decimalPlaces Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type RTExcelObj.ModelFormatCurrency
   */

  @VTID(25)
  RTExcelObj.ModelFormatCurrency modelFormatCurrency(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object symbol,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object decimalPlaces);


  /**
   * <p>
   * Getter method for the COM property "ModelFormatBoolean"
   * </p>
   * @return  Returns a value of type RTExcelObj.ModelFormatBoolean
   */

  @VTID(26)
  RTExcelObj.ModelFormatBoolean modelFormatBoolean();


  // Properties:
}
