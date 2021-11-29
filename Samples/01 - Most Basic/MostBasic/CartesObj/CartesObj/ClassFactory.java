package CartesObj  ;

import com4j.*;

/**
 * Defines methods to create COM objects
 */
public abstract class ClassFactory {
  private ClassFactory() {} // instanciation is not allowed


  /**
   * CartesObj Object
   */
  public static CartesObj.ICartesObj createCartesObj() {
    return COM4J.createInstance( CartesObj.ICartesObj.class, "{CFE6A6CF-5B3D-4FC7-A714-D291E2D7A905}" );
  }

  /**
   * RPADeveloper Object
   */
  public static CartesObj.IRPADeveloper createRPADeveloper() {
    return COM4J.createInstance( CartesObj.IRPADeveloper.class, "{9FB90F08-06BB-4493-9A67-311AC971A034}" );
  }

  /**
   * RPAComponent Object
   */
  public static CartesObj.IRPAComponent createRPAComponent() {
    return COM4J.createInstance( CartesObj.IRPAComponent.class, "{731D2411-BB98-4FD1-B07D-DEF6AA50BDDB}" );
  }

  /**
   * RPAParameters Object
   */
  public static CartesObj.IRPAParameters createRPAParameters() {
    return COM4J.createInstance( CartesObj.IRPAParameters.class, "{57FE5E02-7635-4591-821C-1D04834BC5E3}" );
  }

  /**
   * RPAWin32Component Object
   */
  public static CartesObj.IRPAWin32Component createRPAWin32Component() {
    return COM4J.createInstance( CartesObj.IRPAWin32Component.class, "{7F59F0C1-1341-49BE-B58A-7EA675A3BEEA}" );
  }

  /**
   * RPAWin32Accessibility Object
   */
  public static CartesObj.IRPAWin32Accessibility createRPAWin32Accessibility() {
    return COM4J.createInstance( CartesObj.IRPAWin32Accessibility.class, "{C3A7222C-13C4-4AF8-84E5-CFA7F72ABCB7}" );
  }

  /**
   * RPAWin32CheckRadioButton Object
   */
  public static CartesObj.IRPAWin32CheckRadioButton createRPAWin32CheckRadioButton() {
    return COM4J.createInstance( CartesObj.IRPAWin32CheckRadioButton.class, "{F04E93A8-4F1A-48CC-98CB-4896A122330B}" );
  }

  /**
   * RPAWin32Combobox32 Object
   */
  public static CartesObj.IRPAWin32Combobox32 createRPAWin32Combobox32() {
    return COM4J.createInstance( CartesObj.IRPAWin32Combobox32.class, "{8C190B41-EAEF-4D70-BCE7-6D731EC6EE17}" );
  }

  /**
   * RPAWin32DateTimeW32 Object
   */
  public static CartesObj.IRPAWin32DateTimeW32 createRPAWin32DateTimeW32() {
    return COM4J.createInstance( CartesObj.IRPAWin32DateTimeW32.class, "{5C5018F1-FA19-424E-8EF0-CE1D899D4F85}" );
  }

  /**
   * RPAWin32Edit32 Object
   */
  public static CartesObj.IRPAWin32Edit32 createRPAWin32Edit32() {
    return COM4J.createInstance( CartesObj.IRPAWin32Edit32.class, "{E24CFBF4-7402-469F-8DE1-58C113FB4CC4}" );
  }

  /**
   * RPAWin32GridGXWND Object
   */
  public static CartesObj.IRPAWin32GridGXWND createRPAWin32GridGXWND() {
    return COM4J.createInstance( CartesObj.IRPAWin32GridGXWND.class, "{71FEE5F5-BF9E-4A02-8606-8492C992C40E}" );
  }

  /**
   * RPAWin32InternetExplorer Object
   */
  public static CartesObj.IRPAWin32InternetExplorer createRPAWin32InternetExplorer() {
    return COM4J.createInstance( CartesObj.IRPAWin32InternetExplorer.class, "{BDC6C9E5-E88D-47E8-8B54-AE0D00925E3E}" );
  }

  /**
   * RPAWin32Listbox32 Object
   */
  public static CartesObj.IRPAWin32Listbox32 createRPAWin32Listbox32() {
    return COM4J.createInstance( CartesObj.IRPAWin32Listbox32.class, "{150B24E0-9DA7-418D-8B65-BEF2A9AABB28}" );
  }

