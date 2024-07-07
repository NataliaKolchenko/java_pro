package tasks.of30;

import java.util.ArrayList;
import java.util.List;

// Проверить, есть ли хотя бы один элемент, удовлетворяющий заданному условию.
public class ex15_FindOneElem {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();

        intList.add(3);
        intList.add(5);
        intList.add(1);
        intList.add(9);
        intList.add(8);

        boolean res = intList.stream()
                .anyMatch(n-> n == 0);

        System.out.println(res);
    }
}
