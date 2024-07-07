package example.groupingBy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Задача: Группировка студентов по курсам и вычисление среднего балла
//Условие задачи:
//У вас есть список студентов,
// где каждый студент представлен объектом класса Student.
// Каждый объект Student содержит информацию о студенте:
// его имя, возраст, курс и средний балл (GPA).
//
// Ваша задача — сгруппировать студентов по курсам и вывести информацию о среднем GPA студентов в каждом курсе.
public class GroupingStrudents {
    public static void main(String[] args) {
        List<StudentMy> studentMyList = new ArrayList<>();

        studentMyList.add(new StudentMy("Adam", 18, "Marketing", 3.4));
        studentMyList.add(new StudentMy("Anna", 19, "Marketing", 4.0));
        studentMyList.add(new StudentMy("Andrew", 21, "Marketing", 2.3));

        studentMyList.add(new StudentMy("Lilu", 21, "Math", 4.4));
        studentMyList.add(new StudentMy("Matti", 22, "Math", 4.4));

        studentMyList.add(new StudentMy("Sara", 17, "Design", 5.0));
        studentMyList.add(new StudentMy("Sandra", 18, "Design", 3.8));
        studentMyList.add(new StudentMy("Sunny", 21, "Design", 4.6));
        studentMyList.add(new StudentMy("Siu", 19, "Design", 3.7));
        studentMyList.add(new StudentMy("So", 17, "Design", 5.0));

       Map<String, List<StudentMy>> mapCourse =  studentMyList.stream()
                .collect(Collectors.groupingBy(StudentMy::getCourse));


        double avegareGpa = studentMyList.stream()
                .collect(Collectors.averagingDouble(StudentMy::getGpa));

       mapCourse.forEach((course, studentList) -> {
           System.out.println("Course: " + course);
           studentList.forEach(studentMy -> System.out.println(studentMy.getName()));
       });

        System.out.println(avegareGpa);




    }
}

class StudentMy {
    private String name;
    private int age;
    private String course;
    private double gpa;

    public StudentMy(String name, int age, String course, double gpa) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    public double getGpa() {
        return gpa;
    }
}