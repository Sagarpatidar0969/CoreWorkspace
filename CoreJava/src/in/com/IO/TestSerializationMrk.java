package in.com.IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestSerializationMrk {
	
	public static void main(String[] args) throws IOException {
		FileOutputStream in = new FileOutputStream("C:\\Users\\vinayak\\OneDrive\\Desktop\\javaio\\byte.txt");
		ObjectOutputStream out = new ObjectOutputStream(in);
		
		SerializationMrk m = new SerializationMrk();
		m.id = 1;
		m.name = "sr";
		m.java = 80;
		m.js = 90;
		m.python = 78;
		m.total = m.java + m.js + m.python;
		
		out.writeObject(m);
		in.close();
		out.close();
		System.out.println("object is coverted into bytstream");
		
		
		
		
	}

}
