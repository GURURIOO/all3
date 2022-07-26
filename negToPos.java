package day7;
import java.util.*;
public class negToPos {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("enter an natural num : ");
		int a=scan.nextInt();
		if(a<0){
			System.out.println("the given number is neg "+a);
			a=a*-1;
			System.out.println("the given number is changed into "+a);
		}else{
		System.out.println("the given number is positive "+a);}
	}

}
