package example.lection;
// описание задания
// https://github.com/iksergey/be-java/blob/master/src/main/java/org/demo/seminar16_20240805/readme.md

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class TaskItemApplication {
    public static void main(String[] args) throws IOException {
//        UseInterface.run();
        SpringApplication.run(TaskItemApplication.class, args);

    }
}
