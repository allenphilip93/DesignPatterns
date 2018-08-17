public class WordDocument implements Document {

    public WordDocument() {
        System.out.println("Creating a new word document!");
    }

    public void open() {
        System.out.println("Opening the word document!");
    }

    public void close() {
        System.out.println("Closing the word document!");
    }

    public void save() {
        System.out.println("Saving the word document!");
    }
}