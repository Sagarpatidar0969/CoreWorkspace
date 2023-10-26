package in.com.Self;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class Testemp5 {
	public static void main(String[] args) {
		ArrayList<Emp5> l = new ArrayList<Emp5>();
		l.add(new Emp5(6, "ram", "8383"));
		l.add(new Emp5(1, "hariom", "7732"));
		l.add(new Emp5(9,"dilip", "8191"));
		
		System.out.println(l);
		
		Collections.sort(l);
		System.out.println(l);
		
	}

}
