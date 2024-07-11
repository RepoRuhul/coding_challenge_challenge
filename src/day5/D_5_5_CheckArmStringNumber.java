package day5;

public class D_5_5_CheckArmStringNumber {
	//Q: Write a method to check given number is ArmStrongNumber or not 
	
	
	//method to check
	
	public static boolean checkArmStrongNumber(int n) {
		
		int orgNumber=n;
		int reminder=0;
		int newNumber=0;
		
		while(n>0) {
			reminder=n%10; //ist=3   2nd=5  3rd=1
			newNumber=newNumber+(reminder*reminder*reminder); //ist=27  2nd=27+(5*5*5)=152 3rd=152+(1*1*1)=153
			n=n/10; //ist=15    2nd=1  3rd=it will not enough to pass the check point in while loop
		}
		
		//checking
		
		if(orgNumber!=newNumber) {
			return false;
		}
		return true;	
		
	}
	
	public static void main(String[] args) {
		//calling the method
		System.out.println(checkArmStrongNumber(152));
		
	}

}
