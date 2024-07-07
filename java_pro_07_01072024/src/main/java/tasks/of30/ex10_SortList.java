package tasks.of30;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// Отсортировать список строк.
public class ex10_SortList {
    public static void main(String[] args) {
        List<String> stringsList = new ArrayList<>();

        stringsList.add("cat");
        stringsList.add("mama");
        stringsList.add("zeit");
        stringsList.add("son");
        stringsList.add("father");

        List<Integer> intList = new ArrayList<>();

        intList.add(3);
        intList.add(5);
        intList.add(1);
        intList.add(9);
        intList.add(8);

        //прямая сортировка: от А до Я
        stringsList.stream()
                .sorted()
                .forEach(System.out::println);

        //прямая сортировка: от 1 до 10
        intList.stream()
                .sorted()
                .forEach(System.out::println);
        //обратня сортировка: от Я до А
        stringsList.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
        //обратня сортировка: от 9 до 1
        intList.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}
