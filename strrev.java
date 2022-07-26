import java.util.*;
public class strrev {
//	private static final String Hashmap = null;
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		String a=sc.nextLine();
		String b="";
		int n=a.length();
		for (int i = n-1; i>=0; i--) {
			b+=a.charAt(i);
		}
		System.out.println(b);
	}

}
