package day4;

public class D4_1_FindFactorial_LoopingApproach {
	
	//Q: : write the program to find factorial of a number  


	public static void main(String[] args) {
		//input factorial of n
		int n=5;      //5x4x3x2x1=
		//assigning n into r
		int r=n;
		
		//System.out.println(r);//5
		//looping--starting the counter n-1=4, 
		//decremental so in next loop i value will be 4-1=3......
		for(int i=n-1;i>0;i--) {
			//modifying r value after multiplying i value (keep modifying)
			r=r*i;
			
		}
		//print r for factorial
		System.out.println(r);
		

	}

}
