/**
 * Created by regnisalram on 11/14/16.
 */
// App.java
public class App {
    public static void main(String[] args){
        Car myCar = new Car();

        System.out.printf("Just got a new Car, it's %s and has a %d cc Engine!\n",
                myCar.getColor(), myCar.getSizeEngine());
    }
}