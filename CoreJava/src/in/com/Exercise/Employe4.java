package in.com.Exercise;

public class Employe4 implements Cloneable {
	int id;
	String name;
	
	Bank b = new Bank();
	public Employe4(int id ,String name, String bname) {
		this.id = id;
		this.name = name;
		this.b.bname = bname;
		

	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Employe4 e5 = (Employe4) super.clone();
		e5.b = (Bank) b.clone();  
		return e5;
	}

}
