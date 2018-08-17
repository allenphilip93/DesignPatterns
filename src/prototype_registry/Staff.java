public class Staff implements Graphic {

    public void draw() {
        System.out.println("Drawing a staff object!");
    }

    public Graphic clone() {
        System.out.println("Cloning a staff!");
        return new Staff();
    }
}