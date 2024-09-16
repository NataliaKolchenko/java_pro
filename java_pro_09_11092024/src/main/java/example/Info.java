package example;

public class Info {
//    private Employee employee;

    public String getInfo(Employee employee) {
        String info = "";
        if (employee == null) {
            throw new NullPointerException("employee is null");
        }

        if (employee.getRole() == Role.LEVEL_CEO) {
            info = "CEO";
        } else {
            info = "Access denied";
        }

        InfoLogger infoLogger = new InfoLogger();
        infoLogger.doLog(employee);

        return info;
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Bred");
        employee.setAge(50);
        employee.setRole(Role.LEVEL_CEO);

        Info info = new Info();
        System.out.println(info.getInfo(employee));

        System.out.println(InfoLogger.log);

    }
}
