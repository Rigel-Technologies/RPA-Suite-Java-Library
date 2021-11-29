package RTExcelObj  ;

import com4j.*;

@IID("{000244ED-0001-0000-C000-000000000046}")
public interface IModelMeasure extends Com4jObject {
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
   * Setter method for the COM property "Name"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(11)
  void name(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "AssociatedTable"
   * </p>
   * @return  Returns a value of type RTExcelObj.ModelTable
   */

  @VTID(12)
  RTExcelObj.ModelTable associatedTable();


  /**
   * <p>
   * Setter method for the COM property "AssociatedTable"
   * </p>
   * @param rhs Mandatory RTExcelObj.ModelTable parameter.
   */

  @VTID(13)
  void associatedTable(
    RTExcelObj.ModelTable rhs);


  /**
   * <p>
   * Getter method for the COM property "Formula"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(14)
  java.lang.String formula();


  /**
   * <p>
   * Setter method for the COM property "Formula"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(15)
  void formula(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "FormatInformation"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(16)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object formatInformation();


  /**
   * <p>
   * Setter method for the COM property "FormatInformation"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(17)
  void formatInformation(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "Description"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(18)
  java.lang.String description();


  /**
   * <p>
   * Setter method for the COM property "Description"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(19)
  void description(
    java.lang.String rhs);


  /**
   */

  @VTID(20)
  void delete();


  // Properties:
}
