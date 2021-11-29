package RTExcelObj  ;

import com4j.*;

@IID("{0002E166-0000-0000-C000-000000000046}")
public interface VBE extends RTExcelObj.Application {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "VBProjects"
   * </p>
   * @return  Returns a value of type RTExcelObj._VBProjects
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(8)
  RTExcelObj._VBProjects vbProjects();


  /**
   * <p>
   * Getter method for the COM property "CommandBars"
   * </p>
   * @return  Returns a value of type RTExcelObj._CommandBars
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(9)
  RTExcelObj._CommandBars commandBars();


  /**
   * <p>
   * Getter method for the COM property "CodePanes"
   * </p>
   * @return  Returns a value of type RTExcelObj._CodePanes
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(10)
  RTExcelObj._CodePanes codePanes();


  /**
   * <p>
   * Getter method for the COM property "Windows"
   * </p>
   * @return  Returns a value of type RTExcelObj._Windows
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(11)
  RTExcelObj._Windows windows();


  /**
   * <p>
   * Getter method for the COM property "Events"
   * </p>
   * @return  Returns a value of type RTExcelObj.Events
   */

  @DISPID(111) //= 0x6f. The runtime will prefer the VTID if present
  @VTID(12)
  RTExcelObj.Events events();


  /**
   * <p>
   * Getter method for the COM property "ActiveVBProject"
   * </p>
   * @return  Returns a value of type RTExcelObj._VBProject
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(13)
  RTExcelObj._VBProject activeVBProject();


  /**
   * <p>
   * Setter method for the COM property "ActiveVBProject"
   * </p>
   * @param lppptReturn Mandatory RTExcelObj._VBProject parameter.
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(14)
  void activeVBProject(
    RTExcelObj._VBProject lppptReturn);


  /**
   * <p>
   * Getter method for the COM property "SelectedVBComponent"
   * </p>
   * @return  Returns a value of type RTExcelObj._VBComponent
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(15)
  RTExcelObj._VBComponent selectedVBComponent();


  /**
   * <p>
   * Getter method for the COM property "MainWindow"
   * </p>
   * @return  Returns a value of type RTExcelObj.Window
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(16)
  RTExcelObj.Window mainWindow();


  /**
   * <p>
   * Getter method for the COM property "ActiveWindow"
   * </p>
   * @return  Returns a value of type RTExcelObj.Window
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(17)
  RTExcelObj.Window activeWindow();


  /**
   * <p>
   * Getter method for the COM property "ActiveCodePane"
   * </p>
   * @return  Returns a value of type RTExcelObj._CodePane
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(18)
  RTExcelObj._CodePane activeCodePane();


  /**
   * <p>
   * Setter method for the COM property "ActiveCodePane"
   * </p>
   * @param ppCodePane Mandatory RTExcelObj._CodePane parameter.
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(19)
  void activeCodePane(
    RTExcelObj._CodePane ppCodePane);


  /**
   * <p>
   * Getter method for the COM property "Addins"
   * </p>
   * @return  Returns a value of type RTExcelObj._AddIns
   */

  @DISPID(209) //= 0xd1. The runtime will prefer the VTID if present
  @VTID(20)
  RTExcelObj._AddIns addins();


  // Properties:
}
