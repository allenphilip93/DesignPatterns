package lexi.abstractfactory.compositor;

import lexi.abstractfactory.model.abstractfactory;

public class SimpleCompositor implements Compositor {

    private Composition composition;

    public void setComposition(Composition composition) {
        this.composition = composition;
    }

    public void compose() {
        // Algorithm for compose follows here
    }
}
