package in.com.CollectionPractice;

public class EmComp implements Comparable<EmComp>{
	int id;
	String name;
	String phone;
	public EmComp(int id, String name, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
	}
	@Override
	public int compareTo(EmComp o) {
		// TODO Auto-generated method stub
		return this.id-o.id;
	}
	@Override
	public String toString() {
		return "EmComp [id=" + id + ", name=" + name + ", phone=" + phone + "]";
	}
	
	
	

}
