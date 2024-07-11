package day4;

public class D4_3_1_CheckPrimeNumber {
// 0 and 1 are not prime number 
	//0 1 not a prime number
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
	
	public static void main(String[] args) {
		System.out.println(checkPrimeNumber(7));
		
	}

}
//7%2 ==1     7%3   ==1  7%4   ==0  7%5   ==0 7%5   =0 7%6   ==0
//     