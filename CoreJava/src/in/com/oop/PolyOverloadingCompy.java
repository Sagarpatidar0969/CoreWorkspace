package in.com.oop;
public class PolyOverloadingCompy {
	
	public void com() {
		System.out.println("it's a software company");
	}
	public void com(String name) {
		System.out.println("employee name"+ " " + name);
	}
	public void com(int id) {
		System.out.println("employee id" + " " + id);
	}
	public void com(int salary,int age) {
		System.out.println("employee salary"+ " " + salary);
		System.out.println("employee age"+ " " + age);
		
	}

}
