package RT_MSOutlook  ;

import com4j.*;

/**
 * Defines methods to create COM objects
 */
public abstract class ClassFactory {
  private ClassFactory() {} // instanciation is not allowed


  public static RT_MSOutlook._DRecipientControl create_RecipientControl() {
    return COM4J.createInstance( RT_MSOutlook._DRecipientControl.class, "{0006F023-0000-0000-C000-000000000046}" );
  }

  public static RT_MSOutlook._DDocSiteControl create_DocSiteControl() {
    return COM4J.createInstance( RT_MSOutlook._DDocSiteControl.class, "{0006F024-0000-0000-C000-000000000046}" );
  }

  /**
   * Outlook TextBox
   */
  public static RT_MSOutlook._OlkTextBox createOlkTextBox() {
    return COM4J.createInstance( RT_MSOutlook._OlkTextBox.class, "{0006F068-0000-0000-C000-000000000046}" );
  }

  public static RT_MSOutlook._OlkLabel createOlkLabel() {
    return COM4J.createInstance( RT_MSOutlook._OlkLabel.class, "{0006F067-0000-0000-C000-000000000046}" );
  }

  public static RT_MSOutlook._OlkCommandButton createOlkCommandButton() {
    return COM4J.createInstance( RT_MSOutlook._OlkCommandButton.class, "{0006F04A-0000-0000-C000-000000000046}" );
  }

  public static RT_MSOutlook._OlkCheckBox createOlkCheckBox() {
    return COM4J.createInstance( RT_MSOutlook._OlkCheckBox.class, "{0006F04C-0000-0000-C000-000000000046}" );
  }

  public static RT_MSOutlook._OlkOptionButton createOlkOptionButton() {
    return COM4J.createInstance( RT_MSOutlook._OlkOptionButton.class, "{0006F04B-0000-0000-C000-000000000046}" );
  }

  public static RT_MSOutlook._OlkComboBox createOlkComboBox() {
    return COM4J.createInstance( RT_MSOutlook._OlkComboBox.class, "{0006F04D-0000-0000-C000-000000000046}" );
  }

  public static RT_MSOutlook._OlkListBox createOlkListBox() {
    return COM4J.createInstance( RT_MSOutlook._OlkListBox.class, "{0006F04E-0000-0000-C000-000000000046}" );
  }

  public static RT_MSOutlook._OlkInfoBar createOlkInfoBar() {
    return COM4J.createInstance( RT_MSOutlook._OlkInfoBar.class, "{0006F054-0000-0000-C000-000000000046}" );
  }

  public static RT_MSOutlook._OlkContactPhoto createOlkContactPhoto() {
    return COM4J.createInstance( RT_MSOutlook._OlkContactPhoto.class, "{0006F04F-0000-0000-C000-000000000046}" );
  }

  public static RT_MSOutlook._OlkBusinessCardControl createOlkBusinessCardControl() {
    return COM4J.createInstance( RT_MSOutlook._OlkBusinessCardControl.class, "{0006F050-0000-0000-C000-000000000046}" );
  }

  public static RT_MSOutlook._OlkPageControl createOlkPageControl() {
    return COM4J.createInstance( RT_MSOutlook._OlkPageControl.class, "{0006F055-0000-0000-C000-000000000046}" );
  }

  public static RT_MSOutlook._OlkDateControl createOlkDateControl() {
    return COM4J.createInstance( RT_MSOutlook._OlkDateControl.class, "{0006F056-0000-0000-C000-000000000046}" );
  }

  public static RT_MSOutlook._OlkTimeControl createOlkTimeControl() {
    return COM4J.createInstance( RT_MSOutlook._OlkTimeControl.class, "{0006F051-0000-0000-C000-000000000046}" );
  }

  public static RT_MSOutlook._OlkCategory createOlkCategory() {
    return COM4J.createInstance( RT_MSOutlook._OlkCategory.class, "{0006F053-0000-0000-C000-000000000046}" );
  }

  public static RT_MSOutlook._OlkFrameHeader createOlkFrameHeader() {
    return COM4J.createInstance( RT_MSOutlook._OlkFrameHeader.class, "{0006F057-0000-0000-C000-000000000046}" );
  }

  public static RT_MSOutlook._OlkSenderPhoto createOlkSenderPhoto() {
    return COM4J.createInstance( RT_MSOutlook._OlkSenderPhoto.class, "{0006F058-0000-0000-C000-000000000046}" );
  }

  public static RT_MSOutlook._OlkTimeZoneControl createOlkTimeZoneControl() {
    return COM4J.createInstance( RT_MSOutlook._OlkTimeZoneControl.class, "{0006F059-0000-0000-C000-000000000046}" );
  }

  public static RT_MSOutlook._Application createApplication() {
    return COM4J.createInstance( RT_MSOutlook._Application.class, "{0006F03A-0000-0000-C000-000000000046}" );
  }

  public static RT_MSOutlook._CustomXMLSchemaCollection createCustomXMLSchemaCollection() {
    return COM4J.createInstance( RT_MSOutlook._CustomXMLSchemaCollection.class, "{000CDB0D-0000-0000-C000-000000000046}" );
  }
}
