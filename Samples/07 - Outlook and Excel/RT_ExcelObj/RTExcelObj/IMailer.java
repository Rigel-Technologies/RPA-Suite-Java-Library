package RTExcelObj  ;

import com4j.*;

@IID("{000208D1-0001-0000-C000-000000000046}")
public interface IMailer extends Com4jObject {
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
   * <p>
   * Getter method for the COM property "BCCRecipients"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(10)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object bccRecipients();


  /**
   * <p>
   * Setter method for the COM property "BCCRecipients"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(11)
  void bccRecipients(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "CCRecipients"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(12)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object ccRecipients();


  /**
   * <p>
   * Setter method for the COM property "CCRecipients"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(13)
  void ccRecipients(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "Enclosures"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(14)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object enclosures();


  /**
   * <p>
   * Setter method for the COM property "Enclosures"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(15)
  void enclosures(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "Received"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(16)
  boolean received();


  /**
   * <p>
   * Getter method for the COM property "SendDateTime"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @VTID(17)
  java.util.Date sendDateTime();


  /**
   * <p>
   * Getter method for the COM property "Sender"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(18)
  java.lang.String sender();


  /**
   * <p>
   * Getter method for the COM property "Subject"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(19)
  java.lang.String subject();


  /**
   * <p>
   * Setter method for the COM property "Subject"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(20)
  void subject(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "ToRecipients"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(21)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object toRecipients();


  /**
   * <p>
   * Setter method for the COM property "ToRecipients"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(22)
  void toRecipients(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "WhichAddress"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(23)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object whichAddress();


  /**
   * <p>
   * Setter method for the COM property "WhichAddress"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(24)
  void whichAddress(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  // Properties:
}
