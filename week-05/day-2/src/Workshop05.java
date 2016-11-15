/**
 * Created by regnisalram on 11/15/16.
 */
public class Workshop05 {
    public static void main(String[] args) {
        Block block1 = new Block(12);
        Rectangle rec1 = new Rectangle(12, 3);

        block1.setHeight(2);
        block1.setWidth(4);

        System.out.println(rec1.getArea());
        System.out.println(block1.getLength());
        System.out.println(block1.getVolume());
    }
}
