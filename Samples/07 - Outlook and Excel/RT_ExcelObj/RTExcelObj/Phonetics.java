package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface Phonetics extends Com4jObject,Iterable<Com4jObject> {
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
   * Getter method for the COM property "Count"
   * </p>
   */

  @DISPID(118)
  @PropGet
  int count();


  /**
   * <p>
   * Getter method for the COM property "Start"
   * </p>
   */

  @DISPID(608)
  @PropGet
  int start();


  /**
   * <p>
   * Getter method for the COM property "Length"
   * </p>
   */

  @DISPID(609)
  @PropGet
  int length();


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
   * Getter method for the COM property "CharacterType"
   * </p>
   */

  @DISPID(1674)
  @PropGet
  int characterType();


  /**
   * <p>
   * Setter method for the COM property "CharacterType"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(1674)
  @PropPut
  void characterType(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "Alignment"
   * </p>
   */

  @DISPID(453)
  @PropGet
  int alignment();


  /**
   * <p>
   * Setter method for the COM property "Alignment"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(453)
  @PropPut
  void alignment(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "Font"
   * </p>
   */

  @DISPID(146)
  @PropGet
  RTExcelObj.Font font();


  /**
   * <p>
   * Getter method for the COM property "Item"
   * </p>
   * @param index Mandatory int parameter.
   */

  @DISPID(170)
  @PropGet
  com4j.Com4jObject item(
    int index);


  /**
   */

  @DISPID(117)
  void delete();


  /**
   * @param start Mandatory int parameter.
   * @param length Mandatory int parameter.
   * @param text Mandatory java.lang.String parameter.
   */

  @DISPID(181)
  void add(
    int start,
    int length,
    java.lang.String text);


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
   * Getter method for the COM property "_Default"
   * </p>
   * @param index Mandatory int parameter.
   */

  @DISPID(0)
  @PropGet
  @DefaultMethod
  com4j.Com4jObject _Default(
    int index);


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4)
  @PropGet
  java.util.Iterator<Com4jObject> iterator();

  // Properties:
}
