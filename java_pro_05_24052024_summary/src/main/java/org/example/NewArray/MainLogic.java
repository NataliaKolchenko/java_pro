//Написать класс, который будет отвечать за решение задачи
//Задача есть массив чисел
//нужно сформировать новый массив чисел
//в котором все нули будут в конце
//при этом порядок остальных элементов не будет нарушен
//Декомпозиция:
//        1. Задание массива
//1.1 Сформировать через Random'a
//        2. Само решение *
//        3. Вывод решения
//3.1 в терминал

package org.example.NewArray;

import java.util.Scanner;

public class MainLogic {

    public  void MainLogic() {
        Methods useMethod = new Methods();
        Scanner scanner = new Scanner(System.in);

        System.out.println("How big should an array be?");
        int userAnswer = scanner.nextInt();

        if (useMethod.isArrayNull(userAnswer)) {
            System.out.println("ERROR: incorrect array");
            scanner.close();
        } else {
            int [] array = useMethod.createArray(userAnswer);
            System.out.print("Original array: ");
            useMethod.printArray(array);


            if (useMethod.isArrayHasZero(array)) {
                System.out.print("Sorted array: ");
                int [] newArray = useMethod.sortArray(array);
                useMethod.printArray(newArray);
            } else {
                System.out.println("Original array doesn't has zero");
            }
        }
        }


}
