/**
 * Created by regnisalram on 11/14/16.
 */
// App.java
public class App {
    public static void main(String[] args){
        Car myCar = new Car();

        myCar.setKmOdometer(12312);
        myCar.setTypecar("Mazda");

        Car myCar2 = new Car();

        myCar2.setTypecar("Ford");
        myCar2.setColor("silver");
        myCar2.setSizeEngine(2500);
        myCar2.setKmOdometer(152312);

        Car myCar3 = new Car();

        myCar3.setTypecar("Beamer");
        myCar3.setColor("green");
        myCar3.setSizeEngine(2800);
        myCar3.setKmOdometer(42521);

        System.out.printf("Just got a new Car, it's %s and has a %d cc Engine!\n",
                myCar.getColor(), myCar.getSizeEngine());

        myCar.drive(15);

        System.out.printf("This %s is %s, has %d cc engine and clocked %d km's.\n",
                myCar.getTypecar(), myCar.getColor(), myCar.getSizeEngine(), myCar.getKmOdometer());

        myCar2.drive(1200);

        System.out.printf("This %s is %s, has %d cc engine and clocked %d km's.\n",
                myCar2.getTypecar(), myCar2.getColor(), myCar2.getSizeEngine(), myCar2.getKmOdometer());

        myCar3.drive(49);
        
        System.out.printf("This %s is %s, has %d cc engine and clocked %d km's.\n",
                myCar3.getTypecar(), myCar3.getColor(), myCar3.getSizeEngine(), myCar3.getKmOdometer());
    }
}