package in.com.IOtest;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Byline {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("C:\\Users\\vinayak\\OneDrive\\Desktop\\javaio\\ram.txt");
		BufferedReader br = new BufferedReader(fr);
		String s = br.readLine();
		
		while(s != null) {
			System.out.println(s);
			s = br.readLine();
			
		}
		fr.close();
		br.close();
	}

}
