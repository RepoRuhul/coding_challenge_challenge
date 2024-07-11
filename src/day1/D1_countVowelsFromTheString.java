package day1;

public class D1_countVowelsFromTheString {
	
	
/*Q: ******Write a method to find the number of vowels from a String? —converting to lower or upper space  & counting only ‘a’ ‘e’ ‘i’ ‘o’ ‘u’ [ converting to lower or upper space
They will not mention any approach]
-create the method which will count vowels(static, void, takes string arg)
-declare a count variable
-loop through every char
--with charAT(_)--in the method body you will  check char is a’ ‘e’ ‘i’ ‘o’ ‘u’ or not
-if matches increase the count
-finally print the count variable
-put the string in a String variable  in the main()
-call the method which will count vowels
*/
	//create the method
	public static void printTotalVowels(String str) {
		
		str=str.toLowerCase();
		
		//declare the count variable
		
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||
					str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				count++;
			}
		}
		
		System.out.println("Total vowles:"+count);		
	}
		
	public static void main(String[] args) {
		
		printTotalVowels("Aasjdlsjfou");
	}

}
