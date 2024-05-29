package org.example.Practice.ExtraTask;

public class Employee {
   private String name;
    private String position;
    private double salary;

    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee:" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary
                ;
    }
    //    Метод calculateBonus() для расчета бонуса, например, +5% от зарплаты.

    public double getCalculateBonus() {
        double bonusRate = 0.05;
        return this.salary * bonusRate;
    }
}