  /**
   * RPAWin32ListView32 Object
   */
  public static CartesObj.IRPAWin32ListView32 createRPAWin32ListView32() {
    return COM4J.createInstance( CartesObj.IRPAWin32ListView32.class, "{B193DB93-C1FF-428F-A59F-78E32B01C4EC}" );
  }

  /**
   * RPAWin32SysHeader32 Object
   */
  public static CartesObj.IRPAWin32SysHeader32 createRPAWin32SysHeader32() {
    return COM4J.createInstance( CartesObj.IRPAWin32SysHeader32.class, "{7247C57B-0FD3-4520-9637-30ABA4579043}" );
  }

  /**
   * RPAWin32TabControl32 Object
   */
  public static CartesObj.IRPAWin32TabControl32 createRPAWin32TabControl32() {
    return COM4J.createInstance( CartesObj.IRPAWin32TabControl32.class, "{F84376D8-DF56-4CF6-B0ED-2383058A3682}" );
  }

  /**
   * RPAWin32Toolbar32 Object
   */
  public static CartesObj.IRPAWin32Toolbar32 createRPAWin32Toolbar32() {
    return COM4J.createInstance( CartesObj.IRPAWin32Toolbar32.class, "{4D99E306-7995-4BA6-A653-18F07C7D5B51}" );
  }

  /**
   * RPAWin32TreeView32 Object
   */
  public static CartesObj.IRPAWin32TreeView32 createRPAWin32TreeView32() {
    return COM4J.createInstance( CartesObj.IRPAWin32TreeView32.class, "{5056D098-21E6-4F90-BA99-AC17706E9EFF}" );
  }

  /**
   * RPAMSHTMLComponent Object
   */
  public static CartesObj.IRPAMSHTMLComponent createRPAMSHTMLComponent() {
    return COM4J.createInstance( CartesObj.IRPAMSHTMLComponent.class, "{DFADC9D9-FE3A-4A73-8E74-C2F1C21986A5}" );
  }

  /**
   * RPAMSHTMLAnchor Object
   */
  public static CartesObj.IRPAMSHTMLAnchor createRPAMSHTMLAnchor() {
    return COM4J.createInstance( CartesObj.IRPAMSHTMLAnchor.class, "{231911FE-6202-411F-89D0-213919EA9EBD}" );
  }

  /**
   * RPAMSHTMLBody Object
   */
  public static CartesObj.IRPAMSHTMLBody createRPAMSHTMLBody() {
    return COM4J.createInstance( CartesObj.IRPAMSHTMLBody.class, "{B79BD092-DE02-473A-A35C-61E8F6512B9F}" );
  }

  /**
   * RPAMSHTMLButton Object
   */
  public static CartesObj.IRPAMSHTMLButton createRPAMSHTMLButton() {
    return COM4J.createInstance( CartesObj.IRPAMSHTMLButton.class, "{4390D5E2-8069-4631-9429-F5C3B45ED622}" );
  }

  /**
   * RPAMSHTMLCheckbox Object
   */
  public static CartesObj.IRPAMSHTMLCheckbox createRPAMSHTMLCheckbox() {
    return COM4J.createInstance( CartesObj.IRPAMSHTMLCheckbox.class, "{60533D1A-9CDE-42A1-BB3B-27EB7FB14EA9}" );
  }

  /**
   * RPAMSHTMLForm Object
   */
  public static CartesObj.IRPAMSHTMLForm createRPAMSHTMLForm() {
    return COM4J.createInstance( CartesObj.IRPAMSHTMLForm.class, "{D5093E4C-11AC-494D-9691-90AE24943740}" );
  }

  /**
   * RPAMSHTMLFrame Object
   */
  public static CartesObj.IRPAMSHTMLFrame createRPAMSHTMLFrame() {
    return COM4J.createInstance( CartesObj.IRPAMSHTMLFrame.class, "{6D97E5B4-2108-465E-8372-0A638926DAA1}" );
  }

  /**
   * RPAMSHTMLHTML Object
   */
  public static CartesObj.IRPAMSHTMLHTML createRPAMSHTMLHTML() {
    return COM4J.createInstance( CartesObj.IRPAMSHTMLHTML.class, "{7F0D9E4E-359E-4A5A-A137-A7AA126640D6}" );
  }

  /**
   * RPAMSHTMLImg Object
   */
  public static CartesObj.IRPAMSHTMLImg createRPAMSHTMLImg() {
    return COM4J.createInstance( CartesObj.IRPAMSHTMLImg.class, "{3F0D0F83-F200-4D7A-81EB-C2AFD540317A}" );
  }

