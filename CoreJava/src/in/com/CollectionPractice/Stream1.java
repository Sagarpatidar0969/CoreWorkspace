package in.com.CollectionPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream1 {
	public static void main(String[] args) {
	List<Integer>l = new ArrayList<Integer>();
	
	l.add(67);
	l.add(88);
	l.add(92);
	l.add(23);
	l.add(44);
	l.add(55);
	
	
	Stream<Integer>s = l.stream();
	List<Integer> newlist = s.filter(e -> e % 2 == 0).collect(Collectors.toList());
	System.out.println(newlist);
	}

}
