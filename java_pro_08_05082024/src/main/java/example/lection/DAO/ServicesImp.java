package example.lection.DAO;

import example.lection.DAO.TaskServices;
import example.lection.Model.TaskItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Repository
public class ServicesImp implements TaskServices {
    private List<TaskItem> tasksList;
    @Autowired
    private JdbcTemplate jdbcTemplate;
    private final RowMapper<TaskItem> taskItemRowMapper = (ResultSet rs, int rowNum) -> {
        TaskItem taskItem = new TaskItem();
        taskItem.setId((rs.getString("id")));
        taskItem.setTitle(rs.getString("title"));
        taskItem.setDescription(rs.getString("description"));
        taskItem.setCreatedDateTime(Timestamp.valueOf(rs.getTimestamp("createdDateTime").toLocalDateTime()));
        taskItem.setDeadline(Timestamp.valueOf(rs.getTimestamp("deadline").toLocalDateTime()));
        taskItem.setTimeZone(ZoneId.of(rs.getString("timeZone")));
        return taskItem;
    };

    public ServicesImp() {
        this.tasksList = new ArrayList<>();
    }

    @Override
    public TaskItem createTask(TaskItem newTaskItem) {
        Objects.requireNonNull(newTaskItem);

        if (newTaskItem.getTitle().isEmpty()) {
            throw new IllegalArgumentException();
        }

        tasksList.add(newTaskItem);

        return newTaskItem;
    }

    public TaskItem createTaskInDB(TaskItem newTaskItem) {
        Objects.requireNonNull(newTaskItem);

        if (newTaskItem.getTitle().isEmpty()) {
            throw new IllegalArgumentException();
        }

        String sql = "INSERT INTO TaskItems_db (id, title, description, createdDateTime, deadline, timeZone) VALUES (?, ?, ?, ?, ?, ?)";
        KeyHolder keyHolder = new GeneratedKeyHolder();

        jdbcTemplate.update(connection -> {
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, newTaskItem.getId());
            ps.setString(2, newTaskItem.getTitle());
            ps.setString(3, newTaskItem.getDescription());
            ps.setTimestamp(4, newTaskItem.getCreatedDateTime());
            ps.setTimestamp(5, newTaskItem.getDeadline());
            ps.setString(6, newTaskItem.getTimeZone().toString());
            return ps;
        }, keyHolder);

        String selectSql = "SELECT * FROM TaskItems_db WHERE id = ?";
        return jdbcTemplate.queryForObject(selectSql, taskItemRowMapper, newTaskItem.getId());
    }

    @Override
    public TaskItem getTask(String id) {
        return tasksList.stream()
                .filter(i -> i.getId().equals(id))
                .findFirst()
                .get();
    }

    @Override
    public boolean updateTask(String id, TaskItem newTaskItem) {
        TaskItem t = getTask(id);
        if (newTaskItem == null) {
            return false;
        }

        if (newTaskItem.getTitle() == null || newTaskItem.getTitle().isBlank()) {
            return false;
        }
        t.setTitle(newTaskItem.getTitle());
        t.setDescription(newTaskItem.getDescription());
        t.setDeadline(newTaskItem.getDeadline());

        return true;
    }

    @Override
    public boolean deleteTask(UUID id) {
        if (id == null) {
            return false;
        }
        return tasksList.removeIf(taskItem -> taskItem.getId().equals(id));
    }

    @Override
    public List<TaskItem> getAllTasksList() {
        return new ArrayList<>(tasksList);
    }

}
