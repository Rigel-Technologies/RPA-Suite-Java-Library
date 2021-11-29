package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface Mailer extends Com4jObject {
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
   * Getter method for the COM property "BCCRecipients"
   * </p>
   */

  @DISPID(983)
  @PropGet
  java.lang.Object bccRecipients();


  /**
   * <p>
   * Setter method for the COM property "BCCRecipients"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(983)
  @PropPut
  void bccRecipients(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "CCRecipients"
   * </p>
   */

  @DISPID(982)
  @PropGet
  java.lang.Object ccRecipients();


  /**
   * <p>
   * Setter method for the COM property "CCRecipients"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(982)
  @PropPut
  void ccRecipients(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "Enclosures"
   * </p>
   */

  @DISPID(984)
  @PropGet
  java.lang.Object enclosures();


  /**
   * <p>
   * Setter method for the COM property "Enclosures"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(984)
  @PropPut
  void enclosures(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "Received"
   * </p>
   */

  @DISPID(986)
  @PropGet
  boolean received();


  /**
   * <p>
   * Getter method for the COM property "SendDateTime"
   * </p>
   */

  @DISPID(987)
  @PropGet
  java.util.Date sendDateTime();


  /**
   * <p>
   * Getter method for the COM property "Sender"
   * </p>
   */

  @DISPID(988)
  @PropGet
  java.lang.String sender();


  /**
   * <p>
   * Getter method for the COM property "Subject"
   * </p>
   */

  @DISPID(953)
  @PropGet
  java.lang.String subject();


  /**
   * <p>
   * Setter method for the COM property "Subject"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(953)
  @PropPut
  void subject(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "ToRecipients"
   * </p>
   */

  @DISPID(981)
  @PropGet
  java.lang.Object toRecipients();


  /**
   * <p>
   * Setter method for the COM property "ToRecipients"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(981)
  @PropPut
  void toRecipients(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "WhichAddress"
   * </p>
   */

  @DISPID(974)
  @PropGet
  java.lang.Object whichAddress();


  /**
   * <p>
   * Setter method for the COM property "WhichAddress"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(974)
  @PropPut
  void whichAddress(
    java.lang.Object rhs);


  // Properties:
}
