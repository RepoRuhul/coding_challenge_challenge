package day6;

public class D6_FindExtrema {

	public static void main(String[] args) {
		int[]arr= {302,1,2,4,8,5,7};
		
		for(int i=1;i<arr.length-1;i++) {
			int targetElement=arr[i];
			int leftNeighbour=arr[i-1];
			int rightNeighbour=arr[i+1];
			
			if(targetElement!=leftNeighbour+rightNeighbour) {
				System.out.print(targetElement+" ");
			}
		}


	}

}
