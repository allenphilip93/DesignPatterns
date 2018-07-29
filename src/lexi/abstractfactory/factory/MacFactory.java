package lexi.abstractfactory.factory;

import lexi.abstractfactory.model.Button;
import lexi.abstractfactory.model.MacButton;
import lexi.abstractfactory.model.MacScrollBar;
import lexi.abstractfactory.model.ScrollBar;

/**
 * Factory class to create products under Mac style
 */
public class MacFactory implements GUIFactory {

    public ScrollBar createScrollBar() {
        return new MacScrollBar();
    }

    public Button createButton() {
        return new MacButton();
    }
}
