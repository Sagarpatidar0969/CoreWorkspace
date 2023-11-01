package in.com.Exercise1;

public class Charcount66 {
	public static void main(String[] args) {
	String name = "sppatidar27@gmail.comyuuoo";
	int count = 0;
	//char ch []= name.toCharArray();
	for (int i = 0; i < name.length(); i++) {
		for (char j  ='a' ; j < 'z'; j++) {
			if(name.charAt(i)==j) {
				count++;
			
		}
		
	}
		
	}
	if(count>0) {
		System.out.println(count);
	}
	
}

}
