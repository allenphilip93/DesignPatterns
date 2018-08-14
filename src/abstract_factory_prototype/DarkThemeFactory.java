import java.util.Map;
import java.util.HashMap;

public class DarkThemeFactory extends ThemeFactory {

    private static ThemeFactory factory;

    private DarkThemeFactory() {
        
    }

    public static ThemeFactory getInstance() {
        System.out.println("Loading the dark theme singleton factory!");
        if (factory == null) {
            factory = new DarkThemeFactory();
        }
        return factory;
    }

    public void load() {
        System.out.println("Registering prototypes for dark theme!");
        register("icon", new DarkIcon());
        register("menu", new DarkMenu());
        register("theme", new DarkTheme());
    }
}