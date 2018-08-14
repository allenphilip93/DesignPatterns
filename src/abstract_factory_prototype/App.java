/**
 * Abstract factory implementation using singleton factories
 * 
 */
public class App {
    public static void main(String[] args) {
        
        ThemeFactory factory = LightThemeFactory.getInstance();
        factory.load();
        createLight(factory);

        factory = DarkThemeFactory.getInstance();
        factory.load();
        createDark(factory);
    }

    public static void createLight(ThemeFactory factory) {
        Icon icon = (LightIcon) factory.create("icon");
        icon.display();
        Menu menu = (LightMenu) factory.create("menu");
        menu.display();
        Theme theme = (LightTheme) factory.create("theme");
        theme.display();
    }

    public static void createDark(ThemeFactory factory) {
        Icon icon = (DarkIcon) factory.create("icon");
        icon.display();
        Menu menu = (DarkMenu) factory.create("menu");
        menu.display();
        Theme theme = (DarkTheme) factory.create("theme");
        theme.display();
    }
}