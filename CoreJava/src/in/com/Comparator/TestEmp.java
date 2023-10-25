package in.com.Comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
 
public class TestEmp {
	public static void main(String[] args) {
		List<Emp1>l = new ArrayList<Emp1>();
		l.add(new Emp1(5, "heri", "76473"));
		l.add(new Emp1(7, "srpatel","34744" ));
		l.add(new Emp1(2, "ram", "89999"));
		System.out.println(l);
		
		Collections.sort(l,new Comparatbyid());
		System.out.println(l);
		
		//List<Emp1>lp = new ArrayList<Emp1>();
		Collections.sort(l,new Compbyphone());
		System.out.println(l);
		
		Collections.sort(l, new Combyname());
		System.out.println(l);
		
	}

}
