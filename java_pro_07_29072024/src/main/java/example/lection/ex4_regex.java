package example.lection;

import java.util.Arrays;
import java.util.regex.Pattern;

//
//Задание 4: Валидация IP-адреса
//Описание:
//        ч1. Напишите программу, которая проверяет, является ли строка валидным IPv4-адресом.
//
//Обратите внимание: у IPv4 могут быть нули, т е 5.255.255.242, 05.255.255.242 и 005.255.255.242 - это фактически один и тот же IP
//
//ч2. Напишите программу получения всех IPv4 адресов из текста
public class ex4_regex {
    public static void main(String[] args) {
        String ipAddress = "005.255.255.249.77";

        String[] ipParts = ipAddress.split("\\.");
        long res = Arrays.stream(ipParts)
                .map(s -> Integer.parseInt(s))
                .filter(n -> n <= 255)
                .count();

        if (res != 4) {
            System.out.println("invalid address");
        } else {
            System.out.println("valid");
        }


    }
}
