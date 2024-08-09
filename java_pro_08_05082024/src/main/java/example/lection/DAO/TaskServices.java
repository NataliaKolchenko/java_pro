package example.lection.DAO;

import example.lection.Model.TaskItem;

import java.util.List;
import java.util.UUID;

public interface TaskServices {

    TaskItem createTask(TaskItem newTaskItem);

    TaskItem getTask(String id);

    boolean updateTask(String id, TaskItem newTaskItem);

    boolean deleteTask(UUID id);

    List<TaskItem> getAllTasksList();

}
