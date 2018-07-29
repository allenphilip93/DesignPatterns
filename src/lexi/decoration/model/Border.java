package lexi.decoration.model;

public class Border extends MonoGlyph {

    public void draw(Window window) {
        super.draw(window);
        drawBorder(window);
    }

    private void drawBorder(Window window) {
        // logic to draw a border around the enclosing monoglyph
    }
}
