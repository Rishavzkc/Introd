package Utlities;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class WriteProperties {

	public static void main(String[] args) {
		
		Properties prop =new Properties();
		
		OutputStream writeFile =null;
		try {
      writeFile =new FileOutputStream("config.properties");

    prop.setProperty("DBServer", "ns01.kru.rishav");
	prop.setProperty("Name", "rishav");
	prop.setProperty("DBPass", "admin123");
	prop.setProperty("username","root");
	
	prop.store(writeFile, null);
	System.out.println("Create Properties");
		}
		catch(Exception e){
			
			e.printStackTrace();
			
		}
		finally {
			if(writeFile!=null) {
				try {
					writeFile.close();
				} catch (IOException e) {
				
					e.printStackTrace();
				}
			}
		}
	}

}
