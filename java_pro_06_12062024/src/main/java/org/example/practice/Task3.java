package org.example.practice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task3 {
    public static void task3(String[] args) {

        Person person1 = new Person("Ivan", "Iv", 15000);
        Person person2 = new Person("Elena", "Leee", 25000);
        Person person3 = new Person("Kate", "Taa", 35000);

        List<Person> listPerson = List.of(person1, person2, person3);

        Map <String, Double> mapPerson = new HashMap<>();
        for (Person p : listPerson) {
            if (p.getSalary() < 30000) {
                mapPerson.put(p.getName()+" "+p.getSurname(), p.getSalary());
            }
        }

        for (Map.Entry<String, Double> entry : mapPerson.entrySet()){
            System.out.println("Name: " + entry.getKey() + " : salary " + entry.getValue());
        }

    }

}

class Person {
    private String name;
    private String surname;
    private double salary;

    public Person(String name, String surname, double salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getSalary() {
        return salary;
    }
}
