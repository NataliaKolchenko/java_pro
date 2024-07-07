package tasks.of30;


import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;

// Выбрать первые N элементов списка.
public class ex7_ChooseElements {
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
                .limit(3)
                .forEach(System.out::println);

    }
}
