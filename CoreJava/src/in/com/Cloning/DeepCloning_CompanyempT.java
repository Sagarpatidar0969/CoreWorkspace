package in.com.Cloning;

public class DeepCloning_CompanyempT {
	public static void main(String[] args) throws CloneNotSupportedException {
		DeepCloning_Companyemp d1 = new DeepCloning_Companyemp("ram", 873872,777);
		DeepCloning_Companyemp d2 = (DeepCloning_Companyemp) d1.clone();
		
		d2.name = "dilip";
		d2.phone = 676767;
		d2.c.id = 888;
		
		System.out.println(d1.name);
		System.out.println(d1.phone);
		System.out.println(d1.c.id);
		System.out.println(d2.name);
		System.out.println(d2.phone);
		System.out.println(d2.c.id);
		
	}

}
