package in.com.Personal;

class shape{
	void meth() {
	   System.out.println("i am super class");
	}
}

class square extends shape{
	void meth() {
		super.meth();
	   System.out.println("i am sub class");
	}
}


public class P3Methodoverriding {
	public static void main(String[] args) {
		shape s = new square();
		s.meth();
	}

}
