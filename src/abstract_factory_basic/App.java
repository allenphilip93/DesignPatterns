/**
 * Basic abstract factory implementation.
 * 
 */
public class App {
    public static void main(String[] args) {
        
        ThemeFactory factory = new LightThemeFactory();
        create(factory);

        factory = new DarkThemeFactory();
        create(factory);
    }

    public static void create(ThemeFactory factory) {
        Icon icon = factory.createIcon();
        icon.display();
        Menu menu = factory.createMenu();
        menu.display();
        Theme theme = factory.createTheme();
        theme.display();
    }
}