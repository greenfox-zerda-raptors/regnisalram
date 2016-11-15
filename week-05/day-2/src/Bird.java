/**
 * Created by regnisalram on 11/15/16.
 */
public class Bird extends Animal {

    public void fly() {
        System.out.println("bird flies");
    }

    public Bird() {
        super(2, false);
        System.out.println("new bird");
    }

    public void sleep() {
        super.sleep();
    }

    public void eat() {
        System.out.println("The bird is eating");
        super.eat();
    }

    public void nightyNight() {
        super.eat();
        sleep();
    }

    public void speak() {
        System.out.println("bird chirps");
    }
}
