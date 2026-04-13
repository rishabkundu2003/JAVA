import java.io.*;
import java.util.*;

class second
{
   int a;
   int update(int n)
   {
      return ++n;
    }
}

class updemo
{
   public static void main(String[] a)
   {
      int x,y;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter an integer");
      x=sc.nextInt();
      second obj = new second();
      y=obj.update(x);
      System.out.println("Updated Value:"+y);
    }
}
