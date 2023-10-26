package in.com.Self;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream22 {
	public static void main(String[] args) {
		
		List<String>name = List.of("ram","rahul","raju","dilip","hRI");
		List<String>newname = name.stream().filter(e -> e.startsWith("r")).collect(Collectors.toList());
		System.out.println(newname);
		
		List<Integer>num = List.of(1,2,3,4,1,2,3);
		List<Integer>newnum = num.stream().distinct().collect(Collectors.toList());
		System.out.println(newnum);
		
		List<Integer>num2 = List.of(1,2,3,4,5,8);
		List<Integer>square = num2.stream().map(e-> e*e).collect(Collectors.toList());
		System.out.println(square);
	}

}
