package RT_MSOutlook  ;

import com4j.*;

@IID("{000C03E3-0000-0000-C000-000000000046}")
public interface PickerProperties extends RT_MSOutlook._IMsoDispObj,Iterable<Com4jObject> {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Item"
   * </p>
   * @param index Mandatory int parameter.
   * @return  Returns a value of type RT_MSOutlook.PickerProperty
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(9)
  @DefaultMethod
  RT_MSOutlook.PickerProperty item(
    int index);


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(10)
  int count();


  /**
   * @param id Mandatory java.lang.String parameter.
   * @param value Mandatory java.lang.String parameter.
   * @param type Mandatory RT_MSOutlook.MsoPickerField parameter.
   * @return  Returns a value of type RT_MSOutlook.PickerProperty
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(11)
  RT_MSOutlook.PickerProperty add(
    java.lang.String id,
    java.lang.String value,
    RT_MSOutlook.MsoPickerField type);


  /**
   * @param id Mandatory java.lang.String parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(12)
  void remove(
    java.lang.String id);


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(13)
  java.util.Iterator<Com4jObject> iterator();

  // Properties:
}
