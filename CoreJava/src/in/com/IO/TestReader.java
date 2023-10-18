package in.com.IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestReader {
	public static void main(String[] args) throws IOException {
		
		FileReader r = new FileReader("C:\\Users\\vinayak\\OneDrive\\Desktop\\javaio\\sr.txt");
		
		int ch = r.read();
		
		while(ch != -1) {
			System.out.println(ch);
			ch = r.read();
		}
		r.close();
	}

}
