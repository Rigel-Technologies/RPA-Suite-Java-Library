package RT_MSOutlook  ;

import com4j.*;

@IID("{000CD6A3-0000-0000-C000-000000000046}")
public interface SignatureProvider extends Com4jObject {
  // Methods:
  /**
   * @param siglnimg Mandatory RT_MSOutlook.SignatureLineImage parameter.
   * @param psigsetup Mandatory RT_MSOutlook.SignatureSetup parameter.
   * @param psiginfo Mandatory RT_MSOutlook.SignatureInfo parameter.
   * @param xmlDsigStream Mandatory com4j.Com4jObject parameter.
   * @return  Returns a value of type Holder<com4j.stdole.IPictureDisp>
   */

  @DISPID(1610743808) //= 0x60020000. The runtime will prefer the VTID if present
  @VTID(7)
  Holder<com4j.stdole.IPictureDisp> generateSignatureLineImage(
    RT_MSOutlook.SignatureLineImage siglnimg,
    RT_MSOutlook.SignatureSetup psigsetup,
    RT_MSOutlook.SignatureInfo psiginfo,
    com4j.Com4jObject xmlDsigStream);


  /**
   * @param parentWindow Mandatory com4j.Com4jObject parameter.
   * @param psigsetup Mandatory RT_MSOutlook.SignatureSetup parameter.
   */

  @DISPID(1610743809) //= 0x60020001. The runtime will prefer the VTID if present
  @VTID(8)
  void showSignatureSetup(
    com4j.Com4jObject parentWindow,
    RT_MSOutlook.SignatureSetup psigsetup);


  /**
   * @param parentWindow Mandatory com4j.Com4jObject parameter.
   * @param psigsetup Mandatory RT_MSOutlook.SignatureSetup parameter.
   * @param psiginfo Mandatory RT_MSOutlook.SignatureInfo parameter.
   */

  @DISPID(1610743810) //= 0x60020002. The runtime will prefer the VTID if present
  @VTID(9)
  void showSigningCeremony(
    com4j.Com4jObject parentWindow,
    RT_MSOutlook.SignatureSetup psigsetup,
    RT_MSOutlook.SignatureInfo psiginfo);


  /**
   * @param queryContinue Mandatory com4j.Com4jObject parameter.
   * @param psigsetup Mandatory RT_MSOutlook.SignatureSetup parameter.
   * @param psiginfo Mandatory RT_MSOutlook.SignatureInfo parameter.
   * @param xmlDsigStream Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(1610743811) //= 0x60020003. The runtime will prefer the VTID if present
  @VTID(10)
  void signXmlDsig(
    com4j.Com4jObject queryContinue,
    RT_MSOutlook.SignatureSetup psigsetup,
    RT_MSOutlook.SignatureInfo psiginfo,
    com4j.Com4jObject xmlDsigStream);


  /**
   * @param parentWindow Mandatory com4j.Com4jObject parameter.
   * @param psigsetup Mandatory RT_MSOutlook.SignatureSetup parameter.
   * @param psiginfo Mandatory RT_MSOutlook.SignatureInfo parameter.
   */

  @DISPID(1610743812) //= 0x60020004. The runtime will prefer the VTID if present
  @VTID(11)
  void notifySignatureAdded(
    com4j.Com4jObject parentWindow,
    RT_MSOutlook.SignatureSetup psigsetup,
    RT_MSOutlook.SignatureInfo psiginfo);


  /**
   * @param queryContinue Mandatory com4j.Com4jObject parameter.
   * @param psigsetup Mandatory RT_MSOutlook.SignatureSetup parameter.
   * @param psiginfo Mandatory RT_MSOutlook.SignatureInfo parameter.
   * @param xmlDsigStream Mandatory com4j.Com4jObject parameter.
   * @param pcontverres Mandatory Holder<RT_MSOutlook.ContentVerificationResults> parameter.
   * @param pcertverres Mandatory Holder<RT_MSOutlook.CertificateVerificationResults> parameter.
   */

  @DISPID(1610743813) //= 0x60020005. The runtime will prefer the VTID if present
  @VTID(12)
  void verifyXmlDsig(
    com4j.Com4jObject queryContinue,
    RT_MSOutlook.SignatureSetup psigsetup,
    RT_MSOutlook.SignatureInfo psiginfo,
    com4j.Com4jObject xmlDsigStream,
    Holder<RT_MSOutlook.ContentVerificationResults> pcontverres,
    Holder<RT_MSOutlook.CertificateVerificationResults> pcertverres);


  /**
   * @param parentWindow Mandatory com4j.Com4jObject parameter.
   * @param psigsetup Mandatory RT_MSOutlook.SignatureSetup parameter.
   * @param psiginfo Mandatory RT_MSOutlook.SignatureInfo parameter.
   * @param xmlDsigStream Mandatory com4j.Com4jObject parameter.
   * @param pcontverres Mandatory Holder<RT_MSOutlook.ContentVerificationResults> parameter.
   * @param pcertverres Mandatory Holder<RT_MSOutlook.CertificateVerificationResults> parameter.
   */

  @DISPID(1610743814) //= 0x60020006. The runtime will prefer the VTID if present
  @VTID(13)
  void showSignatureDetails(
    com4j.Com4jObject parentWindow,
    RT_MSOutlook.SignatureSetup psigsetup,
    RT_MSOutlook.SignatureInfo psiginfo,
    com4j.Com4jObject xmlDsigStream,
    Holder<RT_MSOutlook.ContentVerificationResults> pcontverres,
    Holder<RT_MSOutlook.CertificateVerificationResults> pcertverres);


  /**
   * @param sigprovdet Mandatory RT_MSOutlook.SignatureProviderDetail parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1610743815) //= 0x60020007. The runtime will prefer the VTID if present
  @VTID(14)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getProviderDetail(
    RT_MSOutlook.SignatureProviderDetail sigprovdet);


  /**
   * @param queryContinue Mandatory com4j.Com4jObject parameter.
   * @param stream Mandatory com4j.Com4jObject parameter.
   * @return  Returns a value of type byte[]
   */

  @DISPID(1610743816) //= 0x60020008. The runtime will prefer the VTID if present
  @VTID(15)
  byte[] hashStream(
    com4j.Com4jObject queryContinue,
    com4j.Com4jObject stream);


  // Properties:
}
