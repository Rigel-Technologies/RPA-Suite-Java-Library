package CartesObj  ;

import com4j.*;

/**
 * Dispatch interface for RPAWin32Component Object
 */
@IID("{C32656CB-7B06-4808-878B-A461B12422E2}")
public interface IRPAWin32Component extends CartesObj.IRPAComponent {
  // Methods:
  /**
   * <p>
   * It clicks on the component. If the value of the "movemouse" parameter is 1, it will place the mouse pointer over the component before clicking. If its value is 0, the mouse pointer will not move.
   * </p>
   * @param movemouse Mandatory int parameter.
   */

  @DISPID(301) //= 0x12d. The runtime will prefer the VTID if present
  @VTID(20)
  void click(
    int movemouse);


  /**
   * @param imagefiles Mandatory CartesObj.IRPAParameters parameter.
   * @param movemouse Mandatory int parameter.
   */

  @DISPID(302) //= 0x12e. The runtime will prefer the VTID if present
  @VTID(21)
  void clickonimage(
    CartesObj.IRPAParameters imagefiles,
    int movemouse);


  /**
   * @param route Mandatory java.lang.String parameter.
   */

  @DISPID(303) //= 0x12f. The runtime will prefer the VTID if present
  @VTID(22)
  void clickmenu(
    java.lang.String route);


  /**
   * @param x Mandatory int parameter.
   * @param y Mandatory int parameter.
   * @param movemouse Mandatory int parameter.
   */

  @DISPID(304) //= 0x130. The runtime will prefer the VTID if present
  @VTID(23)
  void clickon(
    int x,
    int y,
    int movemouse);


  /**
   * @param x Mandatory int parameter.
   * @param y Mandatory int parameter.
   * @param width Mandatory int parameter.
   * @param height Mandatory int parameter.
   * @param imagefiles Mandatory CartesObj.IRPAParameters parameter.
   * @param movemouse Mandatory int parameter.
   */

  @DISPID(305) //= 0x131. The runtime will prefer the VTID if present
  @VTID(24)
  void clickonimagerect(
    int x,
    int y,
    int width,
    int height,
    CartesObj.IRPAParameters imagefiles,
    int movemouse);


  /**
   */

  @DISPID(306) //= 0x132. The runtime will prefer the VTID if present
  @VTID(25)
  void close();


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(307) //= 0x133. The runtime will prefer the VTID if present
  @VTID(26)
  java.lang.String description();


  /**
   * @param movemouse Mandatory int parameter.
   */

  @DISPID(308) //= 0x134. The runtime will prefer the VTID if present
  @VTID(27)
  void doubleclick(
    int movemouse);


  /**
   * @param x Mandatory int parameter.
   * @param y Mandatory int parameter.
   * @param movemouse Mandatory int parameter.
   */

  @DISPID(309) //= 0x135. The runtime will prefer the VTID if present
  @VTID(28)
  void doubleclickon(
    int x,
    int y,
    int movemouse);


  /**
   * @param imagefiles Mandatory CartesObj.IRPAParameters parameter.
   * @param movemouse Mandatory int parameter.
   */

  @DISPID(310) //= 0x136. The runtime will prefer the VTID if present
  @VTID(29)
  void doubleclickonimage(
    CartesObj.IRPAParameters imagefiles,
    int movemouse);


  /**
   * @param x Mandatory int parameter.
   * @param y Mandatory int parameter.
   * @param width Mandatory int parameter.
   * @param height Mandatory int parameter.
   * @param imagefiles Mandatory CartesObj.IRPAParameters parameter.
   * @param movemouse Mandatory int parameter.
   */

  @DISPID(311) //= 0x137. The runtime will prefer the VTID if present
  @VTID(30)
  void doubleclickonimagerect(
    int x,
    int y,
    int width,
    int height,
    CartesObj.IRPAParameters imagefiles,
    int movemouse);


  /**
   */

  @DISPID(312) //= 0x138. The runtime will prefer the VTID if present
  @VTID(31)
  void down();


  /**
   * @param button Mandatory java.lang.String parameter.
   * @param screenx Mandatory int parameter.
   * @param screeny Mandatory int parameter.
   */

  @DISPID(313) //= 0x139. The runtime will prefer the VTID if present
  @VTID(32)
  void draganddrop(
    java.lang.String button,
    int screenx,
    int screeny);


