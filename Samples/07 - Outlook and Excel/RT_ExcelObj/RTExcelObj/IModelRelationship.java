package RTExcelObj  ;

import com4j.*;

@IID("{000244D9-0001-0000-C000-000000000046}")
public interface IModelRelationship extends Com4jObject {
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
   * Getter method for the COM property "ForeignKeyTable"
   * </p>
   * @return  Returns a value of type RTExcelObj.ModelTable
   */

  @VTID(10)
  RTExcelObj.ModelTable foreignKeyTable();


  /**
   * <p>
   * Getter method for the COM property "ForeignKeyColumn"
   * </p>
   * @return  Returns a value of type RTExcelObj.ModelTableColumn
   */

  @VTID(11)
  RTExcelObj.ModelTableColumn foreignKeyColumn();


  /**
   * <p>
   * Getter method for the COM property "PrimaryKeyTable"
   * </p>
   * @return  Returns a value of type RTExcelObj.ModelTable
   */

  @VTID(12)
  RTExcelObj.ModelTable primaryKeyTable();


  /**
   * <p>
   * Getter method for the COM property "PrimaryKeyColumn"
   * </p>
   * @return  Returns a value of type RTExcelObj.ModelTableColumn
   */

  @VTID(13)
  RTExcelObj.ModelTableColumn primaryKeyColumn();


  /**
   * <p>
   * Getter method for the COM property "Active"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(14)
  boolean active();


  /**
   * <p>
   * Setter method for the COM property "Active"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(15)
  void active(
    boolean rhs);


  /**
   */

  @VTID(16)
  void delete();


  // Properties:
}
