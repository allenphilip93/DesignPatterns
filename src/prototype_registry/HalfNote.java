public class HalfNote implements Graphic {

    public void draw() {
        System.out.println("Drawing a half note object!");
    }

    public Graphic clone() {
        System.out.println("Cloning a half note object!");
        return new HalfNote();
    }
}