package day1;
//Q:Print your name vertically reverse way
// String name="Arman"
//create a static method with asking string-- which will print name reverse way
//loop through
//charAt(0)
//length()
//print character from last
public class D1_PrintNameVerticallyReverseWayCallingMethod {

	// method to print name reverse way
	public static void printNameReverseWay(String name) {
		// to print character from last we should use last index first
		for (int i = name.length() - 1; i >= 0; i--) {
			System.out.println(name.charAt(i));
		}
	}

	public static void main(String[] args) {
		String name = "Arman";
		//caling the method
		printNameReverseWay(name);

	}

}
