import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by regnisalram on 12/1/16.
 */
public class App {

    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Horse("Paci"));
        animals.add(new Horse("Saci"));
        animals.add(new Horse("Paca"));

        animals.add(new Mouse("Cic"));
        animals.add(new Mouse("Rudy"));
        animals.add(new Mouse("Siccc"));

        animals.add(new Ant());

        for (Animal animal : animals) {
            System.out.println(animal);
        }

        Iterator<Animal> iterator = animals.iterator();
        while (iterator.hasNext()) {
            Animal animal = iterator.next();
            System.out.println("Iterator" + animal);
        }

        iterator = animals.iterator();
        for (int i = 0; i < 3; i++) {
            Animal animal = iterator.next();
            System.out.println("Iterator:" + animal);
        }

        System.out.println("We doing sth else.");

        while (iterator.hasNext()) {
            Animal animal = iterator.next();
            System.out.println("Iterator:" + animal);
        }
    }
}
