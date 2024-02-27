package Lab3;


public class FunWithCharacters {

    public String checkCharacter(String word, int index){
        char ch = word.charAt(index);

        if (Character.isDigit(ch)){
            return String.format("Character '%c' is a digit", ch);
        }

        else if (Character.isAlphabetic(ch)){
            return String.format("Character '%c' is a letter", ch);
        }

        else if (Character.isWhitespace(ch)){
            return String.format("Character '%c' is a white space", ch);
        }

        else {
            return String.format("Character '%c' is unknown", ch);
        }

    }
    public static void main(String[] args) {

        FunWithCharacters labObject = new FunWithCharacters();
        String word = "happy birthday";
        int index = 2;
        System.out.println(labObject.checkCharacter(word, index));

        index = 5;
        System.out.println(labObject.checkCharacter(word, index));

        word = "happy birthday 2 you";
        index = 15;
        System.out.println(labObject.checkCharacter(word, index));

        word = "happy birthday!";
        index = 14;
        System.out.println(labObject.checkCharacter(word, index));



    }
}
