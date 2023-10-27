package in.com.Thread;

public class Testwithoutthread {
	public static void main(String[] args) {
		Withoutthread w= new Withoutthread("ms");
		Withoutthread w1 = new Withoutthread("dhoni");
		w.run();
		w1.run();
	}

}
