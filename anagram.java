package string;
import java.util.*;
public class anagram {
	public static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter the first string:");
		String a=sc.nextLine();
		System.out.println("enter the second string:");
		String aa=sc.nextLine();
		a=randomChar(a);
		aa=randomChar(aa);
		if(a.equals(aa)) {
			System.out.println(a+" is an anagram");
		}
		System.out.println(a);
		System.out.println(aa);
		
	}
	private static String randomChar(String a) {
		 char [] c = a.toCharArray();
		    Arrays.sort(c);
		    String sorted = new String(c);
		return  sorted;
	}

}
