package RTExcelObj  ;

import com4j.*;

@IID("{0002443A-0001-0000-C000-000000000046}")
public interface IShapes extends Com4jObject,Iterable<Com4jObject> {
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
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(10)
  int count();


  /**
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type RTExcelObj.Shape
   */

  @VTID(11)
  RTExcelObj.Shape item(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type RTExcelObj.Shape
   */

  @VTID(12)
  @DefaultMethod
  RTExcelObj.Shape _Default(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @VTID(13)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * @param type Mandatory RTExcelObj.MsoCalloutType parameter.
   * @param left Mandatory float parameter.
   * @param top Mandatory float parameter.
   * @param width Mandatory float parameter.
   * @param height Mandatory float parameter.
   * @return  Returns a value of type RTExcelObj.Shape
   */

  @VTID(14)
  RTExcelObj.Shape addCallout(
    RTExcelObj.MsoCalloutType type,
    float left,
    float top,
    float width,
    float height);


  /**
   * @param type Mandatory RTExcelObj.MsoConnectorType parameter.
   * @param beginX Mandatory float parameter.
   * @param beginY Mandatory float parameter.
   * @param endX Mandatory float parameter.
   * @param endY Mandatory float parameter.
   * @return  Returns a value of type RTExcelObj.Shape
   */

  @VTID(15)
  RTExcelObj.Shape addConnector(
    RTExcelObj.MsoConnectorType type,
    float beginX,
    float beginY,
    float endX,
    float endY);


  /**
   * @param safeArrayOfPoints Mandatory java.lang.Object parameter.
   * @return  Returns a value of type RTExcelObj.Shape
   */

  @VTID(16)
  RTExcelObj.Shape addCurve(
    @MarshalAs(NativeType.VARIANT) java.lang.Object safeArrayOfPoints);


  /**
   * @param orientation Mandatory RTExcelObj.MsoTextOrientation parameter.
   * @param left Mandatory float parameter.
   * @param top Mandatory float parameter.
   * @param width Mandatory float parameter.
   * @param height Mandatory float parameter.
   * @return  Returns a value of type RTExcelObj.Shape
   */

  @VTID(17)
  RTExcelObj.Shape addLabel(
    RTExcelObj.MsoTextOrientation orientation,
    float left,
    float top,
    float width,
    float height);


  /**
   * @param beginX Mandatory float parameter.
   * @param beginY Mandatory float parameter.
   * @param endX Mandatory float parameter.
   * @param endY Mandatory float parameter.
   * @return  Returns a value of type RTExcelObj.Shape
   */

  @VTID(18)
  RTExcelObj.Shape addLine(
    float beginX,
    float beginY,
    float endX,
    float endY);


  /**
   * @param filename Mandatory java.lang.String parameter.
   * @param linkToFile Mandatory RTExcelObj.MsoTriState parameter.
   * @param saveWithDocument Mandatory RTExcelObj.MsoTriState parameter.
   * @param left Mandatory float parameter.
   * @param top Mandatory float parameter.
   * @param width Mandatory float parameter.
   * @param height Mandatory float parameter.
   * @return  Returns a value of type RTExcelObj.Shape
   */

  @VTID(19)
  RTExcelObj.Shape addPicture(
    java.lang.String filename,
    RTExcelObj.MsoTriState linkToFile,
    RTExcelObj.MsoTriState saveWithDocument,
    float left,
    float top,
    float width,
    float height);


  /**
   * @param safeArrayOfPoints Mandatory java.lang.Object parameter.
   * @return  Returns a value of type RTExcelObj.Shape
   */

  @VTID(20)
  RTExcelObj.Shape addPolyline(
    @MarshalAs(NativeType.VARIANT) java.lang.Object safeArrayOfPoints);


  /**
   * @param type Mandatory RTExcelObj.MsoAutoShapeType parameter.
   * @param left Mandatory float parameter.
   * @param top Mandatory float parameter.
   * @param width Mandatory float parameter.
   * @param height Mandatory float parameter.
   * @return  Returns a value of type RTExcelObj.Shape
   */

  @VTID(21)
  RTExcelObj.Shape addShape(
    RTExcelObj.MsoAutoShapeType type,
    float left,
    float top,
    float width,
    float height);


  /**
   * @param presetTextEffect Mandatory RTExcelObj.MsoPresetTextEffect parameter.
   * @param text Mandatory java.lang.String parameter.
   * @param fontName Mandatory java.lang.String parameter.
   * @param fontSize Mandatory float parameter.
   * @param fontBold Mandatory RTExcelObj.MsoTriState parameter.
   * @param fontItalic Mandatory RTExcelObj.MsoTriState parameter.
   * @param left Mandatory float parameter.
   * @param top Mandatory float parameter.
   * @return  Returns a value of type RTExcelObj.Shape
   */

  @VTID(22)
  RTExcelObj.Shape addTextEffect(
    RTExcelObj.MsoPresetTextEffect presetTextEffect,
    java.lang.String text,
    java.lang.String fontName,
    float fontSize,
    RTExcelObj.MsoTriState fontBold,
    RTExcelObj.MsoTriState fontItalic,
    float left,
    float top);


  /**
   * @param orientation Mandatory RTExcelObj.MsoTextOrientation parameter.
   * @param left Mandatory float parameter.
   * @param top Mandatory float parameter.
   * @param width Mandatory float parameter.
   * @param height Mandatory float parameter.
   * @return  Returns a value of type RTExcelObj.Shape
   */

  @VTID(23)
  RTExcelObj.Shape addTextbox(
    RTExcelObj.MsoTextOrientation orientation,
    float left,
    float top,
    float width,
    float height);


  /**
   * @param editingType Mandatory RTExcelObj.MsoEditingType parameter.
   * @param x1 Mandatory float parameter.
   * @param y1 Mandatory float parameter.
   * @return  Returns a value of type RTExcelObj.FreeformBuilder
   */

  @VTID(24)
  RTExcelObj.FreeformBuilder buildFreeform(
    RTExcelObj.MsoEditingType editingType,
    float x1,
    float y1);


  /**
   * <p>
   * Getter method for the COM property "Range"
   * </p>
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type RTExcelObj.ShapeRange
   */

  @VTID(25)
  RTExcelObj.ShapeRange range(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   */

  @VTID(26)
  void selectAll();


  /**
   * @param type Mandatory RTExcelObj.XlFormControl parameter.
   * @param left Mandatory int parameter.
   * @param top Mandatory int parameter.
   * @param width Mandatory int parameter.
   * @param height Mandatory int parameter.
   * @return  Returns a value of type RTExcelObj.Shape
   */

  @VTID(27)
  RTExcelObj.Shape addFormControl(
    RTExcelObj.XlFormControl type,
    int left,
    int top,
    int width,
    int height);


  /**
   * @param classType Optional parameter. Default value is com4j.Variant.getMissing()
   * @param filename Optional parameter. Default value is com4j.Variant.getMissing()
   * @param link Optional parameter. Default value is com4j.Variant.getMissing()
   * @param displayAsIcon Optional parameter. Default value is com4j.Variant.getMissing()
   * @param iconFileName Optional parameter. Default value is com4j.Variant.getMissing()
   * @param iconIndex Optional parameter. Default value is com4j.Variant.getMissing()
   * @param iconLabel Optional parameter. Default value is com4j.Variant.getMissing()
   * @param left Optional parameter. Default value is com4j.Variant.getMissing()
   * @param top Optional parameter. Default value is com4j.Variant.getMissing()
   * @param width Optional parameter. Default value is com4j.Variant.getMissing()
   * @param height Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type RTExcelObj.Shape
   */

  @VTID(28)
  RTExcelObj.Shape addOLEObject(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object classType,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object filename,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object link,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object displayAsIcon,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object iconFileName,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object iconIndex,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object iconLabel,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object left,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object top,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object width,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object height);


  /**
   * @param type Mandatory RTExcelObj.MsoDiagramType parameter.
   * @param left Mandatory float parameter.
   * @param top Mandatory float parameter.
   * @param width Mandatory float parameter.
   * @param height Mandatory float parameter.
   * @return  Returns a value of type RTExcelObj.Shape
   */

  @VTID(29)
  RTExcelObj.Shape addDiagram(
    RTExcelObj.MsoDiagramType type,
    float left,
    float top,
    float width,
    float height);


  /**
   * @param left Mandatory float parameter.
   * @param top Mandatory float parameter.
   * @param width Mandatory float parameter.
   * @param height Mandatory float parameter.
   * @return  Returns a value of type RTExcelObj.Shape
   */

  @VTID(30)
  RTExcelObj.Shape addCanvas(
    float left,
    float top,
    float width,
    float height);


  /**
   * @param xlChartType Optional parameter. Default value is com4j.Variant.getMissing()
   * @param left Optional parameter. Default value is com4j.Variant.getMissing()
   * @param top Optional parameter. Default value is com4j.Variant.getMissing()
   * @param width Optional parameter. Default value is com4j.Variant.getMissing()
   * @param height Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type RTExcelObj.Shape
   */

  @VTID(31)
  RTExcelObj.Shape addChart(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object xlChartType,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object left,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object top,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object width,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object height);


  /**
   * @param layout Mandatory RTExcelObj.SmartArtLayout parameter.
   * @param left Optional parameter. Default value is com4j.Variant.getMissing()
   * @param top Optional parameter. Default value is com4j.Variant.getMissing()
   * @param width Optional parameter. Default value is com4j.Variant.getMissing()
   * @param height Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type RTExcelObj.Shape
   */

  @VTID(32)
  RTExcelObj.Shape addSmartArt(
    RTExcelObj.SmartArtLayout layout,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object left,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object top,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object width,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object height);


  /**
   * @param style Optional parameter. Default value is com4j.Variant.getMissing()
   * @param xlChartType Optional parameter. Default value is com4j.Variant.getMissing()
   * @param left Optional parameter. Default value is com4j.Variant.getMissing()
   * @param top Optional parameter. Default value is com4j.Variant.getMissing()
   * @param width Optional parameter. Default value is com4j.Variant.getMissing()
   * @param height Optional parameter. Default value is com4j.Variant.getMissing()
   * @param newLayout Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type RTExcelObj.Shape
   */

  @VTID(33)
  RTExcelObj.Shape addChart2(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object style,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object xlChartType,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object left,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object top,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object width,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object height,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object newLayout);


  /**
   * @param filename Mandatory java.lang.String parameter.
   * @param linkToFile Mandatory RTExcelObj.MsoTriState parameter.
   * @param saveWithDocument Mandatory RTExcelObj.MsoTriState parameter.
   * @param left Mandatory float parameter.
   * @param top Mandatory float parameter.
   * @param width Mandatory float parameter.
   * @param height Mandatory float parameter.
   * @param compress Mandatory RTExcelObj.MsoPictureCompress parameter.
   * @return  Returns a value of type RTExcelObj.Shape
   */

  @VTID(34)
  RTExcelObj.Shape addPicture2(
    java.lang.String filename,
    RTExcelObj.MsoTriState linkToFile,
    RTExcelObj.MsoTriState saveWithDocument,
    float left,
    float top,
    float width,
    float height,
    RTExcelObj.MsoPictureCompress compress);


  // Properties:
}
