package in.com.Self;

public class Name11 {
	public static void main(String[] args) {
		m1();
		
	}

	private static void m1() {
		try {
			m2();
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

	private static void m2() {
		m3();
		
	}

	private static void m3() {
		String s = "sagar";
		System.out.println(s.charAt(9));
		
	}

}
