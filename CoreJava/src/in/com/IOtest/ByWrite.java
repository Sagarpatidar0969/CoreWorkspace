package in.com.IOtest;

import java.io.FileWriter;
import java.io.IOException;

public class ByWrite {
	public static void main(String[] args) throws IOException {
		FileWriter fr = new FileWriter("C:\\Users\\vinayak\\OneDrive\\Desktop\\javaio\\dilip.txt");
		fr.write("hey dilip ");
		fr.close();
		System.out.println("chalo ho gya");
	}

}
