public class LightThemeFactory implements ThemeFactory {

    public LightThemeFactory() {
        System.out.println("Loading the light theme factory!");
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
}