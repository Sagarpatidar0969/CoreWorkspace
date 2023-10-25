package in.com.CollectionPractice;

import java.util.ArrayList;
import java.util.Collections;

public class Testemcomp {
	public static void main(String[] args) {
		ArrayList<EmComp> e1 = new ArrayList<EmComp>();
		e1.add(new EmComp(4, "sr", "6436"));
		e1.add(new EmComp(9, "ram", "643764"));
		e1.add(new EmComp(1, "dilip", "7374"));
		
		System.out.println(e1);
		
		Collections.sort(e1);
		System.out.println(e1);
	}

}
