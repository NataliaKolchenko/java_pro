package HW;
//Реализуйте метод, который принимает список чисел и унарный оператор, а возвращает новый список,
// где каждый элемент преобразован с помощью переданного оператора. Например, увеличить каждое число на 1.

import java.util.ArrayList;

public class LambdaHW4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(-3);
        list.add(2);
        list.add(-5);
        list.add(6);

        System.out.println(getIncreaseNumber(list, x -> x + 1));
    }

    static ArrayList<Integer> getIncreaseNumber (ArrayList<Integer> numberArr, AddOne ao) {
        ArrayList<Integer> newListNumbers = new ArrayList<>();

        for (int i = 0; i < numberArr.size();   i++) {
            newListNumbers.add(ao.plusOne(numberArr.get(i)));

        }
        return newListNumbers;
    }
}

@FunctionalInterface
interface AddOne {
    int plusOne (int number);
}
