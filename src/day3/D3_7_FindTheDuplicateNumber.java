package day3;

import java.util.HashSet;
import java.util.Set;

public class D3_7_FindTheDuplicateNumber {

	public static void main(String[] args) {
		int[] numbers= {5,10,3,5,4,2,3,4,3};
		
		Set<Integer> duplicateNumber=new HashSet<>();	
		
		//nestedloop
		
		for(int i=0;i<numbers.length;i++) {
			
			for(int j=i+1;j<numbers.length;j++) {
				
				if(numbers[i]==numbers[j]) {
					duplicateNumber.add(numbers[i]);
				}
				
			}
			
		}
		
		System.out.println(duplicateNumber);

	}

}
