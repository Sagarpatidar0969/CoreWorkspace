package in.com.IOtest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Fileread {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("C:\\Users\\vinayak\\OneDrive\\Desktop\\javaio\\ram.txt");
	    int ch = fr.read();
	    
	    while(ch != -1) {
	    	System.out.println((char)ch);
	    	ch = fr.read();
	    }
	    fr.close();
	    
	}
	

}
