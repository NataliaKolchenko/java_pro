package tasks.of30;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Преобразовать список строк в мапу, где ключом будет строка, а значением - длина строки.
public class ex11_FromListToMap {
    public static void main(String[] args) {
        List<String> stringsList = new ArrayList<>();

        stringsList.add("cat");
        stringsList.add("mama");
        stringsList.add("zeit");
        stringsList.add("son");
        stringsList.add("father");

        Map<String, Integer> map =  stringsList.stream()
                .collect(Collectors.toMap(
                        k -> k,
//                        v -> v.length()
                        String::length
                ));

        System.out.println(map);

//        map.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
