package example.practice;

import com.github.javafaker.Faker;

import java.util.*;
import java.util.stream.Collectors;

//есть лист стригов, оставить только уникальные стринги, перевести в заглавнеы буквы, отфильтровать с длинос < 7,
//вернуть мапу: клюк - сама стринга, значение - длина строки
public class Stream_ex2 {

    private static final Faker FAKER = new Faker();

    public static void main(String[] args) {
        List<String> listStr = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            listStr.add(FAKER.name().firstName());
        }

        System.out.println(getUniqueStringMap(listStr));

    }

    public static Map<String, Integer> getUniqueStringMap(List<String> list) {
        return list.stream()
                .distinct()
                .map(String::toUpperCase)
                .filter(el -> el.length() < 7)
                .collect(Collectors.toMap(str -> str, String::length));
    }

}

