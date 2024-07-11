package day4;

public class D4_1_2_FindFactorial_recursiveApproach {
	
	//Q: : write the program to find factorial of a number  
	
	
	public static int printFactorial(int n) {
		
		if(n==0) {
			return 1;
			
		}else {
			return n*printFactorial(n-1);
		}
		 
	}

	public static void main(String[] args) {
		System.out.println(printFactorial(5));
		   //5*4*3*2*1
		

	}

}
