import java.util.Map;
import java.util.HashMap;

public abstract class ThemeFactory {

    private Map<String, Glyph> lookup;

    public abstract void load();

    public void register(String key, Glyph obj) {
        if (lookup == null) {
            lookup = new HashMap<String, Glyph>();
        }
        lookup.put(key, obj);
    }

    public Glyph create(String key) {
        Glyph obj = lookup.get(key);
        if (obj == null) {
            return null;
        }
        System.out.println("Cloning the prototype for " + key);
        return obj.copy();
    }
}