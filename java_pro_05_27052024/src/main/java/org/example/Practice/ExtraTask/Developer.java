package org.example.Practice.ExtraTask;

public class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, String position, double salary, String programmingLanguage) {
        super(name, position, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public String toString() {
        return "Developer:" +
                "name='" + getName() + '\'' +
                ", position='" + getPosition() + '\'' +
                ", salary=" + getSalary() +
                ", programmingLanguage=" + programmingLanguage
                ;
    }

    @Override
    public double getCalculateBonus() {
        int devRate = 500;
        return devRate;
    }
}
