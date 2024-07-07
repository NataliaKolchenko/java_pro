package example.groupingBy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

// группировка по оценкам
public class Example {
    public static void main(String[] args) {
        List<Students> students = new ArrayList<>();

        Random random = new Random();

        for (int i = 1; i < 10; i++) {
            students.add(new Students("Студент " + i, random.nextInt(3, 6)));
        }

        Map<Integer, List<Students>> studentsByGrade = students.stream()
                .collect(Collectors.groupingBy(Students::getGrade));

        studentsByGrade.forEach((grade, studentList) -> {
            System.out.println("Оценка: " + grade);
            studentList.forEach(student -> System.out.println("  " + student));
        });

// группировка по оценкам с подсчетом
        Map<Integer, Long> studentsByGradeCount = students.stream()
                .collect(Collectors.groupingBy(Students::getGrade, Collectors.counting()));

        studentsByGradeCount.forEach((grade, count) -> {
            System.out.println("Grade: " + grade + ", Count: " + count);
        });
    }
}

class Students {
    private String name;
    private int grade;

    public Students(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return name + ": " + grade;
    }
}
