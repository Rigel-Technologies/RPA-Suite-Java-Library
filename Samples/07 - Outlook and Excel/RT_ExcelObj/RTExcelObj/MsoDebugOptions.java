package RTExcelObj  ;

import com4j.*;

@IID("{000C035A-0000-0000-C000-000000000046}")
public interface MsoDebugOptions extends RTExcelObj._IMsoDispObj {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "FeatureReports"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(9)
  int featureReports();


  /**
   * <p>
   * Setter method for the COM property "FeatureReports"
   * </p>
   * @param puintFeatureReports Mandatory int parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(10)
  void featureReports(
    int puintFeatureReports);


  /**
   * <p>
   * Getter method for the COM property "OutputToDebugger"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(11)
  boolean outputToDebugger();


  /**
   * <p>
   * Setter method for the COM property "OutputToDebugger"
   * </p>
   * @param pvarfOutputToDebugger Mandatory boolean parameter.
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(12)
  void outputToDebugger(
    boolean pvarfOutputToDebugger);


  /**
   * <p>
   * Getter method for the COM property "OutputToFile"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(13)
  boolean outputToFile();


  /**
   * <p>
   * Setter method for the COM property "OutputToFile"
   * </p>
   * @param pvarfOutputToFile Mandatory boolean parameter.
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(14)
  void outputToFile(
    boolean pvarfOutputToFile);


  /**
   * <p>
   * Getter method for the COM property "OutputToMessageBox"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(15)
  boolean outputToMessageBox();


  /**
   * <p>
   * Setter method for the COM property "OutputToMessageBox"
   * </p>
   * @param pvarfOutputToMessageBox Mandatory boolean parameter.
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(16)
  void outputToMessageBox(
    boolean pvarfOutputToMessageBox);


  /**
   * <p>
   * Getter method for the COM property "UnitTestManager"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(17)
  com4j.Com4jObject unitTestManager();


  /**
   * @param bstrTagToIgnore Mandatory java.lang.String parameter.
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(18)
  void addIgnoredAssertTag(
    java.lang.String bstrTagToIgnore);


  /**
   * @param bstrTagToIgnore Mandatory java.lang.String parameter.
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(19)
  void removeIgnoredAssertTag(
    java.lang.String bstrTagToIgnore);


  // Properties:
}
