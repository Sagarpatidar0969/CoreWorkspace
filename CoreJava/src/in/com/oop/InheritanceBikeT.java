package in.com.oop;

   class Bike1 extends InheritanceBike {
	int price1 = 1000000;
	
}
    class Biket2 extends Bike1{
	 int price2 = 2000;
	
}
     public class InheritanceBikeT{
	    public static void main(String[] args) {
		
		InheritanceBike b = new InheritanceBike();
		System.out.println(b.color);
		System.out.println(b.price);
		
		Bike1 b1 = new Bike1();
		System.out.println(b1.color);
		System.out.println(b1.price1);
		System.out.println(b1.price);
		
		Biket2 b2 = new Biket2();
		System.out.println(b2.price2);
		System.out.println(b2.price);
		System.out.println(b2.price1);
		System.out.println(b2.color);
	 
	}

}
