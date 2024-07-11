package day2;

public class D2_9_swapingValueWith3rdVariable {
	
	//Swap the int value  input x=5, y=10.....output x=10, y=5

	public static void main(String[] args) {
		//initial value
		
		int x=5;
		int y=10;
		
		System.out.println("x="+x);
		System.out.println("y="+y);
		
		System.out.println("when we swap the value--------");
		//Swapping with 3rd variable
	
		
		int z=x;
		x=y;
		y=z;
		
		
		System.out.println("x="+x);
		System.out.println("y="+y);
		
	}

}
