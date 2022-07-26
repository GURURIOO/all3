package pattern;
import java.util.*;
public class replace_an_word {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter an String: ");
		String  s=sc.nextLine();
		System.out.println("enter an String to replace with: ");
		String  h=sc.nextLine();
		System.out.println("enter an String to replace in: ");
		String  z=sc.nextLine();
		String [] d=s.split(" ");
		for (String str : d) {
			if(str.equals(h)) {
				str=z;
			}
			System.out.print(str+" ");
			
		}

	}

}
