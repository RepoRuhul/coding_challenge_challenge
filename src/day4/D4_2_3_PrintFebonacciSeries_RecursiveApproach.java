package day4;

public class D4_2_3_PrintFebonacciSeries_RecursiveApproach {

	static int a = 0;
	static int b = 1;
	static int c;

	public static void printFebonacciSeries(int n) {
		
		if(n>2) {
		c = a + b;
		System.out.print(" " + c);
		a=b;
		b=c;	
			printFebonacciSeries(n-1);
		}
		
	}
	public static void main(String[] args) {
		System.out.print(a + " " + b);
		printFebonacciSeries(10);
	}

}
