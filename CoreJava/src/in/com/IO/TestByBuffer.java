package in.com.IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestByBuffer {
	public static void main(String[] args) throws IOException {
		FileReader file = new FileReader("C:\\Users\\vinayak\\OneDrive\\Desktop\\javaio\\sr.txt");
		BufferedReader reader = new BufferedReader(file);
		
		String line = reader.readLine();
		while(line != null) {
			System.out.println(line);
			line = reader.readLine();
		}
		file.close();
		reader.close();
	}
	

}
