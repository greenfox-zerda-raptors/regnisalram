/**
 * Created by regnisalram on 11/15/16.
 */
public class Block extends Rectangle {

    public int length;

    public Block() {
        this(1);
    }

    public Block(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public int getVolume() {
        return super.getArea() * length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
