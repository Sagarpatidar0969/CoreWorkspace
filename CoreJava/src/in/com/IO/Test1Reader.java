package in.com.IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test1Reader {
	public static void main(String[] args) throws IOException {
		FileReader file = new FileReader("C:\\Users\\vinayak\\OneDrive\\Desktop\\javaio\\sr.txt");
		BufferedReader b = new BufferedReader(file);
		String g = b.readLine();
		
		
		while(g != null) {
			System.out.println(g);
			g = b.readLine();
		}
		file.close();
		b.close();
	}

}
