package ex3json;

import java.io.FileReader;
import java.util.Iterator;
import java.io.FileNotFoundException;
import java.io.IOException;

 
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Reader {
	
	public void readJson() {
	    JSONParser parser = new JSONParser();
	    
        try {
 
            Object obj = parser.parse(new FileReader(
                    "/Users/mariana.sandoval/eclipse-workspace/03"));
 
            JSONObject jsonObject = (JSONObject) obj;
 
            String baseUrl = (String) jsonObject.get("BaseUrl");
            String browserTarget = (String) jsonObject.get("BrowserTarget");
 
            System.out.println("BaseURL: " + baseUrl);
            System.out.println("Browser Target: " + browserTarget);
 
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
	 
	public static void main(String[] args) {
		
		Reader reader = new Reader();
		reader.readJson();
		
		
	}

}


