package tasks.FirstPart;

// Преобразовать список чисел в список строк.


import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ex1_FromNumberToString {


    public static void main(String[] args) {
        List<Integer> listInts = new ArrayList<>();

        for (int i = 0; i < 15; i++) {
            listInts.add(i);
        }


        System.out.println(getFromNumberToString(listInts));

    }
    public static List<String> getFromNumberToString (List<Integer> listInts) {
       return listInts.stream()
                .map(Object::toString)
                .collect(Collectors.toList());
    }
}
