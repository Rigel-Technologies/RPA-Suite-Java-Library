package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface Model extends Com4jObject {
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
   * Getter method for the COM property "ModelTables"
   * </p>
   */

  @DISPID(3106)
  @PropGet
  RTExcelObj.ModelTables modelTables();


  /**
   * <p>
   * Getter method for the COM property "ModelRelationships"
   * </p>
   */

  @DISPID(3126)
  @PropGet
  RTExcelObj.ModelRelationships modelRelationships();


  /**
   */

  @DISPID(1417)
  void refresh();


  /**
   * @param connectionToDataSource Mandatory RTExcelObj.WorkbookConnection parameter.
   */

  @DISPID(3127)
  RTExcelObj.WorkbookConnection addConnection(
    RTExcelObj.WorkbookConnection connectionToDataSource);


  /**
   * @param modelTable Mandatory java.lang.Object parameter.
   */

  @DISPID(3129)
  RTExcelObj.WorkbookConnection createModelWorkbookConnection(
    java.lang.Object modelTable);


  /**
   * <p>
   * Getter method for the COM property "DataModelConnection"
   * </p>
   */

  @DISPID(3131)
  @PropGet
  RTExcelObj.WorkbookConnection dataModelConnection();


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   */

  @DISPID(110)
  @PropGet
  java.lang.String name();


  /**
   */

  @DISPID(3132)
  void initialize();


  /**
   * <p>
   * Getter method for the COM property "ModelMeasures"
   * </p>
   */

  @DISPID(3190)
  @PropGet
  RTExcelObj.ModelMeasures modelMeasures();


  /**
   * <p>
   * Getter method for the COM property "ModelFormatGeneral"
   * </p>
   */

  @DISPID(3191)
  @PropGet
  RTExcelObj.ModelFormatGeneral modelFormatGeneral();


  /**
   * <p>
   * Getter method for the COM property "ModelFormatDate"
   * </p>
   * @param formatString Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(3192)
  @PropGet
  RTExcelObj.ModelFormatDate modelFormatDate(
    @Optional java.lang.Object formatString);


  /**
   * <p>
   * Getter method for the COM property "ModelFormatDecimalNumber"
   * </p>
   * @param useThousandSeparator Optional parameter. Default value is com4j.Variant.getMissing()
   * @param decimalPlaces Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(3194)
  @PropGet
  RTExcelObj.ModelFormatDecimalNumber modelFormatDecimalNumber(
    @Optional java.lang.Object useThousandSeparator,
    @Optional java.lang.Object decimalPlaces);


  /**
   * <p>
   * Getter method for the COM property "ModelFormatWholeNumber"
   * </p>
   * @param useThousandSeparator Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(3196)
  @PropGet
  RTExcelObj.ModelFormatWholeNumber modelFormatWholeNumber(
    @Optional java.lang.Object useThousandSeparator);


  /**
   * <p>
   * Getter method for the COM property "ModelFormatPercentageNumber"
   * </p>
   * @param useThousandSeparator Optional parameter. Default value is com4j.Variant.getMissing()
   * @param decimalPlaces Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(3197)
  @PropGet
  RTExcelObj.ModelFormatPercentageNumber modelFormatPercentageNumber(
    @Optional java.lang.Object useThousandSeparator,
    @Optional java.lang.Object decimalPlaces);


  /**
   * <p>
   * Getter method for the COM property "ModelFormatScientificNumber"
   * </p>
   * @param decimalPlaces Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(3198)
  @PropGet
  RTExcelObj.ModelFormatScientificNumber modelFormatScientificNumber(
    @Optional java.lang.Object decimalPlaces);


  /**
   * <p>
   * Getter method for the COM property "ModelFormatCurrency"
   * </p>
   * @param symbol Optional parameter. Default value is com4j.Variant.getMissing()
   * @param decimalPlaces Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(3199)
  @PropGet
  RTExcelObj.ModelFormatCurrency modelFormatCurrency(
    @Optional java.lang.Object symbol,
    @Optional java.lang.Object decimalPlaces);


  /**
   * <p>
   * Getter method for the COM property "ModelFormatBoolean"
   * </p>
   */

  @DISPID(3201)
  @PropGet
  RTExcelObj.ModelFormatBoolean modelFormatBoolean();


  // Properties:
}
