package RT_MSOutlook  ;

import com4j.*;

@IID("{0006307E-0000-0000-C000-000000000046}")
public interface PropertyPage extends Com4jObject {
  // Methods:
  /**
   * @param helpFile Mandatory Holder<java.lang.String> parameter.
   * @param helpContext Mandatory Holder<Integer> parameter.
   */

  @VTID(7)
  void getPageInfo(
    Holder<java.lang.String> helpFile,
    Holder<Integer> helpContext);


  /**
   * <p>
   * Getter method for the COM property "Dirty"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(8)
  boolean dirty();


  /**
   */

  @VTID(9)
  void apply();


  // Properties:
}
