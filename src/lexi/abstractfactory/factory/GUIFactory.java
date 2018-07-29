package lexi.abstractfactory.factory;

import lexi.abstractfactory.model.Button;
import lexi.abstractfactory.model.ScrollBar;

/**
 * Common interface to create products within a certain family
 */
public interface GUIFactory {

    public ScrollBar createScrollBar();

    public Button createButton();
}
