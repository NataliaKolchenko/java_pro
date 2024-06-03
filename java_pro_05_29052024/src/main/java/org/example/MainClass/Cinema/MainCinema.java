package org.example.MainClass.Cinema;

import org.example.MainClass.Cinema.CinemaOffice.Sessions;
import org.example.MainClass.Cinema.Film.AbstractFilm;
import org.example.MainClass.Cinema.Film.ActionFilm;
import org.example.MainClass.Cinema.Film.ComedyFilm;
import org.example.MainClass.Cinema.Film.DramaFilm;

public class MainCinema {
    public static void main(String[] args) {
        AbstractFilm comedy = new ComedyFilm("Mask");
        AbstractFilm drama = new DramaFilm("Titanic");
        AbstractFilm action = new ActionFilm("Avatar");

        Sessions s1 = new Sessions(comedy, "15:00", 134 );
        Sessions s2 = new Sessions(drama, "17:00", 134);
        Sessions s3 = new Sessions(action, "21:00", 134);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

    }
}
