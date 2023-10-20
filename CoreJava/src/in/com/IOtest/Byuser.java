package in.com.IOtest;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Byuser {
	public static void main(String[] args) throws IOException {
		System.out.println("enter the text");
		InputStreamReader isr = new  InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		//String s = br.readLine();
		FileWriter fw = new FileWriter("C:\\Users\\vinayak\\OneDrive\\Desktop\\javaio\\lavish.txt");
		PrintWriter pw = new PrintWriter(fw);
		String s = br.readLine();

		while(!(s.equals("stop"))) {
			pw.println(s);
			s = br.readLine();
			
		}
		System.out.println("exit");
		isr.close();
		br.close();
		fw.close();
		pw.close();
		
	}

}
