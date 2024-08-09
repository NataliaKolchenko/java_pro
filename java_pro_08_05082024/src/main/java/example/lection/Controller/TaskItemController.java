package example.lection.Controller;

import example.lection.DAO.ServicesImp;
import example.lection.Model.TaskItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/task_item")
public class TaskItemController {
    @Autowired
    private ServicesImp servicesImp;

    @PostMapping
    public TaskItem createTodoItem(@RequestBody TaskItem taskItem) {
        return servicesImp.createTaskInDB(taskItem);
    }
}
