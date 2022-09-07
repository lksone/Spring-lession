package com.demo.respose.utils

;

import com4j.Com4jObject;
import com4j.DISPID;
import com4j.IID;
import com4j.VTID;

@IID("{000D0736-0000-0000-C000-000000000046}")
public interface IVContainerProperties extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of typeIVApplication
   */

  @DISPID(1610743808) //= 0x60020000. The runtime will prefer the VTID if present
  @VTID(7)
 IVApplication application();


  /**
   * <p>
   * Getter method for the COM property "Stat"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1610743809) //= 0x60020001. The runtime will prefer the VTID if present
  @VTID(8)
  short stat();


  /**
   * <p>
   * Getter method for the COM property "ObjectType"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1610743810) //= 0x60020002. The runtime will prefer the VTID if present
  @VTID(9)
  short objectType();


  /**
   * <p>
   * Getter method for the COM property "Document"
   * </p>
   * @return  Returns a value of typeIVDocument
   */

  @DISPID(1610743811) //= 0x60020003. The runtime will prefer the VTID if present
  @VTID(10)
 IVDocument document();


  /**
   * <p>
   * Getter method for the COM property "Shape"
   * </p>
   * @return  Returns a value of typeIVShape
   */

  @DISPID(1610743812) //= 0x60020004. The runtime will prefer the VTID if present
  @VTID(11)
 IVShape shape();


  /**
   * <p>
   * Getter method for the COM property "ContainerType"
   * </p>
   * @return  Returns a value of typeVisContainerTypes
   */

  @DISPID(1610743813) //= 0x60020005. The runtime will prefer the VTID if present
  @VTID(12)
 VisContainerTypes containerType();


  /**
   * <p>
   * Getter method for the COM property "ListAlignment"
   * </p>
   * @return  Returns a value of typeVisListAlignment
   */

  @DISPID(1610743814) //= 0x60020006. The runtime will prefer the VTID if present
  @VTID(13)
 VisListAlignment listAlignment();


  /**
   * <p>
   * Setter method for the COM property "ListAlignment"
   * </p>
   * @param alignment MandatoryVisListAlignment parameter.
   */

  @DISPID(1610743814) //= 0x60020006. The runtime will prefer the VTID if present
  @VTID(14)
  void listAlignment(
   VisListAlignment alignment);


  /**
   * <p>
   * Getter method for the COM property "ListDirection"
   * </p>
   * @return  Returns a value of typeVisListDirection
   */

  @DISPID(1610743816) //= 0x60020008. The runtime will prefer the VTID if present
  @VTID(15)
 VisListDirection listDirection();


  /**
   * <p>
   * Setter method for the COM property "ListDirection"
   * </p>
   * @param dir MandatoryVisListDirection parameter.
   */

  @DISPID(1610743816) //= 0x60020008. The runtime will prefer the VTID if present
  @VTID(16)
  void listDirection(
   VisListDirection dir);


  /**
   * <p>
   * Getter method for the COM property "LockMembership"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743818) //= 0x6002000a. The runtime will prefer the VTID if present
  @VTID(17)
  boolean lockMembership();


  /**
   * <p>
   * Setter method for the COM property "LockMembership"
   * </p>
   * @param isLocked Mandatory boolean parameter.
   */

  @DISPID(1610743818) //= 0x6002000a. The runtime will prefer the VTID if present
  @VTID(18)
  void lockMembership(
    boolean isLocked);


  /**
   * <p>
   * Getter method for the COM property "ResizeAsNeeded"
   * </p>
   * @return  Returns a value of typeVisContainerAutoResize
   */

  @DISPID(1610743820) //= 0x6002000c. The runtime will prefer the VTID if present
  @VTID(19)
 

    VisContainerAutoResize resizeAsNeeded();


  /**
   * <p>
   * Setter method for the COM property "ResizeAsNeeded"
   * </p>
   * @param resizeBehavior MandatoryVisContainerAutoResize parameter.
   */

  @DISPID(1610743820) //= 0x6002000c. The runtime will prefer the VTID if present
  @VTID(20)
  void resizeAsNeeded(
   VisContainerAutoResize resizeBehavior);


  /**
   */

  @DISPID(1610743822) //= 0x6002000e. The runtime will prefer the VTID if present
  @VTID(21)
  void disband();


  /**
   */

  @DISPID(1610743823) //= 0x6002000f. The runtime will prefer the VTID if present
  @VTID(22)
  void fitToContents();


  /**
   * @param marginUnits MandatorytagVisUnitCodes parameter.
   * @return  Returns a value of type double
   */

  @DISPID(1610743824) //= 0x60020010. The runtime will prefer the VTID if present
  @VTID(23)
  double getMargin(
   tagVisUnitCodes marginUnits);


  /**
   * @param marginUnits MandatorytagVisUnitCodes parameter.
   * @param marginSize Mandatory double parameter.
   */

  @DISPID(1610743825) //= 0x60020011. The runtime will prefer the VTID if present
  @VTID(24)
  void setMargin(
   tagVisUnitCodes marginUnits,
    double marginSize);


  /**
   * @param spacingUnits MandatorytagVisUnitCodes parameter.
   * @return  Returns a value of type double
   */

  @DISPID(1610743826) //= 0x60020012. The runtime will prefer the VTID if present
  @VTID(25)
  double getListSpacing(
   tagVisUnitCodes spacingUnits);


  /**
   * @param spacingUnits MandatorytagVisUnitCodes parameter.
   * @param spacingSize Mandatory double parameter.
   */

  @DISPID(1610743827) //= 0x60020013. The runtime will prefer the VTID if present
  @VTID(26)
  void setListSpacing(
    tagVisUnitCodes spacingUnits,
    double spacingSize);


  /**
   * @param objectToInsert Mandatory com4j.Com4jObject parameter.
   * @param position Mandatory int parameter.
   */

  @DISPID(1610743828) //= 0x60020014. The runtime will prefer the VTID if present
  @VTID(27)
  void insertListMember(
    Com4jObject objectToInsert,
    int position);


  /**
   * @param shapeMember Mandatory IVShape parameter.
   * @return  Returns a value of type int
   */

  @DISPID(1610743829) //= 0x60020015. The runtime will prefer the VTID if present
  @VTID(28)
  int getListMemberPosition(
    IVShape shapeMember);


  /**
   * @param shape Mandatory IVShape parameter.
   * @return  Returns a value of type VisContainerMemberState
   */

  @DISPID(1610743830) //= 0x60020016. The runtime will prefer the VTID if present
  @VTID(29)
  

    VisContainerMemberState getMemberState(
    IVShape shape);


  /**
   * @param objectToRemove Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(1610743831) //= 0x60020017. The runtime will prefer the VTID if present
  @VTID(30)
  void removeMember(
    Com4jObject objectToRemove);


  /**
   * @param objectToReorder Mandatory com4j.Com4jObject parameter.
   * @param position Mandatory int parameter.
   */

  @DISPID(1610743832) //= 0x60020018. The runtime will prefer the VTID if present
  @VTID(31)
  void reorderListMember(
    Com4jObject objectToReorder,
    int position);


  /**
   * @return  Returns a value of type int[]
   */

  @DISPID(1610743833) //= 0x60020019. The runtime will prefer the VTID if present
  @VTID(32)
  int[] getListMembers();


  /**
   * @param containerFlags Mandatory int parameter.
   * @return  Returns a value of type int[]
   */

  @DISPID(1610743834) //= 0x6002001a. The runtime will prefer the VTID if present
  @VTID(33)
  int[] getMemberShapes(
    int containerFlags);


  /**
   * @param pObjectToAdd Mandatory com4j.Com4jObject parameter.
   * @param addOptions Mandatory VisMemberAddOptions parameter.
   */

  @DISPID(1610743835) //= 0x6002001b. The runtime will prefer the VTID if present
  @VTID(34)
  void addMember(
    Com4jObject pObjectToAdd,
    VisMemberAddOptions addOptions);


  /**
   * <p>
   * Getter method for the COM property "OverlappedList"
   * </p>
   * @return  Returns a value of type IVShape
   */

  @DISPID(1610743836) //= 0x6002001c. The runtime will prefer the VTID if present
  @VTID(35)
  IVShape overlappedList();


  /**
   * <p>
   * Setter method for the COM property "OverlappedList"
   * </p>
   * @param list Mandatory IVShape parameter.
   */

  @DISPID(1610743836) //= 0x6002001c. The runtime will prefer the VTID if present
  @VTID(36)
  void overlappedList(
    IVShape list);


  /**
   * @param direction Mandatory VisLayoutDirection parameter.
   */

  @DISPID(1610743838) //= 0x6002001e. The runtime will prefer the VTID if present
  @VTID(37)
  void rotateFlipList(
    VisLayoutDirection direction);


  /**
   * <p>
   * Getter method for the COM property "ContainerStyle"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743839) //= 0x6002001f. The runtime will prefer the VTID if present
  @VTID(38)
  int containerStyle();


  /**
   * <p>
   * Setter method for the COM property "ContainerStyle"
   * </p>
   * @param pStyle Mandatory int parameter.
   */

  @DISPID(1610743839) //= 0x6002001f. The runtime will prefer the VTID if present
  @VTID(39)
  void containerStyle(
    int pStyle);


  /**
   * <p>
   * Getter method for the COM property "HeadingStyle"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743841) //= 0x60020021. The runtime will prefer the VTID if present
  @VTID(40)
  int headingStyle();


  /**
   * <p>
   * Setter method for the COM property "HeadingStyle"
   * </p>
   * @param pStyle Mandatory int parameter.
   */

  @DISPID(1610743841) //= 0x60020021. The runtime will prefer the VTID if present
  @VTID(41)
  void headingStyle(
    int pStyle);


  // Properties:
}
