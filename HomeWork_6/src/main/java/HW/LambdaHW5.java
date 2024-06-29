package HW;

//Напишите метод, который объединяет два списка в один, используя бинарный оператор для определения,
// как именно объединять элементы. Например, сложить попарно элементы двух числовых списков.

import java.util.ArrayList;

public class LambdaHW5 {
    public static void main(String[] args) {
        ArrayList<Integer> listOne = new ArrayList<>();
        listOne.add(-3);
        listOne.add(2);
        listOne.add(-5);
        listOne.add(6);

        ArrayList<Integer> listTwo = new ArrayList<>();
        listTwo.add(3);
        listTwo.add(-2);
        listTwo.add(5);
        listTwo.add(-6);

        System.out.println(sumNumbers(listOne, listTwo, (x , y) -> x + y));
    }

    public static ArrayList<Integer> sumNumbers (ArrayList<Integer> firstList, ArrayList<Integer> secondList, Operandable op) {
        ArrayList<Integer> finalNumbersList = new ArrayList<>();

        for (int i = 0; i < firstList.size(); i++) {
            finalNumbersList.add(op.operator(firstList.get(i), secondList.get(i)));
        }
        return finalNumbersList;
    }
}

@FunctionalInterface
interface Operandable {
    int operator (int firstNumber, int secondNumber);
}
