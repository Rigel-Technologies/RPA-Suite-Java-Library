package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface UserAccess extends Com4jObject {
  // Methods:
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
   * Getter method for the COM property "AllowEdit"
   * </p>
   */

  @DISPID(2020)
  @PropGet
  boolean allowEdit();


  /**
   * <p>
   * Setter method for the COM property "AllowEdit"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2020)
  @PropPut
  void allowEdit(
    boolean rhs);


  /**
   */

  @DISPID(117)
  void delete();


  // Properties:
}
