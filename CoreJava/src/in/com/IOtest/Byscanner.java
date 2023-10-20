package in.com.IOtest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Byscanner {
	public static void main(String[] args) throws IOException {
		
	
	FileReader fr = new FileReader("C:\\Users\\vinayak\\OneDrive\\Desktop\\javaio\\ram.txt");
	Scanner sc = new Scanner(fr);
	while(sc.hasNext()) {
		System.out.println(sc.nextLine());
		
	}
	fr.close();
	sc.close();
	
	}

}
