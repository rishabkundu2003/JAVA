import java.io.*;
import java.util.*;

class fact
{
   int f=1;
   int i;
   int sum(int n)
  {
     for(i=1;i<=n;i++)
     {
        f=f*i;
     }
  return f;
 }
}
class ass6
{
    public static void main(String[] args)
    {
       int x,y;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a integer");
       x=sc.nextInt();
       fact ob = new fact();
       y=ob.sum(x);
       System.out.println("Updated Value:"+y);
    }
}
