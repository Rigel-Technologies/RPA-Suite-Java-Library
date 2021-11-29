package CE_Data  ;

import com4j.*;

/**
 * Defines methods to create COM objects
 */
public abstract class ClassFactory {
  private ClassFactory() {} // instanciation is not allowed


  /**
   * CartesData Object
   */
  public static CE_Data.ICartesData createCartesData() {
    return COM4J.createInstance( CE_Data.ICartesData.class, "{4D5E4572-D622-4C49-9BD3-4851CCF2B5E3}" );
  }

  /**
   * CartesEnumeratorData Object
   */
  public static CE_Data.ICartesEnumeratorData createCartesEnumeratorData() {
    return COM4J.createInstance( CE_Data.ICartesEnumeratorData.class, "{B91A4E47-32C6-42E4-87B9-7C84FD2F85B7}" );
  }

  /**
   * XMLRecord Object
   */
  public static CE_Data.IXMLRecord createXMLRecord() {
    return COM4J.createInstance( CE_Data.IXMLRecord.class, "{CF708F6E-B372-449B-A360-236C094A7549}" );
  }

  /**
   * XMLFile Object
   */
  public static CE_Data.IXMLFile createXMLFile() {
    return COM4J.createInstance( CE_Data.IXMLFile.class, "{8C2A7179-B593-4BC2-9270-32E10E58C126}" );
  }

  /**
   * XMLKey Object
   */
  public static CE_Data.IXMLKey createXMLKey() {
    return COM4J.createInstance( CE_Data.IXMLKey.class, "{24ABC34F-B404-4BB2-AC29-6D949464E8AE}" );
  }

  /**
   * DateTime Object
   */
  public static CE_Data.IDateTime createDateTime() {
    return COM4J.createInstance( CE_Data.IDateTime.class, "{E6678807-B2D3-474F-902C-BC08BF6BC215}" );
  }
}
