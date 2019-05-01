package com.oocpro.tmdbdesktop;

import com.oocpro.tmdbdesktop.Tmdb.Movie;
import java.io.IOException;

public class Main{
    public static void main (String [] args)throws IOException{
        Movie ring = new Movie(565);
        System.out.println(ring.title + " ("+ring.year+")");
        System.out.println("Plotline: " + ring.plotline);
        System.out.println("Genres: "   + ring.genres);
        System.out.println("Rating: "   + ring.rating);
    }
}

