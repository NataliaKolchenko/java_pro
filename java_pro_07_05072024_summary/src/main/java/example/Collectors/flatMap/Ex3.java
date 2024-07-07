package example.Collectors.flatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Преобразовать список массивов строк в один список всех строк.
public class Ex3 {
    public static void main(String[] args) {
        List<String[]> arrString = List.of(
                new String[]  {"Hello", "World"},
                new String[]  {"My", "Tai"},
                new String[]  {"Program", "Class"}
        );

        arrString.stream()
                .flatMap(strings -> Arrays.stream(strings))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
