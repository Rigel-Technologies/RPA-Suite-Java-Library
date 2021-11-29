package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface ModelMeasure extends Com4jObject {
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
   * Getter method for the COM property "AssociatedTable"
   * </p>
   */

  @DISPID(3204)
  @PropGet
  RTExcelObj.ModelTable associatedTable();


  /**
   * <p>
   * Setter method for the COM property "AssociatedTable"
   * </p>
   * @param rhs Mandatory RTExcelObj.ModelTable parameter.
   */

  @DISPID(3204)
  @PropPut
  void associatedTable(
    RTExcelObj.ModelTable rhs);


  /**
   * <p>
   * Getter method for the COM property "Formula"
   * </p>
   */

  @DISPID(261)
  @PropGet
  java.lang.String formula();


  /**
   * <p>
   * Setter method for the COM property "Formula"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(261)
  @PropPut
  void formula(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "FormatInformation"
   * </p>
   */

  @DISPID(3205)
  @PropGet
  java.lang.Object formatInformation();


  /**
   * <p>
   * Setter method for the COM property "FormatInformation"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(3205)
  @PropPut
  void formatInformation(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "Description"
   * </p>
   */

  @DISPID(218)
  @PropGet
  java.lang.String description();


  /**
   * <p>
   * Setter method for the COM property "Description"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(218)
  @PropPut
  void description(
    java.lang.String rhs);


  /**
   */

  @DISPID(117)
  void delete();


  // Properties:
}
