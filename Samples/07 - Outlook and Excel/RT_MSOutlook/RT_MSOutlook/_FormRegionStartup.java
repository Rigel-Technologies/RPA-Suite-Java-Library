package RT_MSOutlook  ;

import com4j.*;

@IID("{00063059-0000-0000-C000-000000000046}")
public interface _FormRegionStartup extends Com4jObject {
  // Methods:
  /**
   * @param formRegionName Mandatory java.lang.String parameter.
   * @param item Mandatory com4j.Com4jObject parameter.
   * @param lcid Mandatory int parameter.
   * @param formRegionMode Mandatory RT_MSOutlook.OlFormRegionMode parameter.
   * @param formRegionSize Mandatory RT_MSOutlook.OlFormRegionSize parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(64310) //= 0xfb36. The runtime will prefer the VTID if present
  @VTID(7)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getFormRegionStorage(
    java.lang.String formRegionName,
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject item,
    int lcid,
    RT_MSOutlook.OlFormRegionMode formRegionMode,
    RT_MSOutlook.OlFormRegionSize formRegionSize);


  /**
   * @param formRegion Mandatory RT_MSOutlook._FormRegion parameter.
   */

  @DISPID(64317) //= 0xfb3d. The runtime will prefer the VTID if present
  @VTID(8)
  void beforeFormRegionShow(
    RT_MSOutlook._FormRegion formRegion);


  /**
   * @param formRegionName Mandatory java.lang.String parameter.
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(64563) //= 0xfc33. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getFormRegionManifest(
    java.lang.String formRegionName,
    int lcid);


  /**
   * @param formRegionName Mandatory java.lang.String parameter.
   * @param lcid Mandatory int parameter.
   * @param icon Mandatory RT_MSOutlook.OlFormRegionIcon parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(64564) //= 0xfc34. The runtime will prefer the VTID if present
  @VTID(10)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getFormRegionIcon(
    java.lang.String formRegionName,
    int lcid,
    RT_MSOutlook.OlFormRegionIcon icon);


  // Properties:
}
