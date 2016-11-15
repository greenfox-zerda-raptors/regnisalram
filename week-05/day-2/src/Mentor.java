/**
 * Created by regnisalram on 11/15/16.
 */
public class Mentor extends Person {
    private String seniorityLevel;
    private String subject;

    public Mentor() {
    }

    public Mentor(String name, int age, String seniorityLevel, String subject) {
        super(name, age);
        this.seniorityLevel = seniorityLevel;
        this.subject = subject;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("is a(n) %s %s.", this.subject, this.seniorityLevel);
    }
}
