package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface ModelTable extends Com4jObject {
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
  java.lang.String sourceName();


  /**
   * <p>
   * Getter method for the COM property "ModelTableColumns"
   * </p>
   */

  @DISPID(3119)
  @PropGet
  RTExcelObj.ModelTableColumns modelTableColumns();


  /**
   * <p>
   * Getter method for the COM property "SourceWorkbookConnection"
   * </p>
   */

  @DISPID(3120)
  @PropGet
  RTExcelObj.WorkbookConnection sourceWorkbookConnection();


  /**
   */

  @DISPID(65543)
  void _Dummy7();


  /**
   */

  @DISPID(1417)
  void refresh();


  /**
   * <p>
   * Getter method for the COM property "RecordCount"
   * </p>
   */

  @DISPID(1478)
  @PropGet
  int recordCount();


  /**
   * @param newName Mandatory java.lang.String parameter.
   */

  @DISPID(1782)
  void dummy1(
    java.lang.String newName);


  // Properties:
}
