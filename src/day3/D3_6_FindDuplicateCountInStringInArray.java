package day3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class D3_6_FindDuplicateCountInStringInArray {
//Q: Find duplicate string from an array
	public static void main(String[] args) {
		String students[]={"Ruhul","Zannat","Arman","Sohag","Ruhul","Zannat","Sohag"};
		
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
			
		System.out.println(duplicateName.size());
		
		Iterator<String> i=duplicateName.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		
	}

}
