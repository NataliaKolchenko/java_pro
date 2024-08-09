//package example.lection;
//
//import example.lection.DAO.ServicesImp;
//import example.lection.Model.TaskItem;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.BeforeEach;
//
//import java.time.LocalDateTime;
//import java.time.Month;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.UUID;
//
//import static org.junit.Assert.*;
//import static org.junit.jupiter.api.Assertions.assertThrows;
//
//public class ServicesImpTest {
//
//    private ServicesImp taskServices;
//    private LocalDateTime localDateTime4;
//
//    @BeforeEach
//    void initial() {
//        taskServices = new ServicesImp();
//        localDateTime4 = LocalDateTime.of(2024, Month.SEPTEMBER, 28, 14, 33);
////        Controler controler = new Controler(taskServices);
//    }
//
//    @Test
//    void testCreateTaskIsNotNull() {
//
//        TaskItem taskItem1 = new TaskItem("testTask1", "test 1", localDateTime4); //ожидаемый и фактический
//
//        taskServices.createTask(taskItem1);
//        assertEquals(taskItem1, taskItem1);
//
//    }
//
//
//    @Test
//    void testCreateTaskNullPointer() {
//        TaskItem taskItem = null;
//
//        assertThrows(NullPointerException.class, () -> {
//            taskServices.createTask(taskItem);
//        });
//    }
//
//    @Test
//    void testCreateTaskIsEmpty() {
//
//        TaskItem taskItem1 = new TaskItem("", "test", null); //ожидаемый и фактический
//
//        assertThrows(IllegalArgumentException.class, () -> {
//            taskServices.createTask(taskItem1);
//        });
//    }
//
//
//    @Test
//    void testGetTaskSuccess() {
//        TaskItem taskItem1 = new TaskItem("testTask1", "test 1", localDateTime4);
//        UUID expected = taskServices.createTask(taskItem1).getId();
//        UUID actual = taskItem1.getId();
//
//        assertEquals(expected, actual);
//
//    }
//
//    @Test
//    void testGetTaskIncorrectUUID() {
//        TaskItem taskItem1 = new TaskItem("testTask1", "test 1", localDateTime4);
//        UUID expected = taskServices.createTask(taskItem1).getId();
//        UUID actual = UUID.randomUUID();
//
//        assertNotEquals(expected, actual);
//    }
//
//
//    @Test
//    void testUpdateTaskIsNull() {
//
//        TaskItem taskItem1 = new TaskItem("testTask1", "test 1", localDateTime4);
//        taskServices.createTask(taskItem1);
//
//        TaskItem newtaskItem = null;
//
//        //        boolean expected = false; // ожидаемый
//        boolean fact = taskServices.updateTask(taskItem1.getId(), newtaskItem); // фактический
//        assertFalse(fact);
//    }
//
//    @Test
//    void testUpdateTaskTitleIsEmpty() {
//
//        TaskItem taskItem1 = new TaskItem("testTask1", "test 1", localDateTime4);
//        taskServices.createTask(taskItem1);
//
//        TaskItem newtaskItem = new TaskItem("", "test 1", localDateTime4);
//
//        //        boolean expected = false; // ожидаемый
//        boolean fact = taskServices.updateTask(taskItem1.getId(), newtaskItem); // фактический
//        assertFalse(fact);
//    }
//
//    @Test
//    void testUpdateTaskSuccess() {
//
//        TaskItem taskItem1 = new TaskItem("testTask1", "test 1", localDateTime4); // исходный
//
//        taskServices.createTask(taskItem1);
//
//        boolean fact = taskServices.updateTask(taskItem1.getId(), taskItem1); // фактический
//
//        assertTrue(fact);
//    }
//
//    @Test
//    void testDeleteTaskSuccess() {
//        TaskItem taskItem1 = new TaskItem("testTask1", "test 1", localDateTime4);
//        taskServices.createTask(taskItem1);
//
//        assertTrue(taskServices.deleteTask(taskItem1.getId()));
//
//    }
//
//    @Test
//    void testDeleteTaskNull() {
//        UUID id = null;
//
//        assertFalse(taskServices.deleteTask(id));
//
//    }
//
//    @Test
//    void testDeleteTaskIncorrectUUID() {
//        TaskItem taskItem1 = new TaskItem("testTask1", "test 1", localDateTime4);
//        UUID expected = taskServices.createTask(taskItem1).getId();
//        UUID actual = UUID.randomUUID();
//
//        assertNotEquals(expected, actual);
//    }
//
//    @Test
//    void testGetAllTasksList() {
//        TaskItem taskItem1 = new TaskItem("testTask1", "test 1", localDateTime4);
//        TaskItem taskItem2 = new TaskItem("testTask1", "test 1", localDateTime4);
//        taskServices.createTask(taskItem1);
//        taskServices.createTask(taskItem2);
//
//        List<TaskItem> expected = new ArrayList<>();
//        expected.add(taskItem1);
//        expected.add(taskItem2);
//
//        assertEquals(expected, taskServices.getAllTasksList());
//
//    }
//
//    @Test
//    void testGetAllTasksListIsNull() {
//        List<TaskItem> expected = new ArrayList<>();
//        assertEquals(expected, taskServices.getAllTasksList());
//    }
//}