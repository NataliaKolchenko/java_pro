package tasks.FirstPart;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;

//Отфильтровать список строк так, чтобы остались только строки, начинающиеся с определенной буквы.
public class ex4_FilterStrings {
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
                //вернет boolean (содержит/не содержит)
//                .map(str -> str.startsWith("A"))

                //вернет выведет с пробелами и запятыми
//                .map(str -> {
//                    if (str.startsWith("A")) {
//                        return str;
//                    }
//                    return "";
//                })

                //альтернативный вариант
                .filter(string -> string.startsWith("A"))
                .forEach(i -> System.out.print(i + ","));
    }
}
