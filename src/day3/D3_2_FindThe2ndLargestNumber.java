package day3;

import java.util.Arrays;

//Q: Can you writhe the code to Find the largest number? (or 2nd largest number or smallest number)

public class D3_2_FindThe2ndLargestNumber {

	public static void main(String[] args) {
		//input
		int[] arr={30,11,8,4,100,2};
		System.out.println(Arrays.toString(arr));
		//sort the array
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		//smalest
		System.out.println("smalest:"+arr[0]);
		//2nd smalest
		System.out.println("2nd smalest:"+arr[1]);
		
		//Largest
		System.out.println("Largest:"+arr[arr.length-1]);
		
		//2nd Largest
		System.out.println("Largest:"+arr[arr.length-2]);
		
	}

}
