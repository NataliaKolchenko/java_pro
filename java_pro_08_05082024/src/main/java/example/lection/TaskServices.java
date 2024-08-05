package example.lection;

public interface TaskServices {

    TaskItem createTask(TaskItem newTaskItem);

    TaskItem getTask(int id);

    boolean updateTask(int id, TaskItem newTaskItem);

    void deleteTask(int id);

}
