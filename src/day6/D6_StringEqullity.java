package day6;

public class D6_StringEqullity {

	public static void main(String[] args) {
		String name1="Ruhul"; //literal way---string is stored in SCP
		//intern() method will be invoked interally
		//this method is responsible to check the string in SCP
	
		String name2="Ruhul";
		
		//calling String constructor
		String name3=new String("Ruhul"); //it will be in Heap Area (not SCP)
		String name4=new String("Ruhul"); //it will be in Heap Area (not SCP)
		System.out.println(name1==name2); //true
		System.out.println(name3==name2); //false
		System.out.println(name3==name4); //false
		
		
		//checking with eauls()--it checks only value/contents 
		System.out.println(name1.equals(name2));//true
		System.out.println(name1.equals(name3));//true
		System.out.println(name1.equals(name4));//true
		
	
	
	}

}
