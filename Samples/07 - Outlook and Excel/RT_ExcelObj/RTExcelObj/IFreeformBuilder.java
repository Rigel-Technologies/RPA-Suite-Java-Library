package RTExcelObj  ;

import com4j.*;

@IID("{0002443F-0001-0000-C000-000000000046}")
public interface IFreeformBuilder extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type RTExcelObj._Application
   */

  @VTID(7)
  RTExcelObj._Application application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlCreator
   */

  @VTID(8)
  RTExcelObj.XlCreator creator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * @param segmentType Mandatory RTExcelObj.MsoSegmentType parameter.
   * @param editingType Mandatory RTExcelObj.MsoEditingType parameter.
   * @param x1 Mandatory float parameter.
   * @param y1 Mandatory float parameter.
   * @param x2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param y2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param x3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param y3 Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @VTID(10)
  void addNodes(
    RTExcelObj.MsoSegmentType segmentType,
    RTExcelObj.MsoEditingType editingType,
    float x1,
    float y1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object x2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object y2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object x3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object y3);


  /**
   * @return  Returns a value of type RTExcelObj.Shape
   */

  @VTID(11)
  RTExcelObj.Shape convertToShape();


  // Properties:
}
