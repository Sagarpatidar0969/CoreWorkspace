package in.com.Self;

public class Emp5 implements Comparable<Emp5>{
	int id;
	String name;
	String phone;
	
	public Emp5(int id,String name,String phone) {
		this.id = id;
		this.name = name;
		this.phone  = phone;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + name + phone;
	}


	@Override
	public int compareTo(Emp5 o) {
		// TODO Auto-generated method stub
		return this.id-o.id;
	}
	
     
	
	

}
