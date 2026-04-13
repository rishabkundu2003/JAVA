import java.io.*;
import java.util.*;

class pal
{
     int d,t,s=0;
     int sum(int n)
     {
        t=n;
        while(t>=0)
	{
	   d=n%10;
	   s=s*10+d;
	   n=n/10;
	}
	if(t==s)
	{
	   System.out.print("Yes"+ s);
        }
	else
	{
	    System.out.println("Not");
	}
     return s;
     }
}
   
class ass14
{
    public static void main(String[] args)
    {
         pal ob = new pal();
         ob.sum(121);
     }
}
