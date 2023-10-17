package in.com.Exercise;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Interfacequeue {
	public static void main(String[] args) {
		
		Queue<Integer>num  = new PriorityQueue(Comparator.reverseOrder());
		num.add(100);
		num.add(200);
		
		
		System.out.println(num);
		
		num.offer(105);
		System.out.println(num);
		

		System.out.println(num.peek());
		
		num.poll();
		System.out.println(num);
	}

}
