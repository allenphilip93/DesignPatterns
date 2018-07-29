package lexi.composition.compositor;

import lexi.composition.model.Glyph;

/**
 * Compositor interface to compose the glpyhs into a structured format defined by the model module
 */
public interface Compositor {

    /**
     * Trigger the compose operations
     */
    public void compose();

    /**
     * Assign the composition on which the compose operation will be performed
     */
    public void setComposition(Glyph composition);
}
