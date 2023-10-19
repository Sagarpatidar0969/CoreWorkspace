package in.com.IO;

import java.io.File;

public class Puri_datail_file {
	public static void main(String[] args) {
		File f = new File("C:\\Users\\vinayak\\OneDrive\\Desktop\\javaio\\patel.txt");
		if(f.exists()) {
			System.out.println("file name is ...."+f.getName());
			System.out.println("file patha....."+f.getAbsolutePath());
			System.out.println("file lenght......"+f.length());
			System.out.println("file parent......."+f.getParent());
			System.out.println("file spacefree"+f.getFreeSpace());
		}
	}
}
