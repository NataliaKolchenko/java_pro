package tasks.SecondPart;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;

//Преобразовать список слов в список их анаграмм.
public class ex1_StringAnagram {
    static final Faker FAKER = new Faker();

    public static void main(String[] args) {
        List<String> listStr = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            listStr.add(FAKER.name().firstName());
        }

        for (String s : listStr) {
            System.out.printf("%s, ", s);
        }

        System.out.println();
        List<String> newList = listStr.stream()
                .map(ex1_StringAnagram::reverseStr)
                .toList();

        System.out.println(newList);

    }

    public  static String reverseStr (String str) {

       StringBuilder res = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            res.append(str.charAt(i));
        }
        res.reverse();

       return res.toString();
    }
}
