package RTExcelObj  ;

import com4j.*;

@IID("{000244A1-0001-0000-C000-000000000046}")
public interface IHeaderFooter extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Text"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(7)
  java.lang.String text();


  /**
   * <p>
   * Setter method for the COM property "Text"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(8)
  void text(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Picture"
   * </p>
   * @return  Returns a value of type RTExcelObj.Graphic
   */

  @VTID(9)
  RTExcelObj.Graphic picture();


  // Properties:
}
