package in.com.IO;

import java.io.FileWriter;
import java.io.IOException;

public class Test3write {
	public static void main(String[] args) throws IOException {
		FileWriter writer = new FileWriter("C:\\Users\\vinayak\\OneDrive\\Desktop\\javaio\\hello.txt");
		writer.write("hello everyone good morning");
		writer.close();
		System.out.println("write successfully");
	}

}
