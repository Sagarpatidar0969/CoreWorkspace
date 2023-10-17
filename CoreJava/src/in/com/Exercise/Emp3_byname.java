package in.com.Exercise;

import java.util.Comparator;

public class Emp3_byname implements Comparator<Emp3_Comparator>{

	@Override
	public int compare(Emp3_Comparator o1, Emp3_Comparator o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}

}
