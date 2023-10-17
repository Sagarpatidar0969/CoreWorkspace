package in.com.Exercise;

public class Bank_emp_main {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Employe4 e2 = new Employe4(55, "sr", "hdfc");
		Employe4 e3 = (Employe4) e2.clone();
		e3.id = 88;
		e3.name = "sagar";
		e3.b.bname = "idfc";
		
		System.out.println(e2.id);
		System.out.println(e2.name);
		System.out.println(e2.b.bname);
		
		System.out.println(e3.id);
		System.out.println(e3.name);
		System.out.println(e3.b.bname);
		

	}

}
