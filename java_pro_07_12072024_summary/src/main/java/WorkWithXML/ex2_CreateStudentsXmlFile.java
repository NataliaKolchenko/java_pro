package WorkWithXML;

// Напишите программу, которая создает XML файл с информацией о нескольких студентах (имя, возраст, курс).

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class ex2_CreateStudentsXmlFile {
    public static void main(String[] args) throws IOException {
        XmlMapper xmlMapper = new XmlMapper();

        String fileName = "STUDENTS.xml";
        File file = new File(fileName);

        Student st1 = new Student("Peter", 21, "Math");
        Student st2 = new Student("Ben", 19, "Design");
        Student st3 = new Student("Lisa", 20, "Book");

        ArrayList studentList = new ArrayList<>();
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);


        xmlMapper.writeValue(file, studentList);


    }
}
