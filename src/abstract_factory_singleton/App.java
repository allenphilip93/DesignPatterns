/**
 * Abstract factory implementation using singleton factories
 * 
 */
public class App {
    public static void main(String[] args) {
        
        ThemeFactory factory = LightThemeFactory.getInstance();
        create(factory);

        factory = DarkThemeFactory.getInstance();
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