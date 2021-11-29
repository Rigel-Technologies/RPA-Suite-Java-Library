package RT_MSOutlook  ;

import com4j.*;

@IID("{000630C2-0000-0000-C000-000000000046}")
public interface Conflicts extends Com4jObject {
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
   * @return  Returns a value of type RT_MSOutlook.Conflict
   */

  @DISPID(81) //= 0x51. The runtime will prefer the VTID if present
  @VTID(12)
  RT_MSOutlook.Conflict item(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * @return  Returns a value of type RT_MSOutlook.Conflict
   */

  @DISPID(86) //= 0x56. The runtime will prefer the VTID if present
  @VTID(13)
  RT_MSOutlook.Conflict getFirst();


  /**
   * @return  Returns a value of type RT_MSOutlook.Conflict
   */

  @DISPID(88) //= 0x58. The runtime will prefer the VTID if present
  @VTID(14)
  RT_MSOutlook.Conflict getLast();


  /**
   * @return  Returns a value of type RT_MSOutlook.Conflict
   */

  @DISPID(87) //= 0x57. The runtime will prefer the VTID if present
  @VTID(15)
  RT_MSOutlook.Conflict getNext();


  /**
   * @return  Returns a value of type RT_MSOutlook.Conflict
   */

  @DISPID(89) //= 0x59. The runtime will prefer the VTID if present
  @VTID(16)
  RT_MSOutlook.Conflict getPrevious();


  // Properties:
}
