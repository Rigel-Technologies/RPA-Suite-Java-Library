package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface CheckBox extends Com4jObject {
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
   * Getter method for the COM property "BottomRightCell"
   * </p>
   */

  @DISPID(615)
  @PropGet
  RTExcelObj.Range bottomRightCell();


  /**
   */

  @DISPID(602)
  java.lang.Object bringToFront();


  /**
   */

  @DISPID(551)
  java.lang.Object copy();


  /**
   * @param appearance Optional parameter. Default value is 2
   * @param format Optional parameter. Default value is -4147
   */

  @DISPID(213)
  java.lang.Object copyPicture(
    @Optional @DefaultValue("2") RTExcelObj.XlPictureAppearance appearance,
    @Optional @DefaultValue("-4147") RTExcelObj.XlCopyPictureFormat format);


  /**
   */

  @DISPID(565)
  java.lang.Object cut();


  /**
   */

  @DISPID(117)
  java.lang.Object delete();


  /**
   */

  @DISPID(1039)
  com4j.Com4jObject duplicate();


  /**
   * <p>
   * Getter method for the COM property "Enabled"
   * </p>
   */

  @DISPID(600)
  @PropGet
  boolean enabled();


  /**
   * <p>
   * Setter method for the COM property "Enabled"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(600)
  @PropPut
  void enabled(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Height"
   * </p>
   */

  @DISPID(123)
  @PropGet
  double height();


  /**
   * <p>
   * Setter method for the COM property "Height"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @DISPID(123)
  @PropPut
  void height(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "Index"
   * </p>
   */

  @DISPID(486)
  @PropGet
  int index();


  /**
   * <p>
   * Getter method for the COM property "Left"
   * </p>
   */

  @DISPID(127)
  @PropGet
  double left();


  /**
   * <p>
   * Setter method for the COM property "Left"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @DISPID(127)
  @PropPut
  void left(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "Locked"
   * </p>
   */

  @DISPID(269)
  @PropGet
  boolean locked();


  /**
   * <p>
   * Setter method for the COM property "Locked"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(269)
  @PropPut
  void locked(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   */

  @DISPID(110)
  @PropGet
  java.lang.String name();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(110)
  @PropPut
  void name(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "OnAction"
   * </p>
   */

  @DISPID(596)
  @PropGet
  java.lang.String onAction();


  /**
   * <p>
   * Setter method for the COM property "OnAction"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(596)
  @PropPut
  void onAction(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Placement"
   * </p>
   */

  @DISPID(617)
  @PropGet
  java.lang.Object placement();


  /**
   * <p>
   * Setter method for the COM property "Placement"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(617)
  @PropPut
  void placement(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "PrintObject"
   * </p>
   */

  @DISPID(618)
  @PropGet
  boolean printObject();


  /**
   * <p>
   * Setter method for the COM property "PrintObject"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(618)
  @PropPut
  void printObject(
    boolean rhs);


  /**
   * @param replace Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(235)
  java.lang.Object select(
    @Optional java.lang.Object replace);


  /**
   */

  @DISPID(605)
  java.lang.Object sendToBack();


  /**
   * <p>
   * Getter method for the COM property "Top"
   * </p>
   */

  @DISPID(126)
  @PropGet
  double top();


  /**
   * <p>
   * Setter method for the COM property "Top"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @DISPID(126)
  @PropPut
  void top(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "TopLeftCell"
   * </p>
   */

  @DISPID(620)
  @PropGet
  RTExcelObj.Range topLeftCell();


  /**
   * <p>
   * Getter method for the COM property "Visible"
   * </p>
   */

  @DISPID(558)
  @PropGet
  boolean visible();


  /**
   * <p>
   * Setter method for the COM property "Visible"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(558)
  @PropPut
  void visible(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Width"
   * </p>
   */

  @DISPID(122)
  @PropGet
  double width();


  /**
   * <p>
   * Setter method for the COM property "Width"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @DISPID(122)
  @PropPut
  void width(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "ZOrder"
   * </p>
   */

  @DISPID(622)
  @PropGet
  int zOrder();


  /**
   * <p>
   * Getter method for the COM property "ShapeRange"
   * </p>
   */

  @DISPID(1528)
  @PropGet
  RTExcelObj.ShapeRange shapeRange();


  /**
   * <p>
   * Getter method for the COM property "Caption"
   * </p>
   */

  @DISPID(139)
  @PropGet
  java.lang.String caption();


  /**
   * <p>
   * Setter method for the COM property "Caption"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(139)
  @PropPut
  void caption(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Characters"
   * </p>
   * @param start Optional parameter. Default value is com4j.Variant.getMissing()
   * @param length Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(603)
  @PropGet
  RTExcelObj.Characters characters(
    @Optional java.lang.Object start,
    @Optional java.lang.Object length);


  /**
   * @param customDictionary Optional parameter. Default value is com4j.Variant.getMissing()
   * @param ignoreUppercase Optional parameter. Default value is com4j.Variant.getMissing()
   * @param alwaysSuggest Optional parameter. Default value is com4j.Variant.getMissing()
   * @param spellLang Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(505)
  java.lang.Object checkSpelling(
    @Optional java.lang.Object customDictionary,
    @Optional java.lang.Object ignoreUppercase,
    @Optional java.lang.Object alwaysSuggest,
    @Optional java.lang.Object spellLang);


  /**
   * <p>
   * Getter method for the COM property "LockedText"
   * </p>
   */

  @DISPID(616)
  @PropGet
  boolean lockedText();


  /**
   * <p>
   * Setter method for the COM property "LockedText"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(616)
  @PropPut
  void lockedText(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Text"
   * </p>
   */

  @DISPID(138)
  @PropGet
  java.lang.String text();


  /**
   * <p>
   * Setter method for the COM property "Text"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(138)
  @PropPut
  void text(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Accelerator"
   * </p>
   */

  @DISPID(846)
  @PropGet
  java.lang.Object accelerator();


  /**
   * <p>
   * Setter method for the COM property "Accelerator"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(846)
  @PropPut
  void accelerator(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "Border"
   * </p>
   */

  @DISPID(128)
  @PropGet
  RTExcelObj.Border border();


  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   */

  @DISPID(0)
  @PropGet
  @DefaultMethod
  int _Default();


  /**
   * <p>
   * Setter method for the COM property "_Default"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(0)
  @PropPut
  @DefaultMethod
  void _Default(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "Display3DShading"
   * </p>
   */

  @DISPID(1122)
  @PropGet
  boolean display3DShading();


  /**
   * <p>
   * Setter method for the COM property "Display3DShading"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1122)
  @PropPut
  void display3DShading(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Interior"
   * </p>
   */

  @DISPID(129)
  @PropGet
  RTExcelObj.Interior interior();


  /**
   * <p>
   * Getter method for the COM property "LinkedCell"
   * </p>
   */

  @DISPID(1058)
  @PropGet
  java.lang.String linkedCell();


  /**
   * <p>
   * Setter method for the COM property "LinkedCell"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1058)
  @PropPut
  void linkedCell(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "PhoneticAccelerator"
   * </p>
   */

  @DISPID(1121)
  @PropGet
  java.lang.Object phoneticAccelerator();


  /**
   * <p>
   * Setter method for the COM property "PhoneticAccelerator"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(1121)
  @PropPut
  void phoneticAccelerator(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "Value"
   * </p>
   */

  @DISPID(6)
  @PropGet
  java.lang.Object value();


  /**
   * <p>
   * Setter method for the COM property "Value"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(6)
  @PropPut
  void value(
    java.lang.Object rhs);


  // Properties:
}
