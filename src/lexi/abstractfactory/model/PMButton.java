package lexi.abstractfactory.model;

public class PMButton extends Button {
    private Rect boundRect;
    private Glyph parent;

    public void press() {
        // insert implementation
    }

    public void draw(Window w) {
        // insert logic to draw
    }

    public void bounds(Rect rect) {
        this.boundRect = rect;
    }

    public void intersects(Point point) {
        // insert logic for hit detection
    }

    public void insert(Glyph glyph) {
        // insert logic follows here
    }

    public void remove(Glyph glyph) {
        // insert delete impl
    }

    public Glyph child(int index) {
        // return the child at index
        return null;
    }

    public Glyph parent() {
        // return the parent glyph
        return null;
    }
}
