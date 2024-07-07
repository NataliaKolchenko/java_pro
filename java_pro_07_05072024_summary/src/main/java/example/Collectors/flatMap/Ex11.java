package example.Collectors.flatMap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Преобразовать список компаний, каждая из которых имеет список отделов, в один список всех отделов.
public class Ex11 {
    public static void main(String[] args) {
        List<Company> companyList = new ArrayList<>();
        companyList.add(new Company("Company_1", List.of("B", "A", "C")));
        companyList.add(new Company("Company_2", List.of("D", "E", "H", "T")));
        companyList.add(new Company("Company_3", List.of("M", "I")));

        companyList.stream()
                .map(Company::getDepartmentsInCompany)
                .flatMap(List::stream)
                .collect(Collectors.toList())
                .forEach(System.out::println);


    }
}

class Company {
    private String companyName;
    private List<String> departmentsInCompany;

    public Company(String companyName, List<String> departmentsInCompany) {
        this.companyName = companyName;
        this.departmentsInCompany = departmentsInCompany;
    }

    public String getCompanyName() {
        return companyName;
    }

    public List<String> getDepartmentsInCompany() {
        return departmentsInCompany;
    }
}
