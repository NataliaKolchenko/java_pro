package example.ParallelStream;


//Пример с сохранением порядка
//Если порядок выполнения важен, используйте forEachOrdered:


import java.util.Arrays;
import java.util.List;

public class Example2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c", "d");
        list.parallelStream()
                .forEachOrdered(System.out::println);
    }
}
