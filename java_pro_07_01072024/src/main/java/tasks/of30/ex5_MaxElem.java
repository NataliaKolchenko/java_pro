package tasks.of30;

import java.util.ArrayList;
import java.util.List;

// Найти максимальный элемент в числовом списке.

public class ex5_MaxElem {

    public static void main(String[] args) {

        List<Integer> listNum = new ArrayList<>();

        for (int i = 0; i <= 10; i++) {
            int randomNum = ((int)(Math.random() * 100) - 15);
            listNum.add(randomNum);
        }
        System.out.println(listNum);

        int maxNum = listNum.stream()
                .max(Integer::compare)
                .get();

        System.out.println(maxNum);


    }
}

