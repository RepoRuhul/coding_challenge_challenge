package day6;

public class Day6_3_RightAngleShape {

	public static void main(String[] args) {
	int n=10;	
	for(int i=0;i<n;i++) { //outer loop starts
		//inner loop-for print  * 
		//in the first iteration it will print one star...then two...then three....
		for(int k=0;k<=i;k++) {
			System.out.print("* "); //need to put a space so that * can be printed in shape
			
		}
			
		System.out.println(); //giving me a new line
		
	} ////outer loop ends
	
	}
}
