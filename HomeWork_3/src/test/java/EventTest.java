import org.example.Event;
import org.example.Host;
import org.example.Repository;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class EventTest {

    LocalDateTime firstDate = LocalDateTime.of(2025, Month.MAY, 15, 11, 30);
    Host firstHost = new Host("James Bond", "bond@jamesbond.com", "agent007", "me.jpg");
    Event firstEvent = new Event("B-Day party", firstDate, "Party of my nice", "BDay", false, firstHost);
    Repository repo = new Repository();

    @Test
    void getIDNotNullTest () {
        repo.createEvent(firstEvent);
        assertNotNull (firstEvent.getId());
    }










}
