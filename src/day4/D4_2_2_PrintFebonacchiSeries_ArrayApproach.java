package day4;

import java.util.Arrays;





public class D4_2_2_PrintFebonacchiSeries_ArrayApproach {

	public static void printFebonacchiSeries(int n) {
		
		//declaring the array
		
		int[] series=new int[n];
		//System.out.println(Arrays.toString(series));
		//series[0]=0  series[1]=1  series[2]=series[0]+series[1]
		
		
		for(int i=0;i<n;i++){
			
			if(i<2) {
				series[i]=i;
			}else {
				series[i]=series[i-1]+series[i-2];
			}
					
		}
		
		System.out.println(Arrays.toString(series));	
	}
	
	
	
	public static void main(String[] args) {
		printFebonacchiSeries(10);
	}

}
