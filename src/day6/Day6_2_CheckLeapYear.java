package day6;

public class Day6_2_CheckLeapYear {

	//method to check leap year
	public static void checkLeapYear(int n) {
		if(n%4==0 && n%100!=0  || n%400==0){
			System.out.println(n+ "-this is a leap year");
		}else {
			System.out.println(n+ "-this is not a leap year");
		}
	} 
	
	
	public static void main(String[] args) {
		//calling the method
		checkLeapYear(1900);

		
		 
		
		
		
	}

}
