package example.lection;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import static java.lang.Compiler.disable;


public class Controler {
    private ObjectMapper jsonMapper = new ObjectMapper();

    private String path = "TASK_LIST.json";
    private ServicesImp taskServices;

    public Controler(ServicesImp taskServices) {
        this.taskServices = taskServices;
    }

    public String getAllTasks() throws JsonProcessingException {
        jsonMapper.registerModule(new JavaTimeModule())
                .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS); //отключает преобразование дат в метке времени

        String json = jsonMapper.writeValueAsString(taskServices.getAllTasksList());
        return json;
    }


    public void writeToJSON() {

        try (
                BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            writer.write(getAllTasks());
            System.out.println("Файл успешно записан.");
        } catch (IOException e) {
            System.err.println("Error in writing progress" + e.getMessage());
        }

    }
}

//        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
//            writer.write(json);
//            System.out.println("Файл успешно записан.");
//        } catch (IOException e) {
//            System.err.println("Error in writing progress" + e.getMessage());
//        }
//
//    }


