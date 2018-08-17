public abstract class Application {

    Document document;

    public abstract Document createDocument();

    public void newDocument() {
        document = createDocument();
    }

    public void openDocument() {
        document.open();
    }

    public void saveDocument() {
        document.save();
    }
}