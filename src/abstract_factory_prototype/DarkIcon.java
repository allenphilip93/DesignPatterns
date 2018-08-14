public class DarkIcon extends Icon {

    public void display() {
        System.out.println("Displaying the dark icon!");
    }

    public Glyph copy() {
        return new DarkIcon();
    }
}