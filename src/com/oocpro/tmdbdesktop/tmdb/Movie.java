package com.oocpro.tmdbdesktop.Tmdb;

import com.oocpro.tmdbdesktop.Constants;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.MalformedURLException;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;
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

        JSONArray ja_genres = movie.getJSONArray("genres");
        Iterator genres_itr = ja_genres.iterator();

        genres = new ArrayList<String>();
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

