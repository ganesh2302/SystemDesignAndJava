package CreationalDesignPattern.Prototype;

public class Main {
    public static void main(String args[]){
        Student student = new Student("abc",123,1);
        Student student1 = (Student) student.clone();
    }
}
