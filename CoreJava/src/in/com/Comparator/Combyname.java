package in.com.Comparator;

import java.util.Comparator;

public class Combyname implements Comparator<Emp1> {

	@Override
	public int compare(Emp1 o1, Emp1 o2) {
		
		return o1.ename.compareTo(o2.ename);
	}
	

}
