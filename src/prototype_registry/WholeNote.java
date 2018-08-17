public class WholeNote implements Graphic {
    
    public void draw() {
        System.out.println("Drawing a whole note!");
    }

    public Graphic clone() {
        System.out.println("Cloning a whole note!");
        return new WholeNote();
    }
}