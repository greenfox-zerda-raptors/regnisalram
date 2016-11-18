package regnisalram;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by regnisalram on 11/17/16.
 */
public class TodoList {
    ArrayList<TodoItem> toDoList = new ArrayList<>();

    public TodoList() {
        load();
    }
    public void load() {
        try (BufferedReader br = new BufferedReader(new FileReader("/Users/regnisalram/greenfox/regnisalram/week-05/project/todofiles/todolist.txt"))) {
             String line = null;
        while ((line = br.readLine()) != null) {
            TodoItem item = new TodoItem(line);
            toDoList.add(item);
            }
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }
    }

    public void addNewItem(TodoItem newItem) {
        toDoList.add(newItem);
    }

    public void remove(String answer) {
        try {
            toDoList.remove(Integer.parseInt(answer)-1);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Unable to remove: Index is out of bound");
        } catch (NumberFormatException e) {
            System.out.println("Unable to remove: Index is not a number");
        }

    }



    @Override
    public String toString() {
        String out = "";
        for (TodoItem listItem : toDoList)
            out += String.valueOf(toDoList.indexOf(listItem) + 1) + " - " + listItem.toString() + "\n";
        return out;
    }

    public void writeFile() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/regnisalram/greenfox/regnisalram/week-05/project/todofiles/todolist.txt"))) {
            for (TodoItem listItem : toDoList) {
                bw.write(String.valueOf(listItem));
                bw.newLine();
            }

            bw.flush();
            bw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