  /**
   * @param button Mandatory java.lang.String parameter.
   * @param x Mandatory int parameter.
   * @param y Mandatory int parameter.
   * @param screenx Mandatory int parameter.
   * @param screeny Mandatory int parameter.
   */

  @DISPID(314) //= 0x13a. The runtime will prefer the VTID if present
  @VTID(33)
  void dragfromanddrop(
    java.lang.String button,
    int x,
    int y,
    int screenx,
    int screeny);


  /**
   * @return  Returns a value of type int
   */

  @DISPID(315) //= 0x13b. The runtime will prefer the VTID if present
  @VTID(34)
  int enabled();


  /**
   * @return  Returns a value of type int
   */

  @DISPID(316) //= 0x13c. The runtime will prefer the VTID if present
  @VTID(35)
  int exists();


  /**
   * @param imagefiles Mandatory CartesObj.IRPAParameters parameter.
   * @return  Returns a value of type CartesObj.IRPAParameters
   */

  @DISPID(317) //= 0x13d. The runtime will prefer the VTID if present
  @VTID(36)
  CartesObj.IRPAParameters findPicture(
    CartesObj.IRPAParameters imagefiles);


  /**
   * @param x Mandatory int parameter.
   * @param y Mandatory int parameter.
   * @param width Mandatory int parameter.
   * @param height Mandatory int parameter.
   * @param imagefiles Mandatory CartesObj.IRPAParameters parameter.
   * @return  Returns a value of type CartesObj.IRPAParameters
   */

  @DISPID(318) //= 0x13e. The runtime will prefer the VTID if present
  @VTID(37)
  CartesObj.IRPAParameters findPictureIn(
    int x,
    int y,
    int width,
    int height,
    CartesObj.IRPAParameters imagefiles);


  /**
   */

  @DISPID(319) //= 0x13f. The runtime will prefer the VTID if present
  @VTID(38)
  void focus();


  /**
   * @return  Returns a value of type int
   */

  @DISPID(320) //= 0x140. The runtime will prefer the VTID if present
  @VTID(39)
  int focused();


  /**
   * @return  Returns a value of type int
   */

  @DISPID(321) //= 0x141. The runtime will prefer the VTID if present
  @VTID(40)
  int handle();


  /**
   * @return  Returns a value of type int
   */

  @DISPID(323) //= 0x143. The runtime will prefer the VTID if present
  @VTID(41)
  int idRole();


  /**
   * @return  Returns a value of type int
   */

  @DISPID(324) //= 0x144. The runtime will prefer the VTID if present
  @VTID(42)
  int idSituation();


  /**
   * @param x Mandatory int parameter.
   * @param y Mandatory int parameter.
   */

  @DISPID(325) //= 0x145. The runtime will prefer the VTID if present
  @VTID(43)
  void move(
    int x,
    int y);


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(326) //= 0x146. The runtime will prefer the VTID if present
  @VTID(44)
  java.lang.String name();


  /**
   * @return  Returns a value of type int
   */

  @DISPID(327) //= 0x147. The runtime will prefer the VTID if present
  @VTID(45)
  int pid();


  /**
   * @param x Mandatory int parameter.
   * @param y Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(328) //= 0x148. The runtime will prefer the VTID if present
  @VTID(46)
  int pixel(
    int x,
    int y);


  /**
   * @param msg Mandatory int parameter.
   * @param wParam Mandatory int parameter.
   * @param lParam Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(329) //= 0x149. The runtime will prefer the VTID if present
  @VTID(47)
  int postMessage(
    int msg,
    int wParam,
    int lParam);


  /**
   * @param keycode Mandatory int parameter.
   * @param repetitions Mandatory int parameter.
   */

  @DISPID(330) //= 0x14a. The runtime will prefer the VTID if present
  @VTID(48)
  void press(
    int keycode,
    int repetitions);


