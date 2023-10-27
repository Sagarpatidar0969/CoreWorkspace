package in.com.Thread;

public class Withoutthread {
	String s = null;
	public Withoutthread(String s) {
		this.s = s;
		
	}

	 public void run() {
	for (int i = 0; i <=10; i++) {
		System.out.println(s + " " + i);
		
		
		
	}	

	}
}
