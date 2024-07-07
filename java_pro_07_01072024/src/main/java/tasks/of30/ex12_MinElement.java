package tasks.of30;

import java.util.ArrayList;
import java.util.List;

// Найти минимальный элемент в числовом списке.
public class ex12_MinElement {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();

        intList.add(3);
        intList.add(5);
        intList.add(1);
        intList.add(9);
        intList.add(8);

        int minElem = intList.stream()
                .min(Integer::compareTo)
                .get();

        System.out.println(minElem);
    }
}
