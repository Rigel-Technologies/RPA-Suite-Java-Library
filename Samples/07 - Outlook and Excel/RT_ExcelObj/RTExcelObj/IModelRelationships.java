package RTExcelObj  ;

import com4j.*;

@IID("{000244DA-0001-0000-C000-000000000046}")
public interface IModelRelationships extends Com4jObject,Iterable<Com4jObject> {
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
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(10)
  int count();


  /**
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type RTExcelObj.ModelRelationship
   */

  @VTID(11)
  RTExcelObj.ModelRelationship item(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type RTExcelObj.ModelRelationship
   */

  @VTID(12)
  @DefaultMethod
  RTExcelObj.ModelRelationship _Default(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @VTID(13)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * @param foreignKeyColumn Mandatory RTExcelObj.ModelTableColumn parameter.
   * @param primaryKeyColumn Mandatory RTExcelObj.ModelTableColumn parameter.
   * @return  Returns a value of type RTExcelObj.ModelRelationship
   */

  @VTID(14)
  RTExcelObj.ModelRelationship add(
    RTExcelObj.ModelTableColumn foreignKeyColumn,
    RTExcelObj.ModelTableColumn primaryKeyColumn);


  /**
   * @param pivotTable Mandatory RTExcelObj.PivotTable parameter.
   */

  @VTID(15)
  void detectRelationships(
    RTExcelObj.PivotTable pivotTable);


  // Properties:
}
