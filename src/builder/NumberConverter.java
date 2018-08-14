public class NumberConverter extends Converter {

    int output;

    public void convertNumber(Object object) {
        output = new Integer((String) object);
    }

    public int getNumber() {
        return output;
    }
}