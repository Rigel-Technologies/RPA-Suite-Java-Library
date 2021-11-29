package RTExcelObj  ;

import com4j.*;

@IID("{000244C9-0001-0000-C000-000000000046}")
public interface ISlicerItem extends Com4jObject {
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
   * @return  Returns a value of type RTExcelObj.SlicerCache
   */

  @VTID(9)
  RTExcelObj.SlicerCache parent();


  /**
   * <p>
   * Getter method for the COM property "Caption"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(10)
  java.lang.String caption();


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(11)
  java.lang.String name();


  /**
   * <p>
   * Getter method for the COM property "SourceName"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(12)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object sourceName();


  /**
   * <p>
   * Getter method for the COM property "SourceNameStandard"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(13)
  java.lang.String sourceNameStandard();


  /**
   * <p>
   * Getter method for the COM property "Value"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(14)
  java.lang.String value();


  /**
   * <p>
   * Getter method for the COM property "Selected"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(15)
  boolean selected();


  /**
   * <p>
   * Setter method for the COM property "Selected"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(16)
  void selected(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "HasData"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(17)
  boolean hasData();


  // Properties:
}
