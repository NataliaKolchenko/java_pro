package tasks.of30;

import java.util.ArrayList;
import java.util.List;

// Проверить, все ли строки в списке начинаются с определенной буквы.
public class ex22_CheckAllStrings {

    public static void main(String[] args) {
        List<String> stringsList = new ArrayList<>();

        stringsList.add("cat");
        stringsList.add("mama");
        stringsList.add("zeit");
        stringsList.add("new");
        stringsList.add("Father");
        stringsList.add("father2");

        boolean res = stringsList.stream()
                .allMatch(string -> string.toLowerCase().startsWith("f"));

        System.out.println(res);
    }
}
