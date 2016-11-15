import java.util.ArrayList;

/**
 * Created by regnisalram on 11/15/16.
 */
public class Student extends Person {

    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }

    ArrayList<Integer> grades = new ArrayList<Integer>();
    public void addGrade(int grade) {
        if (0 < grade && grade < 6)
            grades.add(grade);
    }

    public float getAverage() {
        int sum = 0;
        for (Integer grade : grades) {
            sum += grade;
        }
        return (float) sum / grades.size();
    }

    @Override
    public String toString() {
        return super.toString() + String.format("average %s.", this.getAverage());
    }
}
