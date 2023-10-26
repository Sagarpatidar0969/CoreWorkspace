package in.com.rahul;

import java.util.Arrays;

public class Reverse {
	public static void main(String[] args) {
		String name = "rahul";
		char ch[] = name.toCharArray();
		for (int i = 0; i < ch.length/2; i++) {
			char temp = ch[i];
			ch[i] = ch[ch.length-1-i];
			ch[ch.length-1-i] = temp;
			
		}
	name = Arrays.toString(ch);
	System.out.println(name);
	}

}