  /**
   * @param language Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(331) //= 0x14b. The runtime will prefer the VTID if present
  @VTID(49)
  java.lang.String recognition(
    java.lang.String language);


  /**
   * @param language Mandatory java.lang.String parameter.
   * @param ratiox Mandatory double parameter.
   * @param ratioy Mandatory double parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(332) //= 0x14c. The runtime will prefer the VTID if present
  @VTID(50)
  java.lang.String recognitionRatio(
    java.lang.String language,
    double ratiox,
    double ratioy);


  /**
   * @param language Mandatory java.lang.String parameter.
   * @param x Mandatory int parameter.
   * @param y Mandatory int parameter.
   * @param width Mandatory int parameter.
   * @param height Mandatory int parameter.
   * @param ratiox Mandatory double parameter.
   * @param ratioy Mandatory double parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(333) //= 0x14d. The runtime will prefer the VTID if present
  @VTID(51)
  java.lang.String recognitionRatioFrom(
    java.lang.String language,
    int x,
    int y,
    int width,
    int height,
    double ratiox,
    double ratioy);


  /**
   * @param width Mandatory int parameter.
   * @param height Mandatory int parameter.
   */

  @DISPID(334) //= 0x14e. The runtime will prefer the VTID if present
  @VTID(52)
  void reSize(
    int width,
    int height);


  /**
   * @param movemouse Mandatory int parameter.
   */

  @DISPID(335) //= 0x14f. The runtime will prefer the VTID if present
  @VTID(53)
  void rightClick(
    int movemouse);


  /**
   * @param x Mandatory int parameter.
   * @param y Mandatory int parameter.
   * @param movemouse Mandatory int parameter.
   */

  @DISPID(336) //= 0x150. The runtime will prefer the VTID if present
  @VTID(54)
  void rightClickOn(
    int x,
    int y,
    int movemouse);


  /**
   * @param imagefiles Mandatory CartesObj.IRPAParameters parameter.
   * @param movemouse Mandatory int parameter.
   */

  @DISPID(337) //= 0x151. The runtime will prefer the VTID if present
  @VTID(55)
  void rightClickOnImage(
    CartesObj.IRPAParameters imagefiles,
    int movemouse);


  /**
   * @param x Mandatory int parameter.
   * @param y Mandatory int parameter.
   * @param width Mandatory int parameter.
   * @param height Mandatory int parameter.
   * @param imagefiles Mandatory CartesObj.IRPAParameters parameter.
   * @param movemouse Mandatory int parameter.
   */

  @DISPID(338) //= 0x152. The runtime will prefer the VTID if present
  @VTID(56)
  void rightClickOnImageRect(
    int x,
    int y,
    int width,
    int height,
    CartesObj.IRPAParameters imagefiles,
    int movemouse);


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(339) //= 0x153. The runtime will prefer the VTID if present
  @VTID(57)
  java.lang.String role();


  /**
   * @param filename Mandatory java.lang.String parameter.
   */

  @DISPID(340) //= 0x154. The runtime will prefer the VTID if present
  @VTID(58)
  void saveRectToFile(
    java.lang.String filename);


  /**
   * @param x Mandatory int parameter.
   * @param y Mandatory int parameter.
   * @param width Mandatory int parameter.
   * @param height Mandatory int parameter.
   * @param filename Mandatory java.lang.String parameter.
   */

  @DISPID(341) //= 0x155. The runtime will prefer the VTID if present
  @VTID(59)
  void saveRectPartToFile(
    int x,
    int y,
    int width,
    int height,
    java.lang.String filename);


  /**
   * @param msg Mandatory int parameter.
   * @param wParam Mandatory int parameter.
   * @param lParam Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(342) //= 0x156. The runtime will prefer the VTID if present
  @VTID(60)
  int sendMessage(
    int msg,
    int wParam,
    int lParam);


  /**
   * @param x Mandatory int parameter.
   * @param y Mandatory int parameter.
   */

  @DISPID(343) //= 0x157. The runtime will prefer the VTID if present
  @VTID(61)
  void setMouse(
    int x,
    int y);


  /**
   * @param mode Mandatory java.lang.String parameter.
   */

  @DISPID(344) //= 0x158. The runtime will prefer the VTID if present
  @VTID(62)
  void show(
    java.lang.String mode);


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(345) //= 0x159. The runtime will prefer the VTID if present
  @VTID(63)
  java.lang.String situation();


  /**
   * @param route Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(346) //= 0x15a. The runtime will prefer the VTID if present
  @VTID(64)
  java.lang.String titleMenu(
    java.lang.String route);


  /**
   * @param key Mandatory java.lang.String parameter.
   * @param controlkey1 Mandatory java.lang.String parameter.
   * @param controlkey2 Mandatory java.lang.String parameter.
   */

