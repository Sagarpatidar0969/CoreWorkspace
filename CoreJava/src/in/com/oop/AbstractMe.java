package in.com.oop;

 abstract class AbstractMe22222 {
	public void h() {
		System.out.println("this is normal method 111");
	}
	public abstract void area();

}

    abstract class you extends AbstractMe{
	  public void g() {
		  System.out.println("i am second class222");
	  }
	  public abstract void shape();
  }
    
    public class AbstractMe{
    	public static void main(String[] args) {
			AbstractMe22222 a = new AbstractMe22222() {
				
				@Override
				public void area() {
					System.out.println("i am main class111 ");
					
				}
			};
		a.area();
		a.h();
			
			you y = new you() {
				
				@Override
				public void shape() {
					System.out.println("i am main class222");
					
				}
			};
			y.shape();
			y.g();
			
			
		}
    	
    }
    
