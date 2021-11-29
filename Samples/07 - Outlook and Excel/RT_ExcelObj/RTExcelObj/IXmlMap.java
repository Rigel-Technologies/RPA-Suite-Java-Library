package RTExcelObj  ;

import com4j.*;

@IID("{0002447B-0001-0000-C000-000000000046}")
public interface IXmlMap extends Com4jObject {
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
   * Getter method for the COM property "_Default"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(10)
  @DefaultMethod
  java.lang.String _Default();


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(11)
  java.lang.String name();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(12)
  void name(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "IsExportable"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(13)
  boolean isExportable();


  /**
   * <p>
   * Getter method for the COM property "ShowImportExportValidationErrors"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(14)
  boolean showImportExportValidationErrors();


  /**
   * <p>
   * Setter method for the COM property "ShowImportExportValidationErrors"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(15)
  void showImportExportValidationErrors(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "SaveDataSourceDefinition"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(16)
  boolean saveDataSourceDefinition();


  /**
   * <p>
   * Setter method for the COM property "SaveDataSourceDefinition"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(17)
  void saveDataSourceDefinition(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "AdjustColumnWidth"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(18)
  boolean adjustColumnWidth();


  /**
   * <p>
   * Setter method for the COM property "AdjustColumnWidth"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(19)
  void adjustColumnWidth(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "PreserveColumnFilter"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(20)
  boolean preserveColumnFilter();


  /**
   * <p>
   * Setter method for the COM property "PreserveColumnFilter"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(21)
  void preserveColumnFilter(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "PreserveNumberFormatting"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(22)
  boolean preserveNumberFormatting();


  /**
   * <p>
   * Setter method for the COM property "PreserveNumberFormatting"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(23)
  void preserveNumberFormatting(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "AppendOnImport"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(24)
  boolean appendOnImport();


  /**
   * <p>
   * Setter method for the COM property "AppendOnImport"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(25)
  void appendOnImport(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "RootElementName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(26)
  java.lang.String rootElementName();


  /**
   * <p>
   * Getter method for the COM property "RootElementNamespace"
   * </p>
   * @return  Returns a value of type RTExcelObj.XmlNamespace
   */

  @VTID(27)
  RTExcelObj.XmlNamespace rootElementNamespace();


  /**
   * <p>
   * Getter method for the COM property "Schemas"
   * </p>
   * @return  Returns a value of type RTExcelObj.XmlSchemas
   */

  @VTID(28)
  RTExcelObj.XmlSchemas schemas();


  /**
   * <p>
   * Getter method for the COM property "DataBinding"
   * </p>
   * @return  Returns a value of type RTExcelObj.XmlDataBinding
   */

  @VTID(29)
  RTExcelObj.XmlDataBinding dataBinding();


  /**
   */

  @VTID(30)
  void delete();


  /**
   * @param url Mandatory java.lang.String parameter.
   * @param overwrite Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type RTExcelObj.XlXmlImportResult
   */

  @VTID(31)
  RTExcelObj.XlXmlImportResult _import(
    java.lang.String url,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object overwrite);


  /**
   * @param xmlData Mandatory java.lang.String parameter.
   * @param overwrite Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type RTExcelObj.XlXmlImportResult
   */

  @VTID(32)
  RTExcelObj.XlXmlImportResult importXml(
    java.lang.String xmlData,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object overwrite);


  /**
   * @param url Mandatory java.lang.String parameter.
   * @param overwrite Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type RTExcelObj.XlXmlExportResult
   */

  @VTID(33)
  RTExcelObj.XlXmlExportResult export(
    java.lang.String url,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object overwrite);


  /**
   * @param data Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type RTExcelObj.XlXmlExportResult
   */

  @VTID(34)
  RTExcelObj.XlXmlExportResult exportXml(
    Holder<java.lang.String> data);


  /**
   * <p>
   * Getter method for the COM property "WorkbookConnection"
   * </p>
   * @return  Returns a value of type RTExcelObj.WorkbookConnection
   */

  @VTID(35)
  RTExcelObj.WorkbookConnection workbookConnection();


  // Properties:
}
