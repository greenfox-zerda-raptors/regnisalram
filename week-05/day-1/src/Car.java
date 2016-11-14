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

    void drive(int clicks) {
        this.setKmOdometer(this.getKmOdometer() + clicks);
        if (clicks < 20) {
            System.out.printf("brrm, %s just drove around town %d clicks.\n", this.typecar, clicks);
        } else if (clicks < 50) {
            System.out.printf("brrm, screech, brrm, screech; %s commuted %d clicks.\n", this.typecar, clicks);
        } else {
            System.out.printf("whee, %s did %d clicks.\n", this.typecar, clicks);
        }
    }

    public String toString() {
        return String.format("This %s is %s, has %d cc engine and clocked %d km's.\n",
                this.getTypecar(), this.getColor(), this.getSizeEngine(), this.getKmOdometer());
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