package RT_MSOutlook  ;

import com4j.*;

@IID("{000672F8-0000-0000-C000-000000000046}")
public interface _OlkPageControl extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Page"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.OlPageType
   */

  @DISPID(64465) //= 0xfbd1. The runtime will prefer the VTID if present
  @VTID(7)
  RT_MSOutlook.OlPageType page();


  /**
   * <p>
   * Setter method for the COM property "Page"
   * </p>
   * @param pageID Mandatory RT_MSOutlook.OlPageType parameter.
   */

  @DISPID(64465) //= 0xfbd1. The runtime will prefer the VTID if present
  @VTID(8)
  void page(
    RT_MSOutlook.OlPageType pageID);


  // Properties:
}
