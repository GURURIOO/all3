
import java.util.Scanner;
public class printDup {
	static Scanner s=new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter a String : ");
		String str  = s.nextLine();
		int l= str.length();
		int a[] = new int [l];
		System.out.print("repeted char is : ");
		for(int i=0 ; i<l ; i++) {
			int count=1;
			for(int j=i+1 ; j<l ; j++) {
				if(str.charAt(i) == str.charAt(j)) {
					count++;
					a[j] = -1;
				}
			}
			if (a[i]!=-1){
				a[i]=count;
			}
			if(a[i]>1) {
				System.out.print(str.charAt(i));
			}		
		}
	}
}

