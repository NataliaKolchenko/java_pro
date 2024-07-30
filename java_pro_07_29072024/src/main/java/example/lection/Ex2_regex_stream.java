package example.lection;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

//Задание 2: Извлечение всех email адресов из текста
//Описание: Напишите программу, которая извлекает все email адреса из заданного текста.
//
//Пусть Email адреса имеют вид [nickname@домен_второго_уровня]
public class Ex2_regex_stream {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\w+@(\\w+)\\.(\\w+)");
        String phone = ";oihiuhwe;fkjw;oef ewfhweufh ejfpqwdoq mail@mail.ru ewefwef gGmail@com.com";

        String[] wordsArr = phone.split(" ");

        System.out.println(Arrays.toString(wordsArr));

        Boolean[] resultArr = new Boolean[wordsArr.length];

        Arrays.stream(wordsArr).filter(string -> pattern.matcher(string).matches())
                .forEach(System.out::println);

    }
}
