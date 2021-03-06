package RT_MSOutlook  ;

import com4j.*;

@IID("{8A64A872-FC6B-4D4A-926E-3A3689562C1C}")
public interface CustomTaskPaneEvents extends Com4jObject {
  // Methods:
  /**
   * @param customTaskPaneInst Mandatory RT_MSOutlook._CustomTaskPane parameter.
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  void visibleStateChange(
    RT_MSOutlook._CustomTaskPane customTaskPaneInst);


  /**
   * @param customTaskPaneInst Mandatory RT_MSOutlook._CustomTaskPane parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  void dockPositionStateChange(
    RT_MSOutlook._CustomTaskPane customTaskPaneInst);


  // Properties:
}
