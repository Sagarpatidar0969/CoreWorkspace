package in.com.IOtest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ByuserSr {
	public static void main(String[] args) throws IOException {
		System.out.println("enter here >>>");
		InputStreamReader in  = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		FileWriter fw = new FileWriter("C:\\Users\\vinayak\\OneDrive\\Desktop\\javaio\\class.txt");
		PrintWriter pw = new PrintWriter(fw);
		String s = br.readLine();
		
		
		while(!(s.equals("stop"))) {
			pw.println(s); 
			s = br.readLine();
		}
		System.out.println("exit");
		in.close();
		br.close();
		fw.close();
		pw.close();
		
	}

}
