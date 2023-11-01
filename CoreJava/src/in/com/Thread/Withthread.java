package in.com.Thread;

 class Withthread1 extends Thread{
	String name;
	public Withthread1(String name) {
		this.name = name;
	}
		@Override
		public void run() {
			for (int i = 1; i < 10; i++) {
				System.out.println(name + " " + i);
			}
		
		}
}
 
 public class Withthread{
	 public static void main(String[] args) {
		Withthread1 t1 = new Withthread1("india");
		Withthread1 t2 = new Withthread1("newziland");
		
		t1.setPriority(10);
		t2.setPriority(2);
		
		t1.start();
		t2.start();
		
		
		
	}
 }
