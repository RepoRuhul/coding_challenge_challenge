package day2;

public class D2_5_findLargestNumberComparingValue {
//Q: Find the largest number from an array*might not be mentioned
	//—using comparison in if condition

	public static void main(String[] args) {

		//have some numbers in an array		
		int[] arr= {4,2,8,1,100,25,3};
		
		int highestNumber=arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>highestNumber) {
				highestNumber=arr[i];
			}
		}
		
		System.out.println(highestNumber);

	}

}
