/**
 * Created by regnisalram on 11/15/16.
 */
public class Bird extends Animal {
    public void fly() {
        System.out.println("The bird can fly");
    }

    public Bird() {
        super("Bird");
    }

    public void sleep() {
        System.out.println("The bird is sleeping");
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
}
