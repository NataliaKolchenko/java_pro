package example.lection;
// описание задания
// https://github.com/iksergey/be-java/blob/master/src/main/java/org/demo/seminar16_20240805/readme.md

//P.S. добавить класс для генерации ID (или заиспользовать UID),
// добавить класс для работы с JSON
// добавить класс "run", в который из main все перенести

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {
    public static void main(String[] args) {
        LocalDateTime localDateTime4 = LocalDateTime.of(2024, Month.SEPTEMBER, 28, 14, 33);
        ZonedDateTime klDateTime = localDateTime4.atZone(ZoneId.of("Asia/Kuala_Lumpur"));

        ServicesImp taskServices = new ServicesImp();

        TaskItem taskItem = new TaskItem("testTask", "test test", localDateTime4, klDateTime);
        taskServices.createTask(taskItem);

        System.out.println(taskServices.getTask(1));

    }
}
