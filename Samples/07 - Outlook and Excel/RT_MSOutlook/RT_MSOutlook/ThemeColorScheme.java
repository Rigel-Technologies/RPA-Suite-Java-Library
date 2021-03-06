package RT_MSOutlook  ;

import com4j.*;

@IID("{000C03A2-0000-0000-C000-000000000046}")
public interface ThemeColorScheme extends RT_MSOutlook._IMsoDispObj,Iterable<Com4jObject> {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(10)
  int count();


  /**
   * @param index Mandatory RT_MSOutlook.MsoThemeColorSchemeIndex parameter.
   * @return  Returns a value of type RT_MSOutlook.ThemeColor
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(11)
  @DefaultMethod
  RT_MSOutlook.ThemeColor colors(
    RT_MSOutlook.MsoThemeColorSchemeIndex index);


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(12)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * @param fileName Mandatory java.lang.String parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(13)
  void load(
    java.lang.String fileName);


  /**
   * @param fileName Mandatory java.lang.String parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(14)
  void save(
    java.lang.String fileName);


  /**
   * @param name Mandatory java.lang.String parameter.
   * @return  Returns a value of type int
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(15)
  int getCustomColor(
    java.lang.String name);


  // Properties:
}
