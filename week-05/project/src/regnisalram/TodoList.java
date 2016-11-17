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

    public void writeNewItem(TodoItem newItem) {
        toDoList.add(newItem);
    }

    @Override
    public String toString() {
        String out = "";
        for (TodoItem listItem : toDoList)
            out += String.valueOf(toDoList.indexOf(listItem) + 1) + " - " + listItem.toString() + "\n";
        return out;
    }

}
