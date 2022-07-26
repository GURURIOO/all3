package day7;

import java.util.Scanner;

public class multiplyOfTwoMatrix {

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
		System.out.println("the mul of the matrixs :");
		mul(a,b);
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
	public static void mul(int[][] a1,int[][] a2) {
		int [][] arc=new int[r][c1];
		for (int i = 0; i < r; ++i) {
		      for (int j = 0; j < c1; ++j) {
		         for (int k = 0; k < c; ++k) {
		            arc[i][j] += a1[i][k] * a2[k][j];
		         }
		      }
		   }
		ar(arc);
	}
}
