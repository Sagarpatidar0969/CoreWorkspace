package in.com.Self;

public class Testlogin {
	public static void main(String[] args) {
		String name = "ram";
		
		if(name.equals("rama")) {
			System.out.println("valid user name");
		}else {
			Login l =new Login();
			
			try {
				throw l;
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

}
