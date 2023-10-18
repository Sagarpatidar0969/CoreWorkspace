package in.com.Exercise;

import java.util.ArrayList;
import java.util.Collections;

public class Emp3_Test {
	public static void main(String[] args) {
		ArrayList<Emp3_Comparator> l = new ArrayList<Emp3_Comparator>();
		l.add(new Emp3_Comparator(100, "srpatel____"));
		l.add(new Emp3_Comparator(200, "ram"));
		l.add(new Emp3_Comparator(2, "rahul"));
		l.add(new Emp3_Comparator(5, "dilip"));
		
		System.out.println(l);
        Collections.sort(l, new Emp3_Sortbyid());
		System.out.println(l);
		 
		Collections.sort(l,new Emp3_byname());
		System.out.println(l);
		
		
}
}