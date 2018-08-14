public class LightMenu extends Menu {

    public void display() {
        System.out.println("Displaying the light menu!");
    }

    public Glyph copy() {
        return new LightMenu();
    }
}