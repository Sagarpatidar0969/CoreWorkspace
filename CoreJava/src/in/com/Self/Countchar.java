package in.com.Self;



public class Countchar {
	public static void main(String[] args) {
		
	String name = "malyalamarmr";
	
	for(char i = 'a';i<'z';i++) {
		int count = 0;
		for (int j = 0; j < name.length(); j++) {
			if(name.charAt(j)==i) {
				count++;
			}
			
		}
		if(count>0) {
		System.out.println(i +" " +count );
	}
  
}
}
}
