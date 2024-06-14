//package java_pro_06_07062024.src.main.java.org.example.view;
//
////Создать класс View для взаимодействия с пользователем:
////
////int getValue(String title): метод для получения значения от пользователя.
////void print(int data, String title): метод для вывода результата на экран.
//
//
//import java.util.Scanner;
//
//public class ViewTerminal implements View {
//    Scanner scan = new Scanner(System.in);
//    @Override
//    public int getValue (String title) {
//        System.out.println(title);
//        while(!scan.hasNextInt()) {
//            System.out.println("Invalid data");
//            scan.next();
//        }
//
//        return scan.nextInt();
//    }
//
//    @Override
//    public void print (int data, String title) {
//        System.out.printf("%s%d", title, data);
//    }
//}
