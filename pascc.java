package day7;

import java.util.Scanner;

public class pascc {

	public static Scanner sc;

	public static void main(String[] args) {
		sc=new Scanner(System.in);
		System.out.println("enter the row of the matrix :");
		int a=sc.nextInt();
		for (int i = 1; i <=a; i++) {
			int s=1;
			for (int j = 0; j < a-i; j++) {
				System.out.print(" ");
				}
			for (int j2 = 1; j2 <= i; j2++) {
				System.out.print(s+" ");
				s=s*(i-j2)/j2;
			}
			System.out.println();
		}
		
	}

}
