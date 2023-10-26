package in.com.Personal;

abstract class animal{
	 animal(){
		 System.out.println("all");
	 }
	public abstract void sound();
	}
class dog extends animal{
	dog(){
		super();
	}
	public void sound() {
		System.out.println("dog is barking");
	}
}
class lion extends animal{
	lion(){
		super();
	}
		public void sound() {
		System.out.println("lion is roar");
	}
}

public class P5Abtractclass {
	public static void main(String[] args) {
		dog d = new dog();
		lion l = new lion();
		d.sound();
		l.sound();
	}

}
