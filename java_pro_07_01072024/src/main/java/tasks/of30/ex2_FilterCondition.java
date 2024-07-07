package tasks.of30;

import java.util.ArrayList;
import java.util.List;

//Отфильтровать список строк по заданному условию.

public class ex2_FilterCondition {
    public static void main(String[] args) {
        List<String> stringsList = new ArrayList<>();

        stringsList.add("cat");
        stringsList.add("mama");
        stringsList.add("mila");
        stringsList.add("son");
        stringsList.add("father");

        stringsList.stream()
//                .filter(string -> string.startsWith("m"))
                .filter(string -> string.contains("a"))
                .forEach(System.out::println);
    }
}
