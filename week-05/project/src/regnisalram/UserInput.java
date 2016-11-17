package regnisalram;

import java.io.*;
import java.util.Scanner;

/**
 * Created by regnisalram on 11/17/16.
 */
public class UserInput {

    TodoList list = new TodoList();

    Scanner input = new Scanner(System.in);

    public boolean userInput(String answer) {
        String[] answers = answer.split("\\s+", 2);
        String message;
        if (answers[0].equals("list")) {
            if (list.toDoList.size() > 0) {
                System.out.println(list);
            } else {
                System.out.println("No todos for today! :)");
            }
        } else if (answers[0].equals("add")) {
            if (answers.length > 1) {
                TodoItem newItem = new TodoItem(answers[1]);
                list.writeNewItem(newItem);
            } else {
                System.out.println("Unable to add: No task is provided");
            }

        } else if (answer.equals("remove")){

        } else if (answer.equals("complete")){

        } else if (answer.equals("help")){
            readHelpList();
        } else if (answers[0].equals("end")){
            return false;
        }
        return true;
    }

    public void readHelpList() {
        try (BufferedReader br = new BufferedReader(new FileReader("/Users/regnisalram/greenfox/regnisalram/week-05/project/todofiles/commands.txt"))) {
            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
