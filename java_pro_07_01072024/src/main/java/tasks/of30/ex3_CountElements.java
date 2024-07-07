package tasks.of30;


import java.util.List;

// Посчитать количество элементов в списке.
public class ex3_CountElements {
    public static void main(String[] args) {
        List<String> strings = List.of("apple", "banana", "cherry", "date", "elderberry");
        long count = strings.stream().count();
//        long count = strings.size();
        System.out.println("Количество элементов в списке: " + count);
    }
}
