package day2;

import java.util.Arrays;

public class D2_4_findLargestNumber {

	public static void main(String[] args) {
		
		//have some numbers in an array
		
		int[] arr= {4,2,8,1,100,25,3};
		
		//System.out.println(Arrays.toString(arr));
		
		//sorting the array
		Arrays.sort(arr);
		
		//print the highestNumber
		System.out.println("HighestNumber: "+arr[arr.length-1]);
		System.out.println("LowestNumber: "+arr[0]);
	}

}
