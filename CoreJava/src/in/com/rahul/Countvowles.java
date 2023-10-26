package in.com.rahul;

public class Countvowles {
	public static void main(String[] args) {
		String s = "sagra ieas aa ";
		String s1 = s.replace(" ", "");
		char ch[] = s1.toCharArray();
		int Ccount=0;
		int Vcount = 0;
		
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
				Vcount++;
			}
			else if(ch[i]>'a'||ch[i]<'z') {
				Ccount++;
			}		
			}
	System.out.println(Vcount);
			System.out.println(Ccount);
		
		
	}

}
