package in.com.IOtest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Bypic {
	public static void main(String[] args) throws IOException {
		FileInputStream in = new FileInputStream("C:\\Users\\vinayak\\OneDrive\\Desktop\\javaio\\sr.jpg");
		FileOutputStream out = new FileOutputStream("C:\\Users\\vinayak\\OneDrive\\Desktop\\sp.jpg");
		
		int ch = in.read();
		while(ch != -1) {
			out.write(ch);
			ch = in.read();
			
		}
		System.out.println("done");
		
		in.close();
		out.close();
		
		
		
		
		
	}

}
