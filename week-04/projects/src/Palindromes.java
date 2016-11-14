/**
 * Created by regnisalram on 11/11/16.
 */
import java.util.Scanner;


public class Palindromes {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What do you want to do [1=Test if such is a Palindrome, 0=Quit]?");
        firstQuestion(input.nextLine());
        System.out.println("What do you want to do [1=Generate A Palindrome, 2=Test if such is a Palindrome, 0=Quit]?");
        secondQuestion(input.nextLine());
    }

    public static void firstQuestion (String oneOrZero) {
        Scanner input = new Scanner(System.in);
        if (oneOrZero.equals("1")) {
            System.out.println("Enter the phrase please");
            isPalindrome(input.nextLine());
        } else if (input.equals("0")) {
            System.exit(0);
        }

    }

    public static void secondQuestion (String oneOrTwoOrZero) {
        Scanner input = new Scanner(System.in);
        if (oneOrTwoOrZero.equals("1")) {
            System.out.println("I'm not sure what I'm supposed to do here");
        }else if (oneOrTwoOrZero.equals("2")) {
            System.out.println("Enter the phrase please");
            isPalindrome(input.nextLine());
        } else if (input.equals("0")) {
            System.exit(0);
        }

    }

    public static void isPalindrome (String input) {
        StringBuilder strBuilder = new StringBuilder(input);
        StringBuilder reversed = new StringBuilder(strBuilder.reverse());
        String reversedString = reversed.toString();

        System.out.println(reversedString);
        if (input.equals(reversed.toString())) {
            System.out.println("Yup, it's a palindrome");
        } else {
            System.out.println("Nope, not a palindrome");
        }


    }

}
