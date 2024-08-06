package example.lection;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ServicesImp implements TaskServices {
    private List<TaskItem> tasksList = new ArrayList<>();


    @Override
    public TaskItem createTask(TaskItem newTaskItem) {
        try {
            tasksList.add(newTaskItem);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
//        tasksList.add(newTaskItem);
        return newTaskItem;
    }

    @Override
    public TaskItem getTask(UUID id) {
        return tasksList.stream()
                .filter(i -> i.getId().equals(id))
                .findFirst()
                .get();
    }

    @Override
    public boolean updateTask(UUID id, TaskItem newTaskItem) {
        TaskItem t = getTask(id);

        if (newTaskItem == null) {
            return false;
        }

        if (newTaskItem.getTitle() == null && newTaskItem.getTitle().isEmpty()) {
            t.setTitle(newTaskItem.getTitle());
        }

        if (newTaskItem.getDescription() != null && !newTaskItem.getDescription().isEmpty()) {
            t.setDescription(newTaskItem.getDescription());
        }

        if (newTaskItem.getDeadline() != null) {
            t.setDeadline(newTaskItem.getDeadline());
        }


        return true;
    }

    @Override
    public boolean deleteTask(UUID id) {
        return tasksList.removeIf(taskItem -> taskItem.getId().equals(id));
    }

    @Override
    public List<TaskItem> getAllTasksList() {
        return new ArrayList<>(tasksList);
    }

}
