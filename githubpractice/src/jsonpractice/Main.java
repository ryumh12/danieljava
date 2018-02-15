package jsonpractice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException,
            IOException, ParseException {

        JSONParser parser = new JSONParser();
        JSONObject jsonObject = (JSONObject) parser.parse(new FileReader(
                "c:\\i.json"));
       //System.out.println(jsonObject);
        JSONObject response = (JSONObject) jsonObject.get("response");

        JSONArray docsarray = (JSONArray) response.get("docs");
       JSONObject[] docsobject = new JSONObject[docsarray.size()];
      
       int i=0;
        for (Object o : docsarray)
        {
            docsobject[i]  = (JSONObject) o;
            
            i++;
        }
        System.out.println(docsobject[0].getNames());
        
        
       // JSONObject jsonObject_ = (JSONObject) parser.parse(new FileReader(
       //         "c:\\ii.json"));
    }
}