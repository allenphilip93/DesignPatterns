public class DarkThemeFactory implements ThemeFactory {

    private static ThemeFactory factory;

    private DarkThemeFactory() {
        
    }

    public Theme createTheme() {
        return new DarkTheme();
    }
    
    public Icon createIcon() {
        return new DarkIcon();
    }

    public Menu createMenu() {
        return new DarkMenu();
    }

    public static ThemeFactory getInstance() {
        System.out.println("Loading the dark theme singleton factory!");
        if (factory == null) {
            factory = new DarkThemeFactory();
        }
        return factory;
    }
}