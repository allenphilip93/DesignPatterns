public class CharacterConverter extends Converter {

    private String output = "";

    public void convertCharacter(Object obj) {
        System.out.println("Building the character from object");
        output = output + (String) obj;
    }

    public String getCharacter() {
        return output;
    }
}