package in.com.Exercise;

public class Company_deep implements Cloneable{
	String name;
	String location;
	Emp_deepcloning e1 = new Emp_deepcloning();
	public Company_deep(String name, String location, int eid) {
		super();
		this.name = name;
		this.location = location;
		this.e1.eid = eid;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Company_deep c3 = (Company_deep) super.clone();
		c3.e1 = (Emp_deepcloning) e1.clone();
		return c3;
	}
	
	

}
