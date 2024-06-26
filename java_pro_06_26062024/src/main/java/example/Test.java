package example;

import java.util.ArrayList;

//Самая длинная подстрока без повторяющихся символов
//Дана строка s, найдите длину самой длинной
//
//подстрокабез повторяющихся символов.
//
//        Пример 1:
//
//Ввод: s = "abcabcbb"
//Вывод: 3
//Объяснение: Ответ "abc", длина 3.
//Пример 2:
//
//Вход: s = "bbbb"
//Выход: 1
//Объяснение: Ответ "b" с длиной 1.
//Пример 3:
//
//Ввод: s = "pwwkew"
//Вывод: 3
//Объяснение: Ответ "wke" с длиной 3.
//        Обратите внимание, что ответ должен быть подстрокой, «pwke» — это подпоследовательность, а не подстрока.

//https://zazloo.ru/leetcode-tasks3/

public class Test {
    public static void main(String[] args) {
        String str = "abcabcbb";

        System.out.println(getLongestSubStr(str));
    }

    public static int getLongestSubStr (String str) {
        int left = 0;
        int right = 0;
        int maxLength = 0;

        ArrayList<Character> charList = new ArrayList<>();

        for (int i = left; i <= str.length();){
            if (charList.contains(str.charAt(i))) {
                left++;
            } else {
                charList.add(str.charAt(i));
            }
        }


        return 0;
    }
}
