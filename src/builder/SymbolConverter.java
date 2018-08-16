public class SymbolConverter extends Converter {

    String output = "";

    public void convertSymbol(Object obj) {
        output = output + ((String) obj);
    }

    public String getSymbol() {
        return output;
    }

}