package in.com.Exercise;

public class Testemp {
	public static void main(String[] args) throws CloneNotSupportedException {
		
	Emp2 e2  =  new Emp2(666);
	Emp2 e3 = (Emp2) e2.clone();
	e2.id = 555;
	
	System.out.println(e2.id);
	System.out.println(e3.id);
	}

}
