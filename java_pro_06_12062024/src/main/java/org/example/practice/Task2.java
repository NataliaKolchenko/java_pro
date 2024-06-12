package org.example.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task2 {
    public static void task2(String[] args) {
        List<String> list = Arrays.asList("Bike444", "Car4", "Do77g", "Cat"); //создание неизменяемого листа
        Map<String, Integer> mapa = new HashMap<>();
        for (String str : list) {
            mapa.put(str, str.length());

        }

        for (Map.Entry<String, Integer> entry : mapa.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
