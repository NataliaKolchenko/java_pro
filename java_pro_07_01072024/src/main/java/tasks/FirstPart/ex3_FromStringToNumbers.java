package tasks.FirstPart;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;

// Преобразовать список строк в список их длин.

public class ex3_FromStringToNumbers {
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

        listStr.stream()
                .map(string -> string.length())
                .forEach(i -> System.out.printf("%s, ",i ));
    }
}
