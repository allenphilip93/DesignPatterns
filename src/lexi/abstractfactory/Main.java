package lexi.abstractfactory;

import lexi.abstractfactory.compositor.ArrayCompositor;
import lexi.abstractfactory.compositor.Compositor;
import lexi.abstractfactory.factory.GUIFactory;
import lexi.abstractfactory.factory.MacFactory;
import lexi.abstractfactory.model.Glyph;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Reader from an input file and convert it into a
        // form of our internal representation - Composition Glyphs
        Glyph composition = parseInput(reader, path);


        // Inititalize the compositor class instance
        Compositor compositor = new ArrayCompositor();
        compositor.setComposition(composition);

        // Compose the composition's children into rows, characters, images glyphs etc
        compositor.compose();

        // Employing the factory class to build the elements
        GUIFactory factory = new MacFactory();
        Glyph button = factory.createButton();
        Glyph scrollBar = factory.createScrollBar();
    }
}
