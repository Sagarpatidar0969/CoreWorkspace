package in.com.Comparator;

public class Emp1 {
	int eid;
	String ename;
	String ephone;
	
	public Emp1(int eid,String ename,String ephone) {
		this.eid =eid;
		this.ename = ename;
		this.ephone = ephone;
	}
       @Override
    public String toString() {
    	
    	return eid + " " + ename + " " + ephone;
    }
}
