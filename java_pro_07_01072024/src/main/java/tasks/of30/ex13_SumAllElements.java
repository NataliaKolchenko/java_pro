package tasks.of30;

import java.util.ArrayList;
import java.util.List;

// Посчитать сумму всех элементов в числовом списке.
public class ex13_SumAllElements {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();

        intList.add(3);
        intList.add(5);
        intList.add(1);
        intList.add(9);
        intList.add(8);

       int sum =  intList.stream()
//                .reduce((a,b) -> a + b)
                .reduce(Integer::sum)
               .get();

        System.out.println(sum);
    }
}
