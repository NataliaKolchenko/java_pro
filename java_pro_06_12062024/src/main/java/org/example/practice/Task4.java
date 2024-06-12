package org.example.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Task4 {
    public static void main(String[] args) {
        PersonTask p1 = new PersonTask("Ivan", "Iv", 12, 133.3, 33.3);
        PersonTask p2 = new PersonTask("Ka", "kkk", 13, 143.3, 23.3);
        PersonTask p3 = new PersonTask("rrr", "xcvx", 22, 123.3, 43.3);
        PersonTask p4 = new PersonTask("xxx", "werwr", 32, 153.3, 53.3);

        List <PersonTask> prList = List.of(p1,p2,p3,p4);
        Map<PersonTask, List<PersonTask>> map = new TreeMap<>();

        for (PersonTask pr : prList) {
            if (pr.getAge() > 18) {
                map.put(pr, getPrList (prList, pr));
            }
        }

        for (Map.Entry<PersonTask, List<PersonTask>> m : map.entrySet()) {
            System.out.println(m);
        }
    }

    private static List<PersonTask> getPrList(List<PersonTask> b, PersonTask a) {

        List<PersonTask> persList1 = new ArrayList<>();
        for (PersonTask person1 : b) {
            if (person1.getAge() < a.getAge()) {
                persList1.add(person1);
            }
        }
        return persList1;
    }
}

class PersonTask implements Comparable<PersonTask>{
    private String name;
    private String surname;
    private int age;
    private double salary;
    private double bonus;

    public PersonTask(String name, String surname, int age, double salary, double bonus) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public int compareTo(PersonTask o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "PersonTask{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", bonus=" + bonus +
                '}';
    }
}
