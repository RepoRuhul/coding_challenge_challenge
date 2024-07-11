package day1;
public class D1_ReverseSumOfTwoNumbers {
	/*
	 * Q:Reverse the sum of two numbers 
	 * -get two int value 
	 * –add two number 
	 * –get the value (String) of the sum 
	 *-creating method
	 * -reverse
	 */
	public static void reverseSumOfTwoNumbers(int sum) {

		String s = String.valueOf(sum);
		// looping
//		for (int i = s.length() - 1; i >= 0; i--) {
//			System.out.print(s.charAt(i));
//		}
		
		//call the reverse()
		StringBuilder sb=new StringBuilder(s);
		System.out.println(sb.reverse());	

	}

	public static void main(String[] args) {
		int a = 532;
		int b = 681;
		int sum = a + b;
		System.out.println("Befor calling the method:" + sum);
		reverseSumOfTwoNumbers(sum);

	}

}
