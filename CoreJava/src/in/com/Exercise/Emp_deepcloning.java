package in.com.Exercise;

public class Emp_deepcloning implements Cloneable {
	
	int eid;
	
	public Emp_deepcloning() {
		
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}

}
