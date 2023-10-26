package in.com.Self;

import java.util.ArrayList;
import java.util.Collections;

public class TestEmployee5 {
	public static void main(String[] args) {
		ArrayList<Employee5>l = new ArrayList<Employee5>();
		
		l.add(new Employee5(8, "sagar", "8282"));
		l.add(new Employee5(1, "ram", "91912"));
		l.add(new Employee5(5, "dilip", "1771"));
		System.out.println(l);
		
		System.out.println("sort by id---------------------");
		Collections.sort(l, new Empbyid());
		System.out.println(l);
		
		System.out.println("sort by name--------------------");
		Collections.sort(l, new Byname());
		System.out.println(l);
		
		System.out.println("sort by phone--------------------");
		Collections.sort(l, new Byphone());
		System.out.println(l);
	}

}
