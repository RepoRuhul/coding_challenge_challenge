package day3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class D3_5_FindDuplicateStringInArray {
//Q: Find duplicate string from an array
	public static void main(String[] args) {
		String students[]={"Ruhul","Zannat","Arman","Zannat","Ruhul","Zannat"};
		
	//	List<String> duplicateName=new ArrayList<>(); //should not use as List accepting duplicate
		Set<String> duplicateName=new HashSet<>(); //should use as set doesnt accept duplicate
		
		
		//in nested loop checking duplicate (comparing outerloop with innerloop value)
		for(int i=0;i<students.length;i++) {
			for(int j=i+1;j<students.length;j++) {
				if(students[i].equals(students[j])) {
					duplicateName.add(students[i]);
				}
			}
		}
			
		System.out.println(duplicateName);
		for(String s:duplicateName) {
			System.out.println(s);
		}
		
		
	}

}
