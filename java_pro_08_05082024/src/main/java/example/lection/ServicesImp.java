package example.lection;

import java.util.ArrayList;
import java.util.List;

public class ServicesImp implements TaskServices {
    private List<TaskItem> tasksList = new ArrayList<>();


    @Override
    public TaskItem createTask(TaskItem newTaskItem) {
        tasksList.add(newTaskItem);
//        System.out.println(tasksList.size());
        return newTaskItem;
    }

    @Override
    public TaskItem getTask(int id) {
//        System.out.println(tasksList.get(0).getId());
        return tasksList.stream()
                .filter(i -> i.getId() == id)
                .findFirst()
                .get();
    }

    @Override
    public boolean updateTask(int id, TaskItem newTaskItem) {
        TaskItem t = getTask(id);
//        if (t.getId() != id) {
//            return false;
//        }
        t.setTitle(newTaskItem.getTitle());
        t.setDescription(newTaskItem.getDescription());
        t.setDeadline(newTaskItem.getDeadline());
        t.setTimeZone(newTaskItem.getTimeZone());

        return true;
    }

    @Override
    public void deleteTask(int id) {

    }
}
