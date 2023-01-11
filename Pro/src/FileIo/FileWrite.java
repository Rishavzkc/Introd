package FileIo;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

	public static void main(String[] args) {
	
String path= "C:\\Users\\1037482\\Workspace Training\\JavaFile\\java.txt";

FileWriter fw =null;
try {
	 fw =new FileWriter(path);
	fw.write("This is first file");
	fw.flush();
	System.out.println("Text Written");
} catch (IOException e) {
	
	e.printStackTrace();
} 
finally {
	try {
		fw.close();
	} catch (IOException e) {
		
		e.printStackTrace();
	}
}


	}

}
