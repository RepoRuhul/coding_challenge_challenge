package day5;

public class D5_1_CheckPalindrome {
	//Q: Can you write the code to check a number is Palindore or not?
	
	//Method to check
	public static void checkPalindoreme(int n) {
		
		int orgNum=n;
		int newNum=0;
		int reminder=0;
		
		while(n>0) {
			
			//when we use % means i am getting reminder
			//when we use / means i am getting Quotient
			reminder=n%10;   //1   --->2--->1
			newNum=(newNum*10)+reminder;   //0+1=1---> 10+2=12---> 12*10-120+1-121
			n=n/10;  //12/10=1	
		}
		
		if(orgNum==newNum) {
			System.out.println(orgNum+" -is a Palindrome");
		}else {
			System.out.println(orgNum+" -is not a Palindrome");
		}
		
		
		}
	

	public static void main(String[] args) {
		// calling the method
		checkPalindoreme(121);
		

	}

}
