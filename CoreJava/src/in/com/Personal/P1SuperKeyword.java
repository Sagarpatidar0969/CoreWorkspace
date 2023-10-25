package in.com.Personal;

class Super {
	void show() {
		System.out.println("hey i am super class");
	}

}
class b extends Super{
	void show() {
		super.show();
		System.out.println("hey i am sub class");
	}
}

public class P1SuperKeyword {
	public static void main(String[] args) {
		
		b r = new b();
		r.show();
	}		
	}


