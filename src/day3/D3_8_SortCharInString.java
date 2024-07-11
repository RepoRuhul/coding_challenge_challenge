package day3;

import java.util.Arrays;

public class D3_8_SortCharInString {

	public static void main(String[] args) {
		String str="My name is Jannat";
		System.out.println(str);
		str=str.replaceAll(" ","");
		str=str.toLowerCase();
		System.out.println(str);
		
		char[] chars=str.toCharArray();

		System.out.println(Arrays.toString(chars));
		
		//calling sort()
		Arrays.sort(chars);
		System.out.println(Arrays.toString(chars));
		
		for(char c:chars) {
			System.out.print(c+" ");
		}
		
		
	}

}
