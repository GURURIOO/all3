package string;
import java.util.*;
public class uniqueString {
	public static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		String a=sc.nextLine();
		for (int i = 0; i < a.length(); i++) {
			for (int j = 0; j < a.length(); j++) {
				if(a.charAt(i)==a.charAt(j)&&i!=j) {
					break;
				}
				if(j==a.length()-1) {
					System.out.println(a.charAt(i));
					}
			}
		}

	}
	
}
