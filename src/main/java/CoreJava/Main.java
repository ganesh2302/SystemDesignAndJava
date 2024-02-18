package CoreJava;

import CreationalDesignPattern.Prototype.Student;

public class Main {
    public static void main(String args[]){
        MyImmutableClass immutableClass = new MyImmutableClass("Ganesh", new Student("GaKu",1234,456));
        immutableClass.getStudent().setName("XYZ");
        System.out.println("name: "+immutableClass.getStudent().getName());

    }
}
