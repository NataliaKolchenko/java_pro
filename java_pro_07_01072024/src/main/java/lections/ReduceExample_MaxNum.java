package lections;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//Нахождение максимального значения

public class ReduceExample_MaxNum {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Находим максимальное число в потоке
        Optional<Integer> max = numbers.stream()
                .reduce(Integer::max);

        if (max.isPresent()) {
            System.out.println("Максимальное число: " + max.get());
        } else {
            System.out.println("Поток пуст");
        }
    }
}
