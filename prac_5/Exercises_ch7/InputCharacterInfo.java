import java.util.Scanner;
import  java.util.Scanner.*;
public class InputCharacterInfo {
    public static void main(String[] args) {
        char aChar;
        String aString;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Character ....");
        aString = input.nextLine();
        aChar = aString.charAt(0);

        System.out.println("The character is " + aChar);
        if(Character.isUpperCase(aChar))
            System.out.println(aChar + " is uppercase");
        else
            System.out.println(aChar + " is not uppercase");

        if (Character.isLowerCase(aChar))
            System.out.println(aChar + " is lowercase");
        else
            System.out.println(aChar + " is not lowercase");

        aChar = Character.toLowerCase(aChar);
        System.out.println("After toLowerCase(), aChar is " + aChar);

        aChar = Character.toUpperCase(aChar);
        System.out.println("After toupperCase(), aChar is " + aChar);

        if (Character.isLetterOrDigit(aChar))
            System.out.println(aChar+"is a letter or digit");
        else
            System.out.println(aChar+ " is neither letter nor digit");

        if (Character.isWhitespace(aChar))
            System.out.println(aChar + "is whitespace");
        else
            System.out.println(aChar+"is not whitespace");
    }
}
