import java.util.Scanner;

public class FindAlphabetPosition {
    public static void main(String[] args){
        // find the position of english alphabet
        //ASCII a=97 A=65

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter English letter");

        char letter = scanner.next().charAt(0);
        letter = Character.toLowerCase(letter); // this method is use to convert to simple if the user given capital letter

        int asciiValue = (int)letter; // type cast-> it is use to convert char into integer
        System.out.println(asciiValue);

        int position = asciiValue - 96;
        System.out.println(position);
    }
}
