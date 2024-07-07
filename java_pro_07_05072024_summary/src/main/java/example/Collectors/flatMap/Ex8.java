package example.Collectors.flatMap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Преобразовать список студентов, каждый из которых имеет список оценок, в один список всех оценок.
public class Ex8 {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Peter", List.of(3,4,5)));
        studentList.add(new Student("Ada", List.of(5,5,5)));
        studentList.add(new Student("John", List.of(2,5,3)));
        studentList.add(new Student("Leslie", List.of(3,4,4)));

        //1 version
        studentList.stream()
                .map(Student::getScores)
                .flatMap(List::stream)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("____");
        //2 version
        List<Integer> allGrades = studentList.stream()
                .flatMap(student -> student.getScores().stream())
                .collect(Collectors.toList());
        System.out.println(allGrades);

    }


}

class Student {
    private String name;
    private List<Integer> scores;

    public Student(String name, List<Integer> scores) {
        this.name = name;
        this.scores = scores;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getScores() {
        return scores;
    }
}
