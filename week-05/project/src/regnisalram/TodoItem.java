package regnisalram;

/**
 * Created by regnisalram on 11/17/16.
 */
public class TodoItem {

    public boolean status;
    public String name;

    public TodoItem(String name) {
        this.name = name;
        status = true;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return getName();
    }
}
