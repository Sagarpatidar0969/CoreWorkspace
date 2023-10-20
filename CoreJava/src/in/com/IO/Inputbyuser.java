package in.com.IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Inputbyuser {
	public static void main(String[] args) throws IOException {
		System.out.println("enter here your code");
		//for insert the values from user 
		InputStreamReader i = new InputStreamReader(System.in);
		
		//for reading
		BufferedReader b = new BufferedReader(i);
		
		//for path
		FileWriter w = new FileWriter("C:\\Users\\vinayak\\OneDrive\\Desktop\\javaio\\dp.txt");
		
		//print for next line
		PrintWriter p = new PrintWriter(w);
		
		//line by line read
		String line = b.readLine();
		
		while(!(line.equals("stop"))){
			p.println(line);
			line = b.readLine();
		}
		System.out.println("done");
		i.close();
		b.close();
		w.close();
		p.close();
		
	}

}
