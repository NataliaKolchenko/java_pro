package example.practice;

//Фильтрация чисел больше 5 и вывод их в порядке убывания

import java.util.Arrays;
import java.util.List;

public class Stream_ex1 {
    public static void main(String[] args) {

        List<Integer> arr1 = Arrays.asList(2,4,5,7,123);

        arr1.stream()
                .filter(el -> el > 5)
                .sorted((o1, o2) -> o2-o1)
//                .forEach(param -> System.out.println(param));
                .forEach(System.out::println);
    }
}