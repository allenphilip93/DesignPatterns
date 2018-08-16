public class Reader {
    
    public static void main(String[] args) {
        Converter conv;
        String[] input = {"character", "42"};

        conv = new CharacterConverter();
        parse(input, "char", conv);
        System.out.println("Character that has been converted is " + ((CharacterConverter) conv).getCharacter());

        conv = new NumberConverter();
        parse(input, "number", conv);
        System.out.println("Number that has been converted is " + ((NumberConverter) conv).getNumber());
    }

    public static void parse(String[] input, String type, Converter converter) {
        for (String str : input){
            switch (type) {
                case "char" :
                    converter.convertCharacter(str);
                    break;

                case "number" :
                    converter.convertNumber(str);
                    break;

                case "symbol" :
                    converter.convertSymbol(str);
                    break;

            }
        }
    }
}