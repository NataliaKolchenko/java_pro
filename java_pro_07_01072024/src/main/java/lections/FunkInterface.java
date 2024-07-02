package lections;

import java.util.function.*;

public class FunkInterface {


    public static void main(String[] args) {

//        Supplier - поставщик (supplier) значения типа T без входных параметров:

        Supplier<String> supplier = () -> "Привет, мир!";
        System.out.println(supplier.get()); // Выведет: Привет, мир!

//        Consumer - потребитель (consumer) значения типа T с одним входным параметром:

        Consumer<String> consumer = (str) -> System.out.println("Получено сообщение: " + str);
        consumer.accept("Привет, мир!");
// Выведет: Получено сообщение: Привет, мир!

//        Predicate - предикат (predicate) проверяет условие на объекте типа T и возвращает boolean:

        Predicate<Integer> predicate = (num) -> num > 10;
        System.out.println(predicate.test(15)); // Выведет: true

//        Function<T, R> - функция (function) принимает объект типа T и возвращает объект типа R:

        Function<Integer, String> converter = (num) -> String.valueOf(num * 2);
        System.out.println(converter.apply(5)); // Выведет: 10

//        UnaryOperator - унарный оператор (unary operator) принимает и возвращает объект типа T:

        UnaryOperator<Integer> square = (num) -> num * num;
        System.out.println(square.apply(4)); // Выведет: 16

//        BinaryOperator - бинарный оператор (binary operator) принимает два объекта типа T и возвращает объект типа T:

        BinaryOperator<Integer> sum = (a, b) -> a + b;
        System.out.println(sum.apply(3, 4)); // Выведет: 7


    }




}