  /**
   * RPAMSHTMLInputFile Object
   */
  public static CartesObj.IRPAMSHTMLInputFile createRPAMSHTMLInputFile() {
    return COM4J.createInstance( CartesObj.IRPAMSHTMLInputFile.class, "{9B3F6263-CB40-4C6E-A72E-28F4C8389082}" );
  }

  /**
   * RPAMSHTMLInputHidden Object
   */
  public static CartesObj.IRPAMSHTMLInputHidden createRPAMSHTMLInputHidden() {
    return COM4J.createInstance( CartesObj.IRPAMSHTMLInputHidden.class, "{7FBC4CF5-80B8-4744-A056-6060EF0E44A8}" );
  }

  /**
   * RPAMSHTMLInputImage Object
   */
  public static CartesObj.IRPAMSHTMLInputImage createRPAMSHTMLInputImage() {
    return COM4J.createInstance( CartesObj.IRPAMSHTMLInputImage.class, "{1F01833F-8C64-42CC-923A-A7D45A298A7B}" );
  }

  /**
   * RPAMSHTMLInputText Object
   */
  public static CartesObj.IRPAMSHTMLInputText createRPAMSHTMLInputText() {
    return COM4J.createInstance( CartesObj.IRPAMSHTMLInputText.class, "{4F6124F5-5E19-4EF3-A0F9-CCABD9239C73}" );
  }

  /**
   * RPAMSHTMLObject Object
   */
  public static CartesObj.IRPAMSHTMLObject createRPAMSHTMLObject() {
    return COM4J.createInstance( CartesObj.IRPAMSHTMLObject.class, "{6F50F057-24D6-458A-9C1B-5F6F19231104}" );
  }

  /**
   * RPAMSHTMLRadio Object
   */
  public static CartesObj.IRPAMSHTMLRadio createRPAMSHTMLRadio() {
    return COM4J.createInstance( CartesObj.IRPAMSHTMLRadio.class, "{0C24DC93-0210-4D21-8BBD-44C47CC9D55D}" );
  }

  /**
   * RPAMSHTMLSelect Object
   */
  public static CartesObj.IRPAMSHTMLSelect createRPAMSHTMLSelect() {
    return COM4J.createInstance( CartesObj.IRPAMSHTMLSelect.class, "{677B419B-AA4F-4E04-8450-4085EFBD6618}" );
  }

  /**
   * RPAMSHTMLTable Object
   */
  public static CartesObj.IRPAMSHTMLTable createRPAMSHTMLTable() {
    return COM4J.createInstance( CartesObj.IRPAMSHTMLTable.class, "{E3E492EE-63AA-46B5-910C-BFBDB4EC8EE0}" );
  }

  /**
   * RPAMSHTMLTextArea Object
   */
  public static CartesObj.IRPAMSHTMLTextArea createRPAMSHTMLTextArea() {
    return COM4J.createInstance( CartesObj.IRPAMSHTMLTextArea.class, "{7D165258-3272-4530-BC7D-DF7553F7324E}" );
  }

  /**
   * RPAMSHTMLTr Object
   */
  public static CartesObj.IRPAMSHTMLTr createRPAMSHTMLTr() {
    return COM4J.createInstance( CartesObj.IRPAMSHTMLTr.class, "{2542C252-86B0-4E75-8FD7-F348C90B5D91}" );
  }

  /**
   * RPAJava32Component Object
   */
  public static CartesObj.IRPAJava32Component createRPAJava32Component() {
    return COM4J.createInstance( CartesObj.IRPAJava32Component.class, "{FC186157-AECD-4F65-9F5D-0A97D2EB23DD}" );
  }

  /**
   * RPAJava32Check Object
   */
  public static CartesObj.IRPAJava32Check createRPAJava32Check() {
    return COM4J.createInstance( CartesObj.IRPAJava32Check.class, "{BD3A69E8-5F49-46A9-AE49-2B492B0413FB}" );
  }

  /**
   * RPAJava32Combobox Object
   */
  public static CartesObj.IRPAJava32Combobox createRPAJava32Combobox() {
    return COM4J.createInstance( CartesObj.IRPAJava32Combobox.class, "{61A79F40-3756-4262-AA04-9ABC4CF27118}" );
  }

  /**
   * RPAJava32Edit Object
   */
  public static CartesObj.IRPAJava32Edit createRPAJava32Edit() {
    return COM4J.createInstance( CartesObj.IRPAJava32Edit.class, "{8C2A3CC4-26AD-4E88-832B-93EB50F18A28}" );
  }

