package tasks.of30;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Преобразовать список чисел в список квадратов этих чисел.
public class ex19_QuadroNumbers {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();

        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(56);
        intList.add(8);

        System.out.println(intList);

        intList.stream()
                .map(x -> x * x)
                .toList()
//                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
