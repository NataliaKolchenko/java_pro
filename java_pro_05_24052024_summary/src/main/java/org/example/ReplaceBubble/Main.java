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
//4. Рассмотреть разные сценарии
//ПЯТЬ человек
//кто-то должен создать репозиторий
//форкнуть репу
//* Тесты


package org.example.ReplaceBubble;

import org.example.NewArray.Methods;

public class Main {
    public static void main(String[] args) {

        Methods useMethod = new Methods();
        Repository repo = new Repository();

            //int [] array = {1,3,0,6,7,0};
        int [] array = useMethod.createArray(7);
            System.out.print("Original array: ");
            useMethod.printArray(array);


            if (useMethod.isArrayHasZero(array)) {
                System.out.print("Sorted array: ");
                int [] newArray = repo.replaceArrayBubbleSort(array);
                useMethod.printArray(newArray);
            } else {
                System.out.println("Original array doesn't has zero");
            }
        }
    }
