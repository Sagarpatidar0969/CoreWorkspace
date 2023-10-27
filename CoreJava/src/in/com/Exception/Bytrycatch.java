package in.com.Exception;

public class Bytrycatch {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		String n = "sagar";
//		int c = a/b;
//		System.out.println(c);
		try {
			int c = a/b;
			System.out.println(c);
		} catch (Exception e) {
			System.out.println(e);
			//e.printStackTrace();
		
		}
		try {
			char n1 = n.charAt(9);
//			System.out.println(n1);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
