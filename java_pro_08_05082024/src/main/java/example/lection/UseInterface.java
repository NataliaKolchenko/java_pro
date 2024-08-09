package example.lection;

import example.lection.Controller.WorkerWithFiles;
import example.lection.DAO.ServicesImp;
import example.lection.Model.TaskItem;

import java.io.IOException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.Month;

public class UseInterface {


    public static void run() throws IOException {
        Timestamp localDateTime4 = Timestamp.valueOf(LocalDateTime.of(2024, Month.SEPTEMBER, 28, 14, 33));

        ServicesImp taskServices = new ServicesImp();
        WorkerWithFiles workerWithFiles = new WorkerWithFiles(taskServices);

        TaskItem taskItem1 = new TaskItem("testTask1", "test 1", localDateTime4);
        taskServices.createTask(taskItem1);

        TaskItem taskItem3 = new TaskItem("testTask3", "", localDateTime4);
        taskServices.createTask(taskItem3);

        TaskItem taskItem2 = new TaskItem("testTask2", "", null);
        taskServices.createTask(taskItem2);

        TaskItem taskItem4 = new TaskItem("testTask1", "test 1", null);
        taskServices.createTask(taskItem4);

//        System.out.println(taskServices.getAllTasksList());

//        System.out.println(controler.serializationToJSON());
//
//        controler.serializationToJSON();
//        controler.writeToJSON();

        System.out.println(workerWithFiles.deserializationToJSON());
//        System.out.println(taskServices.getAllTasksList());
        System.out.println("------------");
        workerWithFiles.putToList(workerWithFiles.deserializationToJSON());
        System.out.println(taskServices.getAllTasksList());


    }

}
