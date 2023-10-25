package in.com.IOtest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copyimage {
	public static void main(String[] args) throws IOException {
		FileInputStream fn = new FileInputStream("D:\\sagar's mobile\\friends\\a.jpg");
		FileOutputStream fo = new FileOutputStream("C:\\Users\\vinayak\\OneDrive\\Desktop\\sa.jpg");
		
		int ch = fn.read();
		
		while(ch != -1) {
			fo.write(ch);
			ch = fn.read();
			
			
		}
		
		System.out.println("done");
		fn.close();
		fo.close();
		
		
		
		
		
		
		
	}

}
