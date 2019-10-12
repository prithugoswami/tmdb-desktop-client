package com.oocpro.tmdbdesktop;

import com.oocpro.tmdbdesktop.tmdb.Movie;
import com.oocpro.tmdbdesktop.tmdb.Search;
import com.oocpro.tmdbdesktop.components.ImagePanel;

import java.awt.Dimension;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Main{
    public static void main (String[] args)throws IOException{
        System.out.println("Enter a movie name to search ");
        BufferedReader mname = (new BufferedReader(new InputStreamReader
                    (System.in)));
        String Mov_name = mname.readLine();
        Search mv = new Search(Mov_name);
        Movie det = new Movie(mv.movieIds.get(0));
        System.out.println(det.title + " ("+det.year+")");
        System.out.println("Plotline: " + det.plotline);
        System.out.println("Genres: "   + det.genres);
        System.out.println("Rating: "   + det.rating);

        ImagePanel ip = new ImagePanel(det.poster);

        JFrame f = new JFrame("TMDb Desktop Client");
        f.setSize(new Dimension(det.poster.getWidth(), 
                    det.poster.getHeight()));
        f.add(ip);
        f.setVisible(true);

    }
}

