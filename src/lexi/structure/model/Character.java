package lexi.structure.model;

public class Character implements Glyph{

    private Rect boundRect;
    private Glyph parent;

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
    }

    public Glyph parent() {
        // return the parent glyph
    }
}