package tasks.FirstPart;

//Преобразовать список дат в список строк в формате "год-месяц".

import com.github.javafaker.Faker;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class ex5_FormDataToString {
    static final Faker FAKER = new Faker();

    public static void main(String[] args) {

        List<LocalDate> dates = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate startDate = LocalDate.of(2024, 6, 1);

        for (int i = 0; i < 10; i++) {
            dates.add(startDate.plusDays(i));
        }

        for (LocalDate date : dates) {
            System.out.println(date.format(formatter));
        }

        System.out.println();

        System.out.println(getFormatDates(dates));


    }

    public static List<String> getFormatDates (List<LocalDate> listDates) {
        return  listDates.stream()
                .map(date -> date.format(DateTimeFormatter.ofPattern("yyyy/MM")))
                .collect(Collectors.toList());
    }
}

