package codeforces;
import java.util.Scanner;
public class Bit282A {

	public static void main(String[] args) {
 int x=0;
Scanner sc=new Scanner(System.in);
long n=sc.nextLong();
String[] s=new String[(int)n+1];
for(int i=0;i<=n;i++) {
	s[i]=sc.nextLine();
}
for(int i=0;i<=n;i++) {
if(s[i].equals("++X")||s[i].equals("X++")) {
x=x+1;
}
if(s[i].equals("--X")||s[i].equals("X--")) {
	x=x-1;
}
}
System.out.print(x);
	}

}
