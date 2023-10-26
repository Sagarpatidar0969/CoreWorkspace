package in.com.Self;

import java.util.Comparator;

public class Byname  implements Comparator<Employee5>{

	@Override
	public int compare(Employee5 o1, Employee5 o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}

}
