package in.com.Exercise;

import java.util.Comparator;

public class Emp3_Sortbyid implements Comparator<Emp3_Comparator>{

	@Override
	public int compare(Emp3_Comparator o1, Emp3_Comparator o2) {
		
		return o1.eid-o2.eid;
	}
	
	

}
