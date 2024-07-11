package day4;

public class D4_2_1_PrintFebonacciSeries_EasyApproach {

	// 0, 1, (0+1),  (1+1),  (1+2), (2+3)
	
	
	public static void printFebonacchiSeries(int n){
		
		int a=0; int b=1;
		int c;
		System.out.print(a+" "+b+" ");
		if(n>1) {
			for(int i=2;i<n;i++) {
				
				c=a+b;
				System.out.print(c+" ");
				a=b;
				b=c;
				
			}
		}	
		
	}
	
	
	public static void main(String[] args) {
		
		printFebonacchiSeries(10);
	}

}
