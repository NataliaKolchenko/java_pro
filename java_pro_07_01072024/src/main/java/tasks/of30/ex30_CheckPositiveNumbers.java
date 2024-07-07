package tasks.of30;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Проверить, все ли элементы списка являются положительными числами.
public class ex30_CheckPositiveNumbers {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();

        intList.add(3);
        intList.add(5);
        intList.add(1);
        intList.add(9);
        intList.add(8);

       boolean res =  intList.stream()
                .allMatch(n -> n > 0);

        System.out.println(res);
    }
}
