package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface PageSetup extends Com4jObject {
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
   * <p>
   * Getter method for the COM property "BlackAndWhite"
   * </p>
   */

  @DISPID(1009)
  @PropGet
  boolean blackAndWhite();


  /**
   * <p>
   * Setter method for the COM property "BlackAndWhite"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1009)
  @PropPut
  void blackAndWhite(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "BottomMargin"
   * </p>
   */

  @DISPID(1002)
  @PropGet
  double bottomMargin();


  /**
   * <p>
   * Setter method for the COM property "BottomMargin"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @DISPID(1002)
  @PropPut
  void bottomMargin(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "CenterFooter"
   * </p>
   */

  @DISPID(1010)
  @PropGet
  java.lang.String centerFooter();


  /**
   * <p>
   * Setter method for the COM property "CenterFooter"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1010)
  @PropPut
  void centerFooter(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "CenterHeader"
   * </p>
   */

  @DISPID(1011)
  @PropGet
  java.lang.String centerHeader();


  /**
   * <p>
   * Setter method for the COM property "CenterHeader"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1011)
  @PropPut
  void centerHeader(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "CenterHorizontally"
   * </p>
   */

  @DISPID(1005)
  @PropGet
  boolean centerHorizontally();


  /**
   * <p>
   * Setter method for the COM property "CenterHorizontally"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1005)
  @PropPut
  void centerHorizontally(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "CenterVertically"
   * </p>
   */

  @DISPID(1006)
  @PropGet
  boolean centerVertically();


  /**
   * <p>
   * Setter method for the COM property "CenterVertically"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1006)
  @PropPut
  void centerVertically(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ChartSize"
   * </p>
   */

  @DISPID(1012)
  @PropGet
  RTExcelObj.XlObjectSize chartSize();


  /**
   * <p>
   * Setter method for the COM property "ChartSize"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlObjectSize parameter.
   */

  @DISPID(1012)
  @PropPut
  void chartSize(
    RTExcelObj.XlObjectSize rhs);


  /**
   * <p>
   * Getter method for the COM property "Draft"
   * </p>
   */

  @DISPID(1020)
  @PropGet
  boolean draft();


  /**
   * <p>
   * Setter method for the COM property "Draft"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1020)
  @PropPut
  void draft(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "FirstPageNumber"
   * </p>
   */

  @DISPID(1008)
  @PropGet
  int firstPageNumber();


  /**
   * <p>
   * Setter method for the COM property "FirstPageNumber"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(1008)
  @PropPut
  void firstPageNumber(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "FitToPagesTall"
   * </p>
   */

  @DISPID(1013)
  @PropGet
  java.lang.Object fitToPagesTall();


  /**
   * <p>
   * Setter method for the COM property "FitToPagesTall"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(1013)
  @PropPut
  void fitToPagesTall(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "FitToPagesWide"
   * </p>
   */

  @DISPID(1014)
  @PropGet
  java.lang.Object fitToPagesWide();


  /**
   * <p>
   * Setter method for the COM property "FitToPagesWide"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(1014)
  @PropPut
  void fitToPagesWide(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "FooterMargin"
   * </p>
   */

  @DISPID(1015)
  @PropGet
  double footerMargin();


  /**
   * <p>
   * Setter method for the COM property "FooterMargin"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @DISPID(1015)
  @PropPut
  void footerMargin(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "HeaderMargin"
   * </p>
   */

  @DISPID(1016)
  @PropGet
  double headerMargin();


  /**
   * <p>
   * Setter method for the COM property "HeaderMargin"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @DISPID(1016)
  @PropPut
  void headerMargin(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "LeftFooter"
   * </p>
   */

  @DISPID(1017)
  @PropGet
  java.lang.String leftFooter();


  /**
   * <p>
   * Setter method for the COM property "LeftFooter"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1017)
  @PropPut
  void leftFooter(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "LeftHeader"
   * </p>
   */

  @DISPID(1018)
  @PropGet
  java.lang.String leftHeader();


  /**
   * <p>
   * Setter method for the COM property "LeftHeader"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1018)
  @PropPut
  void leftHeader(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "LeftMargin"
   * </p>
   */

  @DISPID(999)
  @PropGet
  double leftMargin();


  /**
   * <p>
   * Setter method for the COM property "LeftMargin"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @DISPID(999)
  @PropPut
  void leftMargin(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "Order"
   * </p>
   */

  @DISPID(192)
  @PropGet
  RTExcelObj.XlOrder order();


  /**
   * <p>
   * Setter method for the COM property "Order"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlOrder parameter.
   */

  @DISPID(192)
  @PropPut
  void order(
    RTExcelObj.XlOrder rhs);


  /**
   * <p>
   * Getter method for the COM property "Orientation"
   * </p>
   */

  @DISPID(134)
  @PropGet
  RTExcelObj.XlPageOrientation orientation();


  /**
   * <p>
   * Setter method for the COM property "Orientation"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlPageOrientation parameter.
   */

  @DISPID(134)
  @PropPut
  void orientation(
    RTExcelObj.XlPageOrientation rhs);


  /**
   * <p>
   * Getter method for the COM property "PaperSize"
   * </p>
   */

  @DISPID(1007)
  @PropGet
  RTExcelObj.XlPaperSize paperSize();


  /**
   * <p>
   * Setter method for the COM property "PaperSize"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlPaperSize parameter.
   */

  @DISPID(1007)
  @PropPut
  void paperSize(
    RTExcelObj.XlPaperSize rhs);


  /**
   * <p>
   * Getter method for the COM property "PrintArea"
   * </p>
   */

  @DISPID(1019)
  @PropGet
  java.lang.String printArea();


  /**
   * <p>
   * Setter method for the COM property "PrintArea"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1019)
  @PropPut
  void printArea(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "PrintGridlines"
   * </p>
   */

  @DISPID(1004)
  @PropGet
  boolean printGridlines();


  /**
   * <p>
   * Setter method for the COM property "PrintGridlines"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1004)
  @PropPut
  void printGridlines(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "PrintHeadings"
   * </p>
   */

  @DISPID(1003)
  @PropGet
  boolean printHeadings();


  /**
   * <p>
   * Setter method for the COM property "PrintHeadings"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1003)
  @PropPut
  void printHeadings(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "PrintNotes"
   * </p>
   */

  @DISPID(1021)
  @PropGet
  boolean printNotes();


  /**
   * <p>
   * Setter method for the COM property "PrintNotes"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1021)
  @PropPut
  void printNotes(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "PrintQuality"
   * </p>
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1022)
  @PropGet
  java.lang.Object printQuality(
    @Optional java.lang.Object index);


  /**
   * <p>
   * Setter method for the COM property "PrintQuality"
   * </p>
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(1022)
  @PropPut
  void printQuality(
    @Optional java.lang.Object index,
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "PrintTitleColumns"
   * </p>
   */

  @DISPID(1023)
  @PropGet
  java.lang.String printTitleColumns();


  /**
   * <p>
   * Setter method for the COM property "PrintTitleColumns"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1023)
  @PropPut
  void printTitleColumns(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "PrintTitleRows"
   * </p>
   */

  @DISPID(1024)
  @PropGet
  java.lang.String printTitleRows();


  /**
   * <p>
   * Setter method for the COM property "PrintTitleRows"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1024)
  @PropPut
  void printTitleRows(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "RightFooter"
   * </p>
   */

  @DISPID(1025)
  @PropGet
  java.lang.String rightFooter();


  /**
   * <p>
   * Setter method for the COM property "RightFooter"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1025)
  @PropPut
  void rightFooter(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "RightHeader"
   * </p>
   */

  @DISPID(1026)
  @PropGet
  java.lang.String rightHeader();


  /**
   * <p>
   * Setter method for the COM property "RightHeader"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1026)
  @PropPut
  void rightHeader(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "RightMargin"
   * </p>
   */

  @DISPID(1000)
  @PropGet
  double rightMargin();


  /**
   * <p>
   * Setter method for the COM property "RightMargin"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @DISPID(1000)
  @PropPut
  void rightMargin(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "TopMargin"
   * </p>
   */

  @DISPID(1001)
  @PropGet
  double topMargin();


  /**
   * <p>
   * Setter method for the COM property "TopMargin"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @DISPID(1001)
  @PropPut
  void topMargin(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "Zoom"
   * </p>
   */

  @DISPID(663)
  @PropGet
  java.lang.Object zoom();


  /**
   * <p>
   * Setter method for the COM property "Zoom"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(663)
  @PropPut
  void zoom(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "PrintComments"
   * </p>
   */

  @DISPID(1524)
  @PropGet
  RTExcelObj.XlPrintLocation printComments();


  /**
   * <p>
   * Setter method for the COM property "PrintComments"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlPrintLocation parameter.
   */

  @DISPID(1524)
  @PropPut
  void printComments(
    RTExcelObj.XlPrintLocation rhs);


  /**
   * <p>
   * Getter method for the COM property "PrintErrors"
   * </p>
   */

  @DISPID(2149)
  @PropGet
  RTExcelObj.XlPrintErrors printErrors();


  /**
   * <p>
   * Setter method for the COM property "PrintErrors"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlPrintErrors parameter.
   */

  @DISPID(2149)
  @PropPut
  void printErrors(
    RTExcelObj.XlPrintErrors rhs);


  /**
   * <p>
   * Getter method for the COM property "CenterHeaderPicture"
   * </p>
   */

  @DISPID(2150)
  @PropGet
  RTExcelObj.Graphic centerHeaderPicture();


  /**
   * <p>
   * Getter method for the COM property "CenterFooterPicture"
   * </p>
   */

  @DISPID(2151)
  @PropGet
  RTExcelObj.Graphic centerFooterPicture();


  /**
   * <p>
   * Getter method for the COM property "LeftHeaderPicture"
   * </p>
   */

  @DISPID(2152)
  @PropGet
  RTExcelObj.Graphic leftHeaderPicture();


  /**
   * <p>
   * Getter method for the COM property "LeftFooterPicture"
   * </p>
   */

  @DISPID(2153)
  @PropGet
  RTExcelObj.Graphic leftFooterPicture();


  /**
   * <p>
   * Getter method for the COM property "RightHeaderPicture"
   * </p>
   */

  @DISPID(2154)
  @PropGet
  RTExcelObj.Graphic rightHeaderPicture();


  /**
   * <p>
   * Getter method for the COM property "RightFooterPicture"
   * </p>
   */

  @DISPID(2155)
  @PropGet
  RTExcelObj.Graphic rightFooterPicture();


  /**
   * <p>
   * Getter method for the COM property "OddAndEvenPagesHeaderFooter"
   * </p>
   */

  @DISPID(2600)
  @PropGet
  boolean oddAndEvenPagesHeaderFooter();


  /**
   * <p>
   * Setter method for the COM property "OddAndEvenPagesHeaderFooter"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2600)
  @PropPut
  void oddAndEvenPagesHeaderFooter(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DifferentFirstPageHeaderFooter"
   * </p>
   */

  @DISPID(2601)
  @PropGet
  boolean differentFirstPageHeaderFooter();


  /**
   * <p>
   * Setter method for the COM property "DifferentFirstPageHeaderFooter"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2601)
  @PropPut
  void differentFirstPageHeaderFooter(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ScaleWithDocHeaderFooter"
   * </p>
   */

  @DISPID(2602)
  @PropGet
  boolean scaleWithDocHeaderFooter();


  /**
   * <p>
   * Setter method for the COM property "ScaleWithDocHeaderFooter"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2602)
  @PropPut
  void scaleWithDocHeaderFooter(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "AlignMarginsHeaderFooter"
   * </p>
   */

  @DISPID(2603)
  @PropGet
  boolean alignMarginsHeaderFooter();


  /**
   * <p>
   * Setter method for the COM property "AlignMarginsHeaderFooter"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2603)
  @PropPut
  void alignMarginsHeaderFooter(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Pages"
   * </p>
   */

  @DISPID(2604)
  @PropGet
  RTExcelObj.Pages pages();


  /**
   * <p>
   * Getter method for the COM property "EvenPage"
   * </p>
   */

  @DISPID(2605)
  @PropGet
  RTExcelObj.Page evenPage();


  /**
   * <p>
   * Getter method for the COM property "FirstPage"
   * </p>
   */

  @DISPID(2606)
  @PropGet
  RTExcelObj.Page firstPage();


  // Properties:
}
