
public class LightTheme extends Theme {

    public void display() {
        System.out.println("Displaying the light theme!");
    }

    public Glyph copy() {
        return new LightTheme();
    }
}