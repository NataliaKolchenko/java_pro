import org.example.Event;
import org.example.Host;
import org.example.Repository;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

public class RepositoryTest {
    static List<Event> eventsList = new ArrayList<>();
    LocalDateTime firstDate = LocalDateTime.of(2025, Month.MAY, 15, 11, 30);
    Host firstHost = new Host("James Bond", "bond@jamesbond.com", "agent007", "me.jpg");
    Event firstEvent = new Event("B-Day party", firstDate, "Party of my nice", "BDay", false, firstHost);
    Event secondEvent = new Event("B-Day party", firstDate, "Party of my nice", "BDay", false, firstHost);

    Repository repo = new Repository();


    @Test
    void getEventByIdNotNullTest(){

        repo.createEvent(firstEvent);

        assertNotNull(repo.getEventById(firstEvent.getId())) ;

    }

    @Test
    void getEventByIdNullTest () {

        repo.createEvent(firstEvent);

        assertNull(repo.getEventById(secondEvent.getId()));

    }
}
