package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface Sort extends Com4jObject {
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
   * Getter method for the COM property "Rng"
   * </p>
   */

  @DISPID(2748)
  @PropGet
  RTExcelObj.Range rng();


  /**
   * <p>
   * Getter method for the COM property "Header"
   * </p>
   */

  @DISPID(895)
  @PropGet
  RTExcelObj.XlYesNoGuess header();


  /**
   * <p>
   * Setter method for the COM property "Header"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlYesNoGuess parameter.
   */

  @DISPID(895)
  @PropPut
  void header(
    RTExcelObj.XlYesNoGuess rhs);


  /**
   * <p>
   * Getter method for the COM property "MatchCase"
   * </p>
   */

  @DISPID(426)
  @PropGet
  boolean matchCase();


  /**
   * <p>
   * Setter method for the COM property "MatchCase"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(426)
  @PropPut
  void matchCase(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Orientation"
   * </p>
   */

  @DISPID(134)
  @PropGet
  RTExcelObj.XlSortOrientation orientation();


  /**
   * <p>
   * Setter method for the COM property "Orientation"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlSortOrientation parameter.
   */

  @DISPID(134)
  @PropPut
  void orientation(
    RTExcelObj.XlSortOrientation rhs);


  /**
   * <p>
   * Getter method for the COM property "SortMethod"
   * </p>
   */

  @DISPID(897)
  @PropGet
  RTExcelObj.XlSortMethod sortMethod();


  /**
   * <p>
   * Setter method for the COM property "SortMethod"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlSortMethod parameter.
   */

  @DISPID(897)
  @PropPut
  void sortMethod(
    RTExcelObj.XlSortMethod rhs);


  /**
   * <p>
   * Getter method for the COM property "SortFields"
   * </p>
   */

  @DISPID(2749)
  @PropGet
  RTExcelObj.SortFields sortFields();


  /**
   * @param rng Mandatory RTExcelObj.Range parameter.
   */

  @DISPID(2750)
  void setRange(
    RTExcelObj.Range rng);


  /**
   */

  @DISPID(1675)
  void apply();


  // Properties:
}
