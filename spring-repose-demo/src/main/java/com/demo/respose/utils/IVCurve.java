package com.demo.respose.utils

;

import com4j.*;

@IID("{000D0722-0000-0000-C000-000000000046}")
public interface IVCurve extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Returns Visio Application instance hosting the object.
   * </p>
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of typeIVApplication
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
 

    IVApplication application();


  /**
   * <p>
   * Returns visObjTypeCurve (42).
   * </p>
   * <p>
   * Getter method for the COM property "ObjectType"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  short objectType();


  /**
   * <p>
   * Getter method for the COM property "Closed"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  short closed();


  /**
   * @param tolerance Mandatory double parameter.
   * @return  Returns a value of type double[]
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(10)
  double[] points(
    double tolerance);


  /**
   * <p>
   * Getter method for the COM property "Start"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(11)
  double start();


  /**
   * <p>
   * Getter method for the COM property "End"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(12)
  double end();


  /**
   * @param t Mandatory double parameter.
   * @param x Mandatory Holder<Double> parameter.
   * @param y Mandatory Holder<Double> parameter.
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(13)
  @DefaultMethod
  void point(
    double t,
    Holder<Double> x,
    Holder<Double> y);


  /**
   * @param t Mandatory double parameter.
   * @param n Mandatory short parameter.
   * @param x Mandatory Holder<Double> parameter.
   * @param y Mandatory Holder<Double> parameter.
   * @param dxdt Mandatory Holder<Double> parameter.
   * @param dydt Mandatory Holder<Double> parameter.
   * @param ddxdt Mandatory Holder<Double> parameter.
   * @param ddydt Mandatory Holder<Double> parameter.
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(14)
  void pointAndDerivatives(
    double t,
    short n,
    Holder<Double> x,
    Holder<Double> y,
    Holder<Double> dxdt,
    Holder<Double> dydt,
    Holder<Double> ddxdt,
    Holder<Double> ddydt);


  // Properties:
}
