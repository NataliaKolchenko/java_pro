package lections;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

// Вычисление суммы чисел

public class ReduceExample_SumNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Вычисляем сумму всех элементов в потоке
        Optional<Integer> sum = numbers.stream()
                .reduce((a, b) -> a + b);

        if (sum.isPresent()) {
            System.out.println("Сумма чисел: " + sum.get());
        } else {
            System.out.println("Поток пуст");
        }
    }
}
