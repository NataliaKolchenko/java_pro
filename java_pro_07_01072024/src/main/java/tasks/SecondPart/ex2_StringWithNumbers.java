package tasks.SecondPart;


import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;

//Отфильтровать список строк так, чтобы остались только строки, содержащие цифры.
public class ex2_StringWithNumbers {


    public static void main(String[] args) {
        List<String> listStr = new ArrayList<>();

        listStr.add("test");
        listStr.add("test1Num");
        listStr.add("2nnnnnum");
        listStr.add("nnnneeeww");

        listStr.stream()
                .filter(string -> string.chars().anyMatch(Character::isDigit))
                .forEach(System.out::println);

        //2 version
        //List<String> newList = listStr.stream()
//        .filter(s -> s.matches(".*\\d.*"))    // '%123456%'   .* = %
//        .toList();

    }
}
