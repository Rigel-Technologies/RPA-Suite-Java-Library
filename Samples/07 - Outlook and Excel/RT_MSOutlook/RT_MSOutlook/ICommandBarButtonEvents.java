package RT_MSOutlook  ;

import com4j.*;

@IID("{55F88890-7708-11D1-ACEB-006008961DA5}")
public interface ICommandBarButtonEvents extends Com4jObject {
  // Methods:
  /**
   * @param ctrl Mandatory RT_MSOutlook._CommandBarButton parameter.
   * @param cancelDefault Mandatory Holder<Boolean> parameter.
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  void click(
    RT_MSOutlook._CommandBarButton ctrl,
    Holder<Boolean> cancelDefault);


  // Properties:
}
