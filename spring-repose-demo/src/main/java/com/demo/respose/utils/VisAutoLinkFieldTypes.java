package com.demo.respose.utils

;

import com4j.*;

/**
 */
public enum VisAutoLinkFieldTypes implements ComEnum {
  /**
   * <p>
   * Field is Shape text
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visAutoLinkShapeText(1),
  /**
   * <p>
   * Field is label for custom property (shape data), field name is label as is required
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visAutoLinkCustPropsLabel(2),
  /**
   * <p>
   * Field is user cell local row name, field is name for user row and is required 
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visAutoLinkUserRowName(3),
  /**
   * <p>
   * Field is angle in geometry
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visAutoLinkGeometryAngle(4),
  /**
   * <p>
   * Field is width of shape
   * </p>
   * <p>
   * The value of this constant is 5
   * </p>
   */
  visAutoLinkGeometryWidth(5),
  /**
   * <p>
   * Field is height of shape
   * </p>
   * <p>
   * The value of this constant is 6
   * </p>
   */
  visAutoLinkGeometryHeight(6),
  /**
   * <p>
   * Field is ID of shape
   * </p>
   * <p>
   * The value of this constant is 7
   * </p>
   */
  visAutoLinkObjectID(7),
  /**
   * <p>
   * Field is local name of the master for the shape
   * </p>
   * <p>
   * The value of this constant is 8
   * </p>
   */
  visAutoLinkMasterName(8),
  /**
   * <p>
   * Field is local name of the shape
   * </p>
   * <p>
   * The value of this constant is 9
   * </p>
   */
  visAutoLinkObjectName(9),
  /**
   * <p>
   * Field is type of shape object
   * </p>
   * <p>
   * The value of this constant is 10
   * </p>
   */
  visAutoLinkObjectType(10),
  /**
   * <p>
   * Field is Data1 property of shape object
   * </p>
   * <p>
   * The value of this constant is 11
   * </p>
   */
  visAutoLinkObjectData1(11),
  /**
   * <p>
   * Field is Data2 property of shape object
   * </p>
   * <p>
   * The value of this constant is 12
   * </p>
   */
  visAutoLinkObjectData2(12),
  /**
   * <p>
   * Field is Data3 property of shape object
   * </p>
   * <p>
   * The value of this constant is 13
   * </p>
   */
  visAutoLinkObjectData3(13),
  /**
   * <p>
   * Field is Universal property row name, field name is rownameU and is required
   * </p>
   * <p>
   * The value of this constant is 14
   * </p>
   */
  visAutoLinkPropRowNameU(14),
  /**
   * <p>
   * Field is Universal user row name, field name is rownameU and is required
   * </p>
   * <p>
   * The value of this constant is 15
   * </p>
   */
  visAutoLinkUserRowNameU(15),
  /**
   * <p>
   * Field is universal name of the master for the shape
   * </p>
   * <p>
   * The value of this constant is 16
   * </p>
   */
  visAutoLinkMasterNameU(16),
  /**
   * <p>
   * Field is universal name of the shape
   * </p>
   * <p>
   * The value of this constant is 17
   * </p>
   */
  visAutoLinkObjectNameU(17),
  ;

  private  int value;
  VisAutoLinkFieldTypes(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
