package in.com.Exception;

public class Bypropagation {
	public static void main(String[] args) {
		m1();
	}
		public static void m1() {
			
		try {
			m2();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
		public static void m2() {
			m3();
			
		}
		
		public static void m3() {
			String s = "sagar";
			char ch = s.charAt(3);
			System.out.println(ch);
			
		}

}
