package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface HeaderFooter extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Text"
   * </p>
   */

  @DISPID(138)
  @PropGet
  java.lang.String text();


  /**
   * <p>
   * Setter method for the COM property "Text"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(138)
  @PropPut
  void text(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Picture"
   * </p>
   */

  @DISPID(479)
  @PropGet
  RTExcelObj.Graphic picture();


  // Properties:
}
