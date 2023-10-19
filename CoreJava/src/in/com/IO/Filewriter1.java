package in.com.IO;

import java.io.FileWriter;
import java.io.IOException;

//import com.sun.org.apache.xpath.internal.axes.WalkerFactory;

public class Filewriter1 {
	public static void main(String[] args) throws IOException {
		FileWriter w = new FileWriter("C:\\Users\\vinayak\\OneDrive\\Desktop\\javaio\\patel.txt");
		w.write("welcome to patidar jiii !!!!!!!!!!");
		w.close();
		System.out.println("data write successfully");
	}

}
