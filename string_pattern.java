package pattern;
import java.util.*;
public class string_pattern {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter an string:");
		String s=sc.nextLine();
		char[] aa=s.toCharArray();
		if(s.length()<5||s.length()>15) {
			System.out.println("length is not valid ");
		}else {
			System.out.println("enter 'a' to check for blank spaces or numbers : ");
			System.out.println("enter 'b' to check for only blank spaces");
			
			char ch=sc.nextLine().charAt(0);
			switch(ch) {
			case 'a':
				for (char c : aa) {
					int q=(char)(c);
					if(q>47&&q<58) {
						
						System.out.println(c+" is numbers");
					}
					if(q==32) {
						System.out.println(s+" contains blank spaces");
					}
				}
				break;
			case 'b':
				for (char c : aa) {
					int q=(char)(c);
					if(q==32) {
						System.out.println(s+" contains blank spaces");
					}
				}
				
			}
			
		}

	}

}
