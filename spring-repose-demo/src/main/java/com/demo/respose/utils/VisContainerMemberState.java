package com.demo.respose.utils

;

import com4j.*;

/**
 */
public enum VisContainerMemberState {
  /**
   * <p>
   * Shape is not a member of the container shape
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visContainerMemberNotAMember, // 0
  /**
   * <p>
   * Container member shape is winthin the bounds of the container shape
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visContainerMemberInterior, // 1
  /**
   * <p>
   * Container member shape is on the boudary of the container shape
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visContainerMemberOnBoundary, // 2
  /**
   * <p>
   * Container member shape is outside the boundary of the container shape
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visContainerMemberOutside, // 3
  /**
   * <p>
   * Container member shape is a list members
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visContainerMemberInList, // 4
}
