package com.demo.respose.utils

;

import com4j.*;

/**
 * <p>
 * Format codes to be passed to PasteSpecial.
 * </p>
 */
public enum tagVisPasteSpecialCodes implements ComEnum {
  /**
   * <p>
   * Paste ANSI text (CF_TEXT)
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visPasteText(1),
  /**
   * <p>
   * Paste bitmap (CF_BITMAP)
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visPasteBitmap(2),
  /**
   * <p>
   * Paste metafile (CF_METAFILEPICT)
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visPasteMetafile(3),
  /**
   * <p>
   * Paste OEM text (CF_OEMTEXT)
   * </p>
   * <p>
   * The value of this constant is 7
   * </p>
   */
  visPasteOEMText(7),
  /**
   * <p>
   * Paste device independent bitmap (CF_DIB)
   * </p>
   * <p>
   * The value of this constant is 8
   * </p>
   */
  visPasteDIB(8),
  /**
   * <p>
   * Paste enhanced metafile (CF_ENHMETAFILE)
   * </p>
   * <p>
   * The value of this constant is 14
   * </p>
   */
  visPasteEMF(14),
  /**
   * <p>
   * Paste OLE object
   * </p>
   * <p>
   * The value of this constant is 65536
   * </p>
   */
  visPasteOLEObject(65536),
  /**
   * <p>
   * Paste rich text
   * </p>
   * <p>
   * The value of this constant is 65537
   * </p>
   */
  visPasteRichText(65537),
  /**
   * <p>
   * Paste hyperlink
   * </p>
   * <p>
   * The value of this constant is 65538
   * </p>
   */
  visPasteHyperlink(65538),
  /**
   * <p>
   * Paste Uniform Resource Locator
   * </p>
   * <p>
   * The value of this constant is 65539
   * </p>
   */
  visPasteURL(65539),
  /**
   * <p>
   * Paste Visio Shapes
   * </p>
   * <p>
   * The value of this constant is 65540
   * </p>
   */
  visPasteVisioShapes(65540),
  /**
   * <p>
   * Paste Visio Masters
   * </p>
   * <p>
   * The value of this constant is 65541
   * </p>
   */
  visPasteVisioMasters(65541),
  /**
   * <p>
   * Paste Visio Text
   * </p>
   * <p>
   * The value of this constant is 65542
   * </p>
   */
  visPasteVisioText(65542),
  /**
   * <p>
   * Paste Visio Icon
   * </p>
   * <p>
   * The value of this constant is 65543
   * </p>
   */
  visPasteVisioIcon(65543),
  /**
   * <p>
   * Paste Ink Data
   * </p>
   * <p>
   * The value of this constant is 65544
   * </p>
   */
  visPasteInk(65544),
  /**
   * <p>
   * Paste Visio Shapes XML
   * </p>
   * <p>
   * The value of this constant is 65545
   * </p>
   */
  visPasteVisioShapesXML(65545),
  /**
   * <p>
   * Paste Visio Masters XML
   * </p>
   * <p>
   * The value of this constant is 65546
   * </p>
   */
  visPasteVisioMastersXML(65546),
  /**
   * <p>
   * Paste Visio Drawing Data without External Data Links
   * </p>
   * <p>
   * The value of this constant is 65548
   * </p>
   */
  visPasteVisioShapesWithoutDataLinks(65548),
  ;

  private  int value;
  tagVisPasteSpecialCodes(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
