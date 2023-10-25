package in.com.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Deserialization {
       public static void main(String[] args) throws Exception {
		FileInputStream in = new FileInputStream("C:\\Users\\vinayak\\OneDrive\\Desktop\\javaio\\byte.txt");
		ObjectInputStream oi = new ObjectInputStream(in);
		
		SerializationMrk m = (SerializationMrk) oi.readObject();
		System.out.println("id=" + m.id);
		System.out.println("name=" +m.name);
		System.out.println("java=" + m.java);
		System.out.println("js=" + m.js);
		System.out.println("python=" +m.python);
		System.out.println("total=" + m.total );
	}	
}