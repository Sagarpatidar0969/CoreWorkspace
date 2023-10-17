package in.com.Exercise;

//shallow cloning

public class Employee1 implements Cloneable {
	int id;
	
	
	public Employee1(int id) {
		this.id = id;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}

}
