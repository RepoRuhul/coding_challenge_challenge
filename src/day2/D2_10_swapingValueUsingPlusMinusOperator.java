package day2;

public class D2_10_swapingValueUsingPlusMinusOperator {

	// Swap the int value input x=5, y=10.....output x=10, y=5

	public static void main(String[] args) {
		// initial value
		int x = 5;
		int y = 10;
		System.out.println("x=" + x);
		System.out.println("y=" + y);

		System.out.println("when we swap the value--------");
		// Swapping with 3rd variable

		x = x + y;// 15
		y = x - y;//5
		x=x-y; //10

		System.out.println("x=" + x);
		System.out.println("y=" + y);

	}

}
