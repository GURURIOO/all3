package day7;
import java.util.*;
public class addTwoMatrix {
	public static Scanner sc;
	private static int r,c,r1,c1;
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		System.out.println("enter the row of the matrix :");
		r=sc.nextInt();
		System.out.println("enter the column of the matrix :");
		c=sc.nextInt();
		int a[][]=arr(r,c);
		ar(a);
		
		System.out.println("enter the row of the matrix :");
		r1=sc.nextInt();
		System.out.println("enter the column of the matrix :");
		c1=sc.nextInt();
		int b[][]=arr(r1,c1);
		ar(b);
		System.out.println("the sum of the matrixs :");
		add(a,b);
	}
	public static int[][] arr(int row,int col) {
		System.out.println("enter the elements:");
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
	public static void add(int[][] a1,int[][] a2) {
		int [][] arc=new int[r][c];
		for(int i=0;i<r;i++) {
			for (int j = 0; j < c; j++) {
				arc[i][j]=a1[i][j]+a2[i][j];
			}
		}
		ar(arc);
	}
}
