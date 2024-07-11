package day2;

public class D2_1_printNumberOfConsonent {
//Q: Write a method to find the number of consonant from a String?

	// method to print number of consonent
	public static void printCountOfConsonent(String str) {

		str = str.toLowerCase();

		// declare the count consonent

		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i)!= 'a' && str.charAt(i) != 'e' &&str.charAt(i) != 'i' && str.charAt(i)!= 'o'
					&& str.charAt(i)!= 'u'&& str.charAt(i)!= ' ') {
				count++;
			}
		}

		System.out.println("Total consonent:" + count);

	}

	public static void main(String[] args) {
		printCountOfConsonent("My name is mamun");

	}

}
