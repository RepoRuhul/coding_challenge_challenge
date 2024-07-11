package day6;

public class Day6_3_LeftAngleShape {

	public static void main(String[] args) {
	int n=10;	
	for(int i=0;i<n;i++) { //outer loop starts
		
		//inner loop-1 for print white space so that * print after that
		for(int j=0;j<n-i; j++) {
			System.out.print(" ");
		}
		
		//inner loop-2 for print  * 
		//in the first iteration it will print one star...then two...then three....
		for(int k=0;k<=i;k++) {
			System.out.print("*"); //need to put a space so that * can be printed in shape
			
		}
		
		//Note: Staying in the outer loop inner loop-1 and inner loop-2 (all iteration)
		// is executed
		
		
		
		
		System.out.println(); //giving me a new line
		
	} ////outer loop ends
	
	}
}
