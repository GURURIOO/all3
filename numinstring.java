package string;

import java.util.Scanner;

public class numinstring {

	public static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		String a=sc.nextLine();
		char [] n=a.toCharArray();
		for(int i=0;i<a.length();i++) {
			if(n[i]>47&&n[i]<58) {
				System.out.print(n[i]+"  ");
			}
		}

	}
}
