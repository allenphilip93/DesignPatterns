package lexi.decoration.model;

/**
 * Transparent enclosure class to add decorator functions on top of glyph
 * like the Border and Scroller glyph subclasses
 */
public class MonoGlyph implements Glyph{
    Glyph component;

    public void setComponent(Glyph component) {
        this.component = component;
    }

    public void draw(Window window) {
        component.draw(window);
    }

    public void bounds(Rect rect) {
        component.bounds(rect);
    }

    public void intersects(Point point) {
        // insert logic for hit detection
    }

    public void insert(Glyph glyph) {
        component.insert(glyph);
    }

    public void remove(Glyph glyph) {
        component.remove(glyph);
    }

    public Glyph child(int index) {
        return component.child(index);
    }

    public Glyph parent() {
        return component.parent();
    }
}
