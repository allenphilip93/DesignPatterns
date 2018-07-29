package lexi.composition;

import lexi.composition.compositor.ArrayCompositor;
import lexi.composition.compositor.Compositor;
import lexi.composition.model.Glyph;

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
    }
}
