package org.example.mainClass;

public class MainPerson {
    public static void main(String[] args) {

        Student student = new Student("nnnnee", 77, "78787");
        Teacher teacher = new Teacher("name2", 32, "Math");

        Foo newFoo = new Foo("new", 34);
        System.out.println(newFoo.getFirstName());

        System.out.println(student.getGroupName());
        System.out.println("test");

    }
}