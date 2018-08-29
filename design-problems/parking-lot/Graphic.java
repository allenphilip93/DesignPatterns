/**
 * An abstract class to represent any 2d graphic
 */
public abstract class Graphic {
    // Shape object has information on what the shape dimensions are
    private Shape shape;

    // Position object has information on where the Space lies
    private Position pos;

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public void setPosition(Position pos) {
        this.pos = pos;
    }

    public boolean hasArea() {
        return this.shape.hasArea();
    }

    public abstract void insert(Graphic graphic);
}