package day5;

public class D5_3_CheckPalindromString {
//Q: check palindrome for string

	//Best one
	
	
	public static void checkPalindrome(String s) {
		s=s.toUpperCase();
		
		StringBuilder sb=new StringBuilder(s);
		String newString=sb.reverse().toString();
		//System.out.println(newString);
		if(s.equals(newString)) {
			System.out.println(s+" is Palindrome");
		}else {
			System.out.println(s+" is not Palindrome");
		}
		
	}
	
	
	public static void main(String[] args) {
		checkPalindrome("MOM");

	}

}
