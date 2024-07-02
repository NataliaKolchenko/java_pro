package lections;

import java.util.Arrays;
import java.util.List;

// Проверка наличия хотя бы одного отрицательного числа

public class ReduceExample_CheckNegativeNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, -4, 5);

        // Проверяем, есть ли хотя бы одно отрицательное число
        boolean hasNegative = numbers.stream()
                .anyMatch(n -> n < 0);

        if (hasNegative) {
            System.out.println("В потоке есть отрицательные числа");
        } else {
            System.out.println("В потоке нет отрицательных чисел");
        }
    }
}
