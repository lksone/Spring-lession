package com.demo.respose.utils

;

import com4j.*;

/**
 * <p>
 * Type codes returned by shape.type and foreigntype. Also used with Event.Get/SetFilterObjects to filter events by object type.
 * </p>
 */
public enum tagVisShapeTypes implements ComEnum {
  /**
   * <p>
   * The type of no shape. Means all types when used as filter code.
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visTypeInval(0),
  /**
   * <p>
   * Page's or master's PageSheet.
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visTypePage(1),
  /**
   * <p>
   * Shape that contains shapes.
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visTypeGroup(2),
  /**
   * <p>
   * Native Visio shape.
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visTypeShape(3),
  /**
   * <p>
   * Imported shape.
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visTypeForeignObject(4),
  /**
   * <p>
   * Shape that is a guide.
   * </p>
   * <p>
   * The value of this constant is 5
   * </p>
   */
  visTypeGuide(5),
  /**
   * <p>
   * Document's DocumentSheet.
   * </p>
   * <p>
   * The value of this constant is 6
   * </p>
   */
  visTypeDoc(6),
  /**
   * <p>
   * Returned by shape.ForeignType if shape is metafile.
   * </p>
   * <p>
   * The value of this constant is 16
   * </p>
   */
  visTypeMetafile(16),
  /**
   * <p>
   * Returned by shape.ForeignType if shape is bitmap.
   * </p>
   * <p>
   * The value of this constant is 32
   * </p>
   */
  visTypeBitmap(32),
  /**
   * <p>
   * Returned by shape.ForeignType if shape is link.
   * </p>
   * <p>
   * The value of this constant is 256
   * </p>
   */
  visTypeIsLinked(256),
  /**
   * <p>
   * Returned by shape.ForeignType if shape is embed.
   * </p>
   * <p>
   * The value of this constant is 512
   * </p>
   */
  visTypeIsEmbedded(512),
  /**
   * <p>
   * Returned by shape.ForeignType if shape is control.
   * </p>
   * <p>
   * The value of this constant is 1024
   * </p>
   */
  visTypeIsControl(1024),
  /**
   * <p>
   * Returned by shape.ForeignType if shape is link, embed or control.
   * </p>
   * <p>
   * The value of this constant is 32768
   * </p>
   */
  visTypeIsOLE2(32768),
  /**
   * <p>
   * Returned by shape.ForeignType if shape is ink.
   * </p>
   * <p>
   * The value of this constant is 64
   * </p>
   */
  visTypeInk(64),
  ;

  private  int value;
  tagVisShapeTypes(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
