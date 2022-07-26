package day7;
import java.util.*;

public class pascal {
	public static Scanner sc;

	public static void main(String[] args) {
		sc=new Scanner(System.in);
		System.out.println("enter the row of the matrix :");
		int a=sc.nextInt();
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a-i; j++) {
				System.out.print(" ");
				}
			for (int j2 = 0; j2 <= i; j2++) {
				System.out.print(" "+fact(i) / (fact(i-j2)*fact(j2)));
			}
			System.out.println();
		}
		
	}
	public static int fact(int a) {
		if(a<1) {
			return 1;
		}
			return a*fact(a-1);
	}

}
