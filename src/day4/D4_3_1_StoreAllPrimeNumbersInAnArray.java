package day4;

import java.util.Arrays;

public class D4_3_1_StoreAllPrimeNumbersInAnArray {
// 0 and 1 are not prime number 
	
	//method to check passing number is prime or not
	public static boolean checkPrimeNumber(int n) {
		if(n<2) {
			return false;
		}else {
		
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
					
		}
			
		return true;
		}		
	}
	
	//method to count how many prime number up to n number
	public static void printCountOfAllPrimeNumbers(int y) {
		int count=0;
		int[] allPrimeNumber=new int[y];
		
		
		for(int j=0;j<=y;j++) {
			if(checkPrimeNumber(j)) {
				
				allPrimeNumber[j]=j;
						
				
			}	
			
		}
		
		
		//System.out.println(Arrays.toString(allPrimeNumber));
			
		
		//System.out.println(Arrays.toString(allPrimeNumber));
		
		for(int m=0;m<allPrimeNumber.length;m++) {
			if(allPrimeNumber[m]!=0) {
				count++;
				System.out.print(allPrimeNumber[m]+" ");
			}
		}
		
		System.out.println();
		System.out.println("Total PrimeNumber is-"+count);
		
	}
	
	public static void main(String[] args) {
		printCountOfAllPrimeNumbers(100);
		
	}

}
