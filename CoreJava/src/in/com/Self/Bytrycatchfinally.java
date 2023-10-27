package in.com.Self;

public class Bytrycatchfinally {
	public static void main(String[] args) {
		int a = 10;
		int b  = 0;
		
		try {
			int c = a/b;
			System.out.println(c);
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		finally {
			System.out.println("always run");
		}
	}

}
