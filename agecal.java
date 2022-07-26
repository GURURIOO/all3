import java.util.*;

public class agecal {
	public static Scanner sc;
	public static void main(String[] args) {
	sc=new Scanner(System.in);
	int day,mon,year;
	System.out.println("enter the birth date:");
	int d1=sc.nextInt();
	System.out.println("enter the birth month:");
	int m1=sc.nextInt();
	System.out.println("enter the birth year:");
	int y1=sc.nextInt();
	System.out.println("enter the current date:");
	int d2=sc.nextInt();
	System.out.println("enter the current month:");
	int m2=sc.nextInt();
	System.out.println("enter the current year:");
	int y2=sc.nextInt();
	if(d1>d2) {
		d2+=30;
		m2--;
	}
	if(m1>m2) {
		m2+=12;
		y2--;
	}
	day=d2-d1;
	mon=m2-m1;
	year=y2-y1;	
	System.out.println("days "+day+" months "+mon+" years "+year+"");
	}

}
