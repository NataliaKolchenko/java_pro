package tasks.of30;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;


// Найти самую длинную строку в списке.
public class ex20_FindLongestString {
    public static void main(String[] args) {
        List<String> stringsList = new ArrayList<>();

        stringsList.add("cat");
        stringsList.add("mama");
        stringsList.add("zeit");
        stringsList.add("son32323234oweiufwoieru234234");
        stringsList.add("father");

        //1 version
       String longestString = stringsList.stream()
               .reduce("", (x, y) -> {
                   if (x.length() > y.length()){
                       return x;
                   }
                   return y;
               });

        System.out.println(longestString);

        //2 version
        Optional<String> longestStr = stringsList.stream()
                .max(Comparator.comparingInt(String::length));

        longestStr.ifPresent(System.out::println); // проверяет значение и выполняет с ним действия


    }
}
