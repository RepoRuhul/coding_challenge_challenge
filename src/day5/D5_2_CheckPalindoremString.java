package day5;

public class D5_2_CheckPalindoremString {
	
	
	//dont use it...not standard
	
	
	//method to check
	public static void checkPalindoremString(String s) {
		String s1=s.toLowerCase();
		String orginal=null+s1;
		String newS = null;
			
		for(int i=s1.length()-1;i>=0;i--) {
			newS=newS+s1.charAt(i);
		}
		
		
		
		//s==newS  ...> checking the memory
		//s.equals(newS)----> checking the contains same or not
		if(orginal.equals(newS)) {
			System.out.println(s+" is Palindrome");
		}else {
			System.out.println(s+" is not a Palindrome");
		}
		
	} 

	public static void main(String[] args) {
		checkPalindoremString("DAd");

	}

}
