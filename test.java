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
            String word = "farrago";
            String req_url = (
                "https://googledictionaryapi.eu-gb.mybluemix.net/?define=%s&lang=en"
            );
            URL url = new URL(String.format(req_url, word));
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
