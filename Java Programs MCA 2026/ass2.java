import java.io.*;
import java.util.*;

class prime
{
   int c=0;
   int i;
   int sum(int n)
  {
     for(i=1;i<=1000;i++)
     {
         if(n%i==0)
         {
               c=c+1;
          }
      }
  return c;
 }
}
class ass2
{
    public static void main(String[] args)
    {
       int x,y;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a integer");
       x=sc.nextInt();
       prime ob = new prime();
       y=ob.sum(x);
       System.out.println("Updated Value:"+y);
    }
}
