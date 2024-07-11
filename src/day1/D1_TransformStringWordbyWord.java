package day1;

import java.util.Arrays;

public class D1_TransformStringWordbyWord {
//put the string in String variable
//create a no return type static method (outside of the main()) with String arg
//in the body call the split method passing white space arg and put in a String type array
//in a loop travers through every index value and print	
	
	//creating method
	public static void reverseStringWordByWord(String str) {
		//after calling split() put in an array
		String [] words=str.split(" ");
		
		for(int i=words.length-1;i>=0;i--) {
			System.out.print(words[i]+" ");
		}
	}
	
	
	public static void main(String[] args) {
		//having string
		String str="Hello Mohammad Tofael Kabir Sharkar";
		
		//calling method by passing the string
		reverseStringWordByWord(str);
	}

}
