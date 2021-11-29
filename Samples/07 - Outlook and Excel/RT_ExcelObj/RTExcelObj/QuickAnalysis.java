package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface QuickAnalysis extends Com4jObject {
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
   * @param xlQuickAnalysisMode Optional parameter. Default value is 0
   */

  @DISPID(496)
  void show(
    @Optional @DefaultValue("0") RTExcelObj.XlQuickAnalysisMode xlQuickAnalysisMode);


  /**
   * @param xlQuickAnalysisMode Optional parameter. Default value is 0
   */

  @DISPID(813)
  void hide(
    @Optional @DefaultValue("0") RTExcelObj.XlQuickAnalysisMode xlQuickAnalysisMode);


  // Properties:
}
