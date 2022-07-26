package day7;
import java.util.Scanner;


public class floid {

	public static Scanner sc;

	public static void main(String[] args) {
		sc=new Scanner(System.in);
		System.out.println("enter the row of the matrix :");
		int a=sc.nextInt();
		int ans=1;
		for (int i = 1; i <=a; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(ans+++" ");
			}
			System.out.println();
			
		}
		}
}
