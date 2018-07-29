package lexi.composition.model;

import java.util.List;

public class Row {
    private Rect boundRect;
    private List<Glyph> children;
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
        children.add(glyph);
    }

    public void remove(Glyph glyph) {
        children.remove(glyph);
    }

    public Glyph child(int index) {
        return children.get(index);
    }

    public Glyph parent() {
        return parent;
    }
}