package regnisalram;

import java.io.*;

/**
 * Created by regnisalram on 11/17/16.
 */
public class UserInput {

    TodoList list = new TodoList();

    public boolean userInput(String answer) {
        String[] answers = answer.split("\\s+", 2);
        if (answers[0].equals("list")) {
            if (list.toDoList.size() > 0) {
                System.out.println(list);
            } else {
                System.out.println("No todos for today! :)");
            }
        } else if (answers[0].equals("add")) {
            if (answers.length > 1) {
                TodoItem newItem = new TodoItem(answers[1]);
                list.addNewItem(newItem);
            } else {
                System.out.println("Unable to add: No task is provided");
            }
        } else if (answers[0].equals("remove")){
            if (answers.length > 1) {
                list.remove(answers[1]);
            } else {
                System.out.println("Unable to remove: No index is provided");
            }
        } else if (answers[0].equals("complete")){

        } else if (answers[0].equals("help")){
            readHelpList();
        } else if (answers[0].equals("end")){
            list.writeFile();
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
