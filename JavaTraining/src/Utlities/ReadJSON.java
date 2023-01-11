package Utlities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJSON {

	public static void main(String[] args) throws IOException, ParseException {
		
		String filepath = System.getProperty("user.dir") +"//testdata.json";
		
		FileReader file =new FileReader(filepath);
		
		JSONParser parser =new JSONParser();
		
        JSONObject json =(JSONObject) parser.parse(file);
          System.out.println(json.toJSONString());
	
	JSONArray Student = (JSONArray)json.get("testdata");
	System.out.println(Student.toJSONString());
	}

}
