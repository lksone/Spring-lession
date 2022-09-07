package com.demo.respose.utils

;

import com.*;
import com4j.*;

@IID("{000D071C-0000-0000-C000-000000000046}")
public interface IVGlobal extends Com4jObject {
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

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(7)
  @DefaultMethod
 

    IVApplication application();


  /**
   * <p>
   * Getter method for the COM property "ActiveDocument"
   * </p>
   * @return  Returns a value of typeIVDocument
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(8)
 

    IVDocument activeDocument();


  /**
   * <p>
   * Getter method for the COM property "ActivePage"
   * </p>
   * @return  Returns a value of typeIVPage
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(9)
 IVPage activePage();


  /**
   * <p>
   * Getter method for the COM property "ActiveWindow"
   * </p>
   * @return  Returns a value of typeIVWindow
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(10)
 

    IVWindow activeWindow();


  /**
   * <p>
   * Getter method for the COM property "Documents"
   * </p>
   * @return  Returns a value of typeIVDocuments
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(11)
 

    IVDocuments documents();


  @VTID(11)
  @ReturnValue(defaultPropertyThrough={IVDocuments.class})
 IVDocument documents(
    @MarshalAs(NativeType.VARIANT) Object nameOrIndex);

  /**
   * <p>
   * Getter method for the COM property "Windows"
   * </p>
   * @return  Returns a value of typeIVWindows
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(12)
 

    IVWindows windows();


  @VTID(12)
  @ReturnValue(defaultPropertyThrough={IVWindows.class})
 IVWindow windows(
    short index);

  /**
   * <p>
   * Getter method for the COM property "Addons"
   * </p>
   * @return  Returns a value of typeIVAddons
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(13)
 IVAddons addons();


  @VTID(13)
  @ReturnValue(defaultPropertyThrough={IVAddons.class})
 IVAddon addons(
    @MarshalAs(NativeType.VARIANT) Object nameOrIndex);

  /**
   * <p>
   * Getter method for the COM property "Vbe"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(14)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject vbe();


  // Properties:
}
