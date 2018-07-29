package lexi.decoration.;

import lexi.decoration.compositor.ArrayCompositor;
import lexi.decoration.compositor.Compositor;
import lexi.decoration.model.Border;
import lexi.decoration.model.Glyph;
import lexi.decoration.model.Scroller;

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

        // Add a scrollbar around the composed glyph
        Glyph scroller = new Scroller();
        scroller.insert(composition);

        // Add a border around the scrollable composed glyph
        Glyph border = new Border();
        border.insert(scroller);


    }
}
