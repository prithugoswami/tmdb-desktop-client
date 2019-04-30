package com.oocpro.tmdbdesktop;

import com.oocpro.tmdbdesktop.Tmdb.Movie;
import java.io.IOException;

public class Main{
    public static void main (String [] args)throws IOException{
        Movie ring = new Movie(565);
        System.out.println(ring.title);
        System.out.println(ring.genres);
    }
}

