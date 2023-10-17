package in.com.Exercise;

public class Emp2 implements Cloneable {
	int id;
	
	
	public Emp2(int id) {
		this.id = id;
	}
		@Override
		protected Object clone() throws CloneNotSupportedException {
			// TODO Auto-generated method stub
			return super.clone();
		}
}
