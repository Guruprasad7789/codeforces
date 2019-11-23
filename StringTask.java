package codeforces;
import java.util.Scanner;
public class StringTask {

	public static void main(String[] args) {
		int n;
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
n=s.length();
char[] ch=new char[500];
for(int i=0,j=0;i<n && j<500;i++,j++)
{
	if(s.charAt(i)=='a'||s.charAt(i)=='A'||s.charAt(i)=='e'||s.charAt(i)=='E'
			||s.charAt(i)=='i'||s.charAt(i)=='I'||s.charAt(i)=='o'
			||s.charAt(i)=='O'||s.charAt(i)=='u'||s.charAt(i)=='U'
			||s.charAt(i)=='y'||s.charAt(i)=='Y') {
	j=j-1;
}
	else {
		if(Character.isUpperCase(s.charAt(i))) {
			
		ch[j]='.';	
		j=j+1;
		ch[j]=Character.toLowerCase(s.charAt(i));	
}
		else {
			ch[j]='.';	
			j=j+1;
			ch[j]=s.charAt(i);	
		}
}
}
for(int i=0;i<500;i++)
{
	if(ch[i]!='\0')
System.out.print(ch[i]);

}

}

}
