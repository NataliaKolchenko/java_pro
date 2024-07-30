package example.WorkWithFiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Создайте программу, которая подсчитывает количество слов в текстовом файле.
public class ex3_CountWordsIntheFile {
    public static void main(String[] args) {
        String fileName = "newFile.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            int countWord = 0;
            while ((line = reader.readLine()) != null) {
               String [] arrayWords = line.split(" ");
               for (int i = 0; i < arrayWords.length; i++) {
                   if (!arrayWords[i].equals(""))
                       countWord++;

               }

            }
            System.out.println(countWord);
        } catch (IOException e) {
            System.out.println("error in reading file" + e.getMessage());

        }
    }
}
