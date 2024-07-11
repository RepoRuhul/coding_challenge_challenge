package day4;

public class D4_3_1_PrintHowManyPrimeNumberInASeries {
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
		for(int j=2;j<=y;j++) {
			if(checkPrimeNumber(j)) {
				
				count++;
				
			}	
			
		}
		
		System.out.print("There are total "+count+" PrimeNumbers");
		
	}
	
	public static void main(String[] args) {
		printCountOfAllPrimeNumbers(20);
		
	}

}
