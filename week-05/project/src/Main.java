import regnisalram.UserInput;

import java.util.Scanner;

/**
 * Created by regnisalram on 11/17/16.
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        UserInput userInput = new UserInput();

        System.out.print("CLI Todo application\n====================\n");
        userInput.readHelpList();
        while (userInput.userInput(input.nextLine())) {
        }
    }
}
