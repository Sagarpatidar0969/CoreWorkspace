package in.com.Thread;
class Daemon777 extends Thread{
	public void run() {
		Thread t = Thread.currentThread();
		if(t.isDaemon()) {
			Cust c = new Cust(77, "sagar", 20, "373783");
			c.Disp();
			
		}else {
			System.out.println("user define..........");
		}
		
	}
}
class Cust{
	int id;
	String name;
	int age;
	String acc;
	public Cust(int id, String name, int age, String acc) {
		//super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.acc = acc;
	}
	
	    void Disp() {
	    	System.out.println("customer id is.........."+id);
	    	System.out.println("Customer name is ........"+name);
	    	System.out.println("customer age is ........."+age);
	    	System.out.println("customer acc num is....... "+acc);
	    	
	    }
	
}


public class Daemon_customer {
	public static void main(String[] args) {
		
		Daemon777 d = new Daemon777();
		d.setDaemon(false);
		d.start();
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Deamon is running");
		
	}

}
