package codeforces;
import java.util.Scanner;
public class DominoPiling50A {

	public static void main(String[] args) {
		int flag=0;
Scanner sc=new Scanner(System.in);
int m=sc.nextInt();
int n=sc.nextInt();
if(m%2==0) {
	for(int i=2;i<=m;i+=2) {
		for(int j=1;j<=n;j++) {
			flag+=1;
		}
	}
}
else {
	for(int i=2;i<=m;i+=2) {
		for(int j=1;j<=n;j++) {
			flag+=1;
		}
	}
	for(int k=2;k<=n;k+=2) {
		flag+=1;
	}
}
System.out.print(flag);
	}

}
