package in.com.IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Scannerreader {
	public static void main(String[] args) throws IOException {
		FileReader r = new FileReader("C:\\Users\\vinayak\\OneDrive\\Desktop\\javaio\\sr.txt");
		Scanner sc= new Scanner(r);
	
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
		sc.close();
		r.close();
		
	}

}
