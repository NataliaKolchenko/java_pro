package HW;

import MyEasyLambdaExamples.Operations;

import java.util.ArrayList;

//Создайте метод, который принимает список чисел и void-метод, отвечающий за логику.
// Метод должен применять переданный void-метод к каждому элементу списка.
// Например, вывести на экран квадрат каждого числа.
public class LambdaHW2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(5);
        list.add(6);

        numbersList(list, x -> System.out.println(x*x));
    }

    static void numbersList (ArrayList<Integer> numList, Operationable ops) {
        for (int i = 0; i < numList.size(); i++) {
            ops.logic(numList.get(i));
        }
    }
}

@FunctionalInterface
interface Operationable {
    void logic (int value);
}
