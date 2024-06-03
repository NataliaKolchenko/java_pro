package org.example.MainClass.Cinema.CinemaOffice;

import org.example.MainClass.Cinema.Film.AbstractFilm;

public class Sessions {
   private AbstractFilm film;
    private String time;
    private int numTickets;

    public Sessions(AbstractFilm film, String time, int tickets) {
        this.film = film;
        this.time = time;
        this.numTickets = tickets;
    }

    @Override
    public String toString() {
        return film.getTitle() + " " + film.getGenre() + " " + this.time + " " + this.numTickets;
    }
}
