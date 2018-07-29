package lexi.composition.model;
/*
 * Common interface for all UI elements of the lexi editor
 */
public interface Glyph {

    // APPEARANCE
    /**
     * Used to draw any glyph onto the windo
     */
    public void draw(Window window);

    /**
     * Specifies a bouding rectange which encompasses the glyph
     */
    public void bounds(Rect rect);

    // HIT DETECTION
    /**
     * Check if a point intersects with the space occupied by the glyph
     */
    public void intersects(Point point);

    // STRUCTURE
    /**
     * Used to add a glyph to its structure
     */
    public void insert(Glyph glyph);

    /**
     * Used to find the child glyph by index
     */
    public Glyph child(int index);

    /**
     * Used to find the parent glyph
     */
    public Glyph parent();

    /**
     * Used to remove the glpyh passed by reference
     */
    public void remove(Glyph glyph);

}