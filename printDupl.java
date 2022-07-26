package string;
import java.util.*;

public class printDupl {
	public static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		String a=sc.nextLine();
		int [] b=new int [a.length()];
		for(int i=0;i<a.length();i++) {
			int x=1;
			for (int j = i+1; j < a.length(); j++) {
				if(a.charAt(i)==a.charAt(j)) {
					x++;
					b[j]=-1;
				}
			}
				if(b[i]!=-1) {
					b[i]=x;
				}
				if(b[i]>1) {
					System.out.println(a.charAt(i));
				}
		}

	}

}
