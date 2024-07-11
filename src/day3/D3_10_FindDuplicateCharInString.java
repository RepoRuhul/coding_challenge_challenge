package day3;

import java.util.HashSet;
import java.util.Set;

public class D3_10_FindDuplicateCharInString {

	public static void main(String[] args) {
		String str="Armaann";
		str=str.toLowerCase();
		
		Set<Character> dupChar=new HashSet<>();
		
		//comparing char
		for(int i=0;i<str.length();i++) {
			
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					dupChar.add(str.charAt(i));
				}
			}
			
			
		}
		
		System.out.println(dupChar);

	}

}
