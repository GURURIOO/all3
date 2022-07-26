import java.util.*;
public class toSingle {
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("enter an number: ");
		int a=scan.nextInt();
		int q=a;
	
		int rec=single(q);
		
		System.out.println(rec);
	
	}
	public static int single(int q){
		int c=0,sum=0;
		while(q>0){
			c=q%10;
			sum+=c;
			q=q/10;
		}
		if(sum>9){
			q=sum;
			sum=single(q);
		}
		return sum;
	}

}
