package in.com.Exception;

public class Testthrow {
	public static void main(String[] args) {
		String n ="sagar";
		
		if(n.equals("sagar")) {
			System.out.println("yes valid user");
		}else {
			Bythrow p = new Bythrow();
			
			try {
				throw p;
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

}
