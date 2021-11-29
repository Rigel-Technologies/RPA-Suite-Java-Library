package RTExcelObj  ;

import com4j.*;

@IID("{000C03D1-0000-0000-C000-000000000046}")
public interface PictureEffect extends RTExcelObj._IMsoDispObj {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type RTExcelObj.MsoPictureEffectType
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(9)
  @DefaultMethod
  RTExcelObj.MsoPictureEffectType type();


  /**
   * <p>
   * Setter method for the COM property "Position"
   * </p>
   * @param position Mandatory int parameter.
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(10)
  void position(
    int position);


  /**
   * <p>
   * Getter method for the COM property "Position"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(11)
  int position();


  /**
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(12)
  void delete();


  /**
   * <p>
   * Getter method for the COM property "EffectParameters"
   * </p>
   * @return  Returns a value of type RTExcelObj.EffectParameters
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(13)
  RTExcelObj.EffectParameters effectParameters();


  @VTID(13)
  @ReturnValue(defaultPropertyThrough={RTExcelObj.EffectParameters.class})
  RTExcelObj.EffectParameter effectParameters(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Setter method for the COM property "Visible"
   * </p>
   * @param visible Mandatory RTExcelObj.MsoTriState parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(14)
  void visible(
    RTExcelObj.MsoTriState visible);


  /**
   * <p>
   * Getter method for the COM property "Visible"
   * </p>
   * @return  Returns a value of type RTExcelObj.MsoTriState
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(15)
  RTExcelObj.MsoTriState visible();


  // Properties:
}
