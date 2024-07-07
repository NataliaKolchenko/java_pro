package tasks.of30;

//Удалить элементы списка, не удовлетворяющие заданному условию.

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ex23_DeletItems {
    public static void main(String[] args) {
        List<String> stringsList = new ArrayList<>();

        stringsList.add("cat");
        stringsList.add("mama");
        stringsList.add("zeit");
        stringsList.add("new");
        stringsList.add("Father");
        stringsList.add("feta");

        List<String> s = stringsList.stream()
                .filter(string -> !string.toLowerCase().contains("f"))
                .collect(Collectors.toList());
//                .forEach(System.out::println);

        System.out.println(s);
    }
}
