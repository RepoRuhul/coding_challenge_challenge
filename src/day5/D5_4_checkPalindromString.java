package day5;

public class D5_4_checkPalindromString {

	public static boolean checkPalindrome(String s) {
		s=s.toUpperCase();
		
		int b=0;   // 0 1 2 3..... 
		int e=s.length()-1;   //  6 5 4..... 
		
		for(int i=0;i<s.length()-1;i++) {
			
			if( s.charAt(b)!=s.charAt(e)) {
				
				return false;		
			}
			
			b++;
			e--;		
		}
		return true;
			
	}
	
	public static void main(String[] args) {
		System.out.println(checkPalindrome("MOipiO"));
		

	}

}
