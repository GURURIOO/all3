package pattern;
import java.util.*;

public class sub_string {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter an string:");
		String a=sc.nextLine();
		System.out.println("enter the num of char:");
		int c=sc.nextInt();
		int b=0;
		for(int i=0;i<a.length()/c;i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(a.charAt(b));
				b++;
			}
			System.out.println();
		}

	}

}
