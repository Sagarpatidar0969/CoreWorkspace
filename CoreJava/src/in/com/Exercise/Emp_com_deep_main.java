package in.com.Exercise;

public class Emp_com_deep_main {
	public static void main(String[] args) throws CloneNotSupportedException {
		Company_deep c1 = new Company_deep("hcl", "inodore", 999);
		
		Company_deep c2 = (Company_deep) c1.clone();
		c2.name = "tcs";
		c2.location = "noida";
		c2.e1.eid = 888;
		System.out.println(c1.name);
		System.out.println(c1.location);
		System.out.println(c1.e1.eid);
		
		System.out.println("----------------------");
		System.out.println(c2.location);
		System.out.println(c2.name);
		System.out.println(c2.e1.eid);
		
	}

}
