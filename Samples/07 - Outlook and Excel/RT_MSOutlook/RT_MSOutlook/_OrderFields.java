package RT_MSOutlook  ;

import com4j.*;

@IID("{0006309A-0000-0000-C000-000000000046}")
public interface _OrderFields extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type RT_MSOutlook._Application
   */

  @DISPID(61440) //= 0xf000. The runtime will prefer the VTID if present
  @VTID(7)
  RT_MSOutlook._Application application();


  /**
   * <p>
   * Getter method for the COM property "Class"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.OlObjectClass
   */

  @DISPID(61450) //= 0xf00a. The runtime will prefer the VTID if present
  @VTID(8)
  RT_MSOutlook.OlObjectClass _class();


  /**
   * <p>
   * Getter method for the COM property "Session"
   * </p>
   * @return  Returns a value of type RT_MSOutlook._NameSpace
   */

  @DISPID(61451) //= 0xf00b. The runtime will prefer the VTID if present
  @VTID(9)
  RT_MSOutlook._NameSpace session();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(61441) //= 0xf001. The runtime will prefer the VTID if present
  @VTID(10)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(80) //= 0x50. The runtime will prefer the VTID if present
  @VTID(11)
  int count();


  /**
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type RT_MSOutlook._OrderField
   */

  @DISPID(81) //= 0x51. The runtime will prefer the VTID if present
  @VTID(12)
  RT_MSOutlook._OrderField item(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * @param propertyName Mandatory java.lang.String parameter.
   * @param isDescending Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type RT_MSOutlook._OrderField
   */

  @DISPID(95) //= 0x5f. The runtime will prefer the VTID if present
  @VTID(13)
  RT_MSOutlook._OrderField add(
    java.lang.String propertyName,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object isDescending);


  /**
   * @param index Mandatory java.lang.Object parameter.
   */

  @DISPID(82) //= 0x52. The runtime will prefer the VTID if present
  @VTID(14)
  void remove(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   */

  @DISPID(64343) //= 0xfb57. The runtime will prefer the VTID if present
  @VTID(15)
  void removeAll();


  /**
   * @param propertyName Mandatory java.lang.String parameter.
   * @param index Mandatory java.lang.Object parameter.
   * @param isDescending Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type RT_MSOutlook._OrderField
   */

  @DISPID(64342) //= 0xfb56. The runtime will prefer the VTID if present
  @VTID(16)
  RT_MSOutlook._OrderField insert(
    java.lang.String propertyName,
    @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object isDescending);


  // Properties:
}
