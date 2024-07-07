package tasks.of30;

// Посчитать сумму длин строк в списке.

import java.util.ArrayList;
import java.util.List;

public class ex17_SumLengthStrings {
    public static void main(String[] args) {
        List<String> stringsList = new ArrayList<>();

        stringsList.add("cat");
        stringsList.add("mama");
        stringsList.add("zeit");
        stringsList.add("son");
        stringsList.add("father");

       int sumRes =  stringsList.stream()
               .mapToInt(String::length)
               .sum();

        System.out.println(sumRes);
    }
}
