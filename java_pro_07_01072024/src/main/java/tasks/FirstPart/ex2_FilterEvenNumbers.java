package tasks.FirstPart;

import java.util.ArrayList;
import java.util.List;

// Отфильтровать список чисел так, чтобы остались только четные числа.

public class ex2_FilterEvenNumbers {
    public static void main(String[] args) {
        List<Integer> listInts = new ArrayList<>();

        for (int i = 0; i < 15; i++) {
            listInts.add(i);
        }

        listInts.stream()
                .filter(n -> n %2 == 0)
                .forEach(System.out::println);

    }


}
