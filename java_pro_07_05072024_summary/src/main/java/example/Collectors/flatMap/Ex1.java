package example.Collectors.flatMap;

import java.util.List;
import java.util.stream.Collectors;

// Преобразовать список списков целых чисел в один список всех чисел.
public class Ex1 {
    public static void main(String[] args) {

        List<List<Integer>> listOfList = List.of(
                List.of(1,2,3),
                List.of(4,5,6),
                List.of(7,8,9));

       List<Integer> newList =  listOfList.stream()
                .flatMap(l -> l.stream())
                .collect(Collectors.toList());

        System.out.println(newList);

    }
}