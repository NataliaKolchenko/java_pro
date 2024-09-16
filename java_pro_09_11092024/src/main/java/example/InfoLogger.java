package example;

import lombok.Getter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
public class InfoLogger {
    public static Map<String, String> log = new HashMap<>();

    public void doLog(Employee employee) {
        log.put(employee.getName(), employee.getRole().toString());


    }
}
