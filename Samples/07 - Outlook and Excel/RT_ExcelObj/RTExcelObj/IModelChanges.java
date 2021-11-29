package RTExcelObj  ;

import com4j.*;

@IID("{000244E4-0001-0000-C000-000000000046}")
public interface IModelChanges extends Com4jObject {
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
   * Getter method for the COM property "TablesAdded"
   * </p>
   * @return  Returns a value of type RTExcelObj.ModelTableNames
   */

  @VTID(10)
  RTExcelObj.ModelTableNames tablesAdded();


  /**
   * <p>
   * Getter method for the COM property "TablesDeleted"
   * </p>
   * @return  Returns a value of type RTExcelObj.ModelTableNames
   */

  @VTID(11)
  RTExcelObj.ModelTableNames tablesDeleted();


  /**
   * <p>
   * Getter method for the COM property "TablesModified"
   * </p>
   * @return  Returns a value of type RTExcelObj.ModelTableNames
   */

  @VTID(12)
  RTExcelObj.ModelTableNames tablesModified();


  /**
   * <p>
   * Getter method for the COM property "TableNamesChanged"
   * </p>
   * @return  Returns a value of type RTExcelObj.ModelTableNameChanges
   */

  @VTID(13)
  RTExcelObj.ModelTableNameChanges tableNamesChanged();


  /**
   * <p>
   * Getter method for the COM property "RelationshipChange"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(14)
  boolean relationshipChange();


  /**
   * <p>
   * Getter method for the COM property "ColumnsAdded"
   * </p>
   * @return  Returns a value of type RTExcelObj.ModelColumnNames
   */

  @VTID(15)
  RTExcelObj.ModelColumnNames columnsAdded();


  /**
   * <p>
   * Getter method for the COM property "ColumnsDeleted"
   * </p>
   * @return  Returns a value of type RTExcelObj.ModelColumnNames
   */

  @VTID(16)
  RTExcelObj.ModelColumnNames columnsDeleted();


  /**
   * <p>
   * Getter method for the COM property "ColumnsChanged"
   * </p>
   * @return  Returns a value of type RTExcelObj.ModelColumnChanges
   */

  @VTID(17)
  RTExcelObj.ModelColumnChanges columnsChanged();


  /**
   * <p>
   * Getter method for the COM property "MeasuresAdded"
   * </p>
   * @return  Returns a value of type RTExcelObj.ModelMeasureNames
   */

  @VTID(18)
  RTExcelObj.ModelMeasureNames measuresAdded();


  /**
   * <p>
   * Getter method for the COM property "UnknownChange"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(19)
  boolean unknownChange();


  /**
   * <p>
   * Getter method for the COM property "Source"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlModelChangeSource
   */

  @VTID(20)
  RTExcelObj.XlModelChangeSource source();


  // Properties:
}
