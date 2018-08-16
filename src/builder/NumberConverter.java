public class NumberConverter extends Converter {

    int output;

    public void convertNumber(Object object) {
        try {
            output = new Integer((String) object);
        } catch (Exception e) {
            return;
        }
    }

    public int getNumber() {
        return output;
    }
}