import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

/**
 * Created by regnisalram on 11/14/16.
 */
// App.java
public class App {
    public static void main(String[] args){
        Car myCar = new Car();

        myCar.setKmOdometer(12312);

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

        Car myCar05 = new Car("Opel", "white", 1400, 25);

        Car myCar06 = new Car("VW", "grey");

        Car myCar07 = new Car(1100, 15);

        System.out.printf("Just got a new Car, it's %s and has a %d cc Engine!\n",
                myCar.getColor(), myCar.getSizeEngine());

        myCar.drive(15);

        System.out.println(myCar.toString());

        myCar2.drive(1200);

        System.out.println(myCar2.toString());

        myCar3.drive(49);

        System.out.println(myCar3.toString());

        System.out.println(myCar05.toString());

        System.out.println(myCar06.toString());

        System.out.println(myCar07.toString());
    }
}