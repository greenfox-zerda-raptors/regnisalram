/**
 * Created by regnisalram on 11/10/16.
 */
/**
 * File I/O: Scan a Directory
 *
 * There are situations where you'll need to find stuff in a directory.  In this challenge, you're asking the
 * user to tell you where to look and handling the error if the user tells you something wrong.
 *
 * What we mentors want to see is a function that will list the contents (files and directories) that are
 * beneath a particular path; handle the error if it does not exist.
 *
 * PATH/FILE?
 * C:\Temppp
 * SORRY  C:\Tempppp is not a directory or does not exist.
 * Bye!

 //// Or if the directory exists:
 * PATH/FILE?
 * C:\Temp
 * Tosh.txt
 * Wailer.txt
 * Cliff.txt
 *
 * Bye!

 * Note that you are writing a program that starts and then exits.  You are not doing a loop (as we've not covered
 * closing objects).
 * You are having to create a File (so there'll be a defined object as you saw in the previous Workshop).
 * Once you have created the File, you need to check if it's a directory
 * If it's a directory, then you need to set an array of files in the directory
 * Then you need a foreach
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Workshop13 {

    //Declare something here (see Workshop12)
    static String pathToList;

    static File dirToCheck;

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
//        String pathToList;

        System.out.print("Path: ");

        while (userInput.hasNextLine()){
            pathToList = userInput.nextLine();
            if(pathToList.equals("q"))
                break;
            printDirectoryContents(pathToList);
            System.out.print("Path: ");
        }
    }

    private static void printDirectoryContents(String pathToList) {
        // Implement this function
        // Open the File
        dirToCheck = new File(pathToList);
        // Does it exist?
        // Is it a directory
        if (dirToCheck.exists()) {
            if (dirToCheck.isDirectory()) {
                // If so, set an array & loop
                File[] files = dirToCheck.listFiles();
                if (dirToCheck.list().length > 0) {
                    System.out.println("Here are your files in this directory: ");
                    for (File f: files) {
                        System.out.println(f.getName());
                    }
                } else {
                    System.out.println("There are no files in here.");
                }

            }
            } else {
            try {
                FileReader reader = new FileReader(dirToCheck);
            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Bye!");
            }
        }


    }
}