package RTExcelObj  ;

import com4j.*;

@IID("{0002443E-0001-0000-C000-000000000046}")
public interface IConnectorFormat extends Com4jObject {
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
   * @param connectedShape Mandatory RTExcelObj.Shape parameter.
   * @param connectionSite Mandatory int parameter.
   */

  @VTID(10)
  void beginConnect(
    RTExcelObj.Shape connectedShape,
    int connectionSite);


  /**
   */

  @VTID(11)
  void beginDisconnect();


  /**
   * @param connectedShape Mandatory RTExcelObj.Shape parameter.
   * @param connectionSite Mandatory int parameter.
   */

  @VTID(12)
  void endConnect(
    RTExcelObj.Shape connectedShape,
    int connectionSite);


  /**
   */

  @VTID(13)
  void endDisconnect();


  /**
   * <p>
   * Getter method for the COM property "BeginConnected"
   * </p>
   * @return  Returns a value of type RTExcelObj.MsoTriState
   */

  @VTID(14)
  RTExcelObj.MsoTriState beginConnected();


  /**
   * <p>
   * Getter method for the COM property "BeginConnectedShape"
   * </p>
   * @return  Returns a value of type RTExcelObj.Shape
   */

  @VTID(15)
  RTExcelObj.Shape beginConnectedShape();


  /**
   * <p>
   * Getter method for the COM property "BeginConnectionSite"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(16)
  int beginConnectionSite();


  /**
   * <p>
   * Getter method for the COM property "EndConnected"
   * </p>
   * @return  Returns a value of type RTExcelObj.MsoTriState
   */

  @VTID(17)
  RTExcelObj.MsoTriState endConnected();


  /**
   * <p>
   * Getter method for the COM property "EndConnectedShape"
   * </p>
   * @return  Returns a value of type RTExcelObj.Shape
   */

  @VTID(18)
  RTExcelObj.Shape endConnectedShape();


  /**
   * <p>
   * Getter method for the COM property "EndConnectionSite"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(19)
  int endConnectionSite();


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type RTExcelObj.MsoConnectorType
   */

  @VTID(20)
  RTExcelObj.MsoConnectorType type();


  /**
   * <p>
   * Setter method for the COM property "Type"
   * </p>
   * @param rhs Mandatory RTExcelObj.MsoConnectorType parameter.
   */

  @VTID(21)
  void type(
    RTExcelObj.MsoConnectorType rhs);


  // Properties:
}
