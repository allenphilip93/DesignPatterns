public class LightIcon extends Icon {

    public void display() {
        System.out.println("Displaying the light icon!");
    }

    public Glyph copy() {
        return new LightIcon();
    }
}