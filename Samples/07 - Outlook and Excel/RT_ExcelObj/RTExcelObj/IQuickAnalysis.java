package RTExcelObj  ;

import com4j.*;

@IID("{000244D0-0001-0000-C000-000000000046}")
public interface IQuickAnalysis extends Com4jObject {
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
   * @param xlQuickAnalysisMode Optional parameter. Default value is 0
   */

  @VTID(10)
  void show(
    @Optional @DefaultValue("0") RTExcelObj.XlQuickAnalysisMode xlQuickAnalysisMode);


  /**
   * @param xlQuickAnalysisMode Optional parameter. Default value is 0
   */

  @VTID(11)
  void hide(
    @Optional @DefaultValue("0") RTExcelObj.XlQuickAnalysisMode xlQuickAnalysisMode);


  // Properties:
}
