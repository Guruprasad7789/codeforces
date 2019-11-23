package codeforces;
import java.util.Scanner;
public class Team231A {
	public static void main(String args[]) {
		int flag=0,x;
Scanner sc=new Scanner(System.in);
long n=sc.nextLong();
int[][] tf=new int[(int)n][3];
for(int i=0;i<n;i++)
{
	for(int j=0;j<3;j++)
	{
		tf[i][j]=sc.nextInt();
	}
}
for(int i=0;i<n;i++)
{
	x=tf[i][0]+tf[i][1]+tf[i][2];
if(x==2||x==3)
{
	flag+=1;
	}

}
System.out.print(flag);
}
}