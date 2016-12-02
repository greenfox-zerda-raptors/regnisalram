/**
 * Created by regnisalram on 12/1/16.
 */
public abstract class AbstractAnimal implements Animal {

    protected int movedDistance = 0;
    protected int feedCounter = 0;
    private String name;
    protected int childrenNum = 0;

    public AbstractAnimal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getChildrenNum() {
        return childrenNum;
    }

    public void setChildrenNum(int childrenNum) {
        this.childrenNum = childrenNum;
    }

    @Override
    public void move(int distance) {
        this.movedDistance += distance;
    }

    @Override
    public void feed() {
        this.feedCounter += defaultFoodAmount();
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " {" +
                "movedDistance=" + movedDistance +
                ", feedCounter=" + feedCounter +
                ", name='" + name + '\'' +
                ", childrenNum=" + childrenNum +
                '}';
    }

    abstract int defaultFoodAmount();
}
