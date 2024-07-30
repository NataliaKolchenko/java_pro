package WorkWithXML;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;

// Создайте простой XML файл с информацией о книге (название, автор, год издания) и напишите программу для его чтения.
public class ex1_CreateAndReadXMLFile {
    public static void main(String[] args) throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        String path = "BOOK.xml";
        File file = new File(path);

        // Сериализация
        Book obj = new Book("War and peace", "Tolstoy", 1865);

        String xml = xmlMapper.writeValueAsString(obj);
        System.out.println("Сериализованный XML:");
        System.out.println(xml);
        xmlMapper.writeValue(file, obj);
    }
}
