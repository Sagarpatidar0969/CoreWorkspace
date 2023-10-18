package in.com.Comparator;

import java.util.Comparator;

public class Compbyphone implements Comparator<Emp1> {

	@Override
	public int compare(Emp1 o1, Emp1 o2) {
		// TODO Auto-generated method stub
		return o1.ephone.compareTo(o2.ephone);
	}

}
