package in.com.IOtest;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Byprint {
	public static void main(String[] args) throws IOException {
		FileWriter fr = new FileWriter("C:\\Users\\vinayak\\OneDrive\\Desktop\\javaio\\rahul.txt");
		PrintWriter pr = new PrintWriter(fr);
		pr.println("hey rahul bhaiya");
		pr.println("kya hal chal");
		
		System.out.println("done");
		
		fr.close();
		pr.close();
	}


}
