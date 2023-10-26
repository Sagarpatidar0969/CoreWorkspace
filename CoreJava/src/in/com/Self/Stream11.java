package in.com.Self;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream11 {
	public static void main(String[] args) {
		
		ArrayList<Integer> l =new ArrayList<Integer>();
		l.add(85);
		l.add(99);
		l.add(66);
		l.add(51);
		l.add(23);
		l.add(22);
		l.add(44);
		
		
		Stream<Integer>s = l.stream();
		List<Integer> evenlist = s.filter(e -> e % 2==0).collect(Collectors.toList());
		System.out.println(evenlist);
	}

}
