/**
 * Created by regnisalram on 12/2/16.
 */
public class Circle {

    private int radius;
    public static int circles = 0;

    public Circle() {
        this(1);
    }

    public Circle(int radius) {
        this.radius = radius;
        circles++;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public static int countObjects() {
        return circles;
    }
}
