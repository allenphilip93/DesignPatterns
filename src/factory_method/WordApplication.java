public class WordApplication extends Application {

    public Document createDocument() {
        return new WordDocument();
    }

    public static void main(String[] args) {
        Application app = new WordApplication();
        app.newDocument();
        app.openDocument();
        app.saveDocument();
    }
}