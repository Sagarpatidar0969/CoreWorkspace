package in.com.Exercise;

public class Emp3_Comparator {
	
	int eid;
	String name;
	
	
	public Emp3_Comparator(int eid,String name) {
		this.eid =eid;
		this.name = name;
	}
	@Override
	public String toString() {
		
		return eid + " " + name;
	}
	
	
	}

