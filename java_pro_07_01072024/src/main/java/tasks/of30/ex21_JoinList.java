package tasks.of30;

//Объединить элементы списка в одну строку с разделителем.

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ex21_JoinList {
    public static void main(String[] args) {
        List<String> stringsList = new ArrayList<>();

        stringsList.add("cat");
        stringsList.add("mama");
        stringsList.add("zeit");
        stringsList.add("new");
        stringsList.add("father");

        String newStr = stringsList.stream()
                .collect(Collectors.joining(", "));

        System.out.println(newStr);

    }
}
