package in.com.Exercise1;

import java.util.Scanner;

public class Marks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the number 1 or 0.............");
//		int num = sc.nextInt();
		int num;
		do {
		int mrks = sc.nextInt();
		if(mrks>=90) {
			System.out.println("this is good");
		}else if(mrks>=60) {
			System.out.println("this is also good");
			
		}else {
			System.out.println("this is good as well");
		}
		System.out.println("Enter the number 1 or 0.............");
	     num = sc.nextInt();

	}while(num==1);

}
}