package matrix;
/**
 * 
 * @author Student
 *	Original array = { 2, 5, 1, 7, 9, 3 }
	Encoded array = { 3, -4, 6, 2, -6, 3 }
	First number in the original array = 2
	Sum of all numbers in original array = 27
 *
 */
import java.util.*;

public class SumOfAllValue {
	public static Scanner sc;

	public static int output1;
	public static int output2;
	
	public static void main(String [] args) {
	sc= new Scanner(System.in);
	System.out.println("enter the size of the array: ");
	int r=sc.nextInt();
	int [] arr = new int [r];
	System.out.println("enter the element :");
	for(int i=0;i<r;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.print("Original array = {");
	for(int i:arr) {
		System.out.print(i+" ");
	}
	System.out.print(" }");

	System.out.println(" ");
	findOriginalFirstAndSum(arr);
	
	
	}

	public static void findOriginalFirstAndSum(int [] input1) {
	int []c=input1;
	c=encode(c);
	System.out.print("Encoded array {");
	for(int i:c) {
		System.out.print(i+" ");
	}
	System.out.print(" }");
	System.out.println(" ");
	System.out.println("First number in the original array = "+input1[0]);
//	System.out.println(" ");
	add(input1);
	}
	
	static int[] encode(int[] a) {
		int b[]=new int[a.length];
		int k=0,u=1;
		for(int i=0;i<a.length-1;i++) {
			int q=a[i];
			int w=a[u++];
			int ss=w-q;
			b[k++]=ss;
		}
		b[a.length-1]=a[a.length-1];
		return b;
	}
	static void add(int[] a) {
		int sum=0;
		for(int i:a) {
			sum+=i;
		}
		System.out.println("Sum of all numbers in original array ="+sum);
	}
	
}