  /**
   * RPAJava32Frame Object
   */
  public static CartesObj.IRPAJava32Frame createRPAJava32Frame() {
    return COM4J.createInstance( CartesObj.IRPAJava32Frame.class, "{42B98266-52E3-42D7-B531-754B2E65BE5A}" );
  }

  /**
   * RPAJava32Interfaces Object
   */
  public static CartesObj.IRPAJava32Interfaces createRPAJava32Interfaces() {
    return COM4J.createInstance( CartesObj.IRPAJava32Interfaces.class, "{C9F0E21B-8DCC-4AB1-9AD0-68B35372C5A4}" );
  }

  /**
   * RPAJava32Table Object
   */
  public static CartesObj.IRPAJava32Table createRPAJava32Table() {
    return COM4J.createInstance( CartesObj.IRPAJava32Table.class, "{34ED7486-0BF1-4AB1-93F0-49A9638B6BF2}" );
  }

  /**
   * RPASapComponent Object
   */
  public static CartesObj.IRPASapComponent createRPASapComponent() {
    return COM4J.createInstance( CartesObj.IRPASapComponent.class, "{C87796D7-27DA-4799-9505-34EF15F491E5}" );
  }

  /**
   * RPASapGrid Object
   */
  public static CartesObj.IRPASapGrid createRPASapGrid() {
    return COM4J.createInstance( CartesObj.IRPASapGrid.class, "{CDAC81B6-0BBD-4C97-84AA-54FA052FEDB0}" );
  }

  /**
   * RPASapPicture Object
   */
  public static CartesObj.IRPASapPicture createRPASapPicture() {
    return COM4J.createInstance( CartesObj.IRPASapPicture.class, "{237B00E8-2FD6-43D4-8358-A52BF715483B}" );
  }

  /**
   * RPASapButton Object
   */
  public static CartesObj.IRPASapButton createRPASapButton() {
    return COM4J.createInstance( CartesObj.IRPASapButton.class, "{1BFBAED9-06A7-44EF-BF88-24E2B5BBB0A1}" );
  }

  /**
   * RPASapControl Object
   */
  public static CartesObj.IRPASapControl createRPASapControl() {
    return COM4J.createInstance( CartesObj.IRPASapControl.class, "{69499206-D5AF-4F41-A898-8E69DC3170D7}" );
  }

  /**
   * RPASapCalendar Object
   */
  public static CartesObj.IRPASapCalendar createRPASapCalendar() {
    return COM4J.createInstance( CartesObj.IRPASapCalendar.class, "{3CE11F90-7883-4670-8F6A-9F922279284B}" );
  }

  /**
   * RPASapWin32 Object
   */
  public static CartesObj.IRPASapWin32 createRPASapWin32() {
    return COM4J.createInstance( CartesObj.IRPASapWin32.class, "{69FAEBDC-1929-46CD-B715-1090006E3481}" );
  }

  /**
   * RPASapCheckbox Object
   */
  public static CartesObj.IRPASapCheckbox createRPASapCheckbox() {
    return COM4J.createInstance( CartesObj.IRPASapCheckbox.class, "{47F72D2B-A384-4A71-AE23-75DCACAE5C34}" );
  }

  /**
   * RPASapCombobox Object
   */
  public static CartesObj.IRPASapCombobox createRPASapCombobox() {
    return COM4J.createInstance( CartesObj.IRPASapCombobox.class, "{0FD9E3E9-B088-4872-97EB-17C7B2E8FE94}" );
  }

  /**
   * RPASapMenu Object
   */
  public static CartesObj.IRPASapMenu createRPASapMenu() {
    return COM4J.createInstance( CartesObj.IRPASapMenu.class, "{44A13959-7123-4C63-A13D-C78C517D2564}" );
  }

  /**
   * RPASapRow Object
   */
  public static CartesObj.IRPASapRow createRPASapRow() {
    return COM4J.createInstance( CartesObj.IRPASapRow.class, "{635B2AEC-9FCE-4E10-9F71-5AF8EBF6733E}" );
  }

  /**
   * RPASapShell Object
   */
  public static CartesObj.IRPASapShell createRPASapShell() {
    return COM4J.createInstance( CartesObj.IRPASapShell.class, "{36611BFC-11A9-42C1-985B-48C7F71FD1B7}" );
  }

  /**
   * RPASapTab Object
   */
  public static CartesObj.IRPASapTab createRPASapTab() {
    return COM4J.createInstance( CartesObj.IRPASapTab.class, "{37A53E00-3A69-4E5E-B9AF-C4807B27B446}" );
  }