  @DISPID(347) //= 0x15b. The runtime will prefer the VTID if present
  @VTID(65)
  void typeKey(
    java.lang.String key,
    java.lang.String controlkey1,
    java.lang.String controlkey2);


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(348) //= 0x15c. The runtime will prefer the VTID if present
  @VTID(66)
  java.lang.String typedWord();


  /**
   * @param x Mandatory int parameter.
   * @param y Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(349) //= 0x15d. The runtime will prefer the VTID if present
  @VTID(67)
  java.lang.String typedWordFrom(
    int x,
    int y);


  /**
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(350) //= 0x15e. The runtime will prefer the VTID if present
  @VTID(68)
  void typeFromClipboard(
    java.lang.String value);


  /**
   * @param value Mandatory java.lang.String parameter.
   * @param checkfocus Mandatory int parameter.
   * @param checkvalue Mandatory int parameter.
   */

  @DISPID(351) //= 0x15f. The runtime will prefer the VTID if present
  @VTID(69)
  void typeFromClipboardCheck(
    java.lang.String value,
    int checkfocus,
    int checkvalue);


  /**
   * @param x Mandatory int parameter.
   * @param y Mandatory int parameter.
   * @param value Mandatory java.lang.String parameter.
   * @param checkfocus Mandatory int parameter.
   * @param checkvalue Mandatory int parameter.
   */

  @DISPID(352) //= 0x160. The runtime will prefer the VTID if present
  @VTID(70)
  void typeFromClipboardOn(
    int x,
    int y,
    java.lang.String value,
    int checkfocus,
    int checkvalue);


  /**
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(353) //= 0x161. The runtime will prefer the VTID if present
  @VTID(71)
  void typeWord(
    java.lang.String value);


  /**
   * @param value Mandatory java.lang.String parameter.
   * @param checkfocus Mandatory int parameter.
   * @param checkvalue Mandatory int parameter.
   */

  @DISPID(354) //= 0x162. The runtime will prefer the VTID if present
  @VTID(72)
  void typeWordCheck(
    java.lang.String value,
    int checkfocus,
    int checkvalue);


  /**
   * @param x Mandatory int parameter.
   * @param y Mandatory int parameter.
   * @param value Mandatory java.lang.String parameter.
   * @param checkfocus Mandatory int parameter.
   * @param checkvalue Mandatory int parameter.
   */

  @DISPID(355) //= 0x163. The runtime will prefer the VTID if present
  @VTID(73)
  void typeWordOn(
    int x,
    int y,
    java.lang.String value,
    int checkfocus,
    int checkvalue);


  /**
   */

  @DISPID(356) //= 0x164. The runtime will prefer the VTID if present
  @VTID(74)
  void up();


  /**
   * <p>
   * Getter method for the COM property "Value"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(357) //= 0x165. The runtime will prefer the VTID if present
  @VTID(75)
  java.lang.String value();


  /**
   * <p>
   * Setter method for the COM property "Value"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(357) //= 0x165. The runtime will prefer the VTID if present
  @VTID(76)
  void value(
    java.lang.String value);


  /**
   * <p>
   * Getter method for the COM property "Visible"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(358) //= 0x166. The runtime will prefer the VTID if present
  @VTID(77)
  int visible();


  /**
   * <p>
   * Setter method for the COM property "Visible"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(358) //= 0x166. The runtime will prefer the VTID if present
  @VTID(78)
  void visible(
    int value);


  /**
   * <p>
   * Getter method for the COM property "WindowState"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(359) //= 0x167. The runtime will prefer the VTID if present
  @VTID(79)
  java.lang.String windowState();


  /**
   * <p>
   * Getter method for the COM property "x"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(322) //= 0x142. The runtime will prefer the VTID if present
  @VTID(80)
  int x();


  /**
   * <p>
   * Getter method for the COM property "y"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(360) //= 0x168. The runtime will prefer the VTID if present
  @VTID(81)
  int y();


  /**
   * <p>
   * Getter method for the COM property "width"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(361) //= 0x169. The runtime will prefer the VTID if present
  @VTID(82)
  int width();


  /**
   * <p>
   * Getter method for the COM property "height"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(362) //= 0x16a. The runtime will prefer the VTID if present
  @VTID(83)
  int height();


  /**
   * <p>
   * Getter method for the COM property "DPIAwareness"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(363) //= 0x16b. The runtime will prefer the VTID if present
  @VTID(84)
  int dpiAwareness();


  // Properties:
}
