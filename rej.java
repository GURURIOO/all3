import java.util.regex.*;
public class rej {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern pattern = Pattern.compile("[a-z0-9_-]{3,9}[@#$].");
		 Matcher m = pattern.matcher("ajaina76@.");
		 boolean b = m.matches();  
		 System.out.println(b);
		 
	}

}
