package day3;

import java.util.Arrays;

//Q: Can you writhe the code to Find the largest number without sort()? (or 2nd largest number or smallest number)

public class D3_3_FindThe2ndLargestNumber_WithoutSortMethod {

	public static void main(String[] args) {
		//input
		int[] arr={30,11,8,4,100,2};
		System.out.println(Arrays.toString(arr));
		
		//sort the array
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]>arr[j]) {  //30>8
					temp=arr[i];   //temp=30
					arr[i]=arr[j]; //arr[i]=11
					arr[j]=temp;   //arr[j]=30
				}			
				
			}				
			
		}
		
		
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
