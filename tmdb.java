import java.net.URL;
import java.net.MalformedURLException;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import org.json.*;
import javax.swing.*;

public class tmdb{
    static String api_key="b888b64c9155c26ade5659ea4dd60e64";      //TMDB API KEY 
    static String a_url="https://api.themoviedb.org/4/";           //ROOT URL FOR TMDB API

    public static void main(String [] args){
    try{

   // }
   // catch{
    //    {
   // } 
    //}

    //static void search(String mov){                                         //function for searching a movie
        String s_url=a_url+"search/movie?api_key="+api_key+"&query=%s";     //General URL format for finding a movie
        String url=String.format(s_url,"CARS");                                //Adding the query
        URL us1 = new URL(url);                                             //Creating url object 
        InputStream sres = (InputStream)us1.getContent();                   //Storing the stream of data we get from the url
        JSONArray ja = new JSONArray(new JSONTokener(sres));
        System.out.println(ja.toString(4));
    }
    catch(MalformedURLException e){
        System.out.println(e);
    }
    catch(IOException e){
        System.out.println(e);
    }


    }    
}

