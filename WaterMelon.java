package codeforces;
import java.util.Scanner;
public class WaterMelon
{
 public static void main(String args[])
 {
     Scanner sc=new Scanner(System.in);
     int waterMelonWeight=sc.nextInt();
     
    if(waterMelonWeight%2==0)
    {
    	if(waterMelonWeight<=2) {
         System.out.println("NO");
    	}
    	else
    	{
    		 System.out.println("YES");
    	}
    }
    else    
    {
    	 System.out.println("NO");	
    }
}
}
