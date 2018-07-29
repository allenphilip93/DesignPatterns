package lexi.abstractfactory.factory;

import lexi.abstractfactory.model.Button;
import lexi.abstractfactory.model.PMButton;
import lexi.abstractfactory.model.PMScrollBar;
import lexi.abstractfactory.model.ScrollBar;

/**
 * Factory class to give us PM family of products
 */
public class PMFactory implements GUIFactory {

    public ScrollBar createScrollBar() {
        return new PMScrollBar();
    }

    public Button createButton() {
        return new PMButton();
    }
}
