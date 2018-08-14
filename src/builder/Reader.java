public class Reader {
    
    public static void main(String[] args) {
        Converter conv;
        conv = new CharacterConverter();
        parse();    
    }

    public static void parse(String input, String type, Converter converter) {
        switch (type) {
            case "char" :
                converter.convertCharacter(input);
                break;

            case "number" :
                converter.convertNumber(input);
                break;

            case "symbol" :
                converter.convertSymbol(input);
                break;

        }
    }
}