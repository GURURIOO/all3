package matrix;

public class REVER {
	public static void main(String[] args) {
		
		int n=454664;
		int e=n;
		int rev=0,rem=0;
		while(n!=0){
			rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
		}
		if(e==rev){
		System.out.println("the given num is an palendron");
		}else{
			System.out.println("the given num is not an palendron");
		}

}
}
