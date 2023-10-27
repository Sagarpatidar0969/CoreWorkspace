package in.com.oop;

public class PolyOverloadingCompyT {
	public static void main(String[] args) {
		PolyOverloadingCompy p = new PolyOverloadingCompy();
		p.com();
		p.com("sagar");
		p.com(7);
		p.com(500000, 21);
		
		System.out.println(p);
	}

}
