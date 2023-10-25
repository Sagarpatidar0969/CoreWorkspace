package in.com.Self;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization implements Serializable {
	int a;
	int b;
	int c;
	
	
	public static void main(String[] args) throws IOException {
		FileOutputStream out = new FileOutputStream("C:\\Users\\vinayak\\OneDrive\\Desktop\\javaio\\self.txt");
		ObjectOutputStream o = new ObjectOutputStream(out);
		Serialization s = new Serialization();
		s.a =10;
		s.b = 20;
		s.c = 30;
		o.writeObject(s);
		out.close();
		o.close();
		System.out.println("obj convert into bytestream");
	}
	

}
