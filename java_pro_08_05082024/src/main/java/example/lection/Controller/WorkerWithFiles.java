package example.lection.Controller;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import example.lection.DAO.TaskServices;
import example.lection.Model.TaskItem;
import example.lection.DAO.ServicesImp;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;


public class WorkerWithFiles {
    private ObjectMapper jsonMapper;

    private String path = "TASK_LIST.json";
    private TaskServices taskServices;

    public WorkerWithFiles(TaskServices taskServices) {
        this.taskServices = taskServices;
        this.jsonMapper = new ObjectMapper();
    }

    public String serializationToJSON() {
        String json = "";
        try {
            jsonMapper.registerModule(new JavaTimeModule())
                    .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS); //отключает преобразование дат в метке времени

            json = jsonMapper.writeValueAsString(taskServices.getAllTasksList());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return json;
    }

    public List<TaskItem> deserializationToJSON() throws IOException {
        jsonMapper.registerModule(new JavaTimeModule());
        List<TaskItem> desListTaskItems = jsonMapper.readValue(new File("TASK_LIST.json"), new TypeReference<>() {
        });

        return desListTaskItems;
    }


    public void writeToJSON() {

        try (
                BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            writer.write(serializationToJSON());
            System.out.println("Файл успешно записан.");
        } catch (IOException e) {
            System.err.println("Error in writing progress" + e.getMessage());
        }

    }

    public void putToList(List<TaskItem> desList) {
        for (int i = 0; i < desList.size(); i++) {
            taskServices.createTask(desList.get(i));

        }

    }
}


