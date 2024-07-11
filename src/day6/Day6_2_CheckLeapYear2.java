package day6;

public class Day6_2_CheckLeapYear2 {
	
	//q: You are given a list of years. you need to write the program to print all leap year from the list
	
	//

	//method to check leap year
	public static boolean checkLeapYear(int n) {
		if(n%4==0 && n%100!=0  || n%400==0){
			return true;
		}
		return false;
	} 
	
	
	public static void main(String[] args) {
		
		int years[]= {1900, 2024, 2300, 2028,1688};
		
		 for(int i=0;i<years.length; i++) {
			
			 
			 if(checkLeapYear(years[i])) {
				 System.out.println(years[i]);
			 }
		 }
		
		
		
	}

}
