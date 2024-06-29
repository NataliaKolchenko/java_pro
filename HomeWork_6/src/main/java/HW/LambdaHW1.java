package HW;
//Напишите метод, который принимает список строк и предикат, и возвращает новый список,
// содержащий только те строки, которые удовлетворяют условию предиката. Например, отфильтровать все строки длиннее 5 символов.

import java.util.ArrayList;
import java.util.List;

public class LambdaHW1 {
    public static void main(String[] args) {
        ArrayList<String> arrStrings = new ArrayList<>();
        arrStrings.add("qwqqweqeqe");
        arrStrings.add("e");
        arrStrings.add("qwe");
        arrStrings.add("qwsdlfjsdofjsodjosie");
        arrStrings.add("qwert");


        System.out.println(process(arrStrings, x -> x.length() >= 5));

    }

    public static List<String> process(ArrayList<String> arr, ArrayStringInterface inf) {
        ArrayList<String> newStrings = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            if (inf.myMethod(arr.get(i))) {
                newStrings.add(arr.get(i));
            }
        }

        return newStrings;
    }
}

@FunctionalInterface
interface ArrayStringInterface {
    boolean myMethod(String str);
}
