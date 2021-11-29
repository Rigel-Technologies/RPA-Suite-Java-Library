package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface ModelRelationship extends Com4jObject {
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
   * Getter method for the COM property "ForeignKeyTable"
   * </p>
   */

  @DISPID(3122)
  @PropGet
  RTExcelObj.ModelTable foreignKeyTable();


  /**
   * <p>
   * Getter method for the COM property "ForeignKeyColumn"
   * </p>
   */

  @DISPID(3123)
  @PropGet
  RTExcelObj.ModelTableColumn foreignKeyColumn();


  /**
   * <p>
   * Getter method for the COM property "PrimaryKeyTable"
   * </p>
   */

  @DISPID(3124)
  @PropGet
  RTExcelObj.ModelTable primaryKeyTable();


  /**
   * <p>
   * Getter method for the COM property "PrimaryKeyColumn"
   * </p>
   */

  @DISPID(3125)
  @PropGet
  RTExcelObj.ModelTableColumn primaryKeyColumn();


  /**
   * <p>
   * Getter method for the COM property "Active"
   * </p>
   */

  @DISPID(2312)
  @PropGet
  boolean active();


  /**
   * <p>
   * Setter method for the COM property "Active"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2312)
  @PropPut
  void active(
    boolean rhs);


  /**
   */

  @DISPID(117)
  void delete();


  // Properties:
}
