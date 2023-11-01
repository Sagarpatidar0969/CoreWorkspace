package in.com.Thread;


class Thrrad1 implements Runnable{
	String name ;
	 Thrrad1(String name) {
		 this.name = name;
		
	}

	@Override
	public void run() {
		String s =  Thread.currentThread().getName();
		for (int i = 0; i < 10; i++) {
			System.out.println(s + " " + name);
			Thread.yield();
			
		}
		
		
	}
	
}


class Thread2 implements Runnable{
	String name;
	 Thread2(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		String s1 = Thread.currentThread().getName();
		for (int i = 0; i < 10; i++) {
			System.out.println(s1 + " " + name);
			Thread.yield();
		}
		
	}
}



public class Yield_Method {
	public static void main(String[] args) {
		Runnable r;
		r = new Thrrad1("sham");
		Thread t = new Thread(r, "Thrrad1");
//		t.getPriority();
		t.start();
		t.getPriority();
		
		r = new Thread2("ram");
		Thread t1 = new Thread(r, "Thread2");
//		t1.getPriority();
		t1.start();
     	t1.getPriority();
		
	}

}
