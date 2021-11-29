package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface SlicerItem extends Com4jObject {
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
  RTExcelObj.SlicerCache parent();


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
   * Getter method for the COM property "Name"
   * </p>
   */

  @DISPID(110)
  @PropGet
  java.lang.String name();


  /**
   * <p>
   * Getter method for the COM property "SourceName"
   * </p>
   */

  @DISPID(721)
  @PropGet
  java.lang.Object sourceName();


  /**
   * <p>
   * Getter method for the COM property "SourceNameStandard"
   * </p>
   */

  @DISPID(2148)
  @PropGet
  java.lang.String sourceNameStandard();


  /**
   * <p>
   * Getter method for the COM property "Value"
   * </p>
   */

  @DISPID(6)
  @PropGet
  java.lang.String value();


  /**
   * <p>
   * Getter method for the COM property "Selected"
   * </p>
   */

  @DISPID(1123)
  @PropGet
  boolean selected();


  /**
   * <p>
   * Setter method for the COM property "Selected"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1123)
  @PropPut
  void selected(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "HasData"
   * </p>
   */

  @DISPID(2989)
  @PropGet
  boolean hasData();


  // Properties:
}
