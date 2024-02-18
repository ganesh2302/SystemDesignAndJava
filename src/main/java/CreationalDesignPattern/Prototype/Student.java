package CreationalDesignPattern.Prototype;

public class Student implements Prototype{
    String name;
    private int pan;
    int roll;

    public Student(String name, int pan, int roll) {
        this.name = name;
        this.pan = pan;
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPan() {
        return pan;
    }

    public void setPan(int pan) {
        this.pan = pan;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    @Override
    public Prototype clone() {
        return new Student(name, pan, roll);
    }
}
