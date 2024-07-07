package example.Collectors.flatMap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Преобразовать список семей, каждая из которых имеет список членов семьи, в один список всех членов семьи.
public class Ex12 {
    public static void main(String[] args) {

        List<Family> families = new ArrayList<>();

        families.add(new Family("Smith", List.of("Adam", "Kary")));
        families.add(new Family("Ivanov", List.of("Peter", "Ivan", "Katy", "Elen")));
        families.add(new Family("Bond", List.of("B1", "B2")));

        families.stream()
                .map(Family::getNames)
                .flatMap(List::stream)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}

class Family {
    private  String lastName;
    private List<String> names;

    public Family(String lastName, List<String> names) {
        this.lastName = lastName;
        this.names = names;
    }

    public String getLastName() {
        return lastName;
    }

    public List<String> getNames() {
        return names;
    }
}
