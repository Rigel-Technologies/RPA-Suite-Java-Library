package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface ModelRelationships extends Com4jObject,Iterable<Com4jObject> {
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
   * Getter method for the COM property "Count"
   * </p>
   */

  @DISPID(118)
  @PropGet
  int count();


  /**
   * @param index Mandatory java.lang.Object parameter.
   */

  @DISPID(170)
  RTExcelObj.ModelRelationship item(
    java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   * @param index Mandatory java.lang.Object parameter.
   */

  @DISPID(0)
  @PropGet
  @DefaultMethod
  RTExcelObj.ModelRelationship _Default(
    java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4)
  @PropGet
  java.util.Iterator<Com4jObject> iterator();

  /**
   * @param foreignKeyColumn Mandatory RTExcelObj.ModelTableColumn parameter.
   * @param primaryKeyColumn Mandatory RTExcelObj.ModelTableColumn parameter.
   */

  @DISPID(181)
  RTExcelObj.ModelRelationship add(
    RTExcelObj.ModelTableColumn foreignKeyColumn,
    RTExcelObj.ModelTableColumn primaryKeyColumn);


  /**
   * @param pivotTable Mandatory RTExcelObj.PivotTable parameter.
   */

  @DISPID(3189)
  void detectRelationships(
    RTExcelObj.PivotTable pivotTable);


  // Properties:
}
