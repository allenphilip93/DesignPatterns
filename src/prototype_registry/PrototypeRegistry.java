import java.util.*;

public class PrototypeRegistry {

    private static Map<String, Graphic> registry;

    private static PrototypeRegistry instance;

    private PrototypeRegistry() {

    }

    public void load() {
        add("wholenote", new Staff());
        add("halfnote", new Staff());
    }

    public void add(String key, Graphic graphic) {
        if (registry == null) {
            registry = new HashMap<>();
        }
        registry.put(key, graphic);
    }

    public static Graphic lookup(String key) {
        if (registry.get(key) != null) {
            return registry.get(key).clone();
        }
        return null;
    }

    public static PrototypeRegistry getInstance() {
        if (instance == null) {
            instance = new PrototypeRegistry();
        }
        return instance;
    }


}