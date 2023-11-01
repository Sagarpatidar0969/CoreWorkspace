package in.com.Cloning;

public class DeepCloning_Companyemp implements Cloneable {
		String name;
		int phone;
		DeepCloning_Company c = new DeepCloning_Company();
		public DeepCloning_Companyemp(String name, int phone, int id) {
			super();
			this.name = name;
			this.phone = phone;
			this.c.id = id;
		}

		
				@Override
				protected Object clone() throws CloneNotSupportedException {
				DeepCloning_Companyemp d = (DeepCloning_Companyemp) super.clone();
				d.c = (DeepCloning_Company) c.clone();
				return d;
				}
}
