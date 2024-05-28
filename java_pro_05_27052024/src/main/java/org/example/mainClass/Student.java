package org.example.mainClass;

public class Student extends Person{
    private String groupName;

    public Student(String firstName, int age, String groupName) {
        super(firstName, age);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}
