package RT_MSOutlook  ;

import com4j.*;

@IID("{0006300C-0000-0000-C000-000000000046}")
public interface _Results extends Com4jObject {
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
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(81) //= 0x51. The runtime will prefer the VTID if present
  @VTID(12)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject item(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "RawTable"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(90) //= 0x5a. The runtime will prefer the VTID if present
  @VTID(13)
  com4j.Com4jObject rawTable();


  /**
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(86) //= 0x56. The runtime will prefer the VTID if present
  @VTID(14)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject getFirst();


  /**
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(88) //= 0x58. The runtime will prefer the VTID if present
  @VTID(15)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject getLast();


  /**
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(87) //= 0x57. The runtime will prefer the VTID if present
  @VTID(16)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject getNext();


  /**
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(89) //= 0x59. The runtime will prefer the VTID if present
  @VTID(17)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject getPrevious();


  /**
   */

  @DISPID(93) //= 0x5d. The runtime will prefer the VTID if present
  @VTID(18)
  void resetColumns();


  /**
   * @param columns Mandatory java.lang.String parameter.
   */

  @DISPID(92) //= 0x5c. The runtime will prefer the VTID if present
  @VTID(19)
  void setColumns(
    java.lang.String columns);


  /**
   * @param property Mandatory java.lang.String parameter.
   * @param descending Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(97) //= 0x61. The runtime will prefer the VTID if present
  @VTID(20)
  void sort(
    java.lang.String property,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object descending);


  /**
   * <p>
   * Getter method for the COM property "DefaultItemType"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.OlItemType
   */

  @DISPID(64143) //= 0xfa8f. The runtime will prefer the VTID if present
  @VTID(21)
  RT_MSOutlook.OlItemType defaultItemType();


  /**
   * <p>
   * Setter method for the COM property "DefaultItemType"
   * </p>
   * @param defaultItemType Mandatory RT_MSOutlook.OlItemType parameter.
   */

  @DISPID(64143) //= 0xfa8f. The runtime will prefer the VTID if present
  @VTID(22)
  void defaultItemType(
    RT_MSOutlook.OlItemType defaultItemType);


  // Properties:
}
