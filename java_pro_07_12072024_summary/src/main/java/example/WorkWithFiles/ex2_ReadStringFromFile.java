package example.WorkWithFiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Напишите программу, которая читает содержимое текстового файла и выводит его на экран.
public class ex2_ReadStringFromFile {
    public static void main(String[] args) {
        String fileName = "newFile.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
        } catch (IOException e) {
            System.out.println("error in reading file" + e.getMessage());

        }
    }
}
