package example.lection.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.UUID;

//Пользователь должен иметь возможность создать новую задачу, указав следующие поля:
//Название задачи
//Описание задачи
//Дата и время создания (автоматически устанавливается на текущую дату и время)
//Дедлайн (дата и время, до которого задача должна быть выполнена)
//Временная зона пользователя
public class TaskItem {
    private String id;
    private String title;
    private String description;
    private Timestamp createdDateTime;
    private Timestamp deadline;
    private ZoneId timeZone;

    public TaskItem(@JsonProperty("title") String title,
                    @JsonProperty("description") String description,
                    @JsonProperty("deadline") Timestamp deadline) {
        this.id = UUID.randomUUID().toString();
        this.title = title;
        this.description = description;
        this.createdDateTime = Timestamp.valueOf(LocalDateTime.now());
        this.deadline = deadline;
        this.timeZone = ZoneId.of("Asia/Kuala_Lumpur");
    }

    public TaskItem() {

    }

    public String getId() {
        return this.id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Timestamp getCreatedDateTime() {
        return createdDateTime;
    }

    public Timestamp getDeadline() {
        return deadline;
    }

    public ZoneId getTimeZone() {
        return timeZone;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCreatedDateTime(Timestamp createdDateTime) {
        this.createdDateTime = createdDateTime;
    }

    public void setDeadline(Timestamp deadline) {
        this.deadline = deadline;
    }

    public void setTimeZone(ZoneId timeZone) {
        this.timeZone = timeZone;
    }

    @Override
    public String toString() {
        return "TaskItem{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", createdDateTime=" + createdDateTime +
                ", deadline=" + deadline +
                ", timeZone=" + timeZone +
                '}';
    }
}
