public class DarkTheme extends Theme {

    public void display() {
        System.out.println("Displaying the dark theme!");
    }

    public Glyph copy() {
        return new DarkTheme();
    }
}