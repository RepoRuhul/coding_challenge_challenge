package day6;

import java.util.ArrayList;

public class D6_AddTwoArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> list1=new ArrayList<>();
		
		list1.add(5);
		list1.add(10);
		
		
		ArrayList<Integer> list2=new ArrayList<>();
		list2.add(15);
		System.out.println(list2);
		list2.addAll(list1);
		System.out.println(list2);
	}

}
