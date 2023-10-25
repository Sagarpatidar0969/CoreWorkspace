package in.com.CollectionPractice;

import java.util.Comparator;

public class Byphone implements Comparator<Em2> {

	@Override
	public int compare(Em2 o1, Em2 o2) {
		// TODO Auto-generated method stub
		return o1.phone.compareTo(o2.phone);
	}

}
