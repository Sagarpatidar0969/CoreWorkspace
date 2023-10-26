package in.com.CollectionPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream2 {
	public static void main(String[] args) {
		List<String>name = List.of("sr","dilip","ram","himanshu","rahul","raju");
		List<String>newname = name.stream().filter(e -> e.startsWith("r")).collect(Collectors.toList());
		System.out.println(newname);
		
		
		List<Integer>num = List.of(1,2,3,1,2,3);
		List<Integer>newnum = num.stream().distinct().collect(Collectors.toList());
		System.out.println(newnum);
		
		
		List<Integer>num2 = List.of(1,2,3,4,5);
		List<Integer> square =num2.stream().map(p -> p*p).collect(Collectors.toList());
		System.out.println(square);
	}

}
