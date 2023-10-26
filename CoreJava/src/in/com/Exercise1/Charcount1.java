package in.com.Exercise1;

public class Charcount1 {
	
	public static void main(String[] args) {
		String name = "malyalam";
		//int count = 0;
		for (char ch ='a'; ch < 'z'; ch++) {
			int count = 0;
			for (int i = 0; i < name.length(); i++) {
				if (name.charAt(i)==ch) {
					count ++;
				}
			}
			if (count > 0) {
				System.out.println(ch + "=" + count);
			}
			
			
			//count = 0;
		}
		
		
			
			
		}
	
}
