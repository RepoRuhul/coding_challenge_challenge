package day3;

import java.util.Arrays;

//Q: Can you writhe the code to Find the largest number without sort()? (or 2nd largest number or smallest number)

public class D3_3_FindTheLargestNumber_WithoutSortMethod_WhileSortedInDecendingOrder {

	public static void main(String[] args) {
		//input
		int[] arr={30,11,8,4,100,2};
		System.out.println(Arrays.toString(arr));
		
		//sort the array
		int temp=0;
		for(int i=0;i<arr.length;i++) { //outer loop
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]<arr[j]) {  //4<100
					temp=arr[i];   //temp=4
					arr[i]=arr[j]; //arr[i]=100
					arr[j]=temp;   //arr[j]=4	}			
				
			}				
			
		}
		
		
		System.out.println(Arrays.toString(arr));
		
		
		//Largest
		System.out.println("Largest:"+arr[0]);
		//2nd largest
		System.out.println("2nd Largest:"+arr[1]);
		
		//smallest
		System.out.println("smallest:"+arr[arr.length-1]);
		
		//2nd smallest
		System.out.println("2nd smallest:"+arr[arr.length-2]);
		
	}

}}
