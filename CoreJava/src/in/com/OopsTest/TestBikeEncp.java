package in.com.OopsTest;

public class TestBikeEncp {
	public static void main(String[] args) {
		BikeEncp b = new BikeEncp();
		
		b.setBcompany("hero");
		b.setBprice(200000);
		b.setBmilez(45);
		
		System.out.println(b.getBcompany());
		System.out.println(b.getBprice());
		System.out.println(b.getBmilez());
	}

}
