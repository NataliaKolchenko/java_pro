package HW;

//Напишите метод, который принимает список строк и логику обрабоктки.
// Основной метод возвращает список целых чисел - результатов применения функции к каждой строке.
// Например, преобразовать список имен в список длин этих имен.


import java.util.ArrayList;

public class LambdaHW3 {
    public static void main(String[] args) {
        ArrayList<String> arrStrings = new ArrayList<>();
        arrStrings.add("qwqqweqeqe");
        arrStrings.add("e");
        arrStrings.add("qwe");
        arrStrings.add("qwsdlfjsdofjsodjosie");
        arrStrings.add("qwert");

        System.out.println(lengthList(arrStrings, x -> x.length()));
    }

    static ArrayList<Integer> lengthList (ArrayList<String> namesList, Changenable ch) {
        ArrayList<Integer> namesLengthList = new ArrayList<>();
        for (int i = 0; i < namesList.size(); i++) {
            namesLengthList.add(ch.strLength(namesList.get(i)));
        }
        return namesLengthList;
    }
}

@FunctionalInterface
interface Changenable {
    int strLength (String str);
}
