package day6;

public class Day5_1_CheckOddOrEvenNumber2 {
	//Q: Print all the even numbers from a range (1-20)
	
	//the method to check number is even or not
	public static boolean isEvenNumber(int n) {
		if(n%2==0) {
			return true;
		}
		return false;
	}
	
	//the method to return the count of evennumber
	
	public static void printCountOfEvenNumbers(int z) {
		int count=0;
		for(int i=1;i<=z;i++) {
			if(isEvenNumber(i)) {
				count++;
				
			}
		}
		
		System.out.println("Total="+count);	
		
	}
	
	//This method will print all even numbers
	public static void printAllEvenNumbers(int y) {
		for(int i=1;i<=y;i++) {
			if(isEvenNumber(i)) {
				System.out.print(i+" ");
				
			}
			
			
		}
	}
	

	public static void main(String[] args) {
		//printAllEvenNumbers(20);
		printCountOfEvenNumbers(20);

	}

}
