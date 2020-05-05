package HW5.Enums;

import java.util.Random;

public class Enums {
    public void getLetterPosition(Abc letter){
        System.out.println("Letter " + letter.name() + " has position " + (letter.ordinal()+1));
    }
    public static void main(String[] args) {
        Random rnd = new Random();
        char c = (char)(rnd.nextInt(26) + 97);
        Abc letter = Abc.valueOf(Character.toString(c));
        Enums myEnum = new Enums();
        myEnum.getLetterPosition(letter);
    }
}
