package pattern;
import java.util.Scanner;
public class alpha_triangle {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter the size: ");
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
	    {
	        for(int j=1;j<=i;j++)
	        {
	            System.out.print((char)(i+64));
	        }
	        System.out.println();
	    }	}

}
