package example.groupingBy;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

//Задача: Группировка сотрудников по департаментам
//Условие задачи:
//У вас есть список сотрудников,
// где каждый сотрудник представлен объектом класса Employee.
// Каждый объект Employee содержит информацию о сотруднике:
// его имя, возраст, департамент и зарплату.
//
// Ваша задача — сгруппировать сотрудников по департаментам и вывести информацию о среднем возрасте сотрудников в каждом департаменте.
public class GroupingEmployee {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("Adam", 18, "Marketing", 3500));
        employeeList.add(new Employee("Kate", 27, "Marketing", 2700));
        employeeList.add(new Employee("Cherry", 31, "Marketing", 3400));

        employeeList.add(new Employee("Ivan", 45, "IT", 5400));
        employeeList.add(new Employee("Sam", 29, "IT", 7000));
        employeeList.add(new Employee("Inna", 23, "IT", 1500));
        employeeList.add(new Employee("Sara", 60, "IT", 3000));
        employeeList.add(new Employee("Sara", 32, "IT", 3000));

        employeeList.add(new Employee("Andrew", 32, "Tech", 3000));
        employeeList.add(new Employee("Math", 32, "Tech", 3000));
        employeeList.add(new Employee("Sandra", 37, "Tech", 3000));
        employeeList.add(new Employee("Tim", 30, "Tech", 3000));

        employeeList.add(new Employee("Harry", 45, "Lead", 10000));

        Map<String, List <Employee>> mapDepUndEmp = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        mapDepUndEmp.forEach((dep, empList) -> {
            System.out.println("Department: " + dep);
            empList.forEach(employee -> System.out.println(employee.getName()));
        });
        double averageAge =
                employeeList.stream().
                        collect(Collectors.averagingInt(Employee::getAge));
        System.out.println("average Age is " + averageAge);


        Map <String, Long> mapCountEmp = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

        mapCountEmp.forEach((dep, count) -> System.out.println("Department: " + dep + "\nNumber of Employees: " + count));



    }
}

class Employee {
    private String name;
    private int age;
    private String department;
    private int salary;

    public Employee(String name, int age, String department, int salary) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }
}
