package org.example;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Repository {
    static List<Event> eventsList = new ArrayList<>();
    public void createEvent(Event event) {
        eventsList.add(event);
    }

    public void printEvents() {
        for(Event e : eventsList) {
            System.out.println(e);
        }
    }

    public void printEvents(Event event) {
        System.out.println(event);
    }


    public Event getEventById(UUID id) {
       for (Event e : eventsList) {
           if (e.getId() == id) {
               return e;
           }
       }
        return null;
    }

    public void deleteEvent (UUID id) {
        Event deletingItem = getEventById(id);
        eventsList.remove(deletingItem);
    }

    public void updateEvent (Event newEvent){
        eventsList.set(eventsList.indexOf(newEvent), newEvent);
    }



}
