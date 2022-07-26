package day7;
import java.util.*;
public class splitString {
	public static Scanner sc;

	 public static void main(String args[])
	    {
			sc=new Scanner(System.in);

	        String str = sc.nextLine();
	        String[] arrOfStr = str.split(" ", str.length());
	  
	        for (String a : arrOfStr)
	            System.out.println(a);
	    }

}
