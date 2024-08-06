package example.lection;

import junit.framework.TestCase;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.UUID;

public class ServicesImpTest extends TestCase {

    private ServicesImp taskServices;

//    @BeforeEach
//    public void initial() {
//        taskServices = new ServicesImp();
////        Controler controler = new Controler(taskServices);
//    }

    @Test
    public void testCreateTaskIsNull() {
        taskServices = new ServicesImp();

        LocalDateTime localDateTime4 = LocalDateTime.of(2024, Month.SEPTEMBER, 28, 14, 33);
        TaskItem taskItem1 = new TaskItem("testTask1", "test 1", localDateTime4); //ожидаемый и фактический

        taskServices.createTask(taskItem1);
        assertEquals(taskItem1, taskItem1);

    }

    @Test
    public void testGetTask() {
    }

    @Test
    public void testUpdateTaskIsNull() {
        taskServices = new ServicesImp();

        LocalDateTime localDateTime4 = LocalDateTime.of(2024, Month.SEPTEMBER, 28, 14, 33);
        TaskItem taskItem1 = new TaskItem("testTask1", "test 1", localDateTime4);
        taskServices.createTask(taskItem1);

        TaskItem newtaskItem = null;

        //        boolean actual = false; // ожидаемый
        boolean fact = taskServices.updateTask(taskItem1.getId(), newtaskItem); // фактический
        assertFalse(fact);
    }

    @Test
    public void testUpdateTaskSuccess() {
        taskServices = new ServicesImp();

        LocalDateTime localDateTime4 = LocalDateTime.of(2024, Month.SEPTEMBER, 28, 14, 33);
        TaskItem taskItem1 = new TaskItem("testTask1", "test 1", localDateTime4); // исходный

        taskServices.createTask(taskItem1);

//        boolean actual = true; // ожидаемый
        boolean fact = taskServices.updateTask(taskItem1.getId(), taskItem1); // фактический

        assertTrue(fact);
    }


    @Test
    public void testDeleteTask() {
    }

    @Test
    public void testGetAllTasksList() {
    }
}