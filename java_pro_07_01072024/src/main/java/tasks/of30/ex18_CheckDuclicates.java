package tasks.of30;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Проверить, есть ли дубликаты в списке.
public class ex18_CheckDuclicates {
    public static void main(String[] args) {
        List<String> stringsList = new ArrayList<>();

        stringsList.add("cat");
        stringsList.add("mama");
        stringsList.add("zeit");
        stringsList.add("son");
        stringsList.add("father");
//        stringsList.add("zeit");

        boolean res = stringsList.stream()
                .distinct() // возвращает поток, в котором все дубликаты удалены.
                .count() != stringsList.size(); //возвращает количество элементов в потоке после удаления дубликатов.


        // 2 версия
        boolean res2 = stringsList.stream()
                        .collect(Collectors.toSet())
                                .size() != stringsList.size();


        System.out.println(res);
        System.out.println(res2);


    }
}
