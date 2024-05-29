package org.example.Practice.ExtraTask;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Employee[] employeesArray = new Employee[10];

        Employee employee1 = new Employee("Anna", "Position emp", 300);
        Manager manager1 = new Manager("Kate", "Position manager", 500, 2);
        Developer dev1 = new Developer("Tom", "Dev 1", 350, "Java");


        System.out.println(employee1);
        System.out.println("Anna's payment:" +  + employee1.getSalary() + " + " + employee1.getCalculateBonus() + " = " + (employee1.getSalary()+employee1.getCalculateBonus()));

        System.out.println(manager1);
        System.out.println("Kate's's payment:" +  + manager1.getSalary() + " + " + manager1.getCalculateBonus() + " = " + (manager1.getSalary()+manager1.getCalculateBonus()));

        System.out.println(dev1);
        System.out.println("Kate's's payment:" +  + dev1.getSalary() + " + " + dev1.getCalculateBonus() + " = " + (dev1.getSalary()+dev1.getCalculateBonus()));

    }
}
