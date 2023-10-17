package in.com.Functoinalinterface_Lambda;


interface lambda {
	void meth1();
}


public class LambdaExpresation {
	
	public static void main(String[] args) {
		lambda obj = () ->
		{
		System.out.println("hii");	
		};
	obj.meth1();
}
}