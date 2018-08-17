public class GraphicTool {

    public void manipulate(String key) {
        System.out.println("Manipulate using the graphic tool!");
        System.out.println("Searching the registry for the key : " + key);

        Graphic graphic = PrototypeRegistry.lookup(key);
        // Do some operation using the graphic
        graphic.draw();
    }

    public static void main(String[] args) {
        PrototypeRegistry.getInstance().load();
        PrototypeRegistry.getInstance().add("staff", new Staff());

        GraphicTool tool = new GraphicTool();
        tool.manipulate("staff");
        tool.manipulate("wholenote");
        tool.manipulate("halfnote");
    }
}