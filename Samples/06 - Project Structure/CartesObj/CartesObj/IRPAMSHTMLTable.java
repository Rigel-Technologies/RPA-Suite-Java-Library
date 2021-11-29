package CartesObj  ;

import com4j.*;

/**
 * Dispatch interface for RPAMSHTMLTable Object
 */
@IID("{A1F95E45-6BFF-4904-82A9-282B2EAC51BF}")
public interface IRPAMSHTMLTable extends CartesObj.IRPAMSHTMLComponent {
  // Methods:
  /**
   * @param row Mandatory int parameter.
   * @param cell Mandatory int parameter.
   * @param method Mandatory java.lang.String parameter.
   * @param parameters Mandatory CartesObj.IRPAParameters parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(401) //= 0x191. The runtime will prefer the VTID if present
  @VTID(38)
  java.lang.String doCell(
    int row,
    int cell,
    java.lang.String method,
    CartesObj.IRPAParameters parameters);


  /**
   * @return  Returns a value of type int
   */

  @DISPID(402) //= 0x192. The runtime will prefer the VTID if present
  @VTID(39)
  int rows();


  // Properties:
}
