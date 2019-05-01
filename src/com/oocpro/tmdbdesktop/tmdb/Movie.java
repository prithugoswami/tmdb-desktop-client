package com.oocpro.tmdbdesktop.tmdb;

import com.oocpro.tmdbdesktop.Constants;

import java.io.InputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.*;

public class Movie{
    final String MOVIEBASEURL = Constants.BASEURL+"/movie/";
    public String title;
    public String year;
    public String plotline;
    public List<String> genres;
    public float rating;

    public Movie(int id)throws IOException, MalformedURLException{
        String geturl = MOVIEBASEURL+id+"?api_key="+Constants.API_KEY;
        InputStream res = (InputStream)new URL(geturl).getContent();
        JSONObject movie = new JSONObject(new JSONTokener(res));

        genres = new ArrayList<String>();
        Iterator genres_itr = movie.getJSONArray("genres").iterator();

        // iterate through each genre and add it's `name` to the `genres` list
        while(genres_itr.hasNext()){
            JSONObject jo = (JSONObject)genres_itr.next();
            genres.add(jo.getString("name"));
        }
        title = movie.getString("title");
        year = movie.getString("release_date").substring(0,4);
        plotline = movie.getString("overview");
        rating = (float)movie.getDouble("vote_average");
    }
}

