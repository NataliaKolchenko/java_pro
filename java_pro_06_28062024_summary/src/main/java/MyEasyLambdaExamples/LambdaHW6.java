package java_pro_06_28062024_summary.src.main.java.MyEasyLambdaExamples;

//Pеализуйте метод, который принимает список чисел и унарный оператор, а возвращает новый список,
// если число положительное, то сделать его отрицательным и наоборот

import java.util.ArrayList;

public class LambdaHW6 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(-3);
        list.add(2);
        list.add(-5);
        list.add(6);

        System.out.println(getChangeUnary(list, x -> {

            if (x > 0) {
                return (-x);
            } else if (x < 0) {
                return (Math.abs(x));
            }
            return 0;
        }));


    }

    public static ArrayList<Integer> getChangeUnary(ArrayList<Integer> numberList, Oppositable op) {
        ArrayList<Integer> newNumberList = new ArrayList<>();

        for (int i = 0; i < numberList.size(); i++) {
            newNumberList.add(op.charMinusPlus(numberList.get(i)));
        }

        return newNumberList;
    }
}

@FunctionalInterface
interface Oppositable {
    int charMinusPlus(int number);
}
