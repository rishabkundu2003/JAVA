import java.io.*;
import java.util.*;

class fibo
{
   int s=0;
   int a=0,b=1,c=0,i;
   int sum(int n)
  {
     for(i=1;i<=n;i++)
     {
         System.out.print(a+" ");
         s+=a;
         c=a+b;
         a=b;
         b=c;
      }
     return s;
  }
}

class ass1
{
    public static void main(String[] args)
    {
       int x,y;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a integer");
       x=sc.nextInt();
       fibo ob = new fibo();
       y=ob.sum(x);
       System.out.println("Updated Value:"+y);
    }
}
