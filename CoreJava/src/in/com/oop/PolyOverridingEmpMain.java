package in.com.oop;

 class PolyOverridingEmp {
	public void details() {
		System.out.println("i am employee");
	}
	public void details(String name) {
		System.out.println("employee name"+ " "+ name);
	}

}
 class PolyOverridingDev extends PolyOverridingEmp{
	 public void details() {
		 
			System.out.println("i am developer");
		}
		public void details(String name) {
			
			System.out.println("employee name"+ " "+ name);
		}
 }

public class PolyOverridingEmpMain{
	public static void main(String[] args) {
//		PolyOverridingEmp e = new PolyOverridingEmp();
//		
//		e.details();
//		e.details("ram");
//		
		PolyOverridingEmp d = new PolyOverridingDev();
		d.details();
		d.details("ram");
		
		
	}
}
