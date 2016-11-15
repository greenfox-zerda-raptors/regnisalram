/**
 * Created by regnisalram on 11/15/16.
 */
public class Person {

    public String name;
    public int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public String toString() {
        return String.format("%s (%s) ", this.name, this.age);
    }
}
