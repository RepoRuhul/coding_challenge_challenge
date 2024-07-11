package day2;

public class D2_3_printNumberOfConsonent_3rdApproach {

	// mehtod

	public static void printTotalNumberOfConsonent(String str) {

		str = str.toLowerCase();
		str=str.replaceAll("\\s","");
		int totalChar=str.length();
		int totalConsonent=0;
		int totalVowels = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				totalVowels++;
			}
		}
		
		totalConsonent=totalChar-totalVowels;

		System.out.println("Total consonent:" + totalConsonent);
	}

	public static void main(String[] args) {
		// calling the method
		printTotalNumberOfConsonent("My name is Mamun");

	}

}
