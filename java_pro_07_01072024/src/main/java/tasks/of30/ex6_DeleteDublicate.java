package tasks.of30;

import java.util.List;
import java.util.stream.Collectors;

// Убрать дубликаты из списка.

public class ex6_DeleteDublicate {
    public static void main(String[] args) {
        List<String> strings = List.of("date", "apple", "banana", "cherry","cherry","cherry", "date", "elderberry", "banana");

        strings.stream()
                .distinct() //возвращает поток, в котором все дубликаты удалены.
                .toList()
//                .collect(Collectors.toList())
                .forEach(System.out::println);


    }
}
