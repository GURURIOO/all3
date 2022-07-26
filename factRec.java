package day7;
import java.util.*;

public class factRec {
	public static Scanner sc;
	static int z=0;
	public static void main(String[] args) {
		sc= new Scanner(System.in);
		System.out.println("enter an number to fact: ");
		int a=sc.nextInt();
		z=a;
		int ans=fact(a);
		System.out.println(ans);
	}
	public static int fact(int k) {
		if(k>1) {		
		z*=k-1;
		k--;
		fact(k);
		}
		return z;
	}

}
