package in.com.Personal;

public class P4Methodoverloading {
	void meth() {
		
		System.out.println("i am default meth");
	}
	void meth(int a) {
		
		System.out.println("i am single parameterized method" + " "+ a);
	}
    public static void main(String[] args) {
		P4Methodoverloading m = new P4Methodoverloading();
		m.meth();
		m.meth(100);
	}
	
	
}
