package day1;

//have the string
//create the method and taking the string in arg
//have a count variable
// in a loop traverse every char and check in a if() condidiont-if matched increase the count variable
//print count 

public class D1_CountTheCharInAString_usingOrOperator {
//Q: can you count 'A'/'a' from the string
	
	//method
	public static void countTheSpecificChar(String str) {	
		int count=0;
		for(int i=0;i<str.length();i++) {

			if(str.charAt(i)=='A' ||str.charAt(i)=='a' ) {
				count++;
			}		
		}
		System.out.println("Total 'A' & 'a' :"+count);		
		
	}
	public static void main(String[] args) {
		String str="Aammaa";
		countTheSpecificChar(str);
		
	}

}