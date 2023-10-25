package in.com.Self;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Testmarks {

	public static void main(String[] args) throws IOException {
		FileOutputStream fo = new FileOutputStream("C:\\Users\\vinayak\\OneDrive\\Desktop\\javaio\\mrk.txt");
		ObjectOutputStream oo = new ObjectOutputStream(fo);
		
		Marks m = new Marks();
		m.java = 67;
		m.js = 89;
		m.py = 77;
		
		
		oo.writeObject(m);
		System.out.println("object converted into bytestream");
	}

}
