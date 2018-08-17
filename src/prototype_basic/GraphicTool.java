public class GraphicTool extends Tool {

    public void manipulate() {
        System.out.println("Manipulate using the graphic tool!");
        Graphic graphic = prototype.clone();
        // Do some operation using the graphic
        graphic.draw();
    }

    public static void main(String[] args) {
        Tool tool = new GraphicTool();
        
        tool.setPrototype(new Staff());
        tool.manipulate();

        tool.setPrototype(new WholeNote());
        tool.manipulate();

        tool.setPrototype(new HalfNote());
        tool.manipulate();
    }
}