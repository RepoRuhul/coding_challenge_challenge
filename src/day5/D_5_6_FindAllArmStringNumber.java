package day5;

public class D_5_6_FindAllArmStringNumber {
	//Q: Write a method to check given number is ArmStrongNumber or not 

	public static boolean checkArmStrongNumber(int n) {
		
		int orgNumber=n;
		int reminder=0;
		int newNumber=0;
		
		while(n>0) {
			reminder=n%10; //ist=3   2nd=5  3rd=1
			newNumber=newNumber+(reminder*reminder*reminder); //ist=27  2nd=27+(5*5*5)=152 3rd=152+(1*1*1)=153
			n=n/10; //ist=15    2nd=1  3rd=it will not enough to pass the check point in while loop
		}
	
		if(orgNumber!=newNumber) {
			return false;
		}
		return true;	
		
	}
	
	//to get all armStrongNumbers
	public static void printAllArmStrongNumbers(int j) {
		
		if(j>100) {
		for(int k=153;k<=j;k++) {
			if(checkArmStrongNumber(k)) {
				System.out.println(k);
			}
		}
	}
	}
	
	public static void main(String[] args) {
		//calling the method
		printAllArmStrongNumbers(500);
		
	}

}
