package codeforces;
import java.util.Scanner;
public class WayTooLongWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
long numberOfLine=sc.nextLong();
String[] s=new String[(int)numberOfLine+1];
for(int i=0;i<=numberOfLine;i++)
    {
	 s[i]=sc.nextLine();
	}

for(int i=1;i<=numberOfLine;i++)
{
	
if(s[i].length()>10) 
{
long x=s[i].length()-2;
System.out.println(s[i].charAt((int) 0) + ""+x +""+ s[i].charAt((int) s[i].length()-1));
}
else
{
	System.out.println(s[i]);
}
}
}
}
