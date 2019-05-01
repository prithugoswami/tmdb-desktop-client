   import java.net.URL;
   import java.net.MalformedURLException;
   import java.io.IOException;
   import java.io.BufferedReader;
   import java.io.InputStreamReader;
   import java.io.InputStream;
   import org.json.*;
   import javax.swing.*;
   
   public class Movie{
      static String api_key="b888b64c9155c26ade5659ea4dd60e64";      //TMDB API KEY 
      static String a_url="https://api.themoviedb.org/3/";           //ROOT URL FOR TMDB API
      static String MOVIE_ID;
      Movie(String M_ID){                                           //CONSTRUCTOR TO INITIALISE MOVIE ID
          this.MOVIE_ID=M_ID;
      }

  
      public static void main(String [] args){
      try{
          System.out.println("ENTER MOVIE ID TO SEARCH ");
          BufferedReader mid=new BufferedReader(new InputStreamReader(System.in));
          String m_id= mid.readLine();
          Movie obj = new Movie(m_id);
          String s_url=a_url+"movie/"+MOVIE_ID+"?api_key="+api_key+"&language=en-US";     //General URL format for finding a movie
          URL us1 = new URL(s_url);                                             //Creating url object 
          InputStream sres = (InputStream)us1.getContent();                   //Storing the stream of data we get from the url
          JSONObject ja = new JSONObject(new JSONTokener(sres));
          //System.out.println(ja.toString(1));
      }
      catch(MalformedURLException e){
          System.out.println(e);
      }
      catch(IOException e){
          System.out.println(e);
      }
      } 
  }
  
   

