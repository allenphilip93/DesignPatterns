public class Registry {

    private static Registry instance;

    private Registry() {

    }

    public void load() {
        System.out.println("Loading registry...");
    }

    public static Registry getInstance() {
        if (instance == null) {
            instance = new Registry();
        }
        return instance;
    }
}