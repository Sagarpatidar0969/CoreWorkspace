package in.com.HashSet;

public class Department{
      int did;
      int dsalary;
      String dname;
	public Department(int did, int dsalary, String dname) {
		super();
		this.did = did;
		this.dsalary = dsalary;
		this.dname = dname;
	}
	@Override
	public String toString() {
		return "Department [did=" + did + ", dsalary=" + dsalary + ", dname=" + dname + "]";
	}
      
}
