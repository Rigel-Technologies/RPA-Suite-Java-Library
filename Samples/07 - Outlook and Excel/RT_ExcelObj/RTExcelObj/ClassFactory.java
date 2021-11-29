package RTExcelObj  ;

import com4j.*;

/**
 * Defines methods to create COM objects
 */
public abstract class ClassFactory {
  private ClassFactory() {} // instanciation is not allowed


  public static RTExcelObj._CustomXMLSchemaCollection createCustomXMLSchemaCollection() {
    return COM4J.createInstance( RTExcelObj._CustomXMLSchemaCollection.class, "{000CDB0D-0000-0000-C000-000000000046}" );
  }

  public static RTExcelObj._Windows createWindows() {
    return COM4J.createInstance( RTExcelObj._Windows.class, "{0002E185-0000-0000-C000-000000000046}" );
  }

  public static RTExcelObj._LinkedWindows createLinkedWindows() {
    return COM4J.createInstance( RTExcelObj._LinkedWindows.class, "{0002E187-0000-0000-C000-000000000046}" );
  }

  public static RTExcelObj._ReferencesEvents createReferencesEvents() {
    return COM4J.createInstance( RTExcelObj._ReferencesEvents.class, "{0002E119-0000-0000-C000-000000000046}" );
  }

  public static RTExcelObj._CommandBarControlEvents createCommandBarEvents() {
    return COM4J.createInstance( RTExcelObj._CommandBarControlEvents.class, "{0002E132-0000-0000-C000-000000000046}" );
  }

  public static RTExcelObj._ProjectTemplate createProjectTemplate() {
    return COM4J.createInstance( RTExcelObj._ProjectTemplate.class, "{32CDF9E0-1602-11CE-BFDC-08002B2B8CDA}" );
  }

  public static RTExcelObj._VBProject createVBProject() {
    return COM4J.createInstance( RTExcelObj._VBProject.class, "{0002E169-0000-0000-C000-000000000046}" );
  }

  public static RTExcelObj._VBProjects createVBProjects() {
    return COM4J.createInstance( RTExcelObj._VBProjects.class, "{0002E101-0000-0000-C000-000000000046}" );
  }

  public static RTExcelObj._Components createComponents() {
    return COM4J.createInstance( RTExcelObj._Components.class, "{BE39F3D6-1B13-11D0-887F-00A0C90F2744}" );
  }

  public static RTExcelObj._VBComponents createVBComponents() {
    return COM4J.createInstance( RTExcelObj._VBComponents.class, "{BE39F3D7-1B13-11D0-887F-00A0C90F2744}" );
  }

  public static RTExcelObj._Component createComponent() {
    return COM4J.createInstance( RTExcelObj._Component.class, "{BE39F3D8-1B13-11D0-887F-00A0C90F2744}" );
  }

  public static RTExcelObj._VBComponent createVBComponent() {
    return COM4J.createInstance( RTExcelObj._VBComponent.class, "{BE39F3DA-1B13-11D0-887F-00A0C90F2744}" );
  }

  public static RTExcelObj._Properties createProperties() {
    return COM4J.createInstance( RTExcelObj._Properties.class, "{0002E18B-0000-0000-C000-000000000046}" );
  }

  public static RTExcelObj._AddIns createAddins() {
    return COM4J.createInstance( RTExcelObj._AddIns.class, "{DA936B63-AC8B-11D1-B6E5-00A0C90F2744}" );
  }

  public static RTExcelObj._CodeModule createCodeModule() {
    return COM4J.createInstance( RTExcelObj._CodeModule.class, "{0002E170-0000-0000-C000-000000000046}" );
  }

  public static RTExcelObj._CodePanes createCodePanes() {
    return COM4J.createInstance( RTExcelObj._CodePanes.class, "{0002E174-0000-0000-C000-000000000046}" );
  }

  public static RTExcelObj._CodePane createCodePane() {
    return COM4J.createInstance( RTExcelObj._CodePane.class, "{0002E178-0000-0000-C000-000000000046}" );
  }

  public static RTExcelObj._References createReferences() {
    return COM4J.createInstance( RTExcelObj._References.class, "{0002E17C-0000-0000-C000-000000000046}" );
  }

  public static RTExcelObj._QueryTable createQueryTable() {
    return COM4J.createInstance( RTExcelObj._QueryTable.class, "{59191DA1-EA47-11CE-A51F-00AA0061507F}" );
  }

  public static RTExcelObj._Application createApplication() {
    return COM4J.createInstance( RTExcelObj._Application.class, "{00024500-0000-0000-C000-000000000046}" );
  }

  public static RTExcelObj._Chart createChart() {
    return COM4J.createInstance( RTExcelObj._Chart.class, "{00020821-0000-0000-C000-000000000046}" );
  }

  public static RTExcelObj._Worksheet createWorksheet() {
    return COM4J.createInstance( RTExcelObj._Worksheet.class, "{00020820-0000-0000-C000-000000000046}" );
  }

  public static RTExcelObj._Global createGlobal() {
    return COM4J.createInstance( RTExcelObj._Global.class, "{00020812-0000-0000-C000-000000000046}" );
  }

  public static RTExcelObj._Workbook createWorkbook() {
    return COM4J.createInstance( RTExcelObj._Workbook.class, "{00020819-0000-0000-C000-000000000046}" );
  }

  public static RTExcelObj._OLEObject createOLEObject() {
    return COM4J.createInstance( RTExcelObj._OLEObject.class, "{00020818-0000-0000-C000-000000000046}" );
  }
}
