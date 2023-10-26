package in.com.Self;

import java.nio.file.CopyOption;
import java.util.Comparator;

public class Byphone implements Comparator<Employee5> {

	@Override
	public int compare(Employee5 o1, Employee5 o2) {
		// TODO Auto-generated method stub
		return o1.phone.compareTo(o2.phone);
	}

}
