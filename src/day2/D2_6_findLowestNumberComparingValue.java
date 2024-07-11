package day2;

public class D2_6_findLowestNumberComparingValue {
//Q: Find the lowest number from an array*might not be mentioned
	//—using comparison in if condition

	public static void main(String[] args) {

		//have some numbers in an array		
		int[] arr= {4,2,8,1,100,25,3};
		
		int LowestNumber=arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<LowestNumber) {
				LowestNumber=arr[i];
			}
		}
		
		System.out.println(LowestNumber);

	}

}
