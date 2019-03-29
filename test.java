import java.net.URL;

import java.net.MalformedURLException;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import org.json.*;


class test{
    public static void main(String args[]){
        try{
            URL url = new URL("https://googledictionaryapi.eu-gb.mybluemix.net/?define=farrago&lang=en");
            InputStream res = (InputStream)url.getContent();
            JSONArray ja = new JSONArray(new JSONTokener(res));
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
