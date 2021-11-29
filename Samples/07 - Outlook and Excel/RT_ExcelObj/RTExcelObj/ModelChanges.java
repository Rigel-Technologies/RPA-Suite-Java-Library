package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface ModelChanges extends Com4jObject {
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
   * Getter method for the COM property "TablesAdded"
   * </p>
   */

  @DISPID(3145)
  @PropGet
  RTExcelObj.ModelTableNames tablesAdded();


  /**
   * <p>
   * Getter method for the COM property "TablesDeleted"
   * </p>
   */

  @DISPID(3146)
  @PropGet
  RTExcelObj.ModelTableNames tablesDeleted();


  /**
   * <p>
   * Getter method for the COM property "TablesModified"
   * </p>
   */

  @DISPID(3147)
  @PropGet
  RTExcelObj.ModelTableNames tablesModified();


  /**
   * <p>
   * Getter method for the COM property "TableNamesChanged"
   * </p>
   */

  @DISPID(3148)
  @PropGet
  RTExcelObj.ModelTableNameChanges tableNamesChanged();


  /**
   * <p>
   * Getter method for the COM property "RelationshipChange"
   * </p>
   */

  @DISPID(3149)
  @PropGet
  boolean relationshipChange();


  /**
   * <p>
   * Getter method for the COM property "ColumnsAdded"
   * </p>
   */

  @DISPID(3150)
  @PropGet
  RTExcelObj.ModelColumnNames columnsAdded();


  /**
   * <p>
   * Getter method for the COM property "ColumnsDeleted"
   * </p>
   */

  @DISPID(3151)
  @PropGet
  RTExcelObj.ModelColumnNames columnsDeleted();


  /**
   * <p>
   * Getter method for the COM property "ColumnsChanged"
   * </p>
   */

  @DISPID(3152)
  @PropGet
  RTExcelObj.ModelColumnChanges columnsChanged();


  /**
   * <p>
   * Getter method for the COM property "MeasuresAdded"
   * </p>
   */

  @DISPID(3153)
  @PropGet
  RTExcelObj.ModelMeasureNames measuresAdded();


  /**
   * <p>
   * Getter method for the COM property "UnknownChange"
   * </p>
   */

  @DISPID(3154)
  @PropGet
  boolean unknownChange();


  /**
   * <p>
   * Getter method for the COM property "Source"
   * </p>
   */

  @DISPID(222)
  @PropGet
  RTExcelObj.XlModelChangeSource source();


  // Properties:
}
