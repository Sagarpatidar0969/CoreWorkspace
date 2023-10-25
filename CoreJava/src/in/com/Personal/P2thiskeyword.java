package in.com.Personal;

class P2thiskeyword{
	int a ;
	P2thiskeyword(int a){
		this.a =a;
	}
	void show() {
		System.out.println(a);
	}

	
 //public class ThisKeyword {
	public static void main(String[] args) {
		P2thiskeyword r = new P2thiskeyword(100);
		r.show();
		 
	}

}
