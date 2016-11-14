/**
 * Created by regnisalram on 11/14/16.
 */
// Car.java
public class Car {
    //Add somethings here to create a car and some fields
    int sizeEngine;
    String color;
    String typecar;
    int kmOdometer;

    Car() {
        this.sizeEngine = 1600;
        this.color = "red";
    }

    int getSizeEngine() {
        return sizeEngine;
    }

    String getColor() {
        return color;
    }

    String getTypecar() {
        return typecar;
    }

    int getKmOdometer() {
        return kmOdometer;
    }

    public static void main(String[] args) {

    }
}