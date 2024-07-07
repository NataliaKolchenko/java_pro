package tasks.of30;


import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;

// Преобразовать список строк в верхний регистр.
public class ex4_StringUpperCase {
    static final Faker FAKER = new Faker();

    public static void main(String[] args) {

        List<String> listStr = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listStr.add(FAKER.name().firstName());
        }

        for (String s : listStr) {
            System.out.printf("%s, ", s);
        }
        System.out.println();

        listStr.stream()
                .map(String::toUpperCase)
//                .map(string -> string.toUpperCase())
                .forEach(s -> System.out.printf("%s, ", s));

    }
}
