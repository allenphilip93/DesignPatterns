import java.util.Map;
import java.util.HashMap;

public class LightThemeFactory extends ThemeFactory {

    private static ThemeFactory factory;

    private LightThemeFactory() {
        
    }

    public static ThemeFactory getInstance() {
        System.out.println("Loading the light theme singleton factory!");
        if (factory == null) {
            factory = new LightThemeFactory();
        }
        return factory;
    }

    public void load() {
        System.out.println("Registering prototypes for light theme!");
        register("icon", new LightIcon());
        register("menu", new LightMenu());
        register("theme", new LightTheme());
    }
}