package day6;
public class Day6_4_FindTripletFromAnArray {

	public static void main(String[] args) {
		// input
		int[] arr= {12, 3, 4, 1, 6, 9}; int sum=8;
		
		//in nested loop we will get 3 indexes' value and we will 
		//get sum of them and compare with input (sum)
		
		/*
		for(int i=0; i<arr.length; i++) {
			if(i<arr.length-1) {
			for(int j=i+1; j<arr.length;j++) {
				if(j<arr.length-1) {
				for(int k=j+1;j<arr.length;j++) {
					if(arr[i]+arr[j]+arr[k]==sum) {
						System.out.println("The Triplet:"+arr[i]+","+arr[j]+","+arr[k]);
					}
					}}
				}
			}
		}
		*/
		//if you dont use if condition to have j and K value	

		for(int i=0; i<arr.length-2; i++) {
			
			for(int j=i+1; j<arr.length;j++) {
				
				for(int k=j+1;j<arr.length;j++) {
					if(arr[i]+arr[j]+arr[k]==sum) {
						System.out.println("The Triplet:"+arr[i]+","+arr[j]+","+arr[k]);
					}
					
				}
			}
		}
		
		
		
		
	}

}
