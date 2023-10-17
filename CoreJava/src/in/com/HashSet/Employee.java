package in.com.HashSet;

public class Employee implements Comparable<Employee>{
	
	int eid;
	String ename;
	Department d1;
	public Employee(int eid, String ename, Department d1) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.d1 = d1;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + "]";
	}
	@Override
	public int compareTo(Employee o) {
		if(this.eid>o.eid)
			return 1;
		else if(this.eid<o.eid)
			return -1;
		return 0;
	}
	

	
	
	
	
	
}
