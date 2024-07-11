package day3;

import java.util.HashMap;
import java.util.Set;

public class D3_10_DuplicateCharWithCount {

	public static void main(String[] args) {
		String  name="Aarmann";
		name=name.toLowerCase();
		name=name.replaceAll(" ","");
		
		
		HashMap<Character,Integer> dupChar=new HashMap<>();
		//key should unique---no duplicate but value can be duplicate
		//get()-------need to pass k---return value
		//keySet()----all keys together
	
		
		for(int i=0; i<name.length();i++) {
			if(dupChar.get(name.charAt(i))==null) {
				dupChar.put(name.charAt(i),1);
			}else {
				int count=dupChar.get(name.charAt(i));
				dupChar.put(name.charAt(i),count+1);
			}
			
		}
		
		//getting all the keys
		Set<Character> chars=dupChar.keySet();
		
		
		//System.out.println(dupChar);
		
		for(char c:chars) {
			if(dupChar.get(c)>1) {
				System.out.println(c+"-"+dupChar.get(c));
			}
			
			
			
		}
	}

}
