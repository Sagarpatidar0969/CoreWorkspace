package in.com.Thread;

class Passport implements Runnable{
	Thread t;
    public Passport() throws InterruptedException {
		t = new Thread(this,"Passport");
		t.start();
		t.join();
	}
	@Override
	public void run() {
		System.out.println("please varification your documents......");
		
	}	
}

class Check implements Runnable{
	Thread t;
	String name;
	String location;
	int phoneNo;
	int adharNo;
	public Check(String name, String location, int phoneNo, int adharNo) throws InterruptedException {
		super();
		this.name = name;
		this.location = location;
		this.phoneNo = phoneNo;
		this.adharNo = adharNo;
		t = new  Thread(this, "Check");
		t.start();
		t.join();
	}
	@Override
	public void run() {
		System.out.println("please wait your documents verifing");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
			
		}
		
		System.out.println(name +  "name is........"+ name);
		System.out.println(name + "location is....."+location);
		System.out.println(name + "phone no. is......"+phoneNo);
		System.out.println(name + " adhar number is......."+adharNo);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
			
		}
		System.out.println("!!!your documents is verified");
		
	}
	
}
class Done implements Runnable{
	Thread t;
	public Done() throws InterruptedException {
		t = new Thread(this, "Done");
		t.start();
		t.join();
	}
	@Override
	public void run() {
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("!!!! documents verification is done");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("!!!your password verification is done");
	}
}
public class PassportVerification {
      public static void main(String[] args) throws InterruptedException {
		Passport p = new Passport();
		Check c = new Check("sham", "pin-326023", 373872828, 37829112);
		
	}
}
