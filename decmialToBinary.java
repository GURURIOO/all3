package day7;
import java.util.*;

public class decmialToBinary {
	public static Scanner sc;

	public static void main(String[] args) {
		sc=new Scanner(System.in);
		System.out.println("enter the decimal:");
		int n=sc.nextInt();
		int r=0;
		int a[]=new int[100];
	
		while(n>0)
		{    
		a[r]=n%2;    
		n=n/2;
		r++;  		
		}    
		for(int i=r-1;i>=0;i--)    
		{    
		System.out.print(a[i]);   
		}    
	}

}
