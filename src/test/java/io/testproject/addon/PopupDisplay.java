package io.testproject.addon;

import io.testproject.sdk.internal.addons.ActionProxy;
import io.testproject.sdk.internal.addons.ProxyDescriptor;
import java.lang.String;

/**
 * Proxy for Popup Display Addon */
public class PopupDisplay {
  /**
   * Factory method for PopupDisplay */
  public static PopupDisplay getPopupDisplay() {
    return new PopupDisplay();
  }

  /**
   * Factory method for PopupDisplay
   * @param display text to show in dialog display */
  public static PopupDisplay popupDisplay(String display) {
    return new PopupDisplay(display);
  }

  /**
   * Popup Display.  */
  public static class PopupDisplay extends ActionProxy {
    /**
     * text to show in dialog display (INPUT) */
    public String display;

    public PopupDisplay() {
      this.setDescriptor(new ProxyDescriptor("k0iuMfy-jkimbRFSTUGPXg", "main.addon.PopupDisplay"));
    }

    public PopupDisplay(String display) {
      this();
      this.display = display;
    }
  }
}
