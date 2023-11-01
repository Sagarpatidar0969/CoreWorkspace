package in.com.Thread;



class Authors implements Runnable{
	 
	Book b;
	Thread t;
	public Authors(Book b) {
		this.b=b;
		t = new Thread(this,"Author");
	}
	@Override
	public void run() {
		b.Writings();
		
		
	}
}
class Student implements Runnable{
	Thread t;Book b;
	public Student(Book b) {
		this.b = b;
		t = new Thread(this,"student");
		
	}
	@Override
	public void run() {
		b.Reading();
		
	}
}

class Book{
	synchronized void Writings() {
		String s = Thread.currentThread().getName();
		System.out.println(s +" : Authore writing book!!!!");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
			
		}
		System.out.println("book is available");
	}
	synchronized void Reading(){
		String s1 = Thread.currentThread().getName();
		System.out.println(s1 + "   reading book");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//System.out.println("student read book");
		notifyAll();
	}
}


public class Synchronized_BookReadWrite {
public static void main(String[] args) {
	Book b = new Book();
	Authors a = new Authors(b);
	Thread T4 = new Thread(a,"Dr  sharma");
	T4.start();
	
	Student s = new Student(b);
	Thread t = new Thread(s, "sagar");
	t.start();
	
	Student s1 = new Student(b);
	Thread t1 = new Thread(s1, "ram");
	t1.start();
	
	Student s2 = new Student(b);
	Thread t2 = new Thread(s2, "rahul");
	t2.start();
	
	Student s3 = new Student(b);
	Thread t3 = new Thread(s3, "dilip");
	t3.start();
	
//	Authors a = new Authors(b);
//	Thread T4 = new Thread(a,"Dr  sharma");
//	T4.start();
//	
	
}
}
