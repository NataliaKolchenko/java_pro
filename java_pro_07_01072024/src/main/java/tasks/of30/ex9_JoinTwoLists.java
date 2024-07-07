package tasks.of30;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Объединить несколько списков в один.

public class ex9_JoinTwoLists {

    static final Faker FAKER = new Faker();

    public static void main(String[] args) {

        List<String> firstList = new ArrayList<>();
        List<String> secondList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            firstList.add(FAKER.name().firstName());
            secondList.add(FAKER.name().firstName());
        }

        System.out.print("FIRST LIST: ");
        for (String s : firstList) {
            System.out.printf("%s, ", s);
        }

        System.out.println();
        System.out.print("SECOND LIST: ");

        for (String s : secondList) {
            System.out.printf("%s, ", s);
        }
        System.out.println();

        List<String> commonList =
                Stream.concat(firstList.stream(), secondList.stream())
                .collect(Collectors.toList());

        System.out.println(commonList);

    }
}
