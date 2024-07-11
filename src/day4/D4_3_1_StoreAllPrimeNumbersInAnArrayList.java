package day4;

import java.util.ArrayList;
import java.util.Arrays;

public class D4_3_1_StoreAllPrimeNumbersInAnArrayList {
	// method to check passing number is prime or not
	public static boolean checkPrimeNumber(int n) {
		if (n < 2) {
			return false;
		} else {

			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					return false;
				}
			}
			return true;
		}
	}

	// method to store prime numbers up to <y> number
	public static void storePrimeNumbers(int y) {

		ArrayList<Integer> allPrimeNumbers = new ArrayList<>();

		for (int j = 2; j <= y; j++) {
			if (checkPrimeNumber(j)) {
				//when condition met..storing in arraylist
				allPrimeNumbers.add(j);

			}
		}
		System.out.println(allPrimeNumbers);	
		
	}

	public static void main(String[] args) {
		//call storePrimeNumbers method
		storePrimeNumbers(25);

	}

}
