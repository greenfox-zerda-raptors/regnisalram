/**
 * Created by regnisalram on 11/14/16.
 */
// App.java
public class App {
    public static void main(String[] args){
        Car myCar = new Car();

        myCar.kmOdometer = 12312;
        myCar.typecar = "Mazda";

        Car myCar2 = new Car();

        myCar2.typecar = "Ford";
        myCar2.color = "silver";
        myCar2.sizeEngine = 2500;
        myCar2.kmOdometer = 152312;

        Car myCar3 = new Car();
        
        myCar3.typecar = "Beamer";
        myCar3.color = "green";
        myCar3.sizeEngine = 2800;
        myCar3.kmOdometer = 42521;

        System.out.printf("Just got a new Car, it's %s and has a %d cc Engine!\n",
                myCar.getColor(), myCar.getSizeEngine());

        System.out.printf("This %s is %s, has %d cc engine and clocked %d km's.\n",
                myCar.getTypecar(), myCar.getColor(), myCar.getSizeEngine(), myCar.getKmOdometer());

        System.out.printf("This %s is %s, has %d cc engine and clocked %d km's.\n",
                myCar2.getTypecar(), myCar2.getColor(), myCar2.getSizeEngine(), myCar2.getKmOdometer());

        System.out.printf("This %s is %s, has %d cc engine and clocked %d km's.\n",
                myCar3.getTypecar(), myCar3.getColor(), myCar3.getSizeEngine(), myCar3.getKmOdometer());
    }
}