package RTExcelObj  ;

import com4j.*;

@IID("{000244AB-0001-0000-C000-000000000046}")
public interface ISort extends Com4jObject {
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
   * Getter method for the COM property "Rng"
   * </p>
   * @return  Returns a value of type RTExcelObj.Range
   */

  @VTID(10)
  RTExcelObj.Range rng();


  /**
   * <p>
   * Getter method for the COM property "Header"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlYesNoGuess
   */

  @VTID(11)
  RTExcelObj.XlYesNoGuess header();


  /**
   * <p>
   * Setter method for the COM property "Header"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlYesNoGuess parameter.
   */

  @VTID(12)
  void header(
    RTExcelObj.XlYesNoGuess rhs);


  /**
   * <p>
   * Getter method for the COM property "MatchCase"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(13)
  boolean matchCase();


  /**
   * <p>
   * Setter method for the COM property "MatchCase"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(14)
  void matchCase(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Orientation"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlSortOrientation
   */

  @VTID(15)
  RTExcelObj.XlSortOrientation orientation();


  /**
   * <p>
   * Setter method for the COM property "Orientation"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlSortOrientation parameter.
   */

  @VTID(16)
  void orientation(
    RTExcelObj.XlSortOrientation rhs);


  /**
   * <p>
   * Getter method for the COM property "SortMethod"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlSortMethod
   */

  @VTID(17)
  RTExcelObj.XlSortMethod sortMethod();


  /**
   * <p>
   * Setter method for the COM property "SortMethod"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlSortMethod parameter.
   */

  @VTID(18)
  void sortMethod(
    RTExcelObj.XlSortMethod rhs);


  /**
   * <p>
   * Getter method for the COM property "SortFields"
   * </p>
   * @return  Returns a value of type RTExcelObj.SortFields
   */

  @VTID(19)
  RTExcelObj.SortFields sortFields();


  /**
   * @param rng Mandatory RTExcelObj.Range parameter.
   */

  @VTID(20)
  void setRange(
    RTExcelObj.Range rng);


  /**
   */

  @VTID(21)
  void apply();


  // Properties:
}
