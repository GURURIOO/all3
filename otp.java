/**
 * 
 * 
1. The length of the OTP is exactly 8
2. The OTP starts with first two characters of the account type (Case sensitive)
3. The third character is first digit of the account number
4. The fourth character is the sum of first five digits of account number (if the sum exceeds single digit then sum of digits should be done to form a single digit.
Repeat if necessary)
5. The fifth character is the first character of the account holder’s name
6. The sixth character is the sum of sixth to tenth digit positions of the account
number (if the sum exceeds single digit then sum of digits should be done to
form a single digit. Repeat if necessary)
7. The seventh character is the last character of the account holder’s name
8. The eighth character is the last digit of the account number
9. All characters should be same case of the input string
 */
package matrix;
import java.util.*;
public class otp {
	public static Scanner sc;
	public static long Acc;	
	public static String output1="NULL",name,typeS;
	public static String[] put1=new String[8];
	public static int t1=0;
	
	public static void main(String[] args) {
		sc= new Scanner(System.in);
		System.out.println("ENTER THE NAME OF THE USER :");
		name=sc.nextLine();
		
		System.out.println("ENTER THE ACCOUNT NUMBER :");
		Acc=sc.nextLong();
		long Ac=Acc;
		while(Ac!=0) {
			Ac/=10;
			t1++;
		}
		sc.nextLine();
		System.out.println("ENTER THE TYPE OF THE ACCOUNT :");
		typeS=sc.nextLine();		
		output1=userMethod(name, Acc, typeS ); 
		System.out.println("the required otp :");
		System.out.print(output1);
	}
	public static String userMethod(String input1, long input2, String input3 ) {
		String ans="";
		int n=input1.length();
		if(n>1) {
			System.out.println("test 1 pass");
			if(t1==11) {
				System.out.println("test 2 pass");
				if(input3.equals("Savings")||input3.equals("Current")||input3.equals("Loan")) {
					System.out.println("test 3 pass");
					ans= OTP();
				}else {
					System.out.println("test 3 fails");
					System.out.println("[ERROR]-- the type you enter is not valid");}
			}else {
			System.out.println("test 2 fails");
			System.out.println("[ERROR]-- the account number is not equal to 11");}
		}else {
			System.out.println("test 1 fails");
			System.out.println("[ERROR]-- The name of the user is less than 2");}
		return ans;
		}
	public static String OTP() {
		for(int i=0;i<2;i++) {
		put1[i]=Character.toString(typeS.charAt(i));
		}
		long Accl=Acc/1000000000;
		Accl=Accl/10;
		char qq=(char) (Accl%10+'0');
		put1[2]=Character.toString(qq);
		
		long num=single(Acc/1000000);
		
		qq=(char) (num+'0');
		put1[3]=Character.toString(qq);
		put1[4]=Character.toString(name.charAt(0));
		Accl=Acc/10;
		num=single(Accl%100000);		
		qq=(char) (num+'0');
		put1[5]=Character.toString(qq);
		qq=name.charAt(name.length()-1);
		put1[6]=Character.toString(qq);
		Accl=Acc;
		qq=(char) (Accl%10+'0');
		put1[7]=Character.toString(qq);
		 StringBuffer sb = new StringBuffer();
	      for(int i = 0; i < put1.length; i++) {
	         sb.append(put1[i]);
	      }
	      String str = sb.toString();
		return str;
		
	}
	public static long single(long l){
		long c=0,sum=0;
		while(l>0){
			c=l%10;
			sum+=c;
			l=l/10;
		}
		if(sum>9){
			l=sum;
			sum=single(l);
		}
		return sum;
	}


}
