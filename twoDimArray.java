package day7;
import java.util.*;
public class twoDimArray {
	public static Scanner sc;
	private static int r,c;
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		System.out.println("enter the row of the matrix :");
		r=sc.nextInt();
		System.out.println("enter the column of the matrix :");
		c=sc.nextInt();
		int a[][]=arr(r,c);
		ar(a);
	}
	public static int[][] arr(int row,int col) {
		int [][] arb=new int[row][col];
		for(int i=0;i<row;i++) {
			for (int j = 0; j < col; j++) {
				arb[i][j]=sc.nextInt();
			}
		}
		
		return arb;
	}
	public static void ar(int[][] a) {
		for(int [] i :a) {
			for(int j:i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
