package day1;
//Q:Print your name vertically reverse way
// String name="Arman"
//loop through
//charAt(0)
//length()
//print character from last

//use System.out.println()

public class D1_2_PrintNameVerticallyReverseWay {

	public static void main(String[] args) {
		String name="Arman";	
		System.out.println(name.length()-1);
		//to print character from last we should use last index first
		//System.out.println(name.charAt(name.length()-1));//n
		for(int i=name.length()-1;i>=0;i--) {
			System.out.println(name.charAt(i));
		}

	}

}
