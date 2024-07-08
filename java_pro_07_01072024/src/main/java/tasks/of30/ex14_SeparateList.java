package tasks.of30;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//Разделить список на части заданного размера.
public class ex14_SeparateList {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();

        intList.add(3);
        intList.add(5);
        intList.add(1);
        intList.add(9);
        intList.add(8);
        intList.add(18);
        intList.add(19);
        intList.add(199);
        intList.add(133);
        intList.add(19339);


        int part = 3; //количество элементов в подлисте
        System.out.println(output(intList, part));

//
//        Map<Boolean, List<Integer>> map = intList.stream()
//                .collect(Collectors.partitioningBy(s -> s > part));
//        System.out.println(map);


    }

    public static List<List<Integer>> output(List<Integer> list, int part) {
        List<List<Integer>> outputList = new ArrayList<>();
        outputList = IntStream.range(0, (int) Math.ceil((double) list.size() / part))
                .mapToObj(n -> list.subList(n * part, Math.min(n * part + part, list.size())))
                .collect(Collectors.toList());

        return outputList;
    }
}
