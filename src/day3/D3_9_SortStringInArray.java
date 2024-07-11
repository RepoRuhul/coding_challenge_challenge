package day3;

import java.util.Arrays;

public class D3_9_SortStringInArray {

	public static void main(String[] args) {
		String[] str= {"Jannat","Ruhul","Arman"};
		
		System.out.println("Before sorting:"+Arrays.toString(str));
			
		Arrays.sort(str);
		System.out.println("After sorting:"+Arrays.toString(str));
		
		
		//number sorting
		int[]ids= {505,101,102,305,5,99};
		System.out.println("Before sorting:"+Arrays.toString(ids));
		Arrays.sort(ids);
		System.out.println("After sorting:"+Arrays.toString(ids));
		
	}

}
