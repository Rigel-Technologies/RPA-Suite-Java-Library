package RTExcelObj  ;

import com4j.*;

@IID("{00020892-0001-0000-C000-000000000046}")
public interface IWindows extends Com4jObject,Iterable<Com4jObject> {
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
   * @param arrangeStyle Optional parameter. Default value is 1
   * @param activeWorkbook Optional parameter. Default value is com4j.Variant.getMissing()
   * @param syncHorizontal Optional parameter. Default value is com4j.Variant.getMissing()
   * @param syncVertical Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(10)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object arrange(
    @Optional @DefaultValue("1") RTExcelObj.XlArrangeStyle arrangeStyle,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object activeWorkbook,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object syncHorizontal,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object syncVertical);


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(11)
  int count();


  /**
   * <p>
   * Getter method for the COM property "Item"
   * </p>
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type RTExcelObj.Window
   */

  @VTID(12)
  RTExcelObj.Window item(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @VTID(13)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type RTExcelObj.Window
   */

  @VTID(14)
  @DefaultMethod
  RTExcelObj.Window _Default(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * @param windowName Mandatory java.lang.Object parameter.
   * @return  Returns a value of type boolean
   */

  @VTID(15)
  boolean compareSideBySideWith(
    @MarshalAs(NativeType.VARIANT) java.lang.Object windowName);


  /**
   * @return  Returns a value of type boolean
   */

  @VTID(16)
  boolean breakSideBySide();


  /**
   * <p>
   * Getter method for the COM property "SyncScrollingSideBySide"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(17)
  boolean syncScrollingSideBySide();


  /**
   * <p>
   * Setter method for the COM property "SyncScrollingSideBySide"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(18)
  void syncScrollingSideBySide(
    boolean rhs);


  /**
   */

  @VTID(19)
  void resetPositionsSideBySide();


  // Properties:
}
