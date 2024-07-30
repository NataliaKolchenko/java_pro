package example.lection;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Задание 3: Проверка на наличие цифр в строке
//Описание: Напишите программу, которая проверяет, содержит ли строка хотя бы одну цифру.
public class Ex3_regex {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\d+");
        String phone = ";oihiuhw3e;fkjw;oef ewfhweufh ejfpqwdoq mai7777l@mail.ru ewefwef gGmail@com.com9";

        String[] wordsArr = phone.split(" ");

        System.out.println(Arrays.toString(wordsArr));

        Boolean[] resultArr = new Boolean[wordsArr.length];
        for (int i = 0; i < wordsArr.length; i++) {
            Matcher matcher = pattern.matcher(wordsArr[i]);
            resultArr[i] = matcher.find();
        }


        System.out.println(Arrays.toString(resultArr));

    }
}
