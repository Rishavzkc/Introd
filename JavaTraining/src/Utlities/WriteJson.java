package Utlities;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class WriteJson {

	public static void main(String[] args) {

		JSONObject student1 =new JSONObject();
student1.put("StudentName", "John");
student1.put("Grade", "1st");
student1.put("Location", "India");

JSONObject student2 =new JSONObject();
student2.put("StudentName", "Jack");
student2.put("Grade", "3st");
student2.put("Location", "London");

System.out.println(student1.toJSONString());
	System.out.println(student2.toJSONString());;
	
	JSONArray studentdetails =new JSONArray();
	studentdetails.add(student1);
	studentdetails.add(student2);
	
	System.out.println(studentdetails.toJSONString());;
	
	JSONObject details =new JSONObject();
	details.put("studentdetails",studentdetails);
	System.out.println(details.toJSONString());
	}

}
