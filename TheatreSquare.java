package codeforces;
import java.util.Scanner;
public class TheatreSquare {

	public static void main(String[] args) {
		long x=1,y=1,noflag;
	Scanner sc=new Scanner(System.in);	
	long n=sc.nextInt();
	long m=sc.nextInt();
	long a=sc.nextInt();
	if(n%a==0)
	{
		x=n/a;
	}
	if(n%a!=0) {
		x=1+n/a;
	}
	if(m%a==0)
	{
		y=m/a;
	}
	if(m%a!=0) {
		y=1+m/a;
	}
	noflag=x*y;
	System.out.println(noflag);
	}
}
