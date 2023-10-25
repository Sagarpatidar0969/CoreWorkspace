package in.com.CollectionPractice;

import java.util.Comparator;

public class Byname implements Comparator<Em2> {

	@Override
	public int compare(Em2 o1, Em2 o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}
	

}
