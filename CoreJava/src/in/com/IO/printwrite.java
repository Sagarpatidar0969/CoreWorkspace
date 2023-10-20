package in.com.IO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class printwrite {
	public static void main(String[] args) throws IOException {
		
	
	FileWriter file = new FileWriter("C:\\Users\\vinayak\\OneDrive\\Desktop\\javaio\\ram.txt");
	
	PrintWriter w = new PrintWriter(file);
	w.println("hey bhiya i'm sagar");
	w.println("how are you");
	System.out.println("done");
	file.close();
	w.close();
	
	}
}
