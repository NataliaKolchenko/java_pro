package example.Collectors.flatMap;

import java.util.ArrayList;
import java.util.List;

// Преобразовать список сотрудников, каждый из которых имеет список проектов, в один список всех проектов.
public class Ex9 {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("Stefan", List.of("Pet Project", "Family Project")));
        employeeList.add(new Employee("Lily", List.of("Cars", "Bikes")));
        employeeList.add(new Employee("Sam", List.of("Project \"Projects\" ")));

        employeeList.stream()
                .map(Employee::getListProjects)
                .flatMap(List::stream)
                .toList()
                .forEach(System.out::println);

    }
}

class Employee {
    private String name;
    private List<String> listProjects;

    public Employee(String name, List<String> listProjects) {
        this.name = name;
        this.listProjects = listProjects;
    }

    public String getName() {
        return name;
    }

    public List<String> getListProjects() {
        return listProjects;
    }
}
