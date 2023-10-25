package in.com.CollectionPractice;

import java.util.ArrayList;
import java.util.Collections;

public class Testem {
	public static void main(String[] args) {
		ArrayList<Em2> a1 = new ArrayList<Em2>();
		a1.add(new Em2(5, "sr", "5485"));
		a1.add(new  Em2(1, "dilpi", "7474"));
		a1.add(new Em2(9, "ram", "8389"));
		
		System.out.println(a1);
		Collections.sort(a1, new Byid() );
		System.out.println(a1);
		
		
		Collections.sort(a1, new Byname());
		System.out.println(a1);
		
		Collections.sort(a1, new Byphone());
		System.out.println(a1);
	}

}
