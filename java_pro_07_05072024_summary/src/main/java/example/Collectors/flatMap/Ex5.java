package example.Collectors.flatMap;

import java.util.Arrays;
import java.util.List;

// Преобразовать список строк, каждая из которых содержит пробелы, в один список всех слов.
public class Ex5 {
    public static void main(String[] args) {
        List<String> strList = List.of(
                "Hello\n\rWorld",
                "My\tTai",
                "Program*Class");
        System.out.println(strList);

        strList.stream()
                .flatMap(s -> Arrays.stream(s.split("[\\s+\\*]")))
                .filter(s -> s.length() > 0)
                .forEach(System.out::println);
    }

}
