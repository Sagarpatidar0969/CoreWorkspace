package in.com.Exercise;
//shallow cloning
public class Testemployee1 {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Employee1 e1 = new Employee1(9833);
		Employee1 e2 = (Employee1) e1.clone();
		e2.id = 53523;
		System.out.println(e1.id);
		System.out.println(e2.id);
		
		
	}
	

}
