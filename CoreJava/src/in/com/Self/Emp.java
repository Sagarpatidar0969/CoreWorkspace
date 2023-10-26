package in.com.Self;

import java.util.ArrayList;
import java.util.Iterator;

//import com.sun.tools.javac.code.Type.ForAll;

public class Emp {
	int id;
	String name;
	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}
	
	public static void main(String[] args) {
		Emp e = new Emp(9, "sr");
		Emp e1 = new Emp(3, "dil+lip");
		
		ArrayList l = new ArrayList();
		l.add(e1);
		l.add(e);
		
		
//		Emp t = (Emp) l.get(0);
//		System.out.println(t);
//		
//		System.out.println("by for loop");
//	for (int i = 0; i < l.size(); i++) {
//		Emp g = (Emp) l.get(i);
//		System.out.println(g);
//		
		
		
//		System.out.println("by foreachloop");
//		
//		for (Object object : l) {
//			Emp y = (Emp) object;
//			System.out.println(y);
//			
//			
//			
//			System.out.println("by iterator");
			
			
			Iterator it = l.iterator();
			while(it.hasNext()) {
				Emp p = (Emp) it.next();
				System.out.println(p);
			}
			
			
		}
	
		
		
}
