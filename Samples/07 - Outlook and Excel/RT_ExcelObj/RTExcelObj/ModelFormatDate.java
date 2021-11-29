package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface ModelFormatDate extends Com4jObject {
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
   * Getter method for the COM property "FormatString"
   * </p>
   */

  @DISPID(3193)
  @PropGet
  java.lang.String formatString();


  /**
   * <p>
   * Setter method for the COM property "FormatString"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(3193)
  @PropPut
  void formatString(
    java.lang.String rhs);


  // Properties:
}