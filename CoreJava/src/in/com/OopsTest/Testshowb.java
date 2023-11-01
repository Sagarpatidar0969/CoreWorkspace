package in.com.OopsTest;

public class Testshowb {
	public static void main(String[] args) {
		Bikeinherit b = new Bikeinherit();
		b.setBikemodal("pulsar150");
		b.setBname("pulsar");
		b.setBprice(20000);
		b.setColor("black");
		
		System.out.println(b.getBikemodal());
		System.out.println(b.getBname());
		System.out.println(b.getBprice());
		System.out.println(b.getColor());
	}

}
