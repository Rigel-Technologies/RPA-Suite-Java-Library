package RTExcelObj  ;

import com4j.*;

@IID("{000C1733-0000-0000-C000-000000000046}")
public interface IMsoCategory extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(7)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(8)
  java.lang.String name();


  /**
   * <p>
   * Getter method for the COM property "IsFiltered"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(9)
  boolean isFiltered();


  /**
   * <p>
   * Setter method for the COM property "IsFiltered"
   * </p>
   * @param pfIsFiltered Mandatory boolean parameter.
   */

  @VTID(10)
  void isFiltered(
    boolean pfIsFiltered);


  // Properties:
}
