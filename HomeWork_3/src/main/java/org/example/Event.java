package org.example;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Event {

    private  UUID id;
    private String title;
    private LocalDateTime date;
    private String description;
    private String eventTypeCategory;
    private boolean isCancelled;
    private Host host;



    public Event(String title, LocalDateTime date, String description, String eventTypeCategory, boolean isCancelled, Host host) {
//        id = (int) (Math.random()*999);
        id = UUID.randomUUID();
        this.title = title;
        this.date = date;
        this.description = description;
        this.eventTypeCategory = eventTypeCategory;
        this.isCancelled = isCancelled;
        this.host = host;
    }

    public UUID getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setEventTypeCategory(String eventTypeCategory) {
        this.eventTypeCategory = eventTypeCategory;
    }

    public void setCancelled(boolean cancelled) {
        isCancelled = cancelled;
    }

    public void setHost(Host host) {
        this.host = host;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", date=" + date +
                ", description='" + description + '\'' +
                ", eventTypeCategory='" + eventTypeCategory + '\'' +
                ", isCancelled=" + isCancelled +
                ", host=" + host +
                '}';
    }


}
