package tasks.of30;

import java.util.ArrayList;
import java.util.List;

// Пропустить первые N элементов списка.
public class ex16_SkipElem {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();

        intList.add(3);
        intList.add(5);
        intList.add(1);
        intList.add(9);
        intList.add(8);

        intList.stream()
                .skip(3)
                .forEach(System.out::println);

//        System.out.println(intList);


    }
}
