package day1;
//Q:Print your name vertically reverse way
// String name="Arman"
//need to call any method which will reverse my string-----reverse() from StringBuffered class or StringBuilder class
//finally we can convertBack to string by calling toString()

public class D1_PrintNameReverseWayWithoutLooping {

	public static void main(String[] args) {
		String name="Arman";	
		System.out.println(name);
		//StringBuilder	sb=new StringBuilder(name);	
		StringBuffer	sb=new StringBuffer(name);	
		//we could directly pring the following line
		//System.out.println(sb.reverse()); // output namrA		
		
		//converting to string
		name=sb.reverse().toString();
		System.out.println(name);
	}

}
