package com.oocpro.tmdbdesktop;

import com.oocpro.tmdbdesktop.tmdb.Movie;
import com.oocpro.tmdbdesktop.tmdb.Search;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;


public class Main{
    public static void main (String [] args)throws IOException{
        System.out.println("Enter a movie name to search ");
        BufferedReader mname = new BufferedReader(new InputStreamReader(System.in));
        String Mov_name = mname.readLine();
        Search mv = new Search(Mov_name);
        Movie det = new Movie(Search.IDs.get(1));
        System.out.println(det.title + " ("+det.year+")");
        System.out.println("Plotline: " + det.plotline);
        System.out.println("Genres: "   + det.genres);
        System.out.println("Rating: "   + det.rating);
    }
}

