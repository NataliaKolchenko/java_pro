package example.lection;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

//Пользователь должен иметь возможность создать новую задачу, указав следующие поля:
//Название задачи
//Описание задачи
//Дата и время создания (автоматически устанавливается на текущую дату и время)
//Дедлайн (дата и время, до которого задача должна быть выполнена)
//Временная зона пользователя
public class TaskItem {
    private int id = 0;
    private static int globalID = 0;
    private String title;
    private String description;
    private LocalDateTime createdDateTime;
    private LocalDateTime deadline;
    private ZonedDateTime timeZone;

    public TaskItem(String title, String description, LocalDateTime deadline, ZonedDateTime timeZone) {
        this.id = ++globalID;
        this.title = title;
        this.description = description;
        this.createdDateTime = LocalDateTime.now();
        this.deadline = deadline;
        this.timeZone = timeZone;
    }

    public TaskItem(String title, String description, LocalDateTime deadline) {

        this(title, description, deadline, LocalDateTime.of(2024, Month.SEPTEMBER, 28, 14, 33).atZone(ZoneId.of("Asia/Kuala_Lumpur")));
    }


    public int getId() {
        return this.id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getCreatedDateTime() {
        return createdDateTime;
    }

    public LocalDateTime getDeadline() {
        return deadline;
    }

    public ZonedDateTime getTimeZone() {
        return timeZone;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCreatedDateTime(LocalDateTime createdDateTime) {
        this.createdDateTime = createdDateTime;
    }

    public void setDeadline(LocalDateTime deadline) {
        this.deadline = deadline;
    }

    public void setTimeZone(ZonedDateTime timeZone) {
        this.timeZone = timeZone;
    }
}
