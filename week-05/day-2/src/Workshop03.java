/**
 * Created by regnisalram on 11/15/16.
 */
public class Workshop03 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Bird bird = new Bird();
        Dog dog = new Dog();

        System.out.println("Testing Animal");
        // how does it speak, sleep, and tell me about its lifeExpectancy and if its a carnivore
        animal.speak();
        animal.sleep();
        System.out.println(animal.toString());

        System.out.println("\nTesting Bird");
        // how does it speak, sleep, what else it can do and tell me about its lifeExpectancy and if its a carnivore
        bird.speak();
        bird.sleep();
        bird.fly();
        System.out.println("And a bird: " + bird.toString());

        System.out.println("\nTesting Dog");
        // how does it speak, sleep, what else it can do and tell me about its lifeExpectancy and if its a carnivore, and what about the tail?
        dog.speak();
        dog.sleep();
        dog.beg();
        System.out.println("And a dog: " + dog.toString());

        System.out.println("\nTesting Dog2");
        Animal dog2 = new Dog();
        // how does it speak, sleep, what else it can do and tell me about its lifeExpectancy and if its a carnivore, and what about the tail?
        dog2.speak();
        dog2.sleep();
        System.out.println("Casting dog2 into Y to see if it begs...");
        ((Dog) dog2).beg();
        System.out.println("And a dog2 cast as (Dog) Y: " + dog.toString());
// this isn't right, i gave up


        System.out.println("\nTesting Dog 'd'");
        // how does it speak, sleep, what else it can do and tell me about its lifeExpectancy and if its a carnivore, and what about the tail?
        Dog d = new Dog();
        d.speak();
        d.sleep();
        System.out.println(d.toString());
    }
}