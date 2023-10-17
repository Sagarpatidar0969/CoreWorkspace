package in.com.Exercise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Comparable1 {
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(100);
		l.add(200);
		l.add(300);
		l.add(22);
		l.add(33);
		
		System.out.println(l);
		Collections.sort(l);
		System.out.println(l);
	}

}
