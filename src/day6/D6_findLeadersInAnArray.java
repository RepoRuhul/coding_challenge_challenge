package day6;

public class D6_findLeadersInAnArray {

	public static void main(String[] args) {
		// input
		int[]arr= {302,1,2,4,13,5,7};
		
		for(int i=0;i<arr.length;i++) { //outer loop
			
			int sum=0;
			for(int j=i+1;j<arr.length;j++) {
				sum=sum+arr[j];
			}
			
			if(arr[i]>sum) {
				System.out.println(arr[i]);
			}
			
		}
	}

}
