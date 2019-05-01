import java.net.URL;
import java.net.MalformedURLException;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import org.json.*;
import javax.swing.*;
   
     public class Search{
        static String api_key="b888b64c9155c26ade5659ea4dd60e64";      //TMDB API KEY 
        static String a_url="https://api.themoviedb.org/3/";           //ROOT URL FOR TMDB API
        static String MOVIE_NAME;
        Search(String M_ID){                                           //CONSTRUCTOR TO INITIALISE MOVIE ID
            this.MOVIE_NAME=M_ID;
        }
  
  
        public static void main(String [] args){
        try{
            System.out.println("ENTER MOVIE NAME TO SEARCH ");
            BufferedReader mnm=new BufferedReader(new InputStreamReader(System.in));
            String m_name= mnm.readLine();
            Search obj = new Search(m_name);
            String s_url=a_url+"search/movie?api_key="+api_key+"&language=en-US&query=%s";     //General URL format for finding a movie
            String url=String.format(s_url,MOVIE_NAME);                              //Adding the query
            System.out.println("URL = "+url);
            URL us1 = new URL(url);                                             //Creating url object 
            InputStream sres = (InputStream)us1.getContent();                   //Storing the stream of data we get from the url
            JSONObject ja = new JSONObject(new JSONTokener(sres));
            System.out.println(ja.toString(1));
            //System.out.println(ja.getNames(ja));
            //String[] ar; 
            //ar=ja.getNames(ja);
            //for(int i=0;i<ar.length;i++)
            //   System.out.println(ar[i]+" ");
        }
        catch(MalformedURLException e){
            System.out.println(e);
        }
        catch(IOException e){
            System.out.println(e);
        }
        }
    }
  

