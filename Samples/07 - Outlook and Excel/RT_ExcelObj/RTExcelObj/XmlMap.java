package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface XmlMap extends Com4jObject {
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
   * Getter method for the COM property "_Default"
   * </p>
   */

  @DISPID(0)
  @PropGet
  @DefaultMethod
  java.lang.String _Default();


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
   * Getter method for the COM property "IsExportable"
   * </p>
   */

  @DISPID(2334)
  @PropGet
  boolean isExportable();


  /**
   * <p>
   * Getter method for the COM property "ShowImportExportValidationErrors"
   * </p>
   */

  @DISPID(2335)
  @PropGet
  boolean showImportExportValidationErrors();


  /**
   * <p>
   * Setter method for the COM property "ShowImportExportValidationErrors"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2335)
  @PropPut
  void showImportExportValidationErrors(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "SaveDataSourceDefinition"
   * </p>
   */

  @DISPID(2336)
  @PropGet
  boolean saveDataSourceDefinition();


  /**
   * <p>
   * Setter method for the COM property "SaveDataSourceDefinition"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2336)
  @PropPut
  void saveDataSourceDefinition(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "AdjustColumnWidth"
   * </p>
   */

  @DISPID(1868)
  @PropGet
  boolean adjustColumnWidth();


  /**
   * <p>
   * Setter method for the COM property "AdjustColumnWidth"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1868)
  @PropPut
  void adjustColumnWidth(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "PreserveColumnFilter"
   * </p>
   */

  @DISPID(2337)
  @PropGet
  boolean preserveColumnFilter();


  /**
   * <p>
   * Setter method for the COM property "PreserveColumnFilter"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2337)
  @PropPut
  void preserveColumnFilter(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "PreserveNumberFormatting"
   * </p>
   */

  @DISPID(2338)
  @PropGet
  boolean preserveNumberFormatting();


  /**
   * <p>
   * Setter method for the COM property "PreserveNumberFormatting"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2338)
  @PropPut
  void preserveNumberFormatting(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "AppendOnImport"
   * </p>
   */

  @DISPID(2339)
  @PropGet
  boolean appendOnImport();


  /**
   * <p>
   * Setter method for the COM property "AppendOnImport"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2339)
  @PropPut
  void appendOnImport(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "RootElementName"
   * </p>
   */

  @DISPID(2340)
  @PropGet
  java.lang.String rootElementName();


  /**
   * <p>
   * Getter method for the COM property "RootElementNamespace"
   * </p>
   */

  @DISPID(2341)
  @PropGet
  RTExcelObj.XmlNamespace rootElementNamespace();


  /**
   * <p>
   * Getter method for the COM property "Schemas"
   * </p>
   */

  @DISPID(2342)
  @PropGet
  RTExcelObj.XmlSchemas schemas();


  /**
   * <p>
   * Getter method for the COM property "DataBinding"
   * </p>
   */

  @DISPID(2343)
  @PropGet
  RTExcelObj.XmlDataBinding dataBinding();


  /**
   */

  @DISPID(117)
  void delete();


  /**
   * @param url Mandatory java.lang.String parameter.
   * @param overwrite Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(917)
  RTExcelObj.XlXmlImportResult _import(
    java.lang.String url,
    @Optional java.lang.Object overwrite);


  /**
   * @param xmlData Mandatory java.lang.String parameter.
   * @param overwrite Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(2344)
  RTExcelObj.XlXmlImportResult importXml(
    java.lang.String xmlData,
    @Optional java.lang.Object overwrite);


  /**
   * @param url Mandatory java.lang.String parameter.
   * @param overwrite Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1414)
  RTExcelObj.XlXmlExportResult export(
    java.lang.String url,
    @Optional java.lang.Object overwrite);


  /**
   * @return  Returns a value of type RTExcelObj.XlXmlExportResult
   */

  @DISPID(2346)
  RTExcelObj.XlXmlExportResult exportXml();


  /**
   * <p>
   * Getter method for the COM property "WorkbookConnection"
   * </p>
   */

  @DISPID(2544)
  @PropGet
  RTExcelObj.WorkbookConnection workbookConnection();


  // Properties:
}
