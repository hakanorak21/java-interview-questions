package ersin;

public class SameLetters {

	public static void main(String[] args) {
		String str1 = "abacdaaabbbcadd";
		String str2 = "caabd";
				
		System.out.println("method 1:  " + m1(str1, str2));

	}
	
	
	public static boolean m1(String str1, String str2) {
		
		while(str1.length()!=0 && str2.length()!=0) {
			str2 = str2.replace(str1.substring(0,1), "");
			str1 = str1.replace(str1.substring(0,1), "");			
		}
		return str1.length()==str2.length();	
	}

}
