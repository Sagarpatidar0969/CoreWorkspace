package in.com.rahul;

import java.util.ArrayList;
import java.util.Iterator;

class Emp {
	int id;
	String name;
	int salary;
	public Emp(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Emp123 [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}
    public class Emp123{
    	//ArrayList<Emp>a1 = new ArrayList<Emp>();
    	public void maxsalary(ArrayList<Emp>a1) {
    		Iterator<Emp>it = a1.iterator();
    		while(it.hasNext()) {
    			Emp e = it.next();
    			if(e.salary>10000) {
    				System.out.println(e.id+ " " + e.name + " " + e.salary);
    			}
    		}
    		
    	}
    	public void searchemp(ArrayList<Emp>a1) {
    		boolean s = true;
    		
    		Iterator<Emp>it = a1.iterator();
    		while(it.hasNext()) {
    			Emp e2 = it.next();
    			if(e2.name.equals("sachin")) {
    				System.out.println("emp is present :" + s);
    			
    			}
    			
    		}
    	}
    
    	
    	
    	
    	
    	
    	
    	
    	
    	public static void main(String[] args) {
			ArrayList<Emp>a1 = new ArrayList<Emp>();
			a1.add(new Emp(2, "sr", 1400000));
			a1.add(new Emp(5, "ram", 150000));
			a1.add(new Emp(3, "rahul", 6000));
			a1.add(new Emp(9, "dilip", 2000));
			a1.add(new Emp(8, "sachin", 11000));
			
		Emp123 e1 = new Emp123();
		e1.maxsalary(a1);
		e1.searchemp(a1);
			
		}
    	
    }
	
	

