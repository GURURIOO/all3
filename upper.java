package matrix;

import java.util.Scanner;

public class upper {

	public static Scanner sc;
	private static int r,c;
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		System.out.println("enter the row of the matrix :");
		r=sc.nextInt();
		System.out.println("enter the column of the matrix :");
		c=sc.nextInt();
		int a[][]=arr(r,c);
		upp(a);
		System.out.println("");
		low(a);
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
	public static void upp(int[][] a) {
		for(int i=0;i<r;i++) {
			System.out.println();
			for (int j = 0; j <c; j++) {
				if(j>= i) {
					System.out.print(a[i][j]+" ");
				}else {
					System.out.print("0 ");
				}
				
			}
		}
	}
	public static void low(int[][] a) {
		for(int i=0;i<r;i++) {
			System.out.println();
			for (int j = 0; j <c; j++) {
				if(j<= i) {
					System.out.print(a[i][j]+" ");
				}else {
					System.out.print("0 ");
				}
				
			}
		}
	}
}
