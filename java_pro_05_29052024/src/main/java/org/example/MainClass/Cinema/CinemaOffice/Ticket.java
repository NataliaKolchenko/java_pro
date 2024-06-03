package org.example.MainClass.Cinema.CinemaOffice;

import org.example.MainClass.Cinema.CinemaOffice.Sessions;
import org.example.MainClass.Cinema.User.User;

public class Ticket {
    User user;
    Sessions session;
    int place;

    public Ticket(User user, Sessions session, int place) {
        this.user = user;
        this.session = session;
        this.place = place;
    }
}
