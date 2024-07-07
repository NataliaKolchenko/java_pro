package tasks.SecondPart;

import java.util.ArrayList;
import java.util.List;

//Отфильтровать список чисел так, чтобы остались только числа, делящиеся на все свои цифры без остатка.

public class ex4_DivNumbers {
    public static void main(String[] args) {
        int numStart = 185;
        int numEnd = 300;
        List<Integer> listNum = new ArrayList<>();

        for (int i = numStart; i < numEnd; i++) {
            listNum.add(i);
        }

        listNum.stream()
                .filter(number -> extracted(number))
                .forEach(System.out::println);

//        System.out.println(isSelfDividedMath(numStart, numEnd));
        //[200, 202, 204, 208, 210, 212, 216, 220, 222, 224, 240, 244, 248, 250, 264, 280, 288]
    }

    private static boolean extracted(Integer number) {
        int t = number;
        while (number != 0) {
           int  division = number % 10;
            if (division != 0) {
                if (t % division != 0)  {
                    return false;
                }
            }
            number = number / 10;
        }
        return true;
    }

    public static List<Integer> isSelfDividedMath(int numberStart, int numberEnd) {

        List<Integer> listNum = new ArrayList<>();


        for (int i = numberStart; i < numberEnd; i++) {
            boolean flag = true;
            int testnum = i;
            int division;

            while (testnum != 0) {
                division = testnum % 10;
                if (division != 0) {
                    if (i % division != 0) {
                        flag = false;
                        break;
                    }
                }
                testnum = testnum / 10;
            }
            if (flag) {
                listNum.add(i);
            }
        }
        return listNum;
    }
}
