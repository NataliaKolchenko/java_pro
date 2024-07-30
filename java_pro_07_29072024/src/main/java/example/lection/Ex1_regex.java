package example.lection;

// Задание 1: Проверка формата номера телефона
//Описание: Напишите программу, которая проверяет, соответствует ли строка формату номера телефона "(999)145-67-89".


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex1_regex {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("\\(\\d{3}\\)\\d{3}(-\\d{2}){2}");
        String phone = "(999)145-67-89";
        Matcher matcher = pattern.matcher(phone);

        System.out.println(matcher.matches());
    }
}