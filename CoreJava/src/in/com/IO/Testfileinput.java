package in.com.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Testfileinput {
	public static void main(String[] args) throws IOException {
		FileInputStream in = new FileInputStream("C:\\Users\\vinayak\\OneDrive\\Desktop\\javaio\\sr.jpg");
		FileOutputStream out = new FileOutputStream("C:\\Users\\vinayak\\OneDrive\\Desktop\\javaio\\sp.txt");
		int ch = in.read();
		while(ch != -1) {
			out.write(ch);
			ch = in.read();
		}
		in.close();
		out.close();
		System.out.println("data copy successfully");
	}

}
