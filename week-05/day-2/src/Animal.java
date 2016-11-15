/**
 * Created by regnisalram on 11/15/16.
 */
public class Animal {

    private int lifeExpectancy;
    private boolean isCarnivore;

    public Animal() {
        this(10, false);
        System.out.println("created an animal");
    }

    public Animal(int lifeExpectancy, boolean isCarnivore) {
        this.lifeExpectancy = lifeExpectancy;
        this.isCarnivore = isCarnivore;
    }

    public Animal(String type) {
        System.out.println(type + " animal is created");
    }

    public void sleep() {
        System.out.println("animal sleeps");
    }

    public void eat() {
        System.out.println("Animal is eating");
    }

    public  void speak() {
        System.out.println("animal speaks");
    }

    public String toString() {
        return String.format("isCarnivore = %b, lifeExpectancy = %d", this.isCarnivore, this.lifeExpectancy);
    }

}
