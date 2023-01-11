package Utlities;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadProperties {

	public static void main(String[] args) {
		
	Properties prop =new Properties();
	InputStream readFile =null;
	
	try {
		readFile = new FileInputStream("config.properties");
		
		prop.load(readFile);
		System.out.println(prop.getProperty("DBServer"));
		System.out.println(prop.getProperty("Name"));
		System.out.println(prop.getProperty("DBPass"));
		System.out.println(prop.getProperty("username"));
	}
	catch(Exception e) {
		e.printStackTrace();
	
	} 
	finally {
		if(readFile!=null) {
			try {
				readFile.close();
			} catch (IOException e) {
			
				e.printStackTrace();
			}
		}
	}
	
	
	}

}
