package CoreJava;

import CreationalDesignPattern.Prototype.Student;

final public class MyImmutableClass {
    private final String name;
    private final Student student;

    MyImmutableClass(String name, Student student){
        this.name = name;
        this.student = student;
    }
    public String getName() {
        return name;
    }
    public Student getStudent() {
        //ensures that it always returns a copy of the object
        return new Student(student.getName(),student.getPan(),student.getRoll());
    }
}


