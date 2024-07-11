package day6;

public class Day5_1_CheckOddOrEvenNumber {
	//Q: Print the given number is even or odd
	
	public static void checkEvenNumber(int n) {
		if(n%2==0) {
			System.out.println(n+ " is an even number");
		}else {
			System.out.println(n+ " is an odd number");
		}
	}
	
	

	public static void main(String[] args) {
		//calling the method
		checkEvenNumber(8);

	}

}
