package org.example.mainClass;

public class Teacher  extends Person{
    private String subject;

    public Teacher(String firstName, int age, String subject) {
        super(firstName, age);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

}

