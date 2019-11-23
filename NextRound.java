package codeforces;
import java.util.Scanner;
public class NextRound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int k=sc.nextInt();
int[] x=new int[n+1];
x[n]=0;
int m=0;
for(int i=0;i<n;i++)
       {
		x[i]=sc.nextInt();
       }

int j=k-1;
while(x[j]==x[j+1]&& x[j]!=0)
{
		k=k+1;
		j++;
	
	}
for(int i=0;i<k;i++)
{
	if(x[i]!=0) {
		m=m+1;
	}
}
int flag=0;
for(int i=0;i<n;i++) {
if(x[i]!=0)
{
	flag=1;
}
}
if(flag==1)
{
	if(m<=k) {
	System.out.print(m);
	}
	else{
		System.out.print(k);	
	}}
if(flag==0) {
	System.out.print("0");
}
	}
}
