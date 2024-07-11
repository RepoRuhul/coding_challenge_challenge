package day3;

//Q: Write the code to swap the string?
public class D3_1_SwapingSring {

	public static void main(String[] args) {
		String x="Arman"; String y="Rahman";
		
		//appending so that you get "ArmanRahman"
		String z=x+y;////ArmanRahman
		
		//using substring() so that you get Arman and assign in y
		y=z.substring(0,x.length()); //Note: in substring() second index always be 1 extra
		System.out.println("value of y="+y);
		//System.out.println(z.length());
		
		//using substring() so that you get Rahman and assign in x
		x=z.substring(x.length(),z.length()); //x.length()=5 and z.length()=11
		System.out.println("value of x="+x);
		

	}

}
