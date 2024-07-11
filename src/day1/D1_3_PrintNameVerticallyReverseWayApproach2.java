package day1;
//Q:Print your name vertically reverse way-----approach 2
// String name="Arman"
//loop through
//charAt(0)
//length()
//focus on charAt()---what index number you are passing

public class D1_3_PrintNameVerticallyReverseWayApproach2 {

	public static void main(String[] args) {
		String name="Arman";	
		
		//System.out.println(name.charAt(name.length()-1));	
		for(int i=0;i<name.length();i++) {
			System.out.println(name.charAt(name.length()-1-i));
		}

	}

}
