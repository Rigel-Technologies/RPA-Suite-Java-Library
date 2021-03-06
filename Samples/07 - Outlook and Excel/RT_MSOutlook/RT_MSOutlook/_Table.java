package RT_MSOutlook  ;

import com4j.*;

@IID("{000630D2-0000-0000-C000-000000000046}")
public interface _Table extends Com4jObject {
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
   * @param filter Mandatory java.lang.String parameter.
   * @return  Returns a value of type RT_MSOutlook._Row
   */

  @DISPID(98) //= 0x62. The runtime will prefer the VTID if present
  @VTID(11)
  RT_MSOutlook._Row findRow(
    java.lang.String filter);


  /**
   * @return  Returns a value of type RT_MSOutlook._Row
   */

  @DISPID(99) //= 0x63. The runtime will prefer the VTID if present
  @VTID(12)
  RT_MSOutlook._Row findNextRow();


  /**
   * @param maxRows Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(64463) //= 0xfbcf. The runtime will prefer the VTID if present
  @VTID(13)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getArray(
    int maxRows);


  /**
   * @return  Returns a value of type RT_MSOutlook._Row
   */

  @DISPID(87) //= 0x57. The runtime will prefer the VTID if present
  @VTID(14)
  RT_MSOutlook._Row getNextRow();


  /**
   * @return  Returns a value of type int
   */

  @DISPID(80) //= 0x50. The runtime will prefer the VTID if present
  @VTID(15)
  int getRowCount();


  /**
   */

  @DISPID(64286) //= 0xfb1e. The runtime will prefer the VTID if present
  @VTID(16)
  void moveToStart();


  /**
   * @param filter Mandatory java.lang.String parameter.
   * @return  Returns a value of type RT_MSOutlook._Table
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(17)
  RT_MSOutlook._Table restrict(
    java.lang.String filter);


  /**
   * @param sortProperty Mandatory java.lang.String parameter.
   * @param descending Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(97) //= 0x61. The runtime will prefer the VTID if present
  @VTID(18)
  void sort(
    java.lang.String sortProperty,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object descending);


  /**
   * <p>
   * Getter method for the COM property "Columns"
   * </p>
   * @return  Returns a value of type RT_MSOutlook._Columns
   */

  @DISPID(64403) //= 0xfb93. The runtime will prefer the VTID if present
  @VTID(19)
  RT_MSOutlook._Columns columns();


  /**
   * <p>
   * Getter method for the COM property "EndOfTable"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64287) //= 0xfb1f. The runtime will prefer the VTID if present
  @VTID(20)
  boolean endOfTable();


  // Properties:
}
