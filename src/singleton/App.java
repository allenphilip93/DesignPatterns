public class App {

    public static void main(String[] arg) {
        Registry registry;
        
        // not possible
        // registry = new Registry();

        registry = Registry.getInstance();
        registry.load();
        System.out.println("Completed loading the registry!");
    }
}