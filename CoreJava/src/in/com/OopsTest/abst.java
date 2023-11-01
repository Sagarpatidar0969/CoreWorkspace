package in.com.OopsTest;

abstract class office{
	public abstract void emp(); 
	
}

abstract class office2{
	public abstract void developer();
}


public class abst {
	public static void main(String[] args) {
		office o =new office() {
			
			@Override
			public void emp() {
				System.out.println("i am employee");
				
			}
		};
		o.emp();
		office2 o2 = new office2() {
			
			@Override
			public void developer() {
				System.out.println("i am developer");
				
			}
		};
		o2.developer();
	}

}
