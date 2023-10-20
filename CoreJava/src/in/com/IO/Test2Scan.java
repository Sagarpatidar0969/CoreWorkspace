package in.com.IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Test2Scan {
	public static void main(String[] args) throws IOException {
		FileReader file = new FileReader("C:\\Users\\vinayak\\OneDrive\\Desktop\\javaio\\sr.txt");
		Scanner sc = new Scanner(file);
		
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
			
		}
			sc.close();
			file.close();
		
	}

}
