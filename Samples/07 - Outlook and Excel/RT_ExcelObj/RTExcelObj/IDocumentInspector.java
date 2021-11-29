package RTExcelObj  ;

import com4j.*;

@IID("{000CD706-0000-0000-C000-000000000046}")
public interface IDocumentInspector extends Com4jObject {
  // Methods:
  /**
   * @param name Mandatory Holder<java.lang.String> parameter.
   * @param desc Mandatory Holder<java.lang.String> parameter.
   */

  @VTID(3)
  void getInfo(
    Holder<java.lang.String> name,
    Holder<java.lang.String> desc);


  /**
   * @param doc Mandatory com4j.Com4jObject parameter.
   * @param status Mandatory Holder<RTExcelObj.MsoDocInspectorStatus> parameter.
   * @param result Mandatory Holder<java.lang.String> parameter.
   * @param action Mandatory Holder<java.lang.String> parameter.
   */

  @VTID(4)
  void inspect(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject doc,
    Holder<RTExcelObj.MsoDocInspectorStatus> status,
    Holder<java.lang.String> result,
    Holder<java.lang.String> action);


  /**
   * @param doc Mandatory com4j.Com4jObject parameter.
   * @param hwnd Mandatory int parameter.
   * @param status Mandatory Holder<RTExcelObj.MsoDocInspectorStatus> parameter.
   * @param result Mandatory Holder<java.lang.String> parameter.
   */

  @VTID(5)
  void fix(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject doc,
    int hwnd,
    Holder<RTExcelObj.MsoDocInspectorStatus> status,
    Holder<java.lang.String> result);


  // Properties:
}
