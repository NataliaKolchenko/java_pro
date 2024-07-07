package tasks.of30;

import java.util.ArrayList;
import java.util.List;

// Проверить, все ли элементы списка удовлетворяют определенному условию.
public class ex8_AllMatchElements {
    public static void main(String[] args) {
        List<String> stringsList = new ArrayList<>();

        stringsList.add("cat");
        stringsList.add("mama");
        stringsList.add("mila");
        stringsList.add("son");
        stringsList.add("father");

        List<Integer> intList = new ArrayList<>();

        intList.add(3);
        intList.add(5);
        intList.add(1);
        intList.add(9);
        intList.add(8);

        boolean resStr = stringsList.stream()
                .allMatch(string -> string.contains("m"));

        System.out.println(resStr);

        boolean resInt = intList.stream()
                .allMatch(num -> num > 0);

        System.out.println(resInt);
    }
}
