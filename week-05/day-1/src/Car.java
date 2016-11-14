/**
 * Created by regnisalram on 11/14/16.
 */
// Car.java
public class Car {
    //Add somethings here to create a car and some fields
    private int sizeEngine;
    private String color;
    private String typecar;
    private int kmOdometer;

    public Car() {
        this.sizeEngine = 1600;
        this.color = "red";
    }

    public int getSizeEngine() {
        return sizeEngine;
    }

    public void setSizeEngine(int sizeEngine) {
        this.sizeEngine = sizeEngine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTypecar() {
        return typecar;
    }

    public void setTypecar(String typecar) {
        this.typecar = typecar;
    }

    public int getKmOdometer() {
        return kmOdometer;
    }

    public void setKmOdometer(int kmOdometer) {
        this.kmOdometer = kmOdometer;
    }

    public static void main(String[] args) {

    }
}