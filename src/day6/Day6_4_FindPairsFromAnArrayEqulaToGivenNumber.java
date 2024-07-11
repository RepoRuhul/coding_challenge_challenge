package day6;
public class Day6_4_FindPairsFromAnArrayEqulaToGivenNumber {

	public static void main(String[] args) {
		// input
		int[] arr= {12, 3, 4, 2, 6, 9}; int n=8;
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1; j<arr.length;j++) {
				
				if(arr[i]+arr[j]==n) {
					System.out.println("The matching pair is:"+arr[i]+","+arr[j]);
				}
				
				
			}
		}

		
	}

}
