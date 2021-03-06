package RTExcelObj  ;

import com4j.*;

@IID("{00024449-0000-0000-C000-000000000046}")
public interface WebOptions extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type RTExcelObj._Application
   */

  @DISPID(148) //= 0x94. The runtime will prefer the VTID if present
  @VTID(7)
  RTExcelObj._Application application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlCreator
   */

  @DISPID(149) //= 0x95. The runtime will prefer the VTID if present
  @VTID(8)
  RTExcelObj.XlCreator creator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(150) //= 0x96. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "RelyOnCSS"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1899) //= 0x76b. The runtime will prefer the VTID if present
  @VTID(10)
  boolean relyOnCSS();


  /**
   * <p>
   * Setter method for the COM property "RelyOnCSS"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1899) //= 0x76b. The runtime will prefer the VTID if present
  @VTID(11)
  void relyOnCSS(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "OrganizeInFolder"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1902) //= 0x76e. The runtime will prefer the VTID if present
  @VTID(12)
  boolean organizeInFolder();


  /**
   * <p>
   * Setter method for the COM property "OrganizeInFolder"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1902) //= 0x76e. The runtime will prefer the VTID if present
  @VTID(13)
  void organizeInFolder(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "UseLongFileNames"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1904) //= 0x770. The runtime will prefer the VTID if present
  @VTID(14)
  boolean useLongFileNames();


  /**
   * <p>
   * Setter method for the COM property "UseLongFileNames"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1904) //= 0x770. The runtime will prefer the VTID if present
  @VTID(15)
  void useLongFileNames(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DownloadComponents"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1906) //= 0x772. The runtime will prefer the VTID if present
  @VTID(16)
  boolean downloadComponents();


  /**
   * <p>
   * Setter method for the COM property "DownloadComponents"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1906) //= 0x772. The runtime will prefer the VTID if present
  @VTID(17)
  void downloadComponents(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "RelyOnVML"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1907) //= 0x773. The runtime will prefer the VTID if present
  @VTID(18)
  boolean relyOnVML();


  /**
   * <p>
   * Setter method for the COM property "RelyOnVML"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1907) //= 0x773. The runtime will prefer the VTID if present
  @VTID(19)
  void relyOnVML(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "AllowPNG"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1908) //= 0x774. The runtime will prefer the VTID if present
  @VTID(20)
  boolean allowPNG();


  /**
   * <p>
   * Setter method for the COM property "AllowPNG"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1908) //= 0x774. The runtime will prefer the VTID if present
  @VTID(21)
  void allowPNG(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ScreenSize"
   * </p>
   * @return  Returns a value of type RTExcelObj.MsoScreenSize
   */

  @DISPID(1909) //= 0x775. The runtime will prefer the VTID if present
  @VTID(22)
  RTExcelObj.MsoScreenSize screenSize();


  /**
   * <p>
   * Setter method for the COM property "ScreenSize"
   * </p>
   * @param rhs Mandatory RTExcelObj.MsoScreenSize parameter.
   */

  @DISPID(1909) //= 0x775. The runtime will prefer the VTID if present
  @VTID(23)
  void screenSize(
    RTExcelObj.MsoScreenSize rhs);


  /**
   * <p>
   * Getter method for the COM property "PixelsPerInch"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1910) //= 0x776. The runtime will prefer the VTID if present
  @VTID(24)
  int pixelsPerInch();


  /**
   * <p>
   * Setter method for the COM property "PixelsPerInch"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(1910) //= 0x776. The runtime will prefer the VTID if present
  @VTID(25)
  void pixelsPerInch(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "LocationOfComponents"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1911) //= 0x777. The runtime will prefer the VTID if present
  @VTID(26)
  java.lang.String locationOfComponents();


  /**
   * <p>
   * Setter method for the COM property "LocationOfComponents"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1911) //= 0x777. The runtime will prefer the VTID if present
  @VTID(27)
  void locationOfComponents(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Encoding"
   * </p>
   * @return  Returns a value of type RTExcelObj.MsoEncoding
   */

  @DISPID(1822) //= 0x71e. The runtime will prefer the VTID if present
  @VTID(28)
  RTExcelObj.MsoEncoding encoding();


  /**
   * <p>
   * Setter method for the COM property "Encoding"
   * </p>
   * @param rhs Mandatory RTExcelObj.MsoEncoding parameter.
   */

  @DISPID(1822) //= 0x71e. The runtime will prefer the VTID if present
  @VTID(29)
  void encoding(
    RTExcelObj.MsoEncoding rhs);


  /**
   * <p>
   * Getter method for the COM property "FolderSuffix"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1914) //= 0x77a. The runtime will prefer the VTID if present
  @VTID(30)
  java.lang.String folderSuffix();


  /**
   */

  @DISPID(1915) //= 0x77b. The runtime will prefer the VTID if present
  @VTID(31)
  void useDefaultFolderSuffix();


  /**
   * <p>
   * Getter method for the COM property "TargetBrowser"
   * </p>
   * @return  Returns a value of type RTExcelObj.MsoTargetBrowser
   */

  @DISPID(2179) //= 0x883. The runtime will prefer the VTID if present
  @VTID(32)
  RTExcelObj.MsoTargetBrowser targetBrowser();


  /**
   * <p>
   * Setter method for the COM property "TargetBrowser"
   * </p>
   * @param rhs Mandatory RTExcelObj.MsoTargetBrowser parameter.
   */

  @DISPID(2179) //= 0x883. The runtime will prefer the VTID if present
  @VTID(33)
  void targetBrowser(
    RTExcelObj.MsoTargetBrowser rhs);


  // Properties:
}
