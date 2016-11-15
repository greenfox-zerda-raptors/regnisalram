/**
 * Created by regnisalram on 11/15/16.
 */
public class Dog extends Animal {

    private boolean hasTail = true;

    public Dog() {
        super(15, true);
        System.out.println("new dog");
    }

//    public Dog(int lifeExpectancy, boolean isCarnivore, boolean hasTail) {
//        super(10, false);
//        this.hasTail = hasTail;
//    }

    public void speak() {
        System.out.println("dog barks");
    }

    public void beg() {
        System.out.println("dog begs");
    }

    @Override
    public String toString() {
        return super.toString() + ", " + String.format("and hasTail = %b", this.hasTail);
    }
}
