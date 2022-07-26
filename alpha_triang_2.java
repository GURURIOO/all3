package pattern;

import java.util.Scanner;

public class alpha_triang_2 {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter the size: ");
		int n=s.nextInt();
		int z=1;
		for(int i=1;i<=n;i++)
	    {
	        for(int j=1;j<=i;j++)
	        {
	            System.out.print((char)(z+64));
	            z++;
	        }
	        System.out.println();
	    }	}

}