  /**
   * RPASapTable Object
   */
  public static CartesObj.IRPASapTable createRPASapTable() {
    return COM4J.createInstance( CartesObj.IRPASapTable.class, "{C678079E-D36F-4FD4-A2E4-36880738E3C1}" );
  }

  /**
   * RPASapTree Object
   */
  public static CartesObj.IRPASapTree createRPASapTree() {
    return COM4J.createInstance( CartesObj.IRPASapTree.class, "{974147ED-9F3F-490A-9ACF-1CFF2A934263}" );
  }

  /**
   * RPASapToolbar Object
   */
  public static CartesObj.IRPASapToolbar createRPASapToolbar() {
    return COM4J.createInstance( CartesObj.IRPASapToolbar.class, "{115E900C-CF02-4442-9019-91524D35B699}" );
  }

  /**
   * RPAWin32Automation Object
   */
  public static CartesObj.IRPAWin32Automation createRPAWin32Automation() {
    return COM4J.createInstance( CartesObj.IRPAWin32Automation.class, "{2E0342A1-C6EA-4E1F-A033-4124D04B1953}" );
  }

  /**
   * RPAData Object
   */
  public static CartesObj.IRPAData createRPAData() {
    return COM4J.createInstance( CartesObj.IRPAData.class, "{5057A97E-6669-4101-835D-F839990F453A}" );
  }

  /**
   * RPADataString Object
   */
  public static CartesObj.IRPADataString createRPADataString() {
    return COM4J.createInstance( CartesObj.IRPADataString.class, "{373951EA-8EF1-4B32-BDD4-CC84FA437157}" );
  }

  /**
   * Manage the Automation text boxes.
   */
  public static CartesObj.IRPAWin32Automation50004 createRPAWin32Automation50004() {
    return COM4J.createInstance( CartesObj.IRPAWin32Automation50004.class, "{171D4704-99AB-4939-8D00-5410F6337E36}" );
  }

  /**
   * Manage the accessibility text boxes.
   */
  public static CartesObj.IRPAWin32Accessibility42 createRPAWin32Accessibility42() {
    return COM4J.createInstance( CartesObj.IRPAWin32Accessibility42.class, "{653F12F4-FC85-41A6-B894-FB86A48EA4D8}" );
  }

  /**
   * RPASapEdit Object
   */
  public static CartesObj.IRPASapEdit createRPASapEdit() {
    return COM4J.createInstance( CartesObj.IRPASapEdit.class, "{8466F528-DF67-4217-B7AD-456CD40D67DA}" );
  }

  /**
   * CredentialStack Object
   */
  public static CartesObj.ICredentialStack createCredentialStack() {
    return COM4J.createInstance( CartesObj.ICredentialStack.class, "{5E5E7094-BF06-4739-B2E4-4D68E9CB94DE}" );
  }

  /**
   * RPAWin32WindowsFormsGrid Object
   */
  public static CartesObj.IRPAWin32WindowsFormsGrid createRPAWin32WindowsFormsGrid() {
    return COM4J.createInstance( CartesObj.IRPAWin32WindowsFormsGrid.class, "{5D463553-AFE6-4C5A-BD2F-43E008BE496F}" );
  }

  /**
   * RPAWin32Accessibility29 Object
   */
  public static CartesObj.IRPAWin32Accessibility29 createRPAWin32Accessibility29() {
    return COM4J.createInstance( CartesObj.IRPAWin32Accessibility29.class, "{0E71EAE4-EDCC-4FF5-A872-B47105767732}" );
  }

  /**
   * RPAWin32Accessibility25 Object
   */
  public static CartesObj.IRPAWin32Accessibility25 createRPAWin32Accessibility25() {
    return COM4J.createInstance( CartesObj.IRPAWin32Accessibility25.class, "{08970607-C7E1-4163-99DA-D97E5B0C47F4}" );
  }

  /**
   * RPAWin32Accessibility28 Object
   */
  public static CartesObj.IRPAWin32Accessibility28 createRPAWin32Accessibility28() {
    return COM4J.createInstance( CartesObj.IRPAWin32Accessibility28.class, "{237EA6E5-B9AA-441B-B75F-95EB4BA1540D}" );
  }

  /**
   * EHLAPISession Object
   */
  public static CartesObj.IEHLAPISession createEHLAPISession() {
    return COM4J.createInstance( CartesObj.IEHLAPISession.class, "{C7D36FCF-C8BB-40C5-BCE8-35C4129F4758}" );
  }
}
