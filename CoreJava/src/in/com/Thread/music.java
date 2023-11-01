package in.com.Thread;
public class music extends Thread {
	@Override
	public void run() {
		
		for (int i = 0; i < 3; i++) {
			String s = Thread.currentThread().getName();
			System.out.println(s + " " + "music play");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				
			}
		}
		}
	public static void main(String[] args) {
		music s = new music();
	    s.setName("pop music");
	    s.start();
	    
	    music s1 = new music();
	    s1.setName("classic music");
	    s1.start();
	}

}

