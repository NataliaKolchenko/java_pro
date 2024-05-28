package org.example.mainClass;

public class Person {
    private String firstName;
    private int age;

    protected Person(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }

    protected String getFirstName() {
        return firstName;
    }

    protected void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    protected int getAge() {
        return age;
    }

    protected void setAge(int age) {
        this.age = age;
    }
}
