package com.demo.respose.utils

;

import com4j.*;

/**
 * <p>
 * Selection types.
 * </p>
 */
public enum VisSelectionTypes {
  /**
   * <p>
   * A selection that contains no shapes initially.
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visSelTypeEmpty, // 0
  /**
   * <p>
   * A selection that contains all shapes initially.
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visSelTypeAll, // 1
  /**
   * <p>
   * A selection that contains one shape initially.
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visSelTypeSingle, // 2
  /**
   * <p>
   * A selection that contains all the shapes of a given layer initially.
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visSelTypeByLayer, // 3
  /**
   * <p>
   * A selection that contains all the shapes of a given type initially.
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visSelTypeByType, // 4
  /**
   * <p>
   * A selection that contains all the instance shapes of a given master initially.
   * </p>
   * <p>
   * The value of this constant is 5
   * </p>
   */
  visSelTypeByMaster, // 5
  /**
   * <p>
   * A selection that contains all the shapes with a given data graphic initially.
   * </p>
   * <p>
   * The value of this constant is 6
   * </p>
   */
  visSelTypeByDataGraphic, // 6
  /**
   * <p>
   * A selection that contains all the shapes with a given role initially.
   * </p>
   * <p>
   * The value of this constant is 7
   * </p>
   */
  visSelTypeByRole, // 7
}
