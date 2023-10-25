package in.com.CollectionPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class Itrater1 {
		int id;
		String name;
		String address;
		public Itrater1(int id,String name,String address) {
			this.id = id;
			this.name = name;
			this.address = address;
			
		}
		
		@Override
		public String toString() {
		// TODO Auto-generated method stub
		return id + " " + name + " " + address;
		}
		public static void main(String[] args) {
			Itrater1 i = new Itrater1(1, "sagar", "rajsthan");
			Itrater1 i1 = new Itrater1(2, "ram", "indore");
			
			ArrayList l = new ArrayList();
			l.add(i);
			l.add(i1);
			
			Itrater1 t = (Itrater1) l.get(0);
			System.out.println(t);
			System.out.println(t.address);
			System.out.println(t.id);
			System.out.println(t.name);
			
			
			
//			
//			for (int j = 0; j < l.size(); j++) {
//				Itrater1 t = (Itrater1) l.get(j);
//				System.out.println(t);
//				
			
			
//			for (Object o : l) {
//				Itrater1 t = (Itrater1) o;
//				System.out.println(t);
//				
//			}
//				
//			Iterator it = l.iterator();
//			while(it.hasNext()) {
//				Itrater1 t = (Itrater1) it.next();
//				System.out.println(t);
//			}
			
			
			}
			
			
		}

