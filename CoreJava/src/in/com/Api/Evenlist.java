package in.com.Api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Evenlist {
	public static void main(String[] args) {
		List<Integer>list = new ArrayList<Integer>();
		list.add(89);
		list.add(100);
		list.add(700);
		list.add(200);
		list.add(111);
		list.add(300);
		list.add(40);
		list.add(60);
		
		System.out.println(list);
		
//		List<Integer>evenlist = new ArrayList<Integer>();
//		for (Integer i : list) {       //for each loop
//			if(i % 2 == 0 ) {          //not use of stream Api
//				evenlist.add(i);				
//			}			
//		}
//		   
//		System.out.println(evenlist);
//		
		
		//using Stream API 
		
		
		Stream<Integer> s = list.stream();
		List<Integer>newlist = s.filter(e -> e % 2 == 0).collect(Collectors.toList());
		System.out.println(newlist);
		
		Stream<Integer>g = list.stream();
		List<Integer>newg = g.filter( p -> p > 50).collect(Collectors.toList());
		System.out.println(newg);
		
		
	}
	

}
