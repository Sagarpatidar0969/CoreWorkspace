package in.com.Thread;

class runna11 implements Runnable{
	String name;
	public runna11(String name) {
	this.name =name;
	}
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(name+ " " + i);
		}
		
	}
}



public class Byrunnable {
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new runna11("india"));
		Thread t2 = new Thread(new runna11("south africa"));
		
		t1.setPriority(10);
		t2.setPriority(2);
		
		t1.start();
		t2.start();
	}

}
