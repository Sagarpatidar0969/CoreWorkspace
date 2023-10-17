package in.com.HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Dep_Employee {
	public static void main(String[] args) {
		
	
	
	HashSet<Employee>hs = new HashSet<>();
	Department dep = new Department(10,12000,"it" );
	Department dep1 = new Department(15,12500,"coder" );
	Department dep2 = new Department(9,13000 ,"qa" );
	
	Employee em = new Employee(121,"sham" ,dep1 );
	Employee em1 = new Employee(112,"lucy" ,dep );
	Employee em2 = new Employee(110, "dev",dep2 );
	Employee em3 = new Employee(125,"zoffer" ,dep );
	
	hs.add(em);
	hs.add(em2);
	hs.add(em3);
	hs.add(em1);
	
	System.out.println("employee id short");
	TreeSet<Employee>ts = new TreeSet<>(hs);
	Iterator<Employee>it = ts.iterator();
	while(it.hasNext()) {
		Employee emp = it.next();
		System.out.println(emp);
	}
	
	
	
	
	
	
	
	
	
	}
}
