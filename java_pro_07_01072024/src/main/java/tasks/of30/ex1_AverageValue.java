package tasks.of30;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

// Найти среднее значение списка чисел.

public class ex1_AverageValue {
    public static void main(String[] args) {
        List<Integer> listNum = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            listNum.add(i);
        }

        OptionalDouble aveNum = listNum.stream().
                mapToInt(e -> e).
                average();


        if (aveNum.isPresent())
        {
            System.out.print(aveNum.getAsDouble());
        }


    }
}
