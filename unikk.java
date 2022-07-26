package matrix;

import java.util.Scanner;

public class unikk {
	public static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter the string one :");
		String a=sc.nextLine();
		System.out.println("enter the string two :");
		String b=sc.nextLine();
		int x=a.length();
		int y=b.length();
		a=a+b;
		b=a.substring(0,x);
		a=a.substring(x,x+y);
		System.out.println("the  :");
		
		System.out.println(a);
	
		System.out.println(b);
	}

}
