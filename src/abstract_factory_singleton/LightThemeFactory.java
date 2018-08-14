public class LightThemeFactory implements ThemeFactory {

    private static ThemeFactory factory;

    private LightThemeFactory() {
        
    }

    public Theme createTheme() {
        return new LightTheme();
    }
    
    public Icon createIcon() {
        return new LightIcon();
    }

    public Menu createMenu() {
        return new LightMenu();
    }

    public static ThemeFactory getInstance() {
        System.out.println("Loading the light theme singleton factory!");
        if (factory == null) {
            factory = new LightThemeFactory();
        }
        return factory;
    }
}