package example.WorkWithFiles;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

// Создайте программу, которая записывает строку "Привет, мир!" в текстовый файл.
public class ex1_WriteStringInFile {
    public static void main(String[] args)  {
        String fileName = "newFile.txt";
        String content = "Привет, мир!";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);
            System.out.println("Файл успешно записан.");
        }  catch (IOException e) {
            System.err.println("Error in writing progress" + e.getMessage());
        }


    }
}
