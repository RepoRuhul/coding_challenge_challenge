package day1;

//have the string
//create the method and taking the string in arg
//have a count variable
// in a loop traverse every char and check in a if() condidiont-if matched increase the count variable
//print count 

public class D1_CountTheCharInAString_upper {
//Q: can you count 'A' from the string
	
	//method
	public static void countTheSpecificChar(String str) {
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='A') {
				count++;
			}		
		}
		System.out.println("Total 'A' is:"+count);		
		
	}
	public static void main(String[] args) {
		String str="Aammaa";
		countTheSpecificChar(str);
		
	}

}
