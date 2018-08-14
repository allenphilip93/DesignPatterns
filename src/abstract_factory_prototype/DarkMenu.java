public class DarkMenu extends Menu {

    public void display() {
        System.out.println("Displaying the dark menu!");
    }

    public Glyph copy() {
        return new DarkMenu();
    }
}