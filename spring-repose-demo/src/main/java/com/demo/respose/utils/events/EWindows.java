package com.demo.respose.utils.events;


import com.demo.respose.utils.IVMSGWrap;
import com.demo.respose.utils.IVWindow;
import com4j.DISPID;
import com4j.Holder;
import com4j.IID;

/**
 * Visio Windows Event Interface
 */
@IID("{000D0B01-0000-0000-C000-000000000046}")
public abstract class EWindows {
  // Methods:
  /**
   * @param window MandatoryIVWindow parameter.
   */

  @DISPID(32769)
  public void windowOpened(
   IVWindow window) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param window MandatoryIVWindow parameter.
   */

  @DISPID(701)
  public void selectionChanged(
   IVWindow window) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param window MandatoryIVWindow parameter.
   */

  @DISPID(16385)
  public void beforeWindowClosed(
   IVWindow window) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param window MandatoryIVWindow parameter.
   */

  @DISPID(4224)
  public void windowActivated(
   IVWindow window) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param window MandatoryIVWindow parameter.
   */

  @DISPID(702)
  public void beforeWindowSelDelete(
   IVWindow window) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param window MandatoryIVWindow parameter.
   */

  @DISPID(703)
  public void beforeWindowPageTurn(
   IVWindow window) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param window MandatoryIVWindow parameter.
   */

  @DISPID(704)
  public void windowTurnedToPage(
   IVWindow window) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Fires after a window's size or position changes
   * </p>
   * @param window MandatoryIVWindow parameter.
   */

  @DISPID(8193)
  public void windowChanged(
   IVWindow window) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Fires after scroll or zoom in a drawing window
   * </p>
   * @param window MandatoryIVWindow parameter.
   */

  @DISPID(705)
  public void viewChanged(
   IVWindow window) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Cancel close of window? T:Yes F:No
   * </p>
   * @param window MandatoryIVWindow parameter.
   * @return  Returns a value of type void
   */

  @DISPID(706)
  public void queryCancelWindowClose(
   IVWindow window) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Window close operation was canceled.
   * </p>
   * @param window MandatoryIVWindow parameter.
   */

  @DISPID(707)
  public void windowCloseCanceled(
   IVWindow window) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Called when keystroke message received for Addon window. True return indicates message was handled.
   * </p>
   * @param msg MandatoryIVMSGWrap parameter.
   * @return  Returns a value of type void
   */

  @DISPID(708)
  public void onKeystrokeMessageForAddon(
   IVMSGWrap msg) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Called when mousedown message received for window. If you set CancelDefault to True then Visio will not process this message.
   * </p>
   * @param button Mandatory int parameter.
   * @param keyButtonState Mandatory int parameter.
   * @param x Mandatory double parameter.
   * @param y Mandatory double parameter.
   * @param cancelDefault Mandatory Holder<Boolean> parameter.
   */

  @DISPID(709)
  public void mouseDown(
    int button,
    int keyButtonState,
    double x,
    double y,
    Holder<Boolean> cancelDefault) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Called when mousemove message received for window. If you set CancelDefault to True then Visio will not process this message.
   * </p>
   * @param button Mandatory int parameter.
   * @param keyButtonState Mandatory int parameter.
   * @param x Mandatory double parameter.
   * @param y Mandatory double parameter.
   * @param cancelDefault Mandatory Holder<Boolean> parameter.
   */

  @DISPID(710)
  public void mouseMove(
    int button,
    int keyButtonState,
    double x,
    double y,
    Holder<Boolean> cancelDefault) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Called when mouseup message received for window. If you set CancelDefault to True then Visio will not process this message.
   * </p>
   * @param button Mandatory int parameter.
   * @param keyButtonState Mandatory int parameter.
   * @param x Mandatory double parameter.
   * @param y Mandatory double parameter.
   * @param cancelDefault Mandatory Holder<Boolean> parameter.
   */

  @DISPID(711)
  public void mouseUp(
    int button,
    int keyButtonState,
    double x,
    double y,
    Holder<Boolean> cancelDefault) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Called when keydown message received for window. If you set CancelDefault to True then Visio will not process this message.
   * </p>
   * @param keyCode Mandatory int parameter.
   * @param keyButtonState Mandatory int parameter.
   * @param cancelDefault Mandatory Holder<Boolean> parameter.
   */

  @DISPID(712)
  public void keyDown(
    int keyCode,
    int keyButtonState,
    Holder<Boolean> cancelDefault) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Called when keypress message received for window. If you set CancelDefault to True then Visio will not process this message.
   * </p>
   * @param keyAscii Mandatory int parameter.
   * @param cancelDefault Mandatory Holder<Boolean> parameter.
   */

  @DISPID(713)
  public void keyPress(
    int keyAscii,
    Holder<Boolean> cancelDefault) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Called when keyup message received for window. If you set CancelDefault to True then Visio will not process this message.
   * </p>
   * @param keyCode Mandatory int parameter.
   * @param keyButtonState Mandatory int parameter.
   * @param cancelDefault Mandatory Holder<Boolean> parameter.
   */

  @DISPID(714)
  public void keyUp(
    int keyCode,
    int keyButtonState,
    Holder<Boolean> cancelDefault) {
        throw new UnsupportedOperationException();
  }


  // Properties:
}
