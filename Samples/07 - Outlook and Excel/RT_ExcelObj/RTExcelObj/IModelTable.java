package RTExcelObj  ;

import com4j.*;

@IID("{000244D7-0001-0000-C000-000000000046}")
public interface IModelTable extends Com4jObject {
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
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(10)
  java.lang.String name();


  /**
   * <p>
   * Getter method for the COM property "SourceName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(11)
  java.lang.String sourceName();


  /**
   * <p>
   * Getter method for the COM property "ModelTableColumns"
   * </p>
   * @return  Returns a value of type RTExcelObj.ModelTableColumns
   */

  @VTID(12)
  RTExcelObj.ModelTableColumns modelTableColumns();


  /**
   * <p>
   * Getter method for the COM property "SourceWorkbookConnection"
   * </p>
   * @return  Returns a value of type RTExcelObj.WorkbookConnection
   */

  @VTID(13)
  RTExcelObj.WorkbookConnection sourceWorkbookConnection();


  /**
   */

  @VTID(14)
  void _Dummy7();


  /**
   */

  @VTID(15)
  void refresh();


  /**
   * <p>
   * Getter method for the COM property "RecordCount"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(16)
  int recordCount();


  /**
   * @param newName Mandatory java.lang.String parameter.
   */

  @VTID(17)
  void dummy1(
    java.lang.String newName);


  // Properties:
}
