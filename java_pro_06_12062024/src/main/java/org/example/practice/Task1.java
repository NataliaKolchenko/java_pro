package org.example.practice;

import java.util.*;

public class Task1 {
    public static void task(String[] args) {
        Map<Integer, String> phoneDic = new HashMap<>();

        phoneDic.put(123, "Q");
        phoneDic.put(456, "a");
        phoneDic.put(789, "t");
        phoneDic.put(890, "n");
        phoneDic.put(123, "t");
        phoneDic.put(null, null);

        for (Map.Entry<Integer,String> entry : phoneDic.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

//        System.out.println(phoneDic);

        List<String> stringList = new ArrayList<>();
        for (String s : stringList) {
            System.out.println(s);
        }
    }
}
