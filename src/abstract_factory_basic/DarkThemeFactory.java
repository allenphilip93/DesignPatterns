public class DarkThemeFactory implements ThemeFactory {
    
    public DarkThemeFactory() {
        System.out.println("Loading the dark theme factory!");
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
}