package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface RoutingSlip extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   */

  @DISPID(148)
  @PropGet
  RTExcelObj._Application application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   */

  @DISPID(149)
  @PropGet
  RTExcelObj.XlCreator creator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   */

  @DISPID(150)
  @PropGet
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "Delivery"
   * </p>
   */

  @DISPID(955)
  @PropGet
  RTExcelObj.XlRoutingSlipDelivery delivery();


  /**
   * <p>
   * Setter method for the COM property "Delivery"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlRoutingSlipDelivery parameter.
   */

  @DISPID(955)
  @PropPut
  void delivery(
    RTExcelObj.XlRoutingSlipDelivery rhs);


  /**
   * <p>
   * Getter method for the COM property "Message"
   * </p>
   */

  @DISPID(954)
  @PropGet
  java.lang.Object message();


  /**
   * <p>
   * Setter method for the COM property "Message"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(954)
  @PropPut
  void message(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "Recipients"
   * </p>
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(952)
  @PropGet
  java.lang.Object recipients(
    @Optional java.lang.Object index);


  /**
   * <p>
   * Setter method for the COM property "Recipients"
   * </p>
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(952)
  @PropPut
  void recipients(
    @Optional java.lang.Object index,
    java.lang.Object rhs);


  /**
   */

  @DISPID(555)
  java.lang.Object reset();


  /**
   * <p>
   * Getter method for the COM property "ReturnWhenDone"
   * </p>
   */

  @DISPID(956)
  @PropGet
  boolean returnWhenDone();


  /**
   * <p>
   * Setter method for the COM property "ReturnWhenDone"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(956)
  @PropPut
  void returnWhenDone(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Status"
   * </p>
   */

  @DISPID(958)
  @PropGet
  RTExcelObj.XlRoutingSlipStatus status();


  /**
   * <p>
   * Getter method for the COM property "Subject"
   * </p>
   */

  @DISPID(953)
  @PropGet
  java.lang.Object subject();


  /**
   * <p>
   * Setter method for the COM property "Subject"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(953)
  @PropPut
  void subject(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "TrackStatus"
   * </p>
   */

  @DISPID(957)
  @PropGet
  boolean trackStatus();


  /**
   * <p>
   * Setter method for the COM property "TrackStatus"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(957)
  @PropPut
  void trackStatus(
    boolean rhs);


  // Properties:
}
