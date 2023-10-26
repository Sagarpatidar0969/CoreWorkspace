package in.com.rahul;

import java.util.Scanner;

public class Searchname {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "this txt for check";
		System.out.println("search the charactor");
		char s = sc.next().charAt(0);
		char ch[] = str.toCharArray();
		int flage= 0;
		
		for (int i = 0; i < ch.length; i++) {
			if(s==ch[i]) {
				flage = 1;
			}
			
		}
		if(flage==1) {
			System.out.println("this charactor is present");
		}
		else {
			System.out.println("this charactor is not present");
	}

}
}
