package example.practice;

import java.util.*;

//найти одинаковые буквы в словах
public class CommonWords {
    public static void main(String[] args) {
        String[] stringArr = {"ruck", "lu", "cooulii", "cualk", "caull", "culoou"};

        List<String> newList = Arrays.stream(stringArr)
                .sorted(Comparator.comparingInt(String::length))
                .toList();

        System.out.println(newList);

        HashSet<Character> commonCharsList = new HashSet<>();
        int minLengthSize = newList.get(0).length();

        boolean isContains;
        for (int i = 0; i < minLengthSize; i++) {
            char currentChar = newList.get(0).charAt(i);
            isContains = true;
            for (int j = 1; j < newList.size(); j++) {
                if (newList.get(j).indexOf(currentChar) == -1) {
                    isContains = false;
                    break;
                }
            }
            if (isContains) commonCharsList.add(currentChar);
        }

        System.out.println(commonCharsList);
    }
}
